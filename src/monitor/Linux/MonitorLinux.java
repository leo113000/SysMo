/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;
import monitor.Monitor;





/**
 *
 * @author turin
 */
public class MonitorLinux extends Monitor {
    
 

    public MonitorLinux()
    {
	super(new LinuxCPU(),new LinuxMem(),new LinuxMother(),new LinuxNetworking(),new LinuxOS(),new LinuxSens());   

	//Pasar los valores a la clase padre con inicializador estático
    }

    
   
    
    
}
