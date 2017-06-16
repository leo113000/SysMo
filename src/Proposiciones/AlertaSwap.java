/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proposiciones;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo J. Vazquez
 */
public class AlertaSwap
{

    private static void alertaCore() throws InterruptedException
    {
	int i = 0;

	JFrame j = new JFrame("Alerta");

	while (i != 6)
	{

	    System.out.println("USAGE=" + i + "%");
	    if (i == 5)
	    {
		//JOptionPane.showMessageDialog(null, "El SWAP alcanzó el 5%");
		JOptionPane.showMessageDialog(j,
			"EL SWAP ESTA AL 5%",
			"ALERTA",
			JOptionPane.WARNING_MESSAGE);
	    }
	    Thread.sleep(1000);
	    i++;
	}

	System.out.println("SIMULACIÓN DE ALERTA SWAP EXITOSA");

    }

    public static void alerta()
    {
	try
	{
	    alertaCore();
	} catch (Exception e)
	{

	}
    }
}
