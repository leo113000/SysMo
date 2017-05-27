/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.Memoria;
import oshi.hardware.platform.linux.LinuxGlobalMemory;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxMem extends Memoria
{

    public LinuxMem() {
        super(new LinuxGlobalMemory());
    }
    
}
