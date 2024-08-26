//For Instance and display data write proper setData() and displayData() function. Create a Demo class and demonstrate by creating 2 objects inside main() function.(EXAMPLE 2)


class Student
{
	String name, department, year;
	int RollNo;
	void setData(String name, String department, String year, int RollNo)
	{
		this.name=name;
		this.department=department;
		this.year=year;
		this.RollNo=RollNo;
	}
	void display()
	{
		System.out.println("Student's Name: "+name+"\nDepartment: "+department+"\nYear: "+year+"\nRoll No: "+RollNo);
	}
}
class Demo12
{
	public static void main(String args[])
	{
		Student st1=new Student();
		Student st2=new Student();
		System.out.println("Data for Student 1: ");
		st1.setData("Shakshi Bhattacharya", "CSE", "3rd Year", 13);
		st1.display();
		System.out.println("-------------------------");
		System.out.println("Data for Student 2: ");
		st2.setData("Mona Kumari", "IT", "2nd Year", 45);
		st2.display();
	}
}	

