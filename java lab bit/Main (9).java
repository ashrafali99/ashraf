import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.*;
/*<applet code="mous.class" height=200 width=200>
</applet>*/
public class mous extends Applet implements 
MouseListener,MouseMotionListener
{
String mes=" ";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void paint(Graphics g)
{
g.drawString(mes,50,50);
}
public void mousePressed(MouseEvent e)
{
mes="Mouse pressed";
repaint();
}
public void mouseReleased(MouseEvent e)
{
mes="Mouse released";
repaint();
}
public void mouseClicked(MouseEvent e)
{
mes="Mouse clicked";
repaint();
}
public void mouseEntered(MouseEvent e)
{
mes="Mouse entered";
repaint();
}
public void mouseExited(MouseEvent e)
{
mes="Mouse exited";
repaint();
}
public void mouseMoved(MouseEvent e)
{
mes="Mouse moved";
repaint();
}
public void mouseDragged(MouseEvent e)
{
mes="Mouse dragged";
repaint();
}
}
