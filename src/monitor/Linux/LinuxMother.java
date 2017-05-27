/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.Mother;
import oshi.hardware.common.AbstractHardwareAbstractionLayer;
import oshi.hardware.platform.linux.LinuxHardwareAbstractionLayer;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxMother extends Mother{

    public LinuxMother() {
        super(new LinuxHardwareAbstractionLayer());
    }

    @Override
    public String getMarcaMother()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getModeloMother()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
