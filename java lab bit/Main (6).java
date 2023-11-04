import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="list.class" width=300 height=300>
</applet>*/
public class list extends Applet implements ItemListener
{
String msg;
Label co;
List c;
public void init()
{
co=new Label("COUNTRY");
c=new List(4,false);
c.addItem("India");
c.addItem("America");
c.addItem("Canada");
c.addItem("France");
c.addItem("Spain");
c.addItem("Japan");
add(co);
add(c);
c.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
msg=c.getSelectedItem();
g.drawString("May country is :"+msg,50,150);
}
}
