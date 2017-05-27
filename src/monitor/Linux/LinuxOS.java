/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.OS;
import oshi.software.os.linux.LinuxOperatingSystem;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxOS extends OS{

    public LinuxOS() {
        super(new LinuxOperatingSystem());
    }
    
}
