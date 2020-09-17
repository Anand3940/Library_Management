import java.awt.Color;
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

public class issuebook implements ActionListener{

	public static void isue() {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("Project");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
		frm.setLayout(null);
        frm.setLocationRelativeTo(null);
		Container f=frm.getContentPane();
		JLabel label=new JLabel();
		label.setBounds(190,30,180,50);
		Font font=new Font("Castellar",Font.BOLD,15);
		Font fnt=new Font("Lucida Fax",Font.PLAIN,14);
		label.setFont(font);
			label.setText("Issue Book");
			f.add(label);
			JLabel bookcallno=new JLabel();
			bookcallno.setBounds(50,90,180,50);
			bookcallno.setText("Book Call No");
			f.add(bookcallno);
			JTextField ty=new JTextField();
			ty.setBounds(190,100,150,25);
			f.add(ty);
			ty.setVisible(true);
			JLabel studentid=new JLabel();
			studentid.setBounds(50,135,180,50);
			studentid.setText("Student id");
			f.add(studentid);
			JTextField textname=new JTextField();
			textname.setBounds(190,145,150,25);
			f.add(textname);
			textname.setVisible(true);
			JLabel studentname=new JLabel();
			studentname.setBounds(50,175,180,50);
			studentname.setText("Student Name");
			f.add(studentname);
			JTextField textauthor=new JTextField();
			textauthor.setBounds(190,190,150,25);
			f.add(textauthor);
			textauthor.setVisible(true);
			JLabel studentcontact=new JLabel();
			studentcontact.setBounds(50,220,180,50);
			studentcontact.setText("Student Contact");
			f.add(studentcontact);
			JTextField textpublisher=new JTextField();
			textpublisher.setBounds(190,235,150,25);
			f.add(textpublisher);
			textpublisher.setVisible(true);
			JButton addbooks=new JButton("Issue Books");
			addbooks.setBounds(100,350,120,30);
			addbooks.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==addbooks)
					{
						JOptionPane.showMessageDialog(addbooks,"Books issued successfully");
						String a=ty.getText();
						String a1=textname.getText();
						String c=textauthor.getText();
						String d=textpublisher.getText();
						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/an","root","12345");
							PreparedStatement prst=connection.prepareStatement("insert into issuebook values(?,?,?,?)");
							prst.setString(1,a);
							prst.setString(2,a1);
							prst.setString(3,c);
							prst.setString(4,d);
							prst.executeUpdate();
							prst.close();
							connection.close();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				}
				
			});
			f.add(addbooks);
			JButton back=new JButton("Back");
		back.setBounds(290,350,80,30);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==back)
				{
					LibrarianSection aa=new LibrarianSection();
					aa.tr();
					frm.dispose();
				}
			}
			
		});
			f.add(back);
			JLabel note=new JLabel();
			note.setText("Note:- Please check Student Id before issuing the book");
			note.setFont(fnt);
			note.setBounds(40,400,420,50);
			note.setVisible(true);
			note.setForeground(Color.RED);
			f.add(note);
			frm.setVisible(true);

	}
public static void main(String args[])
{
	issuebook ui=new issuebook();
	ui.isue();
}
}
