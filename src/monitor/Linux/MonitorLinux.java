/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;
import monitor.Monitor;
import monitor.CPU;
import monitor.Memoria;
import monitor.Mother;
import monitor.NIC;
import monitor.OS;
import monitor.Sensores;





/**
 *
 * @author turin
 */
public class MonitorLinux extends Monitor {
    
    static CPU cpuMonitor;
    static Memoria memMonitor;
    static Mother motherMonitor;
    static OS osMonitor;
    static NIC nicMonitor;
    static Sensores sensMonitor;
    
    static {
	cpuMonitor=new LinuxCPU();
	memMonitor=new LinuxMem();
	motherMonitor=new LinuxMother();
	osMonitor= new LinuxOS();
	nicMonitor= new LinuxNIC();
	sensMonitor= new LinuxSens();
    }

    public MonitorLinux()
    {
	super(cpuMonitor,memMonitor,motherMonitor,nicMonitor,osMonitor,sensMonitor);   

	//Pasar los valores a la clase padre con inicializador estático
    }

    
   
    
    
}
