/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;





/**
 *
 * @author Usuario
 */
public abstract class OS implements iOS,JsonSerializable{

    private OperatingSystem sys;

    public OS(OperatingSystem sys) {
        this.sys = sys;
    }
    
    @Override
    public String getFamiliaOS() {
        return sys.getFamily();
    }

    @Override
    public String getVersionOS() {
	
	OperatingSystemVersion osVersion = sys.getVersion();
	
	return osVersion.getVersion() 
		+" - "+ osVersion.getCodeName() +" - "+ osVersion.getBuildNumber();
	// Tiene todo esos datos se podría ver otra forma de manejarlos, quizas funciones aparte
    }

    @Override
    public String getFabricanteOS() {
        return sys.getManufacturer();
    }

    @Override
    public String ToJson() {
       
    return String.format("{\"Familia\":%s,\"Versio\":%s,\"Fabricante\":%s}",this.getFamiliaOS(),this.getVersionOS(),this.getFabricanteOS());
    
    }
    
}
