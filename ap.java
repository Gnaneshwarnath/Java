import java.io.*;
import java.util.*;
public class ap
{
	public static void main(String args[])
	{
		int ar[]=new int[100],i,j,n,count=0;
		Scanner a=new Scanner(System.in);
		System.out.print("enter no of elements in array :");
		n=a.nextInt();
		System.out.print("enter elements :");
		for(i=0;i<n;i++)
		{
			ar[i]=a.nextInt();
		}
		for(i=0;i<n;i++)
		{
			boolean prime=true;
			for(j=2;j<ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					prime=false;
					count++;
					break;
				}
			}
		}
		if(count>0)
		System.out.print("prime count ="+(count+1));
		System.out.print("compos count ="+(n-(count+1)));
	}
}







