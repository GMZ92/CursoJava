package com.masterchef.bussines;

/**
 * Clase Procedimiento
 * @author Netasystems/Gonzalo
 */
public class Procedimiento 
{	
	/**
	 * Numero de procedimiento
	 */
	private int num; 
	/**
	 * Descripcion de procedimiento
	 */
	private String paso;
	
		
	/**
	 * Constructor con parametros
	 * @param num Parametro numero de procedimiento
	 * @param paso Parametro descripcion de procedimiento
	 */
	public Procedimiento(int num, String paso) 
	{
		super();
		this.num = num;
		this.paso = paso;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de num
	 */
	public int getNum() {
		return num;
	}


	/**
	 * Asigna el valor
	 * @param num Asigna el valor num
	 */
	public void setNum(int num) {
		this.num = num;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de paso
	 */
	public String getPaso() {
		return paso;
	}


	/**
	 * Asigna el valor
	 * @param paso Asigna el valor paso
	 */
	public void setPaso(String paso) {
		this.paso = paso;
	}




	
	
}
