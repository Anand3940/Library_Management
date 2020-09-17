import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class layout1 implements ActionListener{
	public static void main(String args[])
	{
		JFrame frm=new JFrame("Admin login details");
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
		frm.setLocationRelativeTo(null);
       Container c=frm.getContentPane();
	    JLabel j=new JLabel("Library management");
	    j.setBounds(165,60,150,50);
	    c.add(j);
	    JButton admin=new JButton("Admin Login");
	    admin.setBounds(170,150,130,50);
	    admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==admin)
				{
				adminlogin sd=new adminlogin();
				frm.dispose();
			}	
			}
	    });
	    c.add(admin);  	    
	    JButton libra=new JButton("Librarian Login");
	    libra.setBounds(170,220,130,50);
	    libra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianSection sd=new LibrarianSection();
				sd.tr();
				frm.dispose();
			}
	    }
	    		);
	    c.add(libra);
	c.setLayout(null);
	}

}
