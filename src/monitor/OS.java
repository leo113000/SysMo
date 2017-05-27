/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.software.common.AbstractOperatingSystem;

/**
 *
 * @author Usuario
 */
public abstract class OS implements iOS{

    private AbstractOperatingSystem sys;

    public OS(AbstractOperatingSystem sys) {
        this.sys = sys;
    }
    
    @Override
    public String getFamiliaOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVersionOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFabricanteOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
