package Electricity;

import java.awt.Choice;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame {
	
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
		
		
		
		
		
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Signup();
		
	}

}
