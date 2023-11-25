import java.io.*;
import java.util.*;
class A
{
	final void disp()
	{
		System.out.println("SUPER CLASS");
	}
}
class B extends A
{
	void disp1()
	{
		System.out.println("SUB CLASS");
	}
}
public class overiding
{
	public static void main(String args[])
	{
		B b=new B();
		b.disp();
		b.disp1();
	}
}