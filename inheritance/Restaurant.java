package com.inheritance;
import java.util.*;

public class Restaurant {
	public void ingredients()
	{
		System.out.println("PARENT CLASS ingredients");
	}
	public void Menu()
	{
		System.out.println("****MENU****");
		System.out.println("1.Chinese");
		System.out.println("2.Mexican");
		System.out.println("3.Italian");
		System.out.println("************");
		Scanner in=new Scanner(System.in);
		System.out.println("SELECT ITEMS FROM MENU:");
		int n=in.nextInt();
		switch(n)
		{
		case 1:
		{
			Chinese c=new Chinese();
			c.noodles();
			c.ingredients();
			break;
		}
		case 2:
		{
			Mexican m=new Mexican();
			m.nachos();
			m.ingredients();
			break;	
		}
		case 3:
		{
			Italian i=new Italian();
			i.pasta();
			i.ingredients();
		}
		default :
			System.out.println("NOT FROM THE MENU");
	}
	}	
	public static void main(String args[])
	{
		Restaurant r=new Restaurant();
		r.Menu();			
	}
}
