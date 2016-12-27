package 电影购票系统;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class LoginInterface{
 JFrame frame = new JFrame("电影购票系统");
 Container c = frame.getContentPane();
 JTextField moviename = new JTextField();
 JPasswordField account = new JPasswordField();
 JButton purchase= new JButton("购买");
public LoginInterface(){
frame.setBounds(200,100,800,600);
c.setLayout(new BorderLayout());
initFrame();
frame.setVisible(true);
}
public void initFrame(){

JPanel topPanel = new JPanel();
topPanel.setLayout(null);
JTextArea output = new JTextArea();
output.setRows(6);
output.setColumns(32);
output.setEditable(true);
topPanel.add(output);
topPanel.setVisible(true);

JPanel fieldPanel = new JPanel();
fieldPanel.setLayout(null);
JLabel a1 = new JLabel("电影名:");
a1.setBounds(200,400,100,20);
JLabel a2 = new JLabel("电影票数:");
a2.setBounds(200,450,100,20);
fieldPanel.add(a1);
fieldPanel.add(a2);
moviename.setBounds(270,400,300,20);
account.setBounds(270,450,300,20);
fieldPanel.add(moviename);
fieldPanel.add(account);
c.add(fieldPanel,"Center");


JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout());
buttonPanel.add(purchase);
c.add(buttonPanel,"South");
}
public static void main(String[] args){
new LoginInterface();
}
}