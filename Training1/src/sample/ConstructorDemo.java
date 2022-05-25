package sample;
class Student
{
	int id;
	String name;
	String email;
	String course;
	int phno;
	Student(){
		System.out.println("Default Constructor");
		}
	public Student(int id, String name) {
	this.id = id;
	this.name = name;
}
	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Student(int id, String name, String email, String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	Student(int id,String name,String email,String course,int phno){
		this.id=id;
		this.name=name;
		this.email=email;
		this.course=course;
		this.phno=phno;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", phno=" + phno
				+ "]";
	}
	
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		System.out.println("Stdents of siet are");
		Student obj1=new Student(1,"chandana","chan@gmail.com","BE",689555);
System.out.println(obj1);
		Student obj2=new Student(2,"bharathi","ba@gmail.com","BE",34654);
	System.out.println(obj2);	
        Student obj3=new Student(1,"cd");
       System.out.println( obj3);
        	}

}
