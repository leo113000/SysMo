/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.Baseboard;
import oshi.hardware.ComputerSystem;
import oshi.hardware.common.AbstractHardwareAbstractionLayer;

/**
 *
 * @author Usuario
 */
public abstract class Mother implements iMother
{

    private Baseboard mother;

    public Mother(AbstractHardwareAbstractionLayer hardAbs)
    {
	getBaseboard(hardAbs);
    }

    private void getBaseboard(AbstractHardwareAbstractionLayer hardAbs)
    {
	ComputerSystem cs = hardAbs.getComputerSystem(); //Esto me permite obtener la placa madre

	mother = cs.getBaseboard();
    }

    @Override
    public String getMarcaMother()
    {
	return mother.getManufacturer();
    }

    @Override
    public String getModeloMother()
    {
	return mother.getModel() + " - " + mother.getVersion(); //Esto quizás se pueda modularizar

	// en mis dos pc solo muestra el modelo del mother, 6 7 caracteres no mas.
	//si no puedo hacer un metodo aparte que sea getVersion,lo charlamos.
    }

    @Override
    public String ToJson()
    {

	return String.format("{\"Marca\":%s,\"Modelo\":%s}", this.getMarcaMother(), this.getModeloMother());

    }

    @Override
    public String toString()
    {
	
	return "Marca: " + getMarcaMother() + "\n"
		+ "Modelo :" + getModeloMother();
    }

}
