import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class menu extends Frame implements ActionListener
{
Frame f=new Frame();
TextField t1,t2,t3;
int a,b,c;
MenuBar mb;
Menu m;
MenuItem m1,m2,m3;
public void display()
{
f.setTitle("MY FRAME");
f.setSize(669,338);
f.setVisible(true);
f.setLayout(null);
t1=new TextField();
t2=new TextField();
t3=new TextField();
f.add(t1);
f.add(t2);
f.add(t3);
t1.setBounds(50,100,200,20);
t2.setBounds(50,150,200,20);
t3.setBounds(50,200,200,20);
mb=new MenuBar();
f.setMenuBar(mb);
m=new Menu("File");
mb.add(m);
m1=new MenuItem("add");
m2=new MenuItem("Subtract");
m3=new MenuItem("Exit");
m.add(m1);
m.add(m2);
m.add(m3);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==m1)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(" "+c);
}
if(ae.getSource()==m2)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a-b;
t3.setText(" "+c);
}
if(ae.getSource()==m3)
{
System.exit(0);
}
}
public static void main(String args[])
{
menu m=new menu();
m.display();
}
}
