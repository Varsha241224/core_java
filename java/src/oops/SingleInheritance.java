package oops;

class Course //parent
{
	String coursename="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course :"+coursename);
	}
}
class Student extends Course //child
{
	String name="Varshitha";
	
	void showStudent()
	{
		System.out.println("Student:" + name);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Student s=new Student();
		s.showStudent();
		s.showCourse();

	}

}
