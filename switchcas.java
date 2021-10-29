import java.util.*;// importing 
public class switchcas 
{
	public static void main(String[] args) 
	{
		while(true) 
		{
		System.out.println("ENTER 1 for Addition of two numbers");
		System.out.println("ENTER 2 to find Average of two numbers");
		System.out.println("ENTER 3 to find odd or even number");
		System.out.println("ENTER 4 to find +ve or -Ve number");
		System.out.println("ENTER 5 to find prime num or not");
		System.out.println("ENTER 6 to QUIT \n");
		Scanner in=new Scanner(System.in); 
		int num=in.nextInt();// user input
			switch(num) // switch statement
			{
			case 1:// addition
				System.out.println("ENTER TWO VALUES ");
				int a=in.nextInt();
				int b=in.nextInt();
				System.out.println("ADDITION OF TWO NUMBERS: "+(a+b));
			break;
			case 2:// average
				System.out.println("ENTER TWO VALUES ");
				int c=in.nextInt();
				int d=in.nextInt();
				int add=c+d;
				System.out.println("AVERAGE OF TWO NUMBERS: "+(add/2));
			break;
			case 3:// even or odd
				System.out.println("ENTER NUMBER");
				int e=in.nextInt();
				String nu=(e%2==0) ? "EVEN" : "ODD";
				System.out.println("NUMBER IS "+nu);
			break;
			case 4: // postive or negative number
				System.out.println("ENTER NUMBER");
				int f=in.nextInt();
				if(f<0)
					System.out.println(f+" IS NEGATIVE NUMBER");
				else if(f>0)
					System.out.println(f+" IS POSTIVE NUMBER");
				else 
					System.out.println(f+" IS ZERO");
			break;	
			case 5:// prime or not
				System.out.println("ENTER NUMBER");
				int g=in.nextInt();
				boolean flag = false;
			    for (int i = 2; i <= g / 2; ++i) 
			    {
			      if (g % i == 0)
			      {
			        flag = true;
			        break;
			      }
			    }
			    if (!flag)
			      System.out.println(g + " is a prime number.");
			    else
			      System.out.println(g + " is not a prime number.");
			break;
			case 6:// quiting
				System.out.println("QUITING");
				System.exit(0);
			break;
			default:
				System.out.println("NONE OF THE ABOVE");		
			}
		}	
	}
}
