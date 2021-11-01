package assig1;
import java.util.Scanner;
public class Employee1 
{
	double specialAllowance;
	double HRA;
	double transportAllowance;
	double netSalary;
	public int  tax=2500;
	public static double basicSalary;
	Employee1()
	{
		if(basicSalary<=10000)
		{
			HRA=(basicSalary*20)/100;
			specialAllowance=(basicSalary*80)/100;
			transportAllowance=(basicSalary*20)/100;	
		}
		else if (basicSalary<=10001 && basicSalary<=20000)
		{
			HRA=(basicSalary*25)/100;
			specialAllowance=(basicSalary*90)/100;
			transportAllowance=(basicSalary*20)/100;
			
		}
		else
		{
			HRA=(basicSalary*30)/100;
			specialAllowance=(basicSalary*95)/100;
			transportAllowance=(basicSalary*20)/100;
		}
		
	}
	public void calculateNetSalary()//method
	{
		netSalary=basicSalary+HRA+specialAllowance+transportAllowance+tax;
		System.out.println("NET SALARY: "+netSalary);
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE ID:");
		int employeeId=in.nextInt();
		System.out.println("ENTER EMPLOYEE NAME");
		String n=in.next();
		System.out.println("ENTER BASIC SALARY:");
		basicSalary=in.nextDouble();		
		Employee1 obj1=new Employee1();
		obj1.calculateNetSalary();
		System.out.println("EMPLOYEE ID :"+employeeId);
		System.out.println("EMPLOYEE NAME: "+n);
		}
	}


