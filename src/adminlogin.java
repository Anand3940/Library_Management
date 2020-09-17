import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class adminlogin implements ActionListener {
	adminlogin()
	{
		JFrame frm=new JFrame("Project");
	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
		frm.setLocationRelativeTo(null);
		Container d=frm.getContentPane();
		frm.setLayout(null);
		JLabel fil=new JLabel();
		fil.setBounds(140,50,220,80);
		fil.setText("Please Fill the below details to enter");
		d.add(fil);
		JLabel name=new JLabel();
		name.setBounds(100,130,100,80);
		name.setText("Name :-");
		d.add(name);
		
		JTextField ty=new JTextField();
		ty.setBounds(160,150,150,30);
		d.add(ty);
		ty.setVisible(true);
		JLabel ps=new JLabel();
		ps.setBounds(80,180,100,80);
		ps.setText("Password :-");
		d.add(ps);
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(160,200,150,30);
		d.add(pass);
		JButton log=new JButton("Login");
		log.setBounds(190,250,100,30);
		log.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String a=ty.getText();
				String b=pass.getText();
				JOptionPane opr;
				if(e.getSource()==log)
				{
				if(a.equals("admin") && b.equals("123"))
				{
					log.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							librariandetails lib=new librariandetails();
							frm.dispose();
						
						}
					});
				}
				
			}
				
			}
			
		});
		
		d.add(log);
		frm.setVisible(true);
	}
	public static void main(String args[])
	{
		new adminlogin();
	}

}
