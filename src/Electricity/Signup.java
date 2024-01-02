package Electricity;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame implements ActionListener{
	JButton create,back;
	Signup()
	{
		setBounds(450,300,700,400);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		JPanel panel =  new JPanel();
		panel.setBounds(20, 20, 650, 300);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230),2),"Create-Account as"));
		panel.setLayout(null);
		add(panel);
		panel.setForeground(new Color(34,139,34));
		
		JLabel heading = new JLabel("Create Account");
		heading.setBounds(100, 50,140,20);
		panel.add(heading);
		
		Choice acctyp = new Choice ();
		acctyp.add("Admin");
		acctyp.add("Customer");
		acctyp.setBounds(250,50,150,20);
		panel.add(acctyp);
		
		JLabel meternum = new JLabel("Meter Number ");
		meternum.setBounds(100, 90,140,20);
		panel.add(meternum);
		
		JTextField metertext = new JTextField();
		metertext.setBounds(250,90,150,20);
		panel.add(metertext);
		
		JLabel username = new JLabel("Username ");
		username.setBounds(100, 130,140,20);
		panel.add(username);
		
		JTextField utext = new JTextField();
		utext.setBounds(250,130,150,20);
		panel.add(utext);
		
		JLabel name = new JLabel("Name ");
		name.setBounds(100, 170,140,20);
		panel.add(name);
		
		JTextField namet = new JTextField();
		namet.setBounds(250,170,150,20);
		panel.add(namet);
		
		JLabel password = new JLabel("Password ");
		password.setBounds(100, 210,140,20);
		panel.add(password);
		
		JTextField passtext = new JTextField();
		passtext.setBounds(250,210,150,20);
		panel.add(passtext);
		
		 create = new JButton ("Create");
		create.setBounds(140,250,90,20);
		create.setBackground(Color.black);
		create.setForeground(Color.WHITE);
		create.addActionListener(this);
		panel.add(create);
		
		 back = new JButton ("Back");
		back.setBounds(280,250,90,20);
		back.setBackground(Color.black);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		panel.add(back);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
		Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(410,30,250,250);
		panel.add(image);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== create)
		{
			
		}else if(ae.getSource()==back)
		{
			setVisible(false);
			new Login();
		}
		
		
	}

	public static void main(String[] args) {
		new Signup();
		
	}

}
