package main;

public interface studentseeeintrf 
{
	public void createstudents(students std);
	public void showAllstudents();
	public void showstudentsbasedonrollno(int rollno);
	public void updatestudents(String name, int age, int DEPT_ID, int rollno);
	public void deletestudents(int rollno);

}
