/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.Sensors;

/**
 *
 * @author Usuario
 */
public abstract class Sensores implements iSensores
{

    private Sensors sensor;

    public Sensores(Sensors sensor)
    {
	this.sensor = sensor;
    }

    @Override
    public Double getTempCPU()
    {
	return sensor.getCpuTemperature();
    }

    @Override
    public Double getVoltajeCPU()
    {
	return sensor.getCpuVoltage();
    }

    @Override
    public Integer[] getVelVentiladores()
    {
	/*
	 int[ ] cannot be converted to Integer[ ]   
	*/
	int[] aux = sensor.getFanSpeeds();
	Integer[] rta = new Integer[aux.length]; 
	
	int i=0;
	
	for(int enterito : aux) //a cada entero que nos devuelve la librería
	{
	    rta[i]=enterito; //se lo asigna a un espacio de un array de Integer
	}
	
	return rta;
    }

    @Override
    public String ToJson() {
        
    return null; //Json Stringer....
    }

}
