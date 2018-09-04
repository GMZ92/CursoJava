package com.netasystems.calculadora.main;

import com.netasystems.calculadora.business.*;

/**
 * Clase Main Principal
 * @author NetaSystems/Gonzalo
 */
public class Main 
{

	/**
	 * Metodo de la clase main
	 * @param args Argumentos de la clase
	 */
	public static void main(String[] args) 
	{
		Calculadora cal = new Calculadora();
		//1st step
		String primerArg = args[0];
		String segundoArg = args[1];
		String tercerArg = args[2];
	
		Double op1 = 0.0;
		Double op2 = 0.0;
		
		try {
			//Convertir a numeros
			op1 = Double.parseDouble(primerArg);
			op2 = Double.parseDouble(segundoArg);
		}  
		catch (NumberFormatException e) {
			System.out.println("No se ha podido convertir la entrada de texto en numero.");
			System.out.println("Mensaje de error: " + e.getMessage());
			System.exit(-1);
		}
		
		
		//Declarar variable para almacenar resultado
		double resultado;
		
		switch (tercerArg) 
		{
			case "+":
				resultado = cal.suma(op1, op2);
				break;
				
			case "-":
				resultado = cal.resta(op1, op2);
				break;
				
			case "/":
				resultado = cal.dividir(op1, op2);
				break;
				
			case "*":
				resultado = cal.multiplicacion(op1, op2);
				break;
	
			default:
				resultado = -1;
				break;
		}
		
		System.out.println("El resultado de la operacion es: " + resultado);
		
	}

}
