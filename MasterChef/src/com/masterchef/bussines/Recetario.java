package com.masterchef.bussines;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Clase Recetario
 * @author NetaSystems/Gonzalo
 */
public class Recetario 
{
	/**
	 * Lista de recetas
	 */
	private Map<String,Receta> listado;
	
	
	/**
	 * Constructor 
	 */
	public Recetario() 
	{
		listado = new HashMap<String, Receta>();
	}
	
	/**
	 * Metodo mostrar lista de recetas
	 */
	public void mostrarList() 
	{
		Set<String> key = listado.keySet();
		
		for(String k : key) 
		{
			System.out.println("Receta: " + k);
			
			Receta r = listado.get(k);
			
			System.out.println();
			r.mostrarAutor();
			
			System.out.println("Ingredientes:");
			r.mostrarIngredientes();
			
			System.out.println("Procedimiento:");
			r.mostrarProcedimiento();
			
			System.out.println("\n");
		}
	} 
	
	
	/**
	 * Metodo agregar receta
	 * @param nombre de la receta
	 * @param r Receta
	 */
	public void agregarReceta(String nombre,Receta r) 
	{
		listado.put(nombre, r);
	}
	
	
	/**
	 * Metodo eliminar receta
	 * @param nombre de la receta
	 * @return Retorna verdadero para eliminar o falso
	 */
	public boolean eliminarReceta(String nombre)
	{
		if(checkNombre(nombre)) 
		{
			Receta r = listado.remove(nombre);
			
			if( r!=null) 
			{
				return true;
			}
			else
			{
				 return false;
			}
		}
		else 
		{
			System.out.println("Llave No Existe");
			return false;
		}
		
	}
	
	
	/**
	 * Metodo lista llave
	 * @return Retorna la llave
	 */
	public Set<String> listaLLaves() 
	{
		return listado.keySet();
	}
	
	/**
	 * Metodo para checar nombre
	 * @param n Parametro nombre
	 * @return Retorna lista nombre
	 */
	public boolean checkNombre(String n) 
	{
		return this.listado.containsKey(n);
	}

	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de listado
	 */
	public Map<String, Receta> getListado() {
		return listado;
	}

	/**
	 * Asigna el valor
	 * @param listado Asigna el valor listado
	 */
	public void setListado(Map<String, Receta> listado) {
		this.listado = listado;
	}


	
}
