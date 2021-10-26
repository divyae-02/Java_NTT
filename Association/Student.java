package com.association;
public class Student 
{
	public String name;
	public int rollno;
	public String city;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public void studentDetails()
	{
		System.out.println("NAME: " +name+ " \nRollNumber: " +rollno+ "\nCity: " +city);
	}
}
