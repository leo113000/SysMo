/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author turin
 */
public class ArchivoJSON extends ArchivoTexto {
    
    private String json;

   
    
    public ArchivoJSON(String Js) throws IOException {
        super(System.getProperty("user.dir")+"MonitorDeSistema"+String.valueOf(new Date())+".json");
        this.json=Js;
    }
    
      public void create(){
	 try{
	      this.Write(this.json);
	System.out.println("JSON CREADO CORRECTAMENTE");
	 } catch(Exception e)
	 {
	     System.out.println("ERROR AL CREAR JSON");
	 }
        
          
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
