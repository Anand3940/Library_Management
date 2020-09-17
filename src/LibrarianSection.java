import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class LibrarianSection {
	public void tr() {
		JFrame frm=new JFrame("Project");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,500,500,500);
		frm.setLayout(null);
		frm.setLocationRelativeTo(null);
		Container f=frm.getContentPane();
		JLabel label=new JLabel();
	label.setBounds(180,50,180,50);
	Font font=new Font("Castellar",Font.BOLD,12);
	label.setFont(font);
		label.setText("Librarian Section");
		f.add(label);
		JButton addbooks=new JButton("Add Books");
		addbooks.setBounds(190,130,130,30);
		addbooks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addbooks act=new addbooks();
				act.tr();
				frm.dispose();
			}
		});
		f.add(addbooks);
		JButton viewbooks=new JButton("View Books");
		viewbooks.setBounds(190,180,130,30);
		viewbooks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				viewbooks vwbooks=new viewbooks();
				vwbooks.retrive();
				frm.dispose();
			}
			
		});		
		f.add(viewbooks);
		JButton isssuebooks=new JButton("Issue Books");
		isssuebooks.setBounds(190,230,130,30);
		isssuebooks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				issuebook fg=new issuebook();
				issuebook.isue();
				frm.dispose();
			}
			
		});
		f.add(isssuebooks);
		JButton viewissuebooks=new JButton("View Issued Books");
		viewissuebooks.setBounds(180,280,150,30);
		viewissuebooks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				viewissuedbooks sf=new viewissuedbooks();
				sf.re();
				frm.dispose();
			}	
		});
		f.add(viewissuebooks);
		JButton returnbooks=new JButton("Return Books");
		returnbooks.setBounds(190,330,130,30);
		returnbooks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				returnbook fg=new returnbook();
				fg.del();
				frm.dispose();
			}
			
		});
		f.add(returnbooks);
		JButton logout=new JButton("Logout");
		logout.setBounds(200,380,100,30);
		f.add(logout);
logout.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frm.dispose();
	}
	
});
		frm.setVisible(true);
	}
	public static void main(String args[])
	{
		LibrarianSection ty=new LibrarianSection();
		ty.tr();
	}
}
