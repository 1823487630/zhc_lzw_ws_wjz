package ��Ӱ��Ʊϵͳ;



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



public class MovieInterface extends JFrame{
		
	
	public MovieInterface(){
		 setTitle("��Ӱ��Ʊϵͳ");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setBounds(200,50,800,600);
		
	
		setVisible(true);
		ImagePanel ip=new ImagePanel();
		ip.setBounds( 0, 0, 800, 400);
		getContentPane().add(ip);
		
		Container c = getContentPane();
		JButton btn1 = new JButton("����ӳʱ���ѯ");
		JButton btn2 = new JButton("����Ӱ����ѯ");
		btn1.setBounds(100,450,200,50);
		btn2.setBounds(500,450,200,50);
		
		c.add(btn1);
		c.add(btn2);
		
		
		}
	class ImagePanel extends JPanel{
		Image img;
		public void paint(Graphics g){
		 try {
			img = ImageIO.read(new File("D://�ٶȼ���.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			g.drawImage(img, 0, 0, 800, 400, null);
			
		}
	}
	
	
	public static void main(String[] args) {
		new MovieInterface();
		
	}
	

}

