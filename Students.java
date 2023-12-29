package main;

public class students 
{
	private String name;	
	private int age;
	private int rollno;
	private String gender;
	private int DOB;
	private int DEPT_ID;
	private int HOD_ID;
	
	public students() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public int getDEPT_ID() {
		return DEPT_ID;
	}

	public void setDEPT_ID(int dEPT_ID) {
		DEPT_ID = dEPT_ID;
	}

	public int getHOD_ID() {
		return HOD_ID;
	}

	public void setHOD_ID(int hOD_ID) {
		HOD_ID = hOD_ID;
	}

	public String toString() {
		return "students [name=" + name + ", age=" + age + ", rollno=" + rollno + ", gender=" + gender + ", DOB=" + DOB
				+ ", DEPT_ID=" + DEPT_ID + ", HOD_ID=" + HOD_ID + "]";
	}
	}
	
