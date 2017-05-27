/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.Memoria;
import oshi.hardware.GlobalMemory;
import oshi.hardware.platform.windows.WindowsGlobalMemory;

/**
 *
 * @author Leo J. Vazquez
 */
public class WindowsMem extends Memoria{

    public WindowsMem() {
        super(new WindowsGlobalMemory());
    }

    
}
