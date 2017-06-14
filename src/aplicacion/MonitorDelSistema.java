package aplicacion;

import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFrame;
import monitor.Linux.MonitorLinux;
import monitor.Monitor;
import monitor.Windows.MonitorWindows;
import oshi.SystemInfo;
import ui.Home;

/**
 *
 * @author edwin
 */
public class MonitorDelSistema
{

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException, Exception
    {


	/*
        Aquí preparo un hashmap con los argumentos de entrada de la aplicación
	 */
	HashMap<String, String> argumentos = new HashMap<>();

	argumentos.put("gui", "true"); //Sin args, por defecto se muestran los datos por consola
	argumentos.put("refresh", "500"); //Por defecto los datos se refrescan c/ medio segundo
	
	//A cada string parámetro lo divido en el igual y uso el miembro de la 
	//izquierda como clave y al de la derecha como valor en el hashmap	
	for (String a : args)
	{
	    String[] partesArgumento = a.split("="); //Divido el string en el '='
	    argumentos.put(partesArgumento[0], partesArgumento[1]); //Pongo clave y valor en el map
	}

	Monitor master = crearMonitor();


	/*
        Aquí, si se provee el parámetro gui muestro la interfaz de usuario
	 */
	Home ventanaHome = null;

	if (argumentos.get("gui").equals("true"))
	{
	    ventanaHome = construirHome(master);
	    ventanaHome.setVisible(true);
	    while (true)
	    {
		/*
                Aquí se muestra una ventana de ejemplo. Se actualizan los datos 
                en función de la frecuencia de actualización establecida por el 
                jslider.
		 */

		ventanaHome.actualizarDatosSensorYCarga();

		// Esta es la manera de poner el hilo actual en pausa
		// por el tiempo que se necesite en milisegundos
		Thread.sleep(ventanaHome.getFrecuenciaActualizacion());
	    }
	} else
	{
	    master.mostrarDatos(1000);
	}

    }

    /**
     * Construye una instancia de Home y setea algunos atributos
     *
     * @param monitor
     * @return
     */
    private static Home construirHome(Monitor monitor)
    {
	Home home = new Home(monitor);

	home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	home.setSize(800, 600);
	return home;

    }

    private static Monitor crearMonitor() throws Exception
    {
	Monitor moni;

	switch (SystemInfo.getCurrentPlatformEnum())
	{
	    //Armo los casos para cada OS
	    case LINUX:
		System.out.println("Usted tiene Linux instalado");
		moni = new MonitorLinux();
		break;
	    case WINDOWS:
		System.out.println("Usted tiene Windows instalado");
		moni = new MonitorWindows();
		break;
	    default:
		throw new Exception("Su sistema operativo aún no está soportado");
	}

	return moni;
    }
}
