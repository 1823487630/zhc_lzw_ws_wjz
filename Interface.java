package ��Ӱ��Ʊϵͳ;

import java.awt.BorderLayout;
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



public class Interface {
            public static void main(String[] args) {
			JFrame frm = new JFrame();
			frm.setTitle("��ӭʹ�õ�Ӱ������Ʊϵͳ");
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel topPanel = new JPanel();
			frm.getContentPane().add(topPanel, BorderLayout.NORTH);
			JTextField input = new JTextField();
			input.setEditable(true);
			input.setHorizontalAlignment(SwingConstants.LEFT);
			input.setColumns(30);
			JButton myBtn = new JButton("��Ӱ��ѯ");
			ButtonHandler myBtnHandler = new ButtonHandler();
			myBtn.addActionListener(myBtnHandler);
			topPanel.add(input);
			topPanel.add(myBtn);
			ImagePanel ip=new ImagePanel();
			ip.setBounds( 0, 0, 800, 600);
			frm.getContentPane().add(ip);
			
			frm.setBounds(400, 200, 800, 600);
			frm.setVisible(true);
		}

	}
class ImagePanel extends JPanel{
	Image img ;
	public void paint(Graphics g){
	try {
		 img= ImageIO.read(new File("D://���ν��.jpg"));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		g.drawImage(img, 0, 0, 800, 600, null);
		
	}
}
	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			System.out.println("���ν��");
			System.out.println("�ٶ��뼤��");
		}
			
			
		}
	
			


