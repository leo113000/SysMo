/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proposiciones;

/**
 *
 * @author Leo J. Vazquez
 */
public class DataRefresh
{
    public static void refrescarDatosCada(long time) throws InterruptedException
    {
	while(true)
	{
	    //Se actualizan los datos
	    Thread.sleep(time);
	}
	
	
    }
}
