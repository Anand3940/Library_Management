import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class viewissuedbooks {
	public void re()
	{
		 JFrame frm=new JFrame("Project");				
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frm.setLayout(null);
			Container f=frm.getContentPane();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			frm.setSize(screenSize.width/2, screenSize.height/2);
			frm.setLocationRelativeTo(null);
		String data[][]=null;
		String column[]=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/an","root","12345");
			PreparedStatement s=connection.prepareStatement("select * from issuebook");
			ResultSet rs=s.executeQuery();
			
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			connection.close();
		}catch(Exception e){System.out.println(e);}
		JTable l1=new JTable(data,column);
		l1.setBounds(20,20,400,400);
		f.add(l1);
		frm.setVisible(true);
		JButton b2=new JButton("Back");
		b2.setBounds(475,70,90,35);
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
	public static void main(String args[])
	{
		viewissuedbooks gh=new viewissuedbooks();
		gh.re();
	}
}
