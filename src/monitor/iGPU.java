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
public interface iGPU extends JsonSerializable
{

    String getDriverID();
    String getHardwareID();

    String getManufacturer();
    String getModel();

    String getDirectX();

    String getDisplayMemory();
    String getDedicatedMemory();
    String getSharedMemory();
}
