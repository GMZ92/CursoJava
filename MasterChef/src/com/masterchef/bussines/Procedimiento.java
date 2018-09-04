package com.masterchef.bussines;

public class Procedimiento 
{	
	private int num; 
	private String paso;
	
	
	public Procedimiento(int num, String paso) 
	{
		super();
		this.num = num;
		this.paso = paso;
	}

	
	
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getPaso() 
	{
		return paso;
	}

	public void setPaso(String paso) 
	{
		this.paso = paso;
	}
}
