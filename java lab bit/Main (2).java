import java.io.*;
class emp
{
String name;
int bp,hra,da,pf,lic,ta,gross,net;
emp(String n,int b)
{
name=n;
bp=b;
}
public void calculate()throws payoutofboundsException
{
System.out.println("name::"+name);
System.out.println("basicpay::"+bp);
if(bp<3000)
throw new payoutofboundsException(bp);
da=bp*17/100;
hra=bp*10/100;
ta=bp*25/100;
gross=bp+hra+da+ta;
pf=bp*5/100;
lic=bp*8/100;
net=gross-(pf+lic);
System.out.println("hra:"+hra);
System.out.println("da:"+da);
System.out.println("ta:"+ta);
System.out.println("gross:"+gross);
System.out.println("pf:"+pf);
System.out.println("lic:"+lic);
System.out.println("net:"+net);
}
public static void main(String args[])
{
emp x,y,z;
x=new emp("Adarsh",10000);
y=new emp("Arun",20000);
z=new emp("Renu",300000);
try
{
x.calculate();
y.calculate();
z.calculate();
}
catch(payoutofboundsException e)
{
System.out.println("payoutofbounds");
}
}
}
class payoutofboundsException extends Exception
{
int basic;
payoutofboundsException(int a)
{
basic=a;
System.out.println("our organisation doesnot p[rovide salary <3000");
}
}