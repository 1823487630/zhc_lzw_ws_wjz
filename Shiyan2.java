package 练习2;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import 电影购票系统.LoginInterface;

import java.awt.FlowLayout;

public class Shiyan2 extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	public Shiyan2(){
		
		setTitle("电影购票系统");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,0,800,800);
		setVisible(true);
		ImagePanel1 ip=new ImagePanel1();
		ip.setBounds( 0, 0, 800, 600);
		getContentPane().add(ip);
		
		btn1 = new JButton("按上映时间查询");
		btn2 = new JButton("按电影名查询");
		btn3 = new JButton("购买");
		
		btn1.setBounds(50,650,200,50);
		btn2.setBounds(550,650,200,50);
		btn3.setBounds(300,650,200,50);
		add(btn1);
		add(btn2);
		add(btn3);
		btn2.addActionListener(this);
		btn1.addActionListener(this);
		btn3.addActionListener(this);
		
		}
	public static void main(String[] args) {
		new Shiyan2();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==btn2||e.getSource()==btn1){
			 SearchMovie fm=new SearchMovie();
			 fm.searchmovie();
	}
		 if(e.getSource()==btn3){
			 LoginInterface wang = new LoginInterface();
			 wang.LoginInterface();
		 }
	

}
	
	


}
class SearchMovie{
	

	
		public void searchmovie() {
			JFrame frm = new JFrame();
			frm.setTitle("欢迎使用电影自助购票系统");
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel topPanel = new JPanel();
			frm.getContentPane().add(topPanel, BorderLayout.NORTH);
			JTextField input = new JTextField();
			input.setEditable(true);
			input.setHorizontalAlignment(SwingConstants.LEFT);
			input.setColumns(30);
			JButton myBtn = new JButton("电影查询");
			
			
			topPanel.add(input);
			topPanel.add(myBtn);
			ImagePanel2 ip=new ImagePanel2();
			ip.setBounds( 0, 0, 800, 600);
			frm.getContentPane().add(ip);
			frm.setBounds(200, 0, 800, 800);
			frm.setVisible(true);
		}

	}
	
class ImagePanel1 extends JPanel{
	Image img;
	public void paint(Graphics g){
	 try {
		img = ImageIO.read(new File("D://速度激情.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		g.drawImage(img, 0, 0, 800, 600, null);
		
	}
}
class ImagePanel2 extends JPanel{
	Image img;
	public void paint(Graphics g){
	 try {
		img = ImageIO.read(new File("D://超级战舰.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		g.drawImage(img, 0, 0, 800, 600, null);
		
	}
}
class ImagePanel3 extends JPanel{
	Image img;
	public void paint(Graphics g){
	 try {
		img = ImageIO.read(new File("D://那些年.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		g.drawImage(img, 0, 0, 800, 350, null);
		
	}
}
class LoginInterface{
	
	 JFrame frame = new JFrame("电影购票系统");
	 Container c = frame.getContentPane();
	 JTextField moviename = new JTextField();
	 JPasswordField account = new JPasswordField();
	 JButton purchase= new JButton("购买");
	public  void LoginInterface(){
		ImagePanel3 ip=new ImagePanel3();
		ip.setBounds( 0, 0, 800, 600);
		frame.getContentPane().add(ip);
		 
	frame.setBounds(200,100,800,600);
	c.setLayout(new BorderLayout());
	initFrame();
	frame.setVisible(true);
	}
	
		
	
	public void initFrame(){
//
//	JPanel topPanel = new JPanel();
//	topPanel.setLayout(null);
//	JTextArea output = new JTextArea();
//	output.setRows(6);
//	output.setColumns(32);
//	output.setEditable(true);
//	topPanel.add(output);
//	topPanel.setVisible(true);

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
	
	}
	
