
package bookinventorylibrarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;



public class BookInventoryLibraryManagementSystem extends JFrame implements ActionListener{
     JLabel label1,label2,label3,label4;
    JButton button1,button2,button3;
    JTextField textField1,textField2;
   
     JMenuItem item1,item2;
    JMenuBar menu;
    JMenu file1;
    BookInventoryLibraryManagementSystem()
    {
        menu = new JMenuBar();
        menu.setBackground(Color.white);
        file1 = new JMenu("Click Here");
        
        item1 = new JMenuItem("Login");
        item1.addActionListener(this);
        file1.add(item1);
        
        
        item2 = new JMenuItem("SignUp");
        item2.addActionListener(this);
        file1.add(item2);
        
        menu.add(file1);
          
	
        
        
        ImageIcon icon1 = new ImageIcon("src/BookInventoryLibraryManagementSystem/Images/Book8.jpg"); // load the image to a icon
        Image img1 = icon1.getImage(); // transform it 
        Image newimg1 = img1.getScaledInstance(1366,768,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon1 = new ImageIcon(newimg1);  // transform it back
        label1 = new JLabel(icon1);
        label1.setBounds(0,0,1366,768);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        
        
        label2 = new JLabel("Welcome To");
	label2.setFont(new Font("Forte",Font.ITALIC,50));
        label2.setForeground(Color.black);
	label2.setBounds(710,290, 500, 100);
        label1.add(label2);
	
        
        label3 = new JLabel("Tell A Tale");
	label3.setFont(new Font("Forte",Font.ITALIC,50));
        label3.setForeground(Color.black);
	label3.setBounds(695,350, 500, 100);
        label1.add(label3);
        
        label4 = new JLabel("~Created by Sreejita Banerjee");
	label4.setFont(new Font("Forte",Font.ITALIC,25));
        label4.setForeground(Color.black);
	label4.setBounds(750,430, 500, 100);
        label1.add(label4);
        
       /* button1 = new JButton("Login");
        button1.setBounds(500, 500, 150, 30);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        label1.add(button1);*/
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label1);
        this.setJMenuBar(menu);
        //this.add(button1);
//        this.add(label2);
//        this.add(label3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==item1)
            {
                new Login();
            }
            else if(e.getSource()==item2)
            {
                new SignUp();
            }

    }
    
     public static void main(String[] args)
    {
        new BookInventoryLibraryManagementSystem();
    }
}
