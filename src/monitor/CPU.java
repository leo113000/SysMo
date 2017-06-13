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
    public String getFamiliaCPU() {  // Un poco mas "decoroso el string"
        
        String fam=cpu.getFamily()+"th generation";
        
        return fam;
    }

    @Override
    public String getModeloCPU() {  //pendiente de resolucion, por ahora queda en numero
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
        
	Double rta=cpu.getSystemCpuLoad(); //El valor del uso con doble presición
	return Math.rint(rta*100); //esto lo que hace es dejarlo con dos decimales
    }
    
    @Override
    
    public String getArquitecturaCPU(){
	
	return cpu.isCpu64bit()? "x64" : "x86";
        
    }

    @Override
    public String ToJson() {
        
        
        int Nf=this.getNucleosFisicosCPU();
        int Nl =this.getNucleosLogicosCPU();
        double uso=this.getUsoActualCPU();
        String arq=this.getArquitecturaCPU();
        String fab=this.getFabricanteCPU();
        String fam=this.getFamiliaCPU();
        
         return String.format("{\"Nucleos Fisicos:\":%d,\"Nucleos Logicos :\":%d,\"Uso:\":,%.2f,\"Arquitectura:\":%s,\"Fabricante:\":%s,\"Familia:\":%s}",Nf,Nl,uso,arq,fab,fam);
    
        //se agregaron datos que faltaban, uso, fabricante y familia.
    
    }
    
}
