import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JToolTip;
import javax.swing.JComponent;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;
public class helper implements ActionListener{
public static void main(String args[])
{
	   JMenuBar menubar=new JMenuBar();
	JFrame frm=new JFrame("Admin login details");
	   frm.setJMenuBar(menubar);
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setSize(500,500);
	frm.setLocationRelativeTo(null);
   Container c=frm.getContentPane();
   JSeparator sed=new JSeparator(JSeparator.HORIZONTAL);
sed.setBackground(Color.BLACK);
frm.setLayout(new GridLayout(1,1));
   JMenu sd=new JMenu("File        ");
   menubar.add(sd);
   JMenuItem st=new JMenuItem("new    ");
   menubar.add(sd);
   sd.add(st);
   sd.add(sed);
   JMenuItem stt=new JMenuItem("cut  ");
   menubar.add(sd);
   sd.add(stt);
   
   JButton libra=new JButton("Button"){
		public JToolTip createToolTip()
		{
		JToolTip o=super.createToolTip();
		o.setEnabled(true);
		o.setBackground(Color.GREEN);
		return o;
		}};
	libra.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==libra)
			{
				
				System.out.println("hello boss");
				JPopupMenu f=new JPopupMenu();
				
				   f.setDefaultLightWeightPopupEnabled(true);
			}
		}
	});
	frm.setLayout(null);	
    frm.setVisible(true);
	libra.setMnemonic(KeyEvent.VK_ENTER);
	libra.setToolTipText("click bhndee");
	JLabel sdd=new JLabel("hello");
	sdd.setSize(200, 200);
	sdd.set
	c.add(sdd);
	libra.setBounds(170,220,130,50);
	libra.setVisible(true);
	c.add(libra);
	JCheckBox box=new JCheckBox();
	box.setText("male");
	box.setSelected(true);
	box.setActionCommand("rpp");
if(box.getActionCommand()=="rpp")
{
	JOptionPane.showMessageDialog(box,"clkicked successful");
}
	box.setBounds(100,100,100,100);
	c.add(box);

}
}