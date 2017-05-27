/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.CPU;
import oshi.hardware.platform.windows.WindowsCentralProcessor;

/**
 *
 * @author Leo J. Vazquez
 */
public class WindowsCPU extends CPU{

    public WindowsCPU() {
        super(new WindowsCentralProcessor());
    }
        
}
