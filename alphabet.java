import java.io.*;
import java.util.*;
public class alphabet
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
System.out.println("alphabet");
  else
    System.out.println(" not a alphabet");
}
}
