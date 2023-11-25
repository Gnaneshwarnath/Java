import java.io.*;
import java.util.*;
public class sintrest
{
	public static void main(String args[])
	{
		float p,n,si;
		int age;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter principle amount :");
		p=s.nextFloat();
		System.out.println("Enter no of years :");
		n=s.nextFloat();
		System.out.println("Enter age of a citizen :");
		age=s.nextInt();
		if(p<=0)
		{
			System.out.println("invalid");
		}
		else if(n<=0)
		{
			System.out.println("invalid");
		}
		else
		{
			if(age>=60)
			{
				si=(p*n*12)/100;
				System.out.println("simple intrest :"+si);
			}
			else
			{
				si=(p*n*10)/100;
				System.out.println("simple intrest :"+si);
			}
		}
	}
}
		