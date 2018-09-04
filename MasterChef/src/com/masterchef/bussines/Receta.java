package com.masterchef.bussines;

import java.util.List;

/**
 * Clase Receta
 * @author NetaSystems/Gonzalo
 */
public class Receta 
{
	/**
	 * Nombre de la receta
	 */
	private String nombre;
	/**
	 * Lista de autores
	 */
	private List<Autor> autor;
	/**
	 * Lista de ingredientes
	 */
	private List<Ingredientes> ingredientes;
	/**
	 * Lista de procedimientos
	 */
	private List<Procedimiento> procedimiento;
	
	
		
	/**
	 * Constructor con parametros 
	 * @param nombre Nombre de la receta
	 * @param autor Lista de ingredientes
	 * @param ingredientes Lista de ingredientes
	 * @param procedimiento Lista de procedimientos
	 */
	public Receta(String nombre,List<Autor> autor, List<Ingredientes> ingredientes, List<Procedimiento> procedimiento) 
	{
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.ingredientes = ingredientes;
		this.procedimiento = procedimiento;
	}

	
	/**
	 * Metodo mostrar el autor de la lista
	 */
	public void mostrarAutor()
	{
		for (Autor a : autor) 
		{
			System.out.println(a.getNumAutor() + " Autor " + a.getNomAutor());			
		}
	}
	
	/**
	 * Metodo mostrar Ingredientes de la lista
	 */
	public void mostrarIngredientes() 
	{
		for(Ingredientes i : ingredientes) 
		{
			System.out.println("	" + i.getNombre() + "  " + i.getCantidad());
		}
	}
	
	
	/**
	 * Metodo mostrar procedimiento de la lista
	 */
	public void mostrarProcedimiento() 
	{
		for(Procedimiento p : procedimiento) 
		{
			System.out.println("	" + p.getNum() + " " + p.getPaso());
		}
	}
	

	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Asigna el valor
	 * @param nombre Asigna el valor nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de autor
	 */
	public List<Autor> getAutor() {
		return autor;
	}


	/**
	 * Asigna el valor
	 * @param autor Asigna el valor autor
	 */
	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de ingredientes
	 */
	public List<Ingredientes> getIngredientes() {
		return ingredientes;
	}


	/**
	 * Asigna el valor
	 * @param ingredientes Asigna el valor ingredientes
	 */
	public void setIngredientes(List<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de procedimiento
	 */
	public List<Procedimiento> getProcedimiento() {
		return procedimiento;
	}


	/**
	 * Asigna el valor
	 * @param procedimiento Asigna el valor procedimiento
	 */
	public void setProcedimiento(List<Procedimiento> procedimiento) {
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
