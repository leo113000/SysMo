/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Leo J. Vazquez
 */
public interface NIC extends Networking
{
    Integer getIPv4();
    Integer getMACAdress();
    String getNombre();
}
