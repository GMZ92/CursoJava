package com.masterchef.bussines;

public class Ingredientes 
{
	private String nombre;
	private String cantidad;
	
	public Ingredientes(String nombre, String cantidad) 
	{
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		/*
		if (nombre.isEmpty()||cantidad.isEmpty()) 
		{
			System.out.println("Nombre o/y cantidad vacios...");
		}
		else 
		{
			this.nombre = nombre;
			this.cantidad = cantidad;	
		}
		*/
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getcantidad() 
	{
		return cantidad;
	}
	
	public void setcantidad(String cantidad) 
	{
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredientes other = (Ingredientes) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
	
	
	
	
	
}
