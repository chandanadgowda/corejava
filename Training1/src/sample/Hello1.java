package sample;

import java.io.IOException;

public class Hello1{
void m()throws IOException
{
throw new IOException("device error");//checked exception
}
void n()throws IOException
{
m();
}
void p()
{
try
{
n();
}
catch(Exception e){System.out.println("exception handled");}
}
public static void main(String args[])
{
Hello1 obj=new Hello1();
obj.p();
System.out.println("normal flow...");
}
}