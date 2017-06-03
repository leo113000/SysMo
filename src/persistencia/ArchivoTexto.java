/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dario
 */
public class ArchivoTexto {
    
    private FileWriter file=null;
    protected String extention=null;
    
    public ArchivoTexto()throws IOException{
        
        this(".txt");
        
        
    }
    
    public ArchivoTexto(String ext){
        
        this.extention=ext;
    }
    
    public void escribir(String cadena) throws IOException{
        
        try{
            file.append(cadena);
           
      }
        catch(IOException e){
            throw e;
        }
    }
        @Override
    
        public void finalize(){
    
            
            
        }

        
        
        
        
        
        
    }
    
        
    
}
