import java.io.*;
import java.util.*;
public class lpattern
{
public static void main(String args[])
{
int i,j,n;
Scanner h=new Scanner(System.in);
System.out.println("enter no of rows and columns :");
n=h.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(+j);
}
System.out.print("\n");
}
}
}
