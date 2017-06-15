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
    
    iGPU gpuMonitor;
    
    

    public Monitor(iCPU cpuMonitor, iGPU gpuMonitor, iMemoria memMonitor, iMother motherMonitor, iNetworking nicMonitor, iOS osMonitor, iSensores sensMonitor)
    {
	this.cpuMonitor = cpuMonitor;
	this.memMonitor = memMonitor;
	this.motherMonitor = motherMonitor;
	this.osMonitor = osMonitor;
	this.networkingMonitor = nicMonitor;
	
	try
	{
	    this.sensMonitor = sensMonitor;
	} catch (Exception e)
	{
	    this.sensMonitor = null;
	    System.out.println("---ERROR SENSORS");
	    throw e;

	}

	serializables = new ArrayList();
	
	this.gpuMonitor=gpuMonitor;

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

	for (JsonSerializable js : serializables)
	{

	    System.out.println(js.ToJson());
	}

    }

    @Override
    public String ToJson()
    {

	return String.format("{\"Cpu\":%s,\"Memoria\":%s,\"Mother\":%s,\"NIC\":%s,\"OS\":%s,\"Sensores\":%s,\"Gpu\".%s}", this.cpuMonitor.ToJson(), this.memMonitor.ToJson(), this.motherMonitor.ToJson(), this.networkingMonitor.ToJson(), this.osMonitor.ToJson(), this.sensMonitor.ToJson(), this.getGpuMonitor().ToJson());

    }
    
    
    public void mostrarDatos(Integer refresco)
    {

	System.out.println("\n");
	
	System.out.println(osMonitor);

	System.out.println("\n");
	System.out.println("CPU:");
	System.out.println(cpuMonitor);

	System.out.println("\n");

	System.out.println("Memoria:");

	System.out.println(memMonitor);

	System.out.println("\n");

	System.out.println("Motherboard");
	System.out.println(motherMonitor);

	System.out.println("\n");

	System.out.println("Network");
	System.out.println(networkingMonitor);

	System.out.println("\n");

	System.out.println("GPU");
	
	Thread pepe;
	
	System.out.println(gpuMonitor);

	System.out.println("\n");

	System.out.println("\t\t\t ----Real Time Data---- \n");
	while (true)
	{
	    System.out.print("\r                                                               ");
	    //La linea de arriba borra la linea con la información anterior para que no quede mal la impresión
	    System.out.print("\rUso Actual: " + getCpuMonitor().getUsoActualCPU() + "%");
	    System.out.print(" - ");
	    System.out.print("Temp CPU: " + getSensMonitor().getTempCPU());
	    System.out.print(" - ");
	    System.out.print("Memoria en uso: " + getMemMonitor().getMemFisicaUso() + "Mb");

	    try
	    {
		Thread.sleep(refresco);
	    } catch (InterruptedException ex)
	    {

	    }

	}
    }
    
    
    
}
