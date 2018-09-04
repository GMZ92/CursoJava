package com.masterchef.main;

import java.util.List;
import java.util.ArrayList;

import com.masterchef.bussines.Ingredientes;
import com.masterchef.bussines.Procedimiento;
import com.masterchef.bussines.Receta;
import com.masterchef.bussines.Recetario;
import com.masterchef.bussines.Autor;


/**
 * Clase Main
 * @author NetaSystems/Gonzalo
 *
 */
public class Main 
{
	/**
	 * Metodo main de la clase
	 * @param args Argumentos del metodo
	 */
	public static void main(String[] args) 
	{
		System.out.println("MasterChef \n");
		
		String n1 = "Salchichas a la diabla";
		String n2 = "Pollo con crema de cilantro";
		String n3 = "Papas con longaniza en chile morita";
		
		//Autor
		List<Autor> autores = new ArrayList<Autor>();
		
		
		for (int i = 1; i < 4; i++) 
		{
			autores.add(new Autor(i, "Neta"));
		}
		
		//Ingredientes
		List<Ingredientes> ingre = new ArrayList<Ingredientes>();
		
		for(int i =1; i < 4; i++) 
		{
			ingre.add(new Ingredientes("EL " + i + " " + "Ingrediente ", i + "00"));
		}
		
		//Procedimiento
		
		List<Procedimiento> proc = new ArrayList<Procedimiento>();
		
		for (int i = 1; i < 4; i++) 
		{
			proc.add(new Procedimiento(i," Procedimiento..."));
		}
		
		Receta r0 = new Receta(n1, autores, ingre, proc);
		Receta r1 = new Receta(n2, autores, ingre, proc);
		Receta r2 = new Receta(n3, autores, ingre, proc);
		
		Recetario recetario = new Recetario();
		
		recetario.agregarReceta(n1, r0);
		recetario.agregarReceta(n2, r1);
		recetario.agregarReceta(n3, r2);
		
		recetario.mostrarList();
		
		System.out.println("Eliminar receta:");
		
		recetario.mostrarList();
		recetario.eliminarReceta("Pollo con crema de cilantro");

	}
}
