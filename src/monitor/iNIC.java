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
public interface iNIC extends JsonSerializable
{
    String getIPv4();
    String getMACAddress();
    String getNombre();
    long getBytesSend();
    long getBytesRecv();
}
