/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import java.util.ArrayList;

/**
 *
 * @author turin
 */
public abstract class Monitor implements JsonSerializable
{
    iCPU cpuMonitor;
    iMemoria memMonitor;
    iMother motherMonitor;
    iOS osMonitor;
    iNetworking networkingMonitor;
    iSensores sensMonitor;
    ArrayList<JsonSerializable> serializables;

    public Monitor(iCPU cpuMonitor, iMemoria memMonitor, iMother motherMonitor,iNetworking nicMonitor, iOS osMonitor,  iSensores sensMonitor)
    {
	this.cpuMonitor = cpuMonitor;
	this.memMonitor = memMonitor;
	this.motherMonitor = motherMonitor;
	this.osMonitor = osMonitor;
	this.networkingMonitor = nicMonitor;
	this.sensMonitor = sensMonitor;
        serializables=new ArrayList();
        
    }
    

    public iCPU getCpuMonitor() {
        return cpuMonitor;
    }

    public void setCpuMonitor(iCPU cpuMonitor) {
        this.cpuMonitor = cpuMonitor;
    }

    public iMemoria getMemMonitor() {
        return memMonitor;
    }

    public void setMemMonitor(iMemoria memMonitor) {
        this.memMonitor = memMonitor;
    }

    public iMother getMotherMonitor() {
        return motherMonitor;
    }

    public void setMotherMonitor(iMother motherMonitor) {
        this.motherMonitor = motherMonitor;
    }

    public iOS getOsMonitor() {
        return osMonitor;
    }

    public void setOsMonitor(iOS osMonitor) {
        this.osMonitor = osMonitor;
    }

    public iNetworking getNicMonitor() {
        return networkingMonitor;
    }

    public void setNicMonitor(iNetworking nicMonitor) {
        this.networkingMonitor = nicMonitor;
    }

    public iSensores getSensMonitor() {
        return sensMonitor;
    }

    public void setSensMonitor(iSensores sensMonitor) {
        this.sensMonitor = sensMonitor;
    }
    public void SetSerializable(){
        this.serializables.add(this.cpuMonitor);
        this.serializables.add(this.memMonitor);
        this.serializables.add(this.motherMonitor);
        this.serializables.add(this.networkingMonitor);
        this.serializables.add(this.osMonitor);
        this.serializables.add(this.sensMonitor);
        
        for(JsonSerializable js:serializables){
            
            System.out.println(js.ToJson());
            
        }
        
        
    }

    @Override
    public String ToJson() {
        
        
        
        
       return String.format("{\"Cpu\":%s,\"Memoria\":%s,\"Mother\":%s,\"NIC\":%s,\"OS\":%s,\"Sensores\":%s}",this.cpuMonitor.ToJson(),this.memMonitor.ToJson(),this.motherMonitor.ToJson(),this.networkingMonitor.ToJson(),this.osMonitor.ToJson(),this.sensMonitor.ToJson());
    
        
    
    }

    
}
