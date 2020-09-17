import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteLibrarian implements ActionListener{
public static void del()
{
	JFrame frm=new JFrame("Project");
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setBounds(500,500,500,500);
	frm.setLayout(null);
	frm.setLocationRelativeTo(null);
	Container f=frm.getContentPane();
	 JLabel l5=new JLabel("Name :-");
		l5.setBounds(120,50,100,30);
		f.add(l5);
	JTextField ty4=new JTextField();
	ty4.setBounds(180,50,150,30);
	f.add(ty4);
	JButton dellib=new JButton("Delete Librrarian");
	dellib.setBounds(180,130,150,40);
	f.add(dellib);
	dellib.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==dellib)
			{
			String deleteword=ty4.getText();
			Connection connection;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/an","root","12345");
		PreparedStatement preparestatement=connection.prepareStatement("delete from st where name=?");
		preparestatement.setString(1,deleteword);
		preparestatement.executeUpdate();	
		preparestatement.close();
		connection.close();
		frm.setVisible(true);
			} catch (Exception t) {
				// TODO Auto-generated catch block
				t.printStackTrace();
			}
		}
		}
	});
	JButton b2=new JButton("Back");
	b2.setBounds(200,200,90,40);
b2.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
if(e.getSource()==b2)
{
	librariandetails sd=new librariandetails();
	frm.dispose();
}
}

});
b2.setVisible(true);
	f.add(b2);
	frm.setVisible(true);
}
public static void main(String args[])
{
	DeleteLibrarian obj=new DeleteLibrarian();
	obj.del();
}
}
