package sample;
class A{
	int a;
	int b;
	public A() {
		System.out.println("In A class defailt constructor");
	}
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
		
	}
class B extends A{
	int c;

	public B() {
		super();
		super.a=10;
		super.b=20;
		System.out.println("In B class default constructor");
	
	}

	public B(int c) {
		super();
		this.c = c;
		System.out.println("In B class parameterized constructor");
	}
	

	

	
	
}

public class SuperDemo {
	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println(obj.a);
        System.out.println(obj.b);
       
	}

}


