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
import java.util.HashMap;
import java.util.Map;
import monitor.AbstractGraphics;

/**
 *
 * @author Alien
 */
class WindowsGraphics extends AbstractGraphics
{
    private final String MANUFACTURER = "Manufacturer";
    private final String MODEL = "Card name";

    private final String VENDORID = "Vendor ID";
    private final String DEVICEID = "Device ID";
    
    private final String DISPLAYMEMORY = "Display Memory";
    private final String DEDICATEDMEMORY = "Dedicated Memory";
    private final String SHAREDMEMORY = "Shared Memory";
    
    
    private String directX;
    
    @Override
    public String getManufacturer()
    {
	return atributos.get(MANUFACTURER);
    }

    @Override
    public String getModel()
    {
	return atributos.get(MODEL);
    }

    @Override
    public String getDirectX()
    {
	return directX;
    }

    @Override
    public String getDisplayMemory()
    {
	return atributos.get(DISPLAYMEMORY);
    }

    @Override
    public String getDedicatedMemory()
    {
	return atributos.get(DEDICATEDMEMORY);
    }

    @Override
    public String getSharedMemory()
    {
	return atributos.get(SHAREDMEMORY);
    }

    @Override
    public String getHardwareID()
    {
	String v=atributos.get(VENDORID);
	String d=atributos.get(DEVICEID);
	
	return  "".equals(v) || "".equals(d) ? "" : v + ":" + d;
    }

    @Override
    public String getDriverID()
    {
	return "";
    }

    public WindowsGraphics()
    {
	ArrayList<String> datos = obtainAllGPUData();//Para que se recolecte toda la información
	
	atributos=new HashMap<>();
	
	//Y se construyen el resto de objetos
	callConstructData(datos);
    }
    
    
    @Override
    protected void createEmptyObject()
    {
	super.createEmptyObject();
	
	directX="";	
    }
    
    @Override
    protected void constructData(ArrayList<String> datos)
    {
	ArrayList<String> fields = createFields(); //Se cream los campos para comparar y extraer

	for (String iString : datos) //Por cada linea de todos los datos
	{
	    for (int i = 0; i < fields.size(); i++) //Itero buscando cada uno de los campos que tengo que extraer
	    {
		String currField = fields.get(i);//Guardo en una variable el campo aca

		if (iString.contains(VENDORID) || iString.contains(DEVICEID)) //si la linea de los datos en la que estoy posicionado tiene el dato
		{
		    atributos.put(currField,cortarDespuesDe(iString,"0x"));

		    fields.remove(i);
		}else if(iString.contains(currField))
		{
		    atributos.put(currField,cortarDespuesDe(iString,": "));

		    fields.remove(i);
		}
		
	    }
	}
    }

    @Override
    protected  ArrayList<String> createFields()
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

    private ArrayList<String> obtainAllGPUData()
    {
	ArrayList<String> datos = new ArrayList<>();

	String textFile = "./yourTextFile.txt"; //El path del archivo
	ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dxdiag","/whql:off","/t", textFile);
	Process p;
	
	try
	{
	    p = pb.start(); //Se inicia ese proceso, va  a escribir un archivo de texto
	    esperarProceso(p);
	} catch (IOException ex)
	{
	    System.err.println("Error iniciando la extracción");
	}

	
	try
	{
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

	} catch (IOException e)
	{
	    System.out.println("Error inesperado con la apertura del archivo");
	    datos=null;
	}
	
	   return datos; 
	
	
    }

    private void esperarProceso(Process p)
    {
	try
	{
	    p.waitFor(); //espera que el proceso anterior termine
	} catch (InterruptedException e)
	{
	    System.err.println("Ocurrió un error \"inesperado\" al obtener los datos de la GPU");
	}
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
