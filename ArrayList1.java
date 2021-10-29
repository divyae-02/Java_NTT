package com.inheritance;
import java.util.*;//importing ArrayList,Scanner,Collections
public class ArrayList1 
{
	private static double Median(ArrayList<Integer> list)// median
	{
		Collections.sort(list);
		double median=0;
		int size=list.size();
		if(size%2!=0)
			median=list.get(size/2);
		else
			median=(double)(list.get((size/2)-1)+list.get(size/2))/2;
		return median;	
	}
	private static float Mean(ArrayList<Integer> list)//mean
	{
		int sum=Sum(list);
		float mean=(float)sum/list.size();
		return mean;
	}
	private static int Sum(ArrayList<Integer> list)// sum 
	{
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
		sum+=list.get(i);
		}
		return sum;	
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
		int n=in.nextInt();// user input
		System.out.println("ENTER ELEMENTS: ");
		for(int i=0;i<n;i++)
		{
			list.add(in.nextInt());// adding elements into the list
		}
		System.out.println("SUM OF ELEMEMTS: "+Sum(list));
		System.out.println("MEAN OF ELEMENTS: "+Mean(list));
		System.out.println("MEDIAN OF ELEMNTS: "+Median(list));
	}
}
