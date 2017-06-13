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
	NetworkIF[] nets = net.getNetworks();
	iNIC[] aux = new iNIC[nets.length]; // Se crea un arreglo de iNIC (aun no construidas)

	int i = 0;

	for (NetworkIF iNet : nets)
	{
	    aux[i] = new NIC(iNet);//Se construye cada espacio del array
	    i++;
	}
	
	this.nics=aux;

    }

    @Override
    public iNIC[] getNics()
    {
	return nics;
    }

    @Override
    public String ToJson()
    {
	String g="";
        int i=0;
        
        for(iNIC nn:this.getNics()){
            
            
            g+="Nic:"+i+nn.ToJson();
            
            //asignacion de indentificador para cada NIC.
            
        }
         
        return g;
    }
    
    

}
