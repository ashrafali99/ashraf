import java.awt.*;
import java.io.*;
import java.awt.event.*;
/*<applet code="mydetail.class" height=600 width=600>
</applet>*/
public class mydetail extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4,t5;
Button b1;
public mydetail()
{
l1=new Label("NAME:");
l2=new Label("CITY:");
l3=new Label("STATE:");
l4=new Label("PINCODE:");
l5=new Label("MOBILE NUMBER:");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
b1=new Button("CLICK HERE");
setLayout(new GridLayout(10,15));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(b1);
b1.addActionListener(this);
setSize(500,500);
setVisible(true);
}
public void actionPerformed(ActionEvent ac)
{
if(ac.getSource()==b1)
{
t1.setText("Harish");
t2.setText("Palakkad");
t3.setText("Kerala");
t4.setText("678666");
t5.setText("7007007007");
}
else
{
System.exit(1);
}
}
public static void main(String args[])
{
new mydetail();
}
}