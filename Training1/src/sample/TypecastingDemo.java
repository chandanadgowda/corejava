package sample;

public class TypecastingDemo {

	public static void main(String[] args) 
	{
		byte b=10;
		short s= b;	//byte value is widened to short
		int i=b;	//byte value is widened to int
		long l=b;	//byte value is widened to long
		float f=b;	//byte value is widened to float
		double d=b;	//byte value is widened to double

		System.out.println("short value : "+ s);
		System.out.println("int value : "+ i);
		System.out.println("long value : "+ l);
		System.out.println("float value : "+ f);
		System.out.println("double value : "+ d);
	}

}