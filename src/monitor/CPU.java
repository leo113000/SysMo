/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.CentralProcessor;

/**
 *
 * @author Usuario
 */
public abstract class CPU implements iCPU
{
    
    private CentralProcessor cpu;

    public CPU(CentralProcessor cpu) {
        this.cpu = cpu;
    }   
    
    @Override
    public String getFamiliaCPU() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String getModeloCPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFabricanteCPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getNucleosLogicosCPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getNucleosFisicosCPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getUsoActualCPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}