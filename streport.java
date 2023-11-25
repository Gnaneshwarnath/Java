import java.io.*;
import java.util.*;
class student
{

	float s1,s2,s3,s4,total,avg;
	Scanner s= new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter 4 subject marks :");
		s1=s.nextFloat();
		s2=s.nextFloat();
		s3=s.nextFloat();
		s4=s.nextFloat();
	}
	void calc()
	{
		total=s1+s2+s3+s4;
		avg=total/4;
	}
	void display()
	{
		System.out.println("total marks:"+total);
		System.out.println("aggregate :"+avg);
		if(avg>=75)
		{
			System.out.println("Distinction");
		}
		else if(avg>=60&&avg<75)
		{
			System.out.println("First division");
		}
		else if(avg>=50&&avg<60)
		{
			System.out.println("Second division");
		}
		else if(avg>=40&&avg<50)
		{
			System.out.println("Third division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
public class streport
{
	public static void main(String args[])
	{
		student t=new student();
		t.getdata();
		t.calc();
		t.display();
	}
}









