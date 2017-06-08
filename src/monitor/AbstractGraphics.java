/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Leo J. Vazquez
 */
public abstract class AbstractGraphics
{
    
    protected Map<String,String> atributos;
    
    public abstract String getManufacturer();
    public abstract String getModel();
 
    public abstract String getDirectX();
  

    public abstract String getDisplayMemory();
    public abstract String getDedicatedMemory();
    public abstract String getSharedMemory();
  
    
    public abstract String getHardwareID();
    public abstract String getDriverID();
        
    protected abstract void constructData(ArrayList <String> datos);
    protected abstract ArrayList<String> createFields();
    
    protected void createEmptyObject()
    {
	System.out.println("Creando objeto vacio de Graphics");
	
	ArrayList<String> fields=createFields();
	
	for (String field : fields)
	{
	    atributos.put(field, "");
	}
	
    }
        
    protected void callConstructData(ArrayList<String> datos)
    {
	if(datos==null)
	{
	    createEmptyObject();
	}else
	{
	    constructData(datos);
	}
    }
    
    
    protected String cortarDespuesDe(String line, String regex)
    {
	String[] lineas = line.split(regex);

	return lineas[1];
    }
    
}
