import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class addbooks implements ActionListener{
	public static void main(String args[])
	{
		addbooks sd=new addbooks();
		sd.tr();
	}
	public void tr()
	{
JFrame frm=new JFrame("Project");
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setBounds(500,500,500,500);
frm.setLayout(null);
frm.setLocationRelativeTo(null);
Container f=frm.getContentPane();
JLabel label=new JLabel();
label.setBounds(190,30,180,50);
Font font=new Font("Castellar",Font.BOLD,15);
label.setFont(font);
	label.setText("Add Books");
	f.add(label);
	JLabel callno=new JLabel();
	callno.setBounds(50,90,180,50);
	callno.setText("Call No");
	f.add(callno);
	JTextField ty=new JTextField();
	ty.setBounds(190,100,150,25);
	f.add(ty);
	ty.setVisible(true);
	JLabel Name=new JLabel();
	Name.setBounds(50,135,180,50);
	Name.setText("Name");
	f.add(Name);
	JTextField textname=new JTextField();
	textname.setBounds(190,145,150,25);
	f.add(textname);
	textname.setVisible(true);
	JLabel Author=new JLabel();
	Author.setBounds(50,175,180,50);
	Author.setText("Author");
	f.add(Author);
	JTextField textauthor=new JTextField();
	textauthor.setBounds(190,190,150,25);
	f.add(textauthor);
	textauthor.setVisible(true);
	JLabel Publisher=new JLabel();
	Publisher.setBounds(50,220,180,50);
	Publisher.setText("Publisher");
	f.add(Publisher);
	JTextField textpublisher=new JTextField();
	textpublisher.setBounds(190,235,150,25);
	f.add(textpublisher);
	textpublisher.setVisible(true);
	JLabel Quantity=new JLabel();
	Quantity.setBounds(50,265,180,50);
	Quantity.setText("Quantity");
	f.add(Quantity);
	JTextField textquantity=new JTextField();
	textquantity.setBounds(190,280,150,25);
	f.add(textquantity);
	textquantity.setVisible(true);
	JButton addbooks=new JButton("Add Books");
	addbooks.setBounds(180,330,150,50);
	f.add(addbooks);
	
	frm.setVisible(true);
	addbooks.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==addbooks)
			{
JOptionPane.showMessageDialog(addbooks, "Record added succesfully");
					String a=ty.getText();
				    String b=textname.getText();
					String c=textauthor.getText();
					String d=textpublisher.getText();
					String k=textquantity.getText();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/an","root","12345");
				PreparedStatement pr=connection.prepareStatement("insert into addbooks values(?,?,?,?,?)");
				pr.setString(1,a);
				pr.setString(2,b);
				pr.setString(3,c);
				pr.setString(4,d);
				pr.setString(5,k);
				pr.executeUpdate();
				pr.close();
				connection.close();
			} catch (Exception o) {
				// TODO Auto-generated catch block
				o.printStackTrace();
			}
			}
		}
	
	});
	JButton b2=new JButton("Back");
	b2.setBounds(210,400,90,35);
b2.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
if(e.getSource()==b2)
{
	LibrarianSection sd=new LibrarianSection();
	sd.tr();
	frm.dispose();
}
}

});
b2.setVisible(true);
	f.add(b2);
}
	}

