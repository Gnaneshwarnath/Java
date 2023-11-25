import java.io.*;
import java.util.*;
public class reversenum
{
	public static void main(String args[])
	{
		int num,reverse=0,rem;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number :");
		num=s.nextInt();
		if(num<=0)
		{
			System.out.println("invalid");
		}
		else
		{
			while(num!=0)
			{
				rem=num%10;
				reverse=reverse*10+rem;
				num=num/10;
			}
		}
		System.out.println("Reverse number :"+reverse);
	}
}
		