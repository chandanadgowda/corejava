package sample;

import java.util.Scanner;

public class Box1 {

	     double dblWidth;
		 double dblHeight;
		 double dblDepth;
		 //static variables
		 static int boxid;
		 public static void Box() 
			{
			}
			public double calcVolume() 
			{
				//local variable
			double dblTemp;
			dblTemp= dblWidth * dblHeight * dblDepth;
			return dblTemp;
			}
			public static void main(String args[])
			{
				/*
				 * Scanner sc=new Scanner(System.in);
				 * System.out.println("Enter the width of the box"); double w=sc.nextDouble();
				 * System.out.println("Enter the height of the box"); double h=sc.nextDouble();
				 * System.out.println("Enter the depth of the box"); double v=sc.nextDouble();
				 * Box b1=new Box(w,h,v); System.out.println("Volume of the box is "
				 * +b1.calcVolume());
				 */
	Box1 box1=new Box1();
	box1.dblHeight=13;
	box1.dblDepth=33;
	box1.dblWidth=4;
	System.out.println("Volume of the box is " +box1.calcVolume());
	
	Box1 box2=new Box1();
	box2.dblHeight=99;
	box2.dblDepth=3;
	box2.dblWidth=14;
	System.out.println("Volume of the box is " +box2.calcVolume());
	

}
}