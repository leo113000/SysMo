/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proposiciones;

import org.json.JSONObject;

/**
 *
 * @author Leo J. Vazquez
 */
public class VerificadorJSON
{

    public static Boolean validaJSON(String texto)
    {
	Boolean rta = true;

	try
	{
	    JSONObject j = new JSONObject(texto);
	    j.toMap();
	    System.out.println("JSON CORRECTO");
	} catch (Exception e)
	{
	    System.out.println("Error en el JSON");
	    rta = false;
	}

	return rta;
    }
}
