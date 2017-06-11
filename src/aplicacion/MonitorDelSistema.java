package aplicacion;

import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFrame;
import monitor.Linux.LinuxNetworking;
import monitor.Linux.MonitorLinux;
import monitor.Monitor;
import monitor.iNIC;
import monitor.iNetworking;
import oshi.SystemInfo;
import persistencia.ArchivoJSON;
import ui.Home;

/**
 *
 * @author edwin
 */
public class MonitorDelSistema {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException, Exception {
      
        //Bloque para probar metodo de redes
//	Networks leo=new LinuxNetworks();
//	NetworkIF[] leox=leo.getNetworks();
//	String cuerda[]=leox[0].getIPv6addr();
//	System.out.println(cuerda[0]);
	
	/*iNetworking leo=new LinuxNetworking();
	
	iNIC[] nics=leo.getNics();
	
	System.out.println(nics[0].getIPv4());

	/*
        Aquí preparo un hashmap con los argumentos de entrada de la aplicación
        */  
      
        
        /*-------------------------------------------------------------
       
        Monitor testing=new MonitorLinux();
        ArchivoJSON testt=new ArchivoJSON(testing.ToJson());
        testt.Create();
        
        // Este moniTor lo use para testear la creacion del archivo JSon, esta
        guardando el archivo en la carpeta temporal porque hay confictos de 
        permisos, NO TOMA DATOS DE LA GPU
        **SOLUCIONADO**
       ------------------------------------------------- */
	
        
        HashMap<String, String> argumentos = new HashMap<>();
        //A cada string parámetro lo divido en el igual y uso el miembro de la 
        //izquierda como clave y al de la derecha como valor en el hashmap
        for(String a : args){
            String[] partesArgumento = a.split("="); //Divido el string en el '='
            argumentos.put(partesArgumento[0], partesArgumento[1]); //Pongo clave y valor en el map
        }
        
	
	///////////////////////BY LEO///////////////////////////////
	
	argumentos.put("gui", "true");
	
	///////////////////////BY LEO///////////////////////////////
	
	
        /*
        Aquí determino haciendo uso de un enum provisto en OSHI
        el sistema operativo actual
        */
        Home ventanaHome = null;
        // Entro en un switch con el resultado de getCurrentPlatformEnum()
        switch (SystemInfo.getCurrentPlatformEnum()) {
            //Armo los casos para cada OS
            case LINUX:
                System.out.println("Usted tiene Linux instalado");
                break;
            case WINDOWS:
                System.out.println("Usted tiene Windows instalado");
                break;
            default:
                throw new Exception("Su sistema operativo aún no está soportado");
        }
      
        
       
        //     ---Testeando salida de valores---
        
        /*Monitor testing=new MonitorLinux();
        System.out.println(testing.getMemMonitor().getMemFisicaTotal()+"Gb");
        System.out.println("memoria enn uso"+testing.getMemMonitor().getMemFisicaUso());
        
        /*
        Aquí, si se provee el parámetro gui muestro la interfaz de usuario
        */
        if(argumentos.get("gui").equals("true")){
            ventanaHome = construirHome(new MonitorLinux());
            ventanaHome.setVisible(true);
            while (true) {
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
        }
        
    }
    
    /**
     * Construye una instancia de Home y setea algunos atributos
     * @param monitor
     * @return 
     */
    private static Home construirHome(Monitor monitor) {
        Home home = new Home(monitor);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(800, 600);
        return home;
    }
}
