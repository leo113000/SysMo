/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

/**
 *
 * @author turin
 */
public class ArchivoJSON extends ArchivoTexto {
    
    private String json;
   // private String ruta=System.getProperty("user.dir")+"MonitorDeSistema"+String.valueOf(new Date())+".json";

   
    
    public ArchivoJSON(String Js) throws IOException{
        super(System.getProperty("user.dir")+"MonitorDeSistema"+String.valueOf(new Date())+".json");
        this.json=Js;
    }
    
      public void Create() throws IOException{
         this.Write(this.json);
          
      }
    /**
     * Escribe la cadena JSON en el archivo
     * @param cadenaJson
     * @throws IOException 
     */
    
    
    /**
     * Devuelve la cadena JSON asociada a la clave provista
     * { 'pirulo': 'Esta es la cadena asociada a pirluo' }
     * @param clave 
     * @return 'Esta es la cadena asociada a pirulo' si clave = 'pirulo'
     */
    public String leer(String clave) {
        this.abrir();
        /*
        ....
        */
        return "";
    }
    
    /**
     * Abre el archivo con el cual se va a interactuar
     */
    private void abrir(){
        /*
        ....
        */
    }

    @Override
    protected void finalize() throws Throwable {
        file.flush();
        file.close();
        super.finalize();
    }
}
