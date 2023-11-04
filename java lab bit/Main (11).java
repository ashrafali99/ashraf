import java.io.*;
import java.lang.*;
class filewriter
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
FileWriter fstream=new FileWriter("out.txt",true);
BufferedWriter out1=new BufferedWriter(fstream);
System.out.println("Enter the line to append");
out1.write(in.readLine());
out1.close();
}
catch(Exception e)
{ 
System.out.println("Error"+e.getMessage());
}
}}
