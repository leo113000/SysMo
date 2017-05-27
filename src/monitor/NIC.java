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
       // La función devuelve un arreglo de String que solo tiene contenido en el primer espacio
       //Considerar devolver otra cosa o ver mejor manera de devolverlo como Integer
	
       String[] aux=nic.getIPv4addr();
       System.out.println(aux[0]);
       
       return null;
    }

    @Override
    public Integer getMACAdress() {
        return Integer.parseInt(nic.getMacaddr()); //Quizas modificar a String
    }

    @Override
    public String getNombre() {
        return nic.getName();
    }

}
