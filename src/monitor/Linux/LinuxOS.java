/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.OS;
import oshi.software.common.AbstractOperatingSystem;
import oshi.software.os.linux.LinuxOperatingSystem;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxOS extends OS{

    public LinuxOS() {
        super(new LinuxOperatingSystem());
    }

    @Override
    public String getFamiliaOS()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVersionOS()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFabricanteOS()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
