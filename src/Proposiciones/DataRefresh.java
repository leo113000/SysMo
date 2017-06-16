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
	int i=0;
	
	while (true && i<12)//el i es para que este bucle termine a fines practicos de seguir mostrando el programa
	{
	    
	    System.out.print("\rEl dato es: " + Math.floor(Math.random() * 100));
	    Thread.sleep(time);
	    
	    i++;
	}
	
    }
    
    
}
