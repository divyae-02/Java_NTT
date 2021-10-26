package com.association;
public class UndergradStudent extends Student
{
	public int year;
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public void yearDetails()
	{
		System.out.println("YEAR: "+year);
	}
	public void underGradStudiesBranch()
	{
		Branch studentBranch=new Branch();
		studentBranch.studiesBranch();
	}
	public void underGradStudiesBranch1()
	{
		Branch studentBranch1=new Branch();
		studentBranch1.studiesBranch1();
	}
	public void underGradStudiesBranch2()
	{
		Branch studentBranch2=new Branch();
		studentBranch2.studiesBranch2();
	}
	public void underGradStudiesBranch3()
	{
		Branch studentBranch3=new Branch();
		studentBranch3.studiesBranch3();
	}
	public void underGradSociety()
	{
		Society studentSociety=new Society();
		studentSociety.collegeSociety();
	}
	public void underGradSociety1()
	{
		Society studentSociety1=new Society();
		studentSociety1.collegeSociety1();
	}
}
