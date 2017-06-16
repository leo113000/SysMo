/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 *
 * @author Leo J. Vazquez
 */
public class ArchivoCSV extends ArchivoTexto
{

    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final Object[] FILE_HEADER =
    {
	"Sistema Operativo","Version SO",
	"Fabricante CPU", "Núcleos Físicos","Núcleos Lógicos","Arquitectura",
	"Fabricante GPU","Modelo GPU",
	"Memoria física total","Memoria Swap total",
	"Fabricante Mother","Modelo Mother",
	"NIC 1: IPv4","NIC 1: Nombre","NIC 1: MAC Address",
	"NIC 2: IPv4","NIC 2: Nombre","NIC 2: MAC Address",
	"NIC 3: IPv4","NIC 3: Nombre","NIC 3: MAC Address",
	"NIC 4: IPv4","NIC 4: Nombre","NIC 4: MAC Address"
	
    };

    private ArrayList<String> csv;

    public ArchivoCSV(ArrayList<String> csv) throws IOException
    {
	super(System.getProperty("user.dir") + "MonitorDeSistema" + String.valueOf(new Date()) + ".csv");
	System.out.println(System.getProperty("user.dir") + "MonitorDeSistema" + String.valueOf(new Date()) + ".csv");
	this.csv = csv;
    }

    public void create() throws IOException
    {	
	CSVPrinter csvFilePrinter = null;
	
	try
	{

	    CSVFormat csvFileFormat
		    = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);

	    csvFilePrinter = new CSVPrinter(file, csvFileFormat);

	    System.out.println(csv);

	    csvFilePrinter.printRecord(FILE_HEADER);

	    csvFilePrinter.printRecord(csv);

	    System.out.println("CSV CORRECTAMENTE ESCRITO");

	} catch (Exception e)
	{
	    System.out.println("Error en escritura");
	} finally
	{
	    try
	    {

		cerrarArchivo();
		csvFilePrinter.close();

	    } catch (Exception e)
	    {

		System.out.println("Error al cerrar archivo");
	    }
	}

    }
}
