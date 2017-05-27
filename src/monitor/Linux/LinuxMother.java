/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.Mother;
import oshi.hardware.platform.linux.LinuxHardwareAbstractionLayer;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxMother extends Mother{

    public LinuxMother() {
        super(new LinuxHardwareAbstractionLayer());
    }

    
}
