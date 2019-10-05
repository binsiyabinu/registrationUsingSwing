package jdbc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class log {

	public static void main(String[] args) {
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
		
	    f.setSize(500,450);
		f.setLayout(null);
		f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
