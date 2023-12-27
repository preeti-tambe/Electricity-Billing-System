package Electricity;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	Login()
	{
		super("Login Page");
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel uname = new JLabel ("Username  :-");
		uname.setBounds(300, 20, 100, 20);
		add(uname);
	
		JTextField uname1 = new JTextField ();
		uname1.setBounds(400, 20, 150, 20);
		add(uname1);
		
		JLabel upass = new JLabel ("Password  :-");
		upass.setBounds(300, 60, 100, 20);
		add(upass);
	
		JTextField upass1 = new JTextField ();
		upass1.setBounds(400, 60, 150, 20);
		add(upass1);
		
		JLabel login = new JLabel ("Logging in as  :-");
		login.setBounds(300, 100, 100, 20);
		add(login);
		
		Choice login1 = new Choice();
		login1.add("Admin");
		login1.add("Customer");
		login1.setBounds(400, 100, 150, 20);
		add(login1);
		

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
		Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JButton loginbtn = new JButton("Login",i3);
		loginbtn.setBounds(330, 160, 100, 20);
		add(loginbtn);
		

		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
		Image i5 = i4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		
		JButton cancel = new JButton("Cancel",i6);
		cancel.setBounds(450, 160, 100, 20);
		add(cancel);
		
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
		Image i8 = i7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JButton sign = new JButton("Signup",i9);
		sign.setBounds(380, 200, 100, 20);
		add(sign);
		
		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
		Image i11 = i10.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(i11);
		JLabel img = new JLabel(i12);
		img.setBounds(0, 0, 250, 250);
		add(img);



		setSize(800,400);
		setLocation(400,200);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Login();
	}

}
