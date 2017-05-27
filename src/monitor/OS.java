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
public abstract class OS implements iOS{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
