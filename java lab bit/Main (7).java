import java.awt.*;
import java.awt.event.*;
class txt extends Frame implements ActionListener
{
Label n=new Label("Name");
Label a=new Label("Age");
Label q=new Label("Qualification");
Label ad=new Label("Address");
Label t=new Label("Mydetails");
TextField name=new TextField();
TextField age=new TextField();
TextField qual=new TextField();
TextArea add=new TextArea();
Button my= new Button("click");
Button quit= new Button("Quit");
txt()
{
setFont(new Font("Arial",Font.BOLD,15));
show();
setSize(600,600);
setLayout(null);
add(n);
add(name);
add(a);
add(age);
add(q);
add(qual);
add(add);
add(t);
add(my);
add(quit);
quit.setBounds(350,400,150,20);
n.setBounds(100,150,200,20);
name.setBounds(380,150,200,20);
a.setBounds(100,200,50,20);
age.setBounds(350,200,200,20);
q.setBounds(100,250,100,20);
qual.setBounds(380,250,250,20);
ad.setBounds(100,300,200,20);
add.setBounds(380,300,200,60);
t.setBounds(250,50,200,20);
my.setBounds(150,400,150,20);
my.addActionListener(this);
quit.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==my)
{
name.setText("Harish");
age.setText("20");
qual.setText("Under Graduate");
add.setText("Sultanpet,Palakkad");
}
else
System.exit(1);
}
public static void main(String args[])
{
new txt();
}
}
