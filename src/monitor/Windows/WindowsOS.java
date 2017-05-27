/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.OS;
import oshi.json.software.os.OperatingSystem;
import oshi.software.os.windows.WindowsOperatingSystem;

/**
 *
 * @author Leo J. Vazquez
 */
public class WindowsOS extends OS{
    
    public WindowsOS() {
        super(new WindowsOperatingSystem());
    }
    
       
}
