/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dario
 */
public class ArchivoTexto
{

    protected FileWriter file;
    protected String extention;

    public ArchivoTexto()
    {
	this.extention = ".txt";
    }

    public ArchivoTexto(String path) throws IOException
    {
	try
	{
	    file = new FileWriter(path);
	} catch (IOException e)
	{
	    System.out.println("---Create File Error---");
	    throw e;
	}

    }

    public void Write(String contain) throws IOException
    {
	try
	{
	    file.append(contain);
	} catch (IOException e)
	{
	    System.out.println("---Write Error---");
	    throw e;

	}

	file.flush();
	file.close();

    }

    public void cerrarArchivo()
    {
	try
	{
	    file.flush();
	    file.close();
	} catch (Exception e)
	{
	    System.out.println("ERROR AL CERRAR ARCHIVO");
	}
    }

}
