/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Leo J. Vazquez
 */
public abstract class AbstractGraphics
{
    
    
    public abstract String getManufacturer();
    public abstract String getModel();
 
    public abstract String getDirectX();
  

    public abstract String getDisplayMemory();
    public abstract String getDedicatedMemory();
    public abstract String getSharedMemory();
  
    
    public abstract String getHardwareID();
    public abstract String getDriverID();
    
    protected String cortarDespuesDe(String line, String regex)
    {
	String[] lineas = line.split(regex);

	return lineas[1];
    }
}
