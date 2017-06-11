/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import monitor.Linux.MonitorLinux;
import monitor.Monitor;
import oshi.hardware.CentralProcessor;
import oshi.hardware.platform.linux.LinuxCentralProcessor;

/**
 *
 * @author Leo J. Vazquez
 */
public class TestMonitor
{

    public static void main(String[] args)
    {
	/*Monitor m = new MonitorLinux();

	System.out.println("\n\nCPU\n"); //Hay que cambiar el retorno por getName() los otros devuelven numeros
	System.out.println(m.getCpuMonitor().getArquitecturaCPU());
	System.out.println(m.getCpuMonitor().getFabricanteCPU()); 
	System.out.println(m.getCpuMonitor().getNucleosFisicosCPU());
	System.out.println(m.getCpuMonitor().getNucleosLogicosCPU());
	System.out.println(m.getCpuMonitor().getUsoActualCPU()); //error
	
	///////////////////devuelven números como dato //////////////////////////////////
	System.out.println(m.getCpuMonitor().getFamiliaCPU());
	System.out.println(m.getCpuMonitor().getModeloCPU());
	///////////////////devuelven números como dato //////////////////////////////////
	
	System.out.println("\n\nGPU\n");
	System.out.println(m.getGpuMonitor().getDirectX()); //no funciona en linux
	System.out.println(m.getGpuMonitor().getDedicatedMemory());//no funciona en linux
	System.out.println(m.getGpuMonitor().getSharedMemory());//no funciona en linux
	System.out.println(m.getGpuMonitor().getDisplayMemory());//no funciona en linux
	System.out.println(m.getGpuMonitor().getDriverID());
	System.out.println(m.getGpuMonitor().getHardwareID());
	System.out.println(m.getGpuMonitor().getManufacturer());
	System.out.println(m.getGpuMonitor().getModel());

	System.out.println("\n\nMEMORIA\n");
	System.out.println(m.getMemMonitor().getMemFisicaTotal());
	System.out.println(m.getMemMonitor().getMemFisicaUso());
	System.out.println(m.getMemMonitor().getMemSwapTotal());
	System.out.println(m.getMemMonitor().getMemSwapUso());

	System.out.println("\n\n MOTHER \n");
	System.out.println(m.getMotherMonitor().getMarcaMother());
	System.out.println(m.getMotherMonitor().getModeloMother());

	System.out.println("\n\n NETWORK \n");
	System.out.println(m.getNetworkingMonitor().getNics()[0].getIPv4());
	System.out.println(m.getNetworkingMonitor().getNics()[0].getMACAdress());
	System.out.println(m.getNetworkingMonitor().getNics()[0].getNombre());

	System.out.println("\n\nOperative System\n");
	System.out.println(m.getOsMonitor().getFabricanteOS());
	System.out.println(m.getOsMonitor().getFamiliaOS());
	System.out.println(m.getOsMonitor().getVersionOS());

	System.out.println("\n\nSENSORES\n");
	System.out.println(m.getSensMonitor().getTempCPU()); 
	System.out.println(m.getSensMonitor().getVelVentiladores()[0]); //No funciona
	System.out.println(m.getSensMonitor().getVoltajeCPU()); //No funciona

	System.out.println("JSON");
	System.out.println(m.ToJson());*/
	
	CentralProcessor c=new LinuxCentralProcessor();
	
	System.out.println(c.getIdentifier());
	System.out.println(c.getProcessorID());
	
	
    }
}
