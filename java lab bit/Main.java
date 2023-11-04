import java.io.*;
import java.lang.*;
class str1
{
public static void main(String args[])throws IOException
{
String s1=new String();
int a;
String s2;
DataInputStream s=new DataInputStream(System.in);
System.out.println("Enter the String:");
s1=s.readLine( );
System.out.println("Enter the position to extract:");
a=Integer.parseInt(s.readLine());
s2=s1.substring(a);
System.out.println("The string is ="+ s2);
}
}