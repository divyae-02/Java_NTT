package assig1;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
public class FlowerNaame {
	public void displayFlower(int continent)
	{	
	}
	public static void main(String[] args) 
	{
		while(true) 
		{
			Scanner in=new Scanner(System.in); // TAKING INPUTS
			System.out.println("Select Any Given Continent to Display Country and National Flowers ");
			System.out.println("1.ASIA");
			System.out.println("2.EUROPE");
			System.out.println("3.AFRICA");
			System.out.println("4.QUIT");
			FlowerNaame f1=new FlowerNaame();// CREATING OBJECT
			int continent=in.nextInt();
			f1.displayFlower(continent);
			switch(continent)// SWITCH STATEMENT
			{
			case 1:// ASIA
				System.out.println("------------COUNTRIES IN ASIA-----------");
				Dictionary<String, String> asia = new Hashtable<>();
				asia.put("INDIA", "LOTUS");
			    asia.put("PAKISTHAN", "JASMINE");
			    asia.put("NEPAL","LALI GURANS");
			    Enumeration<String> keys=asia.keys();
			    while(keys.hasMoreElements())
			    {
			    	String key=keys.nextElement();
			    	String value=asia.get(key);
			    	System.out.println("Country:"+key+" Nationalflower:"+value);
			    }
			    System.out.println("----------------------------------------");
				break;
			case 2:// EUROPE
				System.out.println("------------EUROPE-----------");
				Dictionary<String, String> europe = new Hashtable<>();
				europe.put("GERMANY","CORN FLOWER");
			    europe.put("FRANCE","LILLY");
			    europe.put("GREECE","ACANTHUS MOLLIS");
			    Enumeration<String> keyy=europe.keys();
			    while(keyy.hasMoreElements())
			    {
			    	String key=keyy.nextElement();
			    	String value=europe.get(key);
			    	System.out.println("Country:"+key+" Nationalflower:"+value);
			    }
			    System.out.println("----------------------------------------");
				break;
			case 3:// AFRICA
				System.out.println("------------COUNTRIES IN AFRICA-----------");
				Dictionary<String, String> africa = new Hashtable<>();
		        africa.put("EGYPT","BLUE LOTUS");
		        africa.put("NIGERIA","YELLOW TRUMPET");
		        africa.put("KENYA","ORCHID");
			    Enumeration<String> keyyy=africa.keys();
			    while(keyyy.hasMoreElements())
			    {
			    	String key=keyyy.nextElement();
			    	String value=africa.get(key);
			    	System.out.println("Country:"+key+" NationalFlower:"+value);
			    }
			    System.out.println("----------------------------------------");
				break;
			case 4:
				System.out.println("--------QUITING-------");
				System.exit(0);
			default:System.out.println("None Of the Above");
			}
		}
	}
}
