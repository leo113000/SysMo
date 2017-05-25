/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author turin
 */
public abstract class Monitor
{
    CPU cpuMonitor;
    Memoria memMonitor;
    Mother motherMonitor;
    OS osMonitor;
    Networking nicMonitor; //Solucionar esto
    Sensores sensMonitor;

    public Monitor(CPU cpuMonitor, Memoria memMonitor, Mother motherMonitor,/* NIC o Networking, */ OS osMonitor,  Sensores sensMonitor)
    {
	this.cpuMonitor = cpuMonitor;
	this.memMonitor = memMonitor;
	this.motherMonitor = motherMonitor;
	this.osMonitor = osMonitor;
	//this.nicMonitor = nicMonitor;
	this.sensMonitor = sensMonitor;
    }

    public CPU getCpuMonitor()
    {
	return cpuMonitor;
    }

    public Memoria getMemMonitor()
    {
	return memMonitor;
    }

    public Mother getMotherMonitor()
    {
	return motherMonitor;
    }

    public OS getOsMonitor()
    {
	return osMonitor;
    }

    public Networking getNicMonitor()
    {
	return nicMonitor;
    }

    public Sensores getSensMonitor()
    {
	return sensMonitor;
    }
    
    
}
