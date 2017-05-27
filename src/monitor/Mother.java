/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.Baseboard;
import oshi.hardware.common.AbstractBaseboard;
import oshi.hardware.common.AbstractHardwareAbstractionLayer;

/**
 *
 * @author Usuario
 */
public abstract class Mother implements iMother{

    private AbstractHardwareAbstractionLayer mother;

    public Mother(AbstractHardwareAbstractionLayer mother) {
        this.mother = mother;
    }
       
    @Override
    public String getMarcaMother() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getModeloMother() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
