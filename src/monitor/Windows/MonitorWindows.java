/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.Monitor;

/**
 *
 * @author turin
 */
public class MonitorWindows extends Monitor {

    public MonitorWindows()
    {
	super(new WindowsCPU(),new WindowsGPU(),new WindowsMem(), new WindowsMother(), new WindowsNetworking(), new WindowsOS(),new WindowsSens());
	//Pasar los valores a la clase padre instanciando objetos directamente
	
    }
    
    
}
