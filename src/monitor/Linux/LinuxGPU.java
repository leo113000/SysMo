/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.Linux;

import java.io.IOException;
import monitor.GPU;

/**
 *
 * @author Leo J. Vazquez
 */
public class LinuxGPU extends GPU
{
    
    public LinuxGPU()
    {
	super(new LinuxGraphics());
    }
    
}
