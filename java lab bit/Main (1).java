import java.io.*;
import java.lang.*;
interface Area
{
final static float pi=3.14f;
float compute(float x,float y);
}
class Rectangle implements Area
{
public float compute(float x,float y)
{
return(x*y);
}
}
class Circle implements Area
{
public float compute(float x,float y)
{
return(pi*x*y);
}
}
class interfacetest
{
public static void main(String args[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
Area ar;
ar=rect;
System.out.println("area of rectangle:"+ar.compute(10,20));
ar=cir;
System.out.println("area of circle:"+ar.compute(10,10));
}
}
