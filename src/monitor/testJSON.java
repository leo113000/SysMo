/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import monitor.Linux.MonitorLinux;

/**
 *
 * @author dario
 */
public class testJSON {
    
    public static void main(String[] args){
        
        Monitor test=new MonitorLinux();
        Integer [] ven=test.getSensMonitor().getVelVentiladores();
        System.out.println(test.sensMonitor.getVoltajeCPU());
        
    }
}
