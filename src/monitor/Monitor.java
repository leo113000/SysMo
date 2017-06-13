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
    iGPU gpuMonitor;
    iMemoria memMonitor;
    iMother motherMonitor;
    iOS osMonitor;
    iNetworking networkingMonitor;
    iSensores sensMonitor;
    ArrayList<JsonSerializable> serializables;

    public Monitor(iCPU cpuMonitor, iGPU gpuMonitor, iMemoria memMonitor, iMother motherMonitor, iNetworking nicMonitor, iOS osMonitor, iSensores sensMonitor)
    {
	this.cpuMonitor = cpuMonitor;
	this.gpuMonitor = gpuMonitor;
	this.memMonitor = memMonitor;
	this.motherMonitor = motherMonitor;
	this.osMonitor = osMonitor;
	this.networkingMonitor = nicMonitor;
	//chequeen este try.choto pero para que no pase nada raro
        try{
            this.sensMonitor = sensMonitor;
        }
        catch(Exception e){
            this.sensMonitor=null;
            System.out.println("---ERROR SENSORS");
             throw e;
        
    }
        //aca corta :)
	
        serializables = new ArrayList();

    }

    public iCPU getCpuMonitor()
    {
	return cpuMonitor;
    }

    public iGPU getGpuMonitor()
    {
	return gpuMonitor;
    }
    
    
    public iMemoria getMemMonitor()
    {
	return memMonitor;
    }

    public iMother getMotherMonitor()
    {
	return motherMonitor;
    }

    public iOS getOsMonitor()
    {
	return osMonitor;
    }

    public iNetworking getNetworkingMonitor()
    {
	return networkingMonitor;
    }

    public iSensores getSensMonitor()
    {
	return sensMonitor;
    }

    public void SetSerializable()
    {
	this.serializables.add(this.cpuMonitor);
	this.serializables.add(this.gpuMonitor);
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
    public String ToJson()
    {

	return String.format("{\"Cpu\":%s,\"Memoria\":%s,\"Mother\":%s,\"NIC\":%s,\"OS\":%s,\"Sensores\":%s,\"Gpu\".%s}", this.cpuMonitor.ToJson(), this.memMonitor.ToJson(), this.motherMonitor.ToJson(), this.networkingMonitor.ToJson(), this.osMonitor.ToJson(), this.sensMonitor.ToJson(),this.getGpuMonitor().ToJson());

    }

}
