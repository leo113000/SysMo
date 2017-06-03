/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import monitor.AbstractGraphics;

/**
 *
 * @author Alien
 */
class WindowsGraphics extends AbstractGraphics
{

    private String manufacturer;
    private String model;

    private String vendorID;
    private String deviceID;

    //Unicos de Windows
    private String directX;
    private String displayMemory;
    private String dedicatedMemory;
    private String sharedMemory;

    @Override
    public String getManufacturer()
    {
	return manufacturer;
    }

    @Override
    public String getModel()
    {
	return model;
    }

    @Override
    public String getDirectX()
    {
	return directX;
    }

    @Override
    public String getDisplayMemory()
    {
	return displayMemory;
    }

    @Override
    public String getDedicatedMemory()
    {
	return dedicatedMemory;
    }

    @Override
    public String getSharedMemory()
    {
	return sharedMemory;
    }

    @Override
    public String getHardwareID()
    {
	return vendorID + ":" + deviceID;
    }

    @Override
    public String getDriverID()
    {
	return null;
    }

    WindowsGraphics() throws IOException
    {

	ArrayList<String> datos = obtainAllGPUData();//Para que se recolecte toda la información

	//Y se construyen el resto de objetos
	constructData(datos);
    }

    private void constructData(ArrayList<String> datos)
    {
	ArrayList<String> fields = createFields(); //Se cream los campos para comparar y extraer

	for (String iString : datos) //Por cada linea de todos los datos
	{
	    for (int i = 0; i < fields.size(); i++) //Itero buscando cada uno de los campos que tengo que extraer
	    {
		String currField = fields.get(i);//Guardo en una variable el campo aca

		if (iString.contains(currField)) //si la linea de los datos en la que estoy posicionado tiene el dato
		{
		    switch (currField) //Asigna el dato en el atributo indicado
		    {

			case "Card name":
			    this.model = cortarDespuesDe(iString, ": ");
			    break;
			case "Manufacturer":
			    this.manufacturer = cortarDespuesDe(iString, ": ");
			    break;
			case "Display Memory":
			    this.displayMemory = cortarDespuesDe(iString, ": ");
			    break;
			case "Dedicated Memory":
			    this.dedicatedMemory = cortarDespuesDe(iString, ": ");
			    break;
			case "Shared Memory":
			    this.sharedMemory = cortarDespuesDe(iString, ": ");
			    break;
			case "Vendor ID":
			    this.vendorID = cortarDespuesDe(iString.trim(), "0x");
			    break;
			case "Device ID":
			    this.deviceID = cortarDespuesDe(iString, "0x");
			    break;
		    }

		    fields.remove(i);
		}
	    }
	}
    }

    private ArrayList<String> createFields()
    {
	ArrayList<String> fields = new ArrayList<>();

	fields.add("Card name");
	fields.add("Manufacturer");
	fields.add("Display Memory");
	fields.add("Dedicated Memory");
	fields.add("Shared Memory");
	fields.add("Vendor ID");
	fields.add("Device ID");

	return fields;
    }

    private ArrayList<String> obtainAllGPUData() throws IOException
    {
	ArrayList<String> datos = new ArrayList<>();

	String textFile = "./yourTextFile.txt"; //El path del archivo
	ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dxdiag", "/t", textFile); //Se construye el proceso
	Process p = pb.start(); //Se inicia ese proceso, va  a escribir un archivo de texto

	BufferedReader br = new BufferedReader(new FileReader(textFile));  //Se lee ese archivo de texto a un buffer

	String line;

	while ((line = br.readLine()) != null)
	{
	    if (line.contains("DirectX Version")) //Cuendo detecta la info del DirectX
	    {
		directX = cortarDespuesDe(line, ": "); //Extrae el dato
	    }

	    if (line.contains("Display Devices")) //Cuando encuentra la leyenda 
	    {

		while (!line.contains("Sound Devices") && (line = br.readLine()) != null)
		{
		    datos.add(line); //Guarda todas las lineas de esa sección, hasta que se acabe o cambie de seccion
		}
	    }

	}

	br.close(); //Se cierra el archivo

	borrarArchivo(new File(textFile).toPath()); //Se borra el .txt creado oportunamente

	return datos;
    }

    private void borrarArchivo(Path path)
    {
	try
	{
	    Files.delete(path);
	} catch (NoSuchFileException x)
	{
	    System.err.format("%s: no such" + " file or directory%n", path);
	} catch (DirectoryNotEmptyException x)
	{
	    System.err.format("%s not empty%n", path);
	} catch (IOException x)
	{
	    System.err.println(x);
	}
    }

}
