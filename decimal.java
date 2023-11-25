import java.io.*;
import java.util.*;
public class decimal
{
	public static void main(String args[])
	{
		int n,i,j,a[]=new int[10],b[]=new int[10],in;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a decimal number :");
		n=s.nextInt();
		for(i=0;n>0;i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		System.out.println("Binary number :");
		for(i=i-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println("Enter a decimal number :");
		in=s.nextInt();
		for(j=0;in>0;j++)
		{
			b[j]=in%8;
			in=in/8;
		}
		System.out.println("\nOctal number :");
		for(j=j-1;j>=0;j--)
		{
			System.out.print(b[j]);
		}
	}
}