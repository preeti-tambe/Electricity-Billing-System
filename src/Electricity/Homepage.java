package Electricity;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class Homepage  extends JFrame implements Runnable{
	Thread t;
	Homepage()
	{
		//to get image in frame
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
		//to adjust image size into frame
		Image i2= i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		//we cannot add image directly into add(); funtion so we use JLabel Class
		 
		JLabel image= new JLabel(i3);
		add(image);
		
		setVisible(true);
		
		for(int i=1;i<500;i++)
		{
			setSize(i,i);
			setLocation(400,150);
			
			
		}
		t=new Thread(this);
		t.start();
	}
	
	
	public void run()
	{
		try
		{
			Thread.sleep(7000);
			setVisible(false);
			new Login();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
	
		new Homepage();
		

	}

}
