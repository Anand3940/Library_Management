import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class librariandetails implements ActionListener{
	librariandetails()
	{
		JFrame frm=new JFrame("Project");
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
        frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		Container e=frm.getContentPane();
		JButton b1=new JButton("Add Librarian");
		b1.setBounds(175,100,140,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				if(e.getSource()==b1)
				{
				AddLibrarian c=new AddLibrarian();
				frm.dispose();
			}
			}
		});
		e.add(b1);
		JButton b2=new JButton("View Librarian Details");
		b2.setBounds(155,170,180,30);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==b2)
				{
					FrameViewLibrarian ff=new FrameViewLibrarian();
					ff.retrive();
				}
			}
			
		});
		e.add(b2);
		JButton b3=new JButton("Delete Librarian");
		b3.setBounds(175,240,130,30);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==b3)
				{
					DeleteLibrarian ff=new DeleteLibrarian();
					ff.del();
					frm.dispose();
				}
			}
			
		});
e.add(b3);
		JButton b4=new JButton("Log Out");
		b4.setBounds(195,310,100,30);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout1 x=new layout1();
				frm.dispose();
			}
		});
		
		e.add(b4);
		frm.setVisible(true);
	}
	public static void main(String args[])
	{
		new librariandetails();
	}
}
