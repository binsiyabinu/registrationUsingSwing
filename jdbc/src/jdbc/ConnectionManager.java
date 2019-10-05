package jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectionManager {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","");  
		 
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
		}
		//System.out.println("hai");
		
		
        JFrame f=new JFrame("Login");
		
		JButton b=new JButton("Submit");
		b.setBounds(200,150,95,30); 
		
		final JTextField tf1,tf2;
		tf1=new JTextField();
	    tf1.setBounds(200,50, 150,20);
	    f.add(tf1);
	    
	    tf2=new JTextField();
	    tf2.setBounds(200,100, 150,20);
	    f.add(tf2);
	    
	    JLabel l1,l2;
	    l1=new JLabel("User Name:");
	    l1.setBounds(50,50, 100,30); 
	    f.add(l1);
	    
	    l2=new JLabel("Password:");
	    l2.setBounds(50,100, 100,30);
	    f.add(l2);
	    f.add(b);
		
		
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){ 
		Statement statement;
		try {
			statement = con.createStatement();
			String username = tf1.getText();
			String password = tf2.getText();
			statement.executeUpdate("INSERT INTO login VALUES ('"+username+"','"+password+"')");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("duplicate entry");
			//e1.printStackTrace();
		}
		
	    	}
	    });
	    f.setSize(500,450);
		f.setLayout(null);
		f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
