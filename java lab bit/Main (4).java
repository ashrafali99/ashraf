import java.awt.*;
import java.applet.*;
/*<applet code ="shape.class" width=500 height=500>
</applet>*/
public class shape extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,10,170,10);
g.drawString("LINE",60,40);
g.drawString("RECTANGLE",45,200);
g.drawString("ARC",290,200);
g.drawString("CIRCLE",45,400);
g.drawString("ELLIPSE",175,500);
g.setColor(Color.blue);
g.fillRect(10,80,150,75);
g.setColor(Color.red);
g.fillOval(10,250,100,100);
g.setColor(Color.magenta);
g.fillArc(250,70,100,100,45,270);
g.setColor(Color.gray);
g.fillOval(125,400,150,75);
}
}
