/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.GlobalMemory;

/**
 *
 * @author Usuario
 */
public abstract class Memoria implements iMemoria
{

    private GlobalMemory memory;

    public Memoria(GlobalMemory memory)
    {
	this.memory = memory;
    }

    @Override
    public Integer getMemFisicaTotal()
    {
	return (int) memory.getTotal();
    }

    @Override
    public Integer getMemSwapTotal()
    {
	return (int) memory.getSwapTotal();
    }

    @Override
    public Integer getMemFisicaUso()
    {
	return (int) (memory.getTotal() - memory.getAvailable()); //Memoria total - disponible=memoria en uso
    }

    @Override
    public Integer getMemSwapUso()
    {
	return (int) memory.getSwapUsed();
    }

    @Override
    public String ToJson() {
       
     Integer L=(int)this.getMemFisicaTotal();
     Integer T=(int)this.getMemSwapTotal();
        
        return String.format("{\"MemFisicaTotal\":%s,\"MemSwapTotal\":%s}",L,T);
        
       
    }

}
