import java.io.*;
import java.util.*;
public class reversestring
{
public static void main(String args[])
{
String str;
int n,i;
Scanner r=new Scanner(System.in);
System.out.print("enter string :");
str=r.nextLine();
n=str.length();
char ch[]=str.toCharArray();
for(i=n-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}
}