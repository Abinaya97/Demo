import java.io.*;
import java.util.*;
public class hello
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==0)
System.out.println(n+ "is ZERO");
else if(n>0)
System.out.prinntln(n+ "is POSITIVE");
else
System.out.println(n+ "is NEGATIVE");
}
}
