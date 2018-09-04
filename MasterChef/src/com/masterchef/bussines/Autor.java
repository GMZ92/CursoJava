package com.masterchef.bussines;

public class Autor 
{
	private int numAutor;
	private String nomAutor;
	
	public Autor(int numAutor, String nomAutor) 
	{
		super();
		this.numAutor = numAutor;
		this.nomAutor = nomAutor;
	}

	public int getNumAutor() {
		return numAutor;
	}

	public void setNumAutor(int numAutor) {
		this.numAutor = numAutor;
	}

	public String getNomAutor() {
		return nomAutor;
	}

	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomAutor == null) ? 0 : nomAutor.hashCode());
		result = prime * result + numAutor;
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
		Autor other = (Autor) obj;
		if (nomAutor == null) {
			if (other.nomAutor != null)
				return false;
		} else if (!nomAutor.equals(other.nomAutor))
			return false;
		if (numAutor != other.numAutor)
			return false;
		return true;
	}
	
	
	
	

		
	

}
