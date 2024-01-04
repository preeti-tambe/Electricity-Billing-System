package Electricity;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Conn {
	Connection c;
	Statement s;
	Conn()
	{
		try{
			c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","abc123");
			s=(Statement) c.createStatement();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	}

}
