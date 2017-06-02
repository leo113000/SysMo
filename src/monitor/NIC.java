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
    public String getIPv4() {

	//Ver que devuelve bien IPv4Addr
       String[] aux=nic.getIPv4addr();
       return aux[0];
    }

    @Override
    public String getMACAdress() {
        return nic.getMacaddr(); 
    }

    @Override
    public String getNombre() {
        return nic.getName();
    }

    @Override
    public String ToJson() {
       
        return String.format("{\"Ipv4\":%d,\"Mac Adress\":%d,\"Nombre\":%s}",this.getIPv4(),this.getMACAdress(),this.getNombre());
                
    }

}
