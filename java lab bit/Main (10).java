import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="shape.class" width=500 height=500>
</applet>*/
public class shape extends Applet
{
int x=100;
int y=100;
public void init()
{
addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
repaint();
x=e.getX();
y=e.getY();
}
}
);
}
public void paint(Graphics g)
{
g.drawRect(x,y,100,100);
g.drawRect(x+50,y,100,150);
g.drawOval(x+100,y,100,100);
g.drawOval(x,y+150,180,50);
}
}