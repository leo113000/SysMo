/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import monitor.AbstractGraphics;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxGraphics extends AbstractGraphics
{

    private String pciID;

    private String driverID;
    private String hardwareID;
    private String vendor;
    private String model;

    @Override
    public String getManufacturer()
    {
	return vendor;
    }

    @Override
    public String getModel()
    {
	return model;
    }

    @Override
    public String getDirectX()
    {
	return null;
    }

    @Override
    public String getDisplayMemory()
    {
	return null;
    }

    @Override
    public String getDedicatedMemory()
    {
	return null;
    }

    @Override
    public String getSharedMemory()
    {
	return null;
    }

    @Override
    public String getHardwareID()
    {
	return hardwareID;
    }

    @Override
    public String getDriverID()
    {
	return driverID;
    }

    LinuxGraphics() throws IOException
    {
	this.pciID = obtainPciNumber(); //Primero se obtiene el PCI path

	ArrayList<String> datos = obtainAllGPUData();//Para que se recolecte toda la información

	//Y se construyen el resto de objetos
	constructData(datos);
    }

    private void constructData(ArrayList<String> datos)
    {
	ArrayList<String> fields = new ArrayList<>();

	fields.add("DRIVER");
	fields.add("PCI_ID");
	fields.add("VENDOR");
	fields.add("MODEL");

	for (String iString : datos) //Por cada linea de todos los datos
	{
	    for (int i = 0; i < fields.size(); i++) //Itero buscando cada uno de los campos que tengo que extraer
	    {
		String currField = fields.get(i);//Guardo en una variable el campo aca

		if (iString.contains(currField)) //si la linea de los datos en la que estoy posicionado tiene el dato
		{
		    switch (currField) //Asigna el dato en el atributo indicado
		    {
			case "DRIVER":
			    this.driverID = cortarDespuesDe(iString, "=");
			    ;
			    break;
			case "PCI_ID":
			    this.hardwareID = cortarDespuesDe(iString, "=");
			    break;
			case "VENDOR":
			    this.vendor = cortarDespuesDe(iString, "=");
			    ;
			    break;
			case "MODEL":
			    this.model = cortarDespuesDe(iString, "=");
			    ;
			    break;
		    }

		    fields.remove(i);
		}
	    }
	}
    }

    private String obtainPciNumber() throws IOException
    {
	String retorno = null;

	Process process = Runtime.getRuntime().exec("lshw -C display");  //Esta línea corre el comando
	InputStream inputstream = process.getInputStream(); //Toma el flujo generado del proceso

	InputStreamReader isr = new InputStreamReader(inputstream); //Se inserta en un lector de flujo
	BufferedReader br = new BufferedReader(isr); //Se pasa a un Buffer

	String line;  //Leo la linea

	while ((line = br.readLine()) != null)
	{
	    if (line.contains("bus info"))
	    {
		retorno = cortarDespuesDe(line, "@");
	    }
	}

	return retorno;
    }

    private ArrayList<String> obtainAllGPUData() throws IOException
    {
	String script = String.format("udevadm info -q property -p /sys/bus/pci/devices/%s", pciID);

	ArrayList<String> datos = new ArrayList<>();

	Process process = Runtime.getRuntime().exec(script);  //Esta línea corre el comando
	InputStream inputstream = process.getInputStream(); //Toma el flujo generado del proceso

	InputStreamReader isr = new InputStreamReader(inputstream); //Se inserta en un lector de flujo
	BufferedReader br = new BufferedReader(isr); //Se pasa a un Buffer

	String line;

	while ((line = br.readLine()) != null)
	{
	    datos.add(line);
	}

	return datos;

    }

}
