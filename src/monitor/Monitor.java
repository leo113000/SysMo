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
    iCPU cpuMonitor;
    iMemoria memMonitor;
    iMother motherMonitor;
    iOS osMonitor;
    iNetworking networkingMonitor;
    iSensores sensMonitor;

    public Monitor(iCPU cpuMonitor, iMemoria memMonitor, iMother motherMonitor,iNetworking nicMonitor, iOS osMonitor,  iSensores sensMonitor)
    {
	this.cpuMonitor = cpuMonitor;
	this.memMonitor = memMonitor;
	this.motherMonitor = motherMonitor;
	this.osMonitor = osMonitor;
	this.networkingMonitor = nicMonitor;
	this.sensMonitor = sensMonitor;
    }
    
    public Monitor(iCPU ma)
    {
        
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

    
}
