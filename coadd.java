import java.io.*;
import java.util.*;
class add
{
float a,b;
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("Enter values :");
a=s.nextFloat();
b=s.nextFloat();
}
void display()
{
System.out.println("Sum of two values :"+(a+b));
}
}
public class coadd
{
public static void main(String args[])
{
add a=new add();
a.getdata();
a.display();
}
}