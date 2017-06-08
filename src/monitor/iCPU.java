/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Leo J. Vazquez
 */
public interface iCPU extends JsonSerializable
{
    String getFamiliaCPU();
    String getModeloCPU();
    String getFabricanteCPU();
    Integer getNucleosLogicosCPU();
    Integer getNucleosFisicosCPU();
    Double getUsoActualCPU();
    String getArquitecturaCPU();
    
}
