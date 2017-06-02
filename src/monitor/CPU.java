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
        return cpu.getFamily();
    }

    @Override
    public String getModeloCPU() {
        return cpu.getModel();
    }

    @Override
    public String getFabricanteCPU() {
        return cpu.getVendor(); //Creo que este es el vendedor segun Google Translate
    }

    @Override
    public Integer getNucleosLogicosCPU() {
        return cpu.getLogicalProcessorCount();
    }

    @Override
    public Integer getNucleosFisicosCPU() {
        return cpu.getPhysicalProcessorCount();
    }

    @Override
    public Double getUsoActualCPU() {
        return cpu.getSystemCpuLoad();
    }
    
    @Override
    
    public Boolean getArquitecturaCPU(){
        
        return cpu.isCpu64bit();
        
    }

    @Override
    public String ToJson() {
        
        
        int Nf=this.getNucleosFisicosCPU();
        int Nl =this.getNucleosLogicosCPU();
        
         return String.format("{\"Nucleos Fisicos:\":%d,\"Nucleos Logicos :\":%d}",Nf,Nl);
    
        
    
    }
    
}
