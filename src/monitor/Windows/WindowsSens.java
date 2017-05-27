/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Windows;

import monitor.Sensores;
import oshi.hardware.Sensors;
import oshi.hardware.platform.windows.WindowsSensors;

/**
 *
 * @author Leo J. Vazquez
 */
public class WindowsSens extends Sensores
{

    public WindowsSens() {
        super(new WindowsSensors());
    }

    
}
