/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.Mother;
import oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer;



/**
 *
 * @author Leo J. Vazquez
 */
public  class WindowsMother extends Mother{

    public WindowsMother() {
        super(new WindowsHardwareAbstractionLayer());
    
        
    }
    
    
    
}
