import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;  
public class tty{  
    public static void main(final String args[]) {  
        JFrame myframe = new JFrame("JToolBar Example");  
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);
        /**JToolBar toolbar = new JToolBar();  
        toolbar.setRollover(true);  
        toolbar.add(new JButton("File"));  
        toolbar.addSeparator();  
        toolbar.add(new JButton("Edit"));  
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" })); **/ 
        Container contentPane = myframe.getContentPane();  

       /** contentPane.add(toolbar, BorderLayout.NORTH);**/
       /** JPanel sd=new JPanel();
        sd.setSize(400,400);
        sd.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        contentPane.add(sd);**/
        JButton yuu=new JButton("maa");
        yuu.setBounds(100,200,90,100);
        Insets e=new Insets(3,3,3,3);
        Border so=new MatteBorder(e,Color.MAGENTA);
        Border o=new MatteBorder(e,Color.BLACK);
        Border s=new CompoundBorder(so,o);
        JDialog h=new JDialog(myframe,"kya be");
        yuu.setBorder(s);
        contentPane.setSize(450,490);
        contentPane.add(yuu);
yuu.setBounds(100, 100, 120, 80);
yuu.setBorder(BorderFactory.createTitledBorder("hello bossd"));
        myframe.setSize(450, 500); 
        myframe.setUndecorated(true);
myframe.getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
myframe.getRootPane().setBorder(s);
        myframe.setVisible(true); 
    }
	}