import java.io.*;
import java.util.*;
public class reverse
{
public static void main(String args[])
{
int num,rev=0,rem;
Scanner s=new Scanner(System.in);
System.out.print("enter number :");
num=s.nextInt();
while(num>0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.print("reverse of a number :"+rev);
}
}