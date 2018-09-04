package com.masterchef.bussines;

import java.util.List;

public class Receta 
{
	private String nombre;
	private List<Autor> autor;
	private List<Ingredientes> ingredientes;
	private List<Procedimiento> procedimiento;
	
	
		
	public Receta(String nombre,List<Autor> autor, List<Ingredientes> ingredientes, List<Procedimiento> procedimiento) 
	{
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.ingredientes = ingredientes;
		this.procedimiento = procedimiento;
	}

	
	public void mostrarAutor()
	{
		for (Autor a : autor) 
		{
			System.out.println(a.getNumAutor() + " Autor " + a.getNomAutor());			
		}
	}
	
	public void mostrarIngredientes() 
	{
		for(Ingredientes i : ingredientes) 
		{
			System.out.println("	" + i.getNombre()+"  "+i.getcantidad());
		}
	}
	
	
	public void mostrarProcedimiento() 
	{
		for(Procedimiento p : procedimiento) 
		{
			System.out.println("	" + p.getNum() + " " + p.getPaso());
		}
	}
	
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public List<Autor> getAutor() 
	{
		return autor;
	}
	
	public void setAutor(List<Autor> autor) 
	{
		this.autor = autor;
	}
	
	
	public List<Ingredientes> getIngredientes() 
	{
		return ingredientes;
	}
	
	public void setIngredientes(List<Ingredientes> ingredientes) 
	{
		this.ingredientes = ingredientes;
	}
	
	
	public List<Procedimiento> getProcedimiento() 
	{
		return procedimiento;
	}
	
	public void setProcedimiento(List<Procedimiento> procedimiento) 
	{
		this.procedimiento = procedimiento;
	}


	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((procedimiento == null) ? 0 : procedimiento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (procedimiento == null) {
			if (other.procedimiento != null)
				return false;
		} else if (!procedimiento.equals(other.procedimiento))
			return false;
		return true;
	}
	
	
}
