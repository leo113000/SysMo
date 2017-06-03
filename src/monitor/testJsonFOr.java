/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import java.util.Arrays;
import monitor.Linux.MonitorLinux;
import oshi.hardware.NetworkIF;
import oshi.hardware.Networks;
import oshi.hardware.platform.linux.LinuxNetworks;

/**
 *
 * @author dario
 */
public class testJsonFOr {

    public static void main(String args[]) {

        Monitor mon = new MonitorLinux();
        //System.out.println(mon.networkingMonitor.ToJson());
       mon.SetSerializable();
        
       // Networks leo=new LinuxNetworks();
        
        //NetworkIF[] nets= leo.getNetworks();
        
        //System.out.println(nets[0].getMacaddr());
    }

}
