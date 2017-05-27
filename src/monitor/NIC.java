/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.NetworkIF;
import oshi.hardware.Networks;

/**
 *
 * @author Usuario
 */
public class NIC implements iNIC {

    private NetworkIF nic;

    public NIC(NetworkIF nic) {
        this.nic = nic;
    }

    @Override
    public Integer getIPv4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getMACAdress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
