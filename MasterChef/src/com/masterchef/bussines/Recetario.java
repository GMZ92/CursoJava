package com.masterchef.bussines;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Recetario 
{
	private Map<String,Receta> listado;
	
	public Recetario() 
	{
		listado = new HashMap<String, Receta>();
	}
	
	public void mostrarList() 
	{
		Set<String> key = listado.keySet();
		
		for(String k : key) 
		{
			System.out.println("Receta: " + k);
			
			Receta r = listado.get(k);
			
			System.out.println();
			r.mostrarAutor();
			
			System.out.println("\nIngredientes:");
			r.mostrarIngredientes();
			
			System.out.println("\nProcedimiento:");
			r.mostrarProcedimiento();
			
			System.out.println("\n");
		}
	} 
	
	
	public void agregarReceta(String nombre,Receta r) 
	{
		listado.put(nombre, r);
	}
	
	
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
	
	
	public Set<String> listaLLaves() 
	{
		return listado.keySet();
	}
	
	public boolean checkNombre(String n) 
	{
		return this.listado.containsKey(n);
	}
	
	public Map<String, Receta> getListado() 
	{
		return listado;
	}

	public void setListado(Map<String, Receta> listado) 
	{
		this.listado = listado;
	}
	

}
