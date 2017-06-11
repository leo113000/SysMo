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
public abstract class GPU implements iGPU
{
    private AbstractGraphics g;

    public GPU(AbstractGraphics g)
    {
	this.g = g;
    }

    @Override
    public  String getSharedMemory()
    {
	return g.getSharedMemory();
    }

    @Override
    public String getDedicatedMemory()
    {
	return g.getDedicatedMemory();
    }

    @Override
    public String getDisplayMemory()
    {
	return g.getDisplayMemory();
    }

    @Override
    public String getDirectX()
    {
	return g.getDirectX();
    }

    @Override
    public String getModel()
    {
	return g.getModel();
    }

    @Override
    public String getManufacturer()
    {
	return g.getManufacturer();
    }

    @Override
    public String getHardwareID()
    {
	return g.getHardwareID();
    }

    @Override
    public String getDriverID()
    {
	return g.getDriverID();
    }

    @Override
    public String ToJson()
    {
        String Sm=this.getSharedMemory();
        String Md=this.getModel();
        String Mf=this.getManufacturer();
        String Hw=this.getHardwareID();
        String Dv=this.getDriverID();
        String Dp=this.getDisplayMemory();
        String Dx=this.getDirectX();
        String Dm=this.getDedicatedMemory();
        
        String dev=String.format("{\"Memoria Compartida: \":%s,\"Modelo: \":%s,\"Fabricante\":%s,\"Hard iD: \",%s;\"Driver iD:\":%s,\"Display Mem: \":%s,\"Direct X: \":%s,\"Memoria Dedicada :\":%s}",Sm,Md,Mf,Hw,Dv,Dp,Dx,Dm);
        
	return dev;
    }
   
    
    
   
    
}
