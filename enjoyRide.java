package assig1;
import java.util.*;
public class enjoyRide 
{
	public void cal(int a,int c,String r,int h) 
	{
        List<Integer> Alibaba=new ArrayList<Integer>();
        List<Integer> a1 = Arrays.asList(50,40);// list(Adult,Child)
        Alibaba.addAll(a1);
        List<Integer> AlphineSlide=new ArrayList<Integer>();
        List<Integer> a2 = Arrays.asList(60,30);
        AlphineSlide.addAll(a2);
        List<Integer> BumpperCars=new ArrayList<Integer>();
        List<Integer> a3 = Arrays.asList(45,25);
        BumpperCars.addAll(a3);
        List<Integer> BaloonRace=new ArrayList<Integer>();
        List<Integer> a4 = Arrays.asList(70,60);
        BaloonRace.addAll(a4);
      if (r.equalsIgnoreCase("Alibaba")) 
      {
        	System.out.print ("\nTotal hours:"+h);
        	System.out.print ("\nAdult ride fare:"+(a*Alibaba.get(0))*h);
        	System.out.print ("\nChild ride fare:"+(c*Alibaba.get(1))*h);
        	System.out.print ("\nTotal Amount:"+((a*Alibaba.get(0))*h+(c*Alibaba.get(1))*h)+"\n");
        	System.out.println("RIDE DONE");
      }
	      else if(r.equalsIgnoreCase("AlphineSlide") )
	      {
	        	System.out.print ("\nTotal hours:"+h);
	        	System.out.print ("\nAdult ride fare:"+(a*AlphineSlide.get(0))*h);
	        	System.out.print ("\nChild ride fare:"+(c*AlphineSlide.get(1))*h);
	        	System.out.print ("\nTotal Amount:"+((a*AlphineSlide.get(0))*h+(c*AlphineSlide.get(1))*h)+"\n");
	        	
	        	
	      }
	      else if(r.equalsIgnoreCase("BumpperCar")) 
	      {
	        	System.out.print ("\nTotal hours:"+h);
	        	System.out.print ("\nAdult ride fare:"+(a*BumpperCars.get(0))*h);
	        	System.out.print ("\nChild ride fare:"+(c*BumpperCars.get(1))*h);
	        	System.out.print ("\nTotal Amount:"+((a*BumpperCars.get(0))*h+(c*BumpperCars.get(1))*h)+"\n");
	        	
	        	
	      }
	      else if(r.equalsIgnoreCase("BaloonRace")) 
	      {
	        	System.out.print ("\nTotal hours:"+h);
	        	System.out.print ("\nAdult ride fare:"+(a*BaloonRace.get(0))*h);
	        	System.out.print ("\nChild ride fare:"+(c*BaloonRace.get(1))*h);
	        	System.out.print ("\nTotal Amount:"+((a*BaloonRace.get(0))*h+(c*BaloonRace.get(1))*h)+"\n");
	        	
	       }
     else
    	  System.out.println("SORRY!!!!MENTIONED CAR NOT AVAILABLE");
	}
	public static void main (String[]args)
	{ 
		System.out.println("-----LIST OF RIDES AVAILABLE----- \n 1.Alibaba\n 2.AlphineSlide\n 3.BumpperCar\n 4.BaloonRace");
	    Scanner sc = new Scanner (System.in);	 
	    System.out.print ("Enter How many adults: ");
	    int a = sc.nextInt ();
	    System.out.print ("Enter how many children: ");
	    int c = sc.nextInt ();
	    System.out.print ("Enter how many hours: ");
	    int h = sc.nextInt ();
	    System.out.print("Enter ride :"); 
	    Scanner sca=new Scanner(System.in);
	    String r=sca.next();
	    enjoyRide obj=new enjoyRide();
	    obj.cal(a, c, r, h);
	    
	}
}