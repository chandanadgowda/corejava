package sample;

public class TestArray {
	public static void main(String args[])
	{
	char name[] = new char[5]; //declaration and instantiation
	name[0] = 'c'; //initialization
	name[1] = 'h';
	name[2] = 'a';
	name[3] = 'n';
	name[4] = 'd';
	name[5]='n';
	name[6]='a';
	for (int i = 0; i <=name.length-1; i++) //length is the property of array
	System.out.print(name[i]);
	}
	}