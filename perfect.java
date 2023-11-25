import java.io.*;
import java.util.*;
public class perfect
{
public static void main(String args[])
{
int num,sum=0,i;
Scanner p=new Scanner(System.in);
System.out.println("enter number to check :");
num=p.nextInt();
for(i=1;i<num;i++)
{
if(num%i==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.println("perfect number..");
}
else
{
System.out.println("not a perfect number..");
}
}
}