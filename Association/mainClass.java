package com.association;
public class mainClass 
{
	public static void main(String[] args) 
	{
		UndergradStudent student1=new UndergradStudent();
		UndergradStudent student2=new UndergradStudent();
		UndergradStudent student3=new UndergradStudent();
		UndergradStudent student4=new UndergradStudent();
		student1.setName("DIVYA");
		student1.setRollno(11);
		student1.setCity("HYDERABAD");
		student1.setYear(2021);
		student1.studentDetails();
		student1.yearDetails();
		student1.underGradStudiesBranch1();
		student1.underGradSociety();
		System.out.println("*****************************************");
		student2.setName("RAJI");
		student2.setRollno(12);
		student2.setCity("BANGALORE");
		student2.setYear(2020);
		student2.studentDetails();
		student2.yearDetails();
		student2.underGradStudiesBranch3();
		student2.underGradSociety1();
		System.out.println("*****************************************");
		student3.setName("RAJESHWARI");
		student3.setRollno(13);
		student3.setCity("BANGALORE");
		student3.setYear(2020);
		student3.studentDetails();
		student3.yearDetails();
		student3.underGradStudiesBranch2();
		student3.underGradSociety();
		System.out.println("*****************************************");
		student4.setName("RAJ");
		student4.setRollno(14);
		student4.setCity("BANGALORE");
		student4.setYear(2020);
		student4.studentDetails();
		student4.yearDetails();
		student4.underGradStudiesBranch();
		student4.underGradSociety1();
		
	}
}
