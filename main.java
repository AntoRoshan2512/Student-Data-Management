package main;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String name;
		int age;
		int rollno;
		String gender;
		int DOB;
		int DEPT_ID;
		int HOD_ID;
		studentseeeintrf eee=new studentseeeimpl();
		System.out.println("Welcome to the students management application");
		try (Scanner sc = new Scanner(System.in)) {
			do 
			{
				System.out.println("1. Add students\n" + "2. Show all students\n" + "3. Show students based on ID\n" + "4. Update the students\n" + "5. Delete the students\n");
				System.out.println("Enter your choice:");
				int ch=sc.nextInt();
				switch (ch) 
				{
				case 1: 
					students std=new students();
					System.out.println("Enter name:");
					name= sc.next();
					System.out.println("Enter age:");
					age= sc.nextInt();
					System.out.println("Enter rollno:");
					rollno= sc.nextInt();
					System.out.println("Enter gender:");
					gender= sc.next();
					System.out.println("Enter DOB");
					DOB= sc.nextInt();
					System.out.println("Enter the DEPT_ID:");
				    DEPT_ID=sc.nextInt();
					System.out.println("Enter the HOD_ID:");
					HOD_ID= sc.nextInt();
					std.setName(name);
					std.setAge(age);
					std.setRollno(rollno);
					std.setGender(gender);
					std.setDOB(DOB);
					std.setDEPT_ID(DEPT_ID);
					std.setHOD_ID(HOD_ID);
					eee.createstudents(std);
				    break;
				case 2:
					eee.showAllstudents();
					break;
				case 3:
					System.out.println("Enter rollno to show the details");
					int stdrollno=sc.nextInt();
					eee.showstudentsbasedonrollno(stdrollno);
					break;
				case 4:
					System.out.println("Enter rollno to update the details");
			        int rollno1 =sc.nextInt();
			        System.out.println("Enter the new name");
			        name=sc.next();
			        System.out.println("Enter new age");
			        age=sc.nextInt();
			        System.out.println("Enter new DEPT_ID");
			        DEPT_ID=sc.nextInt();
					eee.updatestudents(name, age, DEPT_ID, rollno1);
					break;
				case 5:
					System.out.println("Enter the rollno to delete");
			        rollno=sc.nextInt();
					eee.deletestudents(rollno);
					break;
				case 6:
					System.out.println("Thankyou for using this application !!!!!");
					System.exit(0);
				
				default:
					System.out.println("Enter the valid choice!!!!");
					break;
				}
			}while (true);
		}
	}

}
