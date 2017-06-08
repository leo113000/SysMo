/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.NetworkIF;

/**
 *
 * @author Usuario
 */
public class NIC implements iNIC
{

    private NetworkIF nic;

    public NIC(NetworkIF nic)
    {
	this.nic = nic;
    }

    @Override
    public String getIPv4()
    {

	String[] aux = nic.getIPv4addr();

	String rta = "";

	for (String s : aux)
	{
	    rta += s;
	}

	return rta;
    }

    @Override
    public String getMACAdress()
    {
	return nic.getMacaddr();
    }

    @Override
    public String getNombre()
    {
	return nic.getName();
    }

    @Override
    public String ToJson()
    {

	return String.format("{\"Ipv4\":%s,\"Mac Adress\":%s,\"Nombre\":%s}", this.getIPv4(), this.getMACAdress(), this.getNombre());

    }

}
