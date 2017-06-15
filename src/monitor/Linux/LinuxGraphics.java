/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import monitor.AbstractGraphics;

/**
 *
 * @author Leo J. Vazquez
 */
public class LinuxGraphics extends AbstractGraphics
{

    private final String DRIVERID = "DRIVER";
    private final String HARDWAREID = "PCI_ID";
    private final String VENDOR = "VENDOR";
    private final String MODEL = "MODEL";

    private String pciID;

    @Override
    public String getManufacturer()
    {
	return atributos.get(VENDOR);
    }

    @Override
    public String getModel()
    {
	return atributos.get(MODEL);
    }

    @Override
    public String getDirectX()
    {
	return "";
    }

    @Override
    public String getDisplayMemory()
    {
	return "";
    }

    @Override
    public String getDedicatedMemory()
    {
	return "";
    }

    @Override
    public String getSharedMemory()
    {
	return "";
    }

    @Override
    public String getHardwareID()
    {
	//return hardwareID;
	return atributos.get(HARDWAREID);
    }

    @Override
    public String getDriverID()
    {
	return atributos.get(DRIVERID);
    }

    public LinuxGraphics()
    {
	atributos = new HashMap<>();

	this.pciID = obtainPciNumber(); //Primero se obtiene el PCI path

	ArrayList<String> datos = obtainAllGPUData();//Para que se recolecte toda la información
	
	//Y se construyen el resto de objetos
	this.callConstructData(datos);
    }

    @Override
    protected final void constructData(ArrayList<String> datos)
    {
	ArrayList<String> fields = createFields(); //Creo los campos para comparar y extraer

	for (String iString : datos) //Por cada linea de todos los datos
	{
	    for (int i = 0; i < fields.size(); i++) //Itero buscando cada uno de los campos que tengo que extraer
	    {
		String currField = fields.get(i);//Guardo en una variable el campo aca

		if (iString.contains(currField)) //si la linea de los datos en la que estoy posicionado tiene el dato
		{

		    atributos.put(currField, cortarDespuesDe(iString, "=")); //Asigno los datos al HashMap

		    fields.remove(i);
		}
	    }
	}
    }

    @Override
    protected ArrayList<String> createFields()
    {
	ArrayList<String> fields = new ArrayList<>();

	fields.add(DRIVERID);
	fields.add(HARDWAREID);
	fields.add(VENDOR);
	fields.add(MODEL);

	return fields;
    }

    private String obtainPciNumber()
    {
	String retorno = null;
	try
	{
	    Process process = Runtime.getRuntime().exec("lshw -C display");  //Esta línea corre el comando
	    InputStream inputstream = process.getInputStream(); //Toma el flujo generado del proceso

	    InputStreamReader isr = new InputStreamReader(inputstream); //Se inserta en un lector de flujo
	    BufferedReader br = new BufferedReader(isr); //Se pasa a un Buffer

	    String line;  //Leo la linea

	    while ((line = br.readLine()) != null)
	    {
		if (line.contains("info"))
		{
		    retorno = cortarDespuesDe(line, "@"); //Corto despues del @ para obtener el PCI #
		}
	    }
	} catch (Exception e)
	{
	    System.out.println("Error en la creación del objeto");
	    retorno = null;
	}

	return retorno;
    }

    private ArrayList<String> obtainAllGPUData()
    {
	ArrayList<String> datos;

	try
	{
	    String script = String.format("udevadm info -q property -p /sys/bus/pci/devices/%s", pciID);

	    datos = new ArrayList<>();

	    Process process = Runtime.getRuntime().exec(script);  //Esta línea corre el comando
	    InputStream inputstream = process.getInputStream(); //Toma el flujo generado del proceso

	    InputStreamReader isr = new InputStreamReader(inputstream); //Se inserta en un lector de flujo
	    BufferedReader br = new BufferedReader(isr); //Se pasa a un Buffer

	    String line;

	    while ((line = br.readLine()) != null)
	    {
		datos.add(line); //Cada linea se pasa a un arreglo de Strings
	    }
	} catch (Exception e)
	{
	    System.out.println("Error en obtención de datos");
	    datos = null;
	}

	return datos;

    }

}
