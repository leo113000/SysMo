/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.CPU;
import oshi.hardware.platform.windows.WindowsCentralProcessor;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxCPU extends CPU
{

    public LinuxCPU() {
        super(new WindowsCentralProcessor());
    }
}
