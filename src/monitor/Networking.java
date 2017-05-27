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
public abstract class Networking implements iNetworking
{

    private Networks net;
    private iNIC[] nics;

    public Networking(Networks net)
    {
	this.net = net;
	crearNics();
    }

    private void crearNics()
    {
	
	
    }

    @Override
    public iNIC[] getNics()
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
