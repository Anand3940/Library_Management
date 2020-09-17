import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddLibrarian{
AddLibrarian()
{
	  JFrame frm=new JFrame("Project");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
		frm.setLocationRelativeTo(null);
		Container f=frm.getContentPane();
		JLabel l1=new JLabel("Add Librarian");
		l1.setBounds(200,20,100,30);
		f.add(l1);

		JLabel l2=new JLabel("Name");
		l2.setBounds(90,100,100,30);
		f.add(l2);
		frm.setLayout(null);
		JTextField ty1=new JTextField();
		ty1.setBounds(220,100,150,30);
		f.add(ty1);
		JLabel l3=new JLabel("Password");
		l3.setBounds(90,140,100,30);
		f.add(l3);
		JPasswordField x=new JPasswordField();
		x.setBounds(220,140,150,30);
		f.add(x);
		JLabel l4=new JLabel("Email address");
		l4.setBounds(90,180,100,30);
		f.add(l4);
		JTextField ty2=new JTextField();
		ty2.setBounds(220,180,150,30);
		f.add(ty2);
	    JLabel l5=new JLabel("Phone number");
		l5.setBounds(90,220,100,30);
		f.add(l5);
		JTextField ty3=new JTextField();
		ty3.setBounds(220,220,150,30);
		f.add(ty3);
		JLabel l6=new JLabel("Address");
		l6.setBounds(90,260,100,30);
		f.add(l6);
		JTextField ty4=new JTextField();
		ty4.setBounds(220,260,150,30);
		f.add(ty4);
		JButton addlib=new JButton("Add Librarian");
		addlib.setBounds(180,330,150,40);
		f.add(addlib);
		addlib.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==addlib)
				{
					int dia=JOptionPane.showConfirmDialog(addlib, "Librarian added succesfully");
					if(dia==0)
					{
						JOptionPane.showMessageDialog(addlib, "Librarian added succesfully");
						String i=ty1.getText();
						String p=x.getText();
						String l=ty2.getText();
						String o=ty3.getText();
						String k=ty4.getText();
						 Connection connection;
						try {
							Class.forName("com.mysql.jdbc.Driver");
							connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/an","root","12345");
							PreparedStatement preparedStatement = connection.prepareStatement(
									"insert into st values(?,?,?,?,?)");
							preparedStatement.setString(1,i);
							preparedStatement.setString(2,p);
							preparedStatement.setString(3,l);
							preparedStatement.setString(4,o);
							preparedStatement.setString(5,k);
							preparedStatement.executeUpdate();
							
							connection.close();
							preparedStatement.close();
						}
			
						catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});

		f.add(addlib);
		
		JButton back=new JButton("Back");
		back.setBounds(200,380,100,40);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==back)
				{
					librariandetails c=new librariandetails();
					frm.dispose();
				}
			}		
		});
		f.add(back);
		frm.setVisible(true);
	}
public static void main(String args[])
{
	AddLibrarian obj=new AddLibrarian();
	// this class is used for the addlibrarian to the database;
}
}
