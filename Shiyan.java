package 练习;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class Shiyan extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	public Shiyan(){
		
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
		btn1.setBounds(100,650,200,50);
		btn2.setBounds(500,650,200,50);
		add(btn1);
		add(btn2);
		btn2.addActionListener(this);
		btn1.addActionListener(this);
		}
	public static void main(String[] args) {
		new Shiyan();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==btn2||e.getSource()==btn1){
			 SearchMovie fm=new SearchMovie();
			 fm.searchmovie();
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