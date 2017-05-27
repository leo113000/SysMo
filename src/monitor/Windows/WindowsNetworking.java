/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.Networking;
import oshi.hardware.platform.windows.WindowsNetworks;

/**
 *
 * @author Leo J. Vazquez
 */
public class WindowsNetworking extends Networking
{

    public WindowsNetworking()
    {
	super(new WindowsNetworks());
    }

}
