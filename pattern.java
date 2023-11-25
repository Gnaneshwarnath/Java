import java.io.*;
import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int num,n,i,j;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to print :");
		num=s.nextInt();
		System.out.println("Enter no of rows :");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+num);
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+num);
			}
			System.out.println();
		}
	}
}