import java.io.*;
class s extends Thread
{
int i,m;
public void run()
{
try
{
this.sleep(1000);
for(i=1;i<=5;i++)
{
m=7*i;
System.out.println("7"+"*"+i+"="+m);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class t extends Thread
{
int i,m;
public void run()
{
try
{
this.sleep(1000);
for(i=1;i<=5;i++)
{
m=5*i;
System.out.println("5"+"*"+i+"="+m);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class f extends Thread
{
int i,m;
public void run()
{
try
{
this.sleep(1000);
for(i=1;i<=5;i++)
{
m=13*i;
System.out.println("13"+"*"+i+"="+m);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
public class ex
{
public static void main(String args[])
{
System.out.println("multiplication using thread");
s t1=new s();
f t2=new f();
t t3=new t();
t1.run();
t2.run();
t3.run();
}
}