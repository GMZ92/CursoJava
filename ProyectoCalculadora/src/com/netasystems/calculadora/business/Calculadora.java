package com.netasystems.calculadora.business;

/**
 * Clase Calculadora
 * @author NetaSystems/Gonzalo
 */
public class Calculadora 
{
	/**
	 * Metodo de Suma de numeros
	 * @param op1 Parametro numero 1
	 * @param op2 Parametro numero 2
	 * @return El resultado de la suma
	 */
	public double suma(double op1, double op2)
	{
		return op1 + op2;
	}
	
	/**
	 * Metodo de Resta
	 * @param op1 Parametro numero 1
	 * @param op2 Parametro numero 2
	 * @return El resultado de la resta
	 */
	public double resta(double op1, double op2)
	{
		return op1 - op2;
	}
	
	/**
	 * Metodo dividir
	 * @param op1 Parametro numero 1
	 * @param op2 Parametro numero 2
	 * @return El resultado de la division
	 */
	public double dividir(double op1, double op2)
	{
		if(op2 == 0)
		{
			return 0;
		}
		
		return op1 / op2;
	}

	/**
	 * Metodo de Multiplicacion
	 * @param op1 Parametro numero 1
	 * @param op2 Parametro numero 2
	 * @return El resultado de la multiplicacion
	 */
	public double multiplicacion(double op1, double op2)
	{
		return op1 * op2;
	}

}
