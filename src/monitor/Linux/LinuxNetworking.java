/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import monitor.Networking;
import monitor.iNIC;
import oshi.hardware.platform.linux.LinuxNetworks;

/**
 *
 * @author Leo J. Vazquez
 */
class LinuxNetworking extends Networking
{

    public LinuxNetworking()
    {
	super(new LinuxNetworks());
    }

}
