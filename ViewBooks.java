
package BookInventoryLibraryManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewBooks extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10;
    JComboBox comboBox ;
    JPanel panel;
    JButton button1,button2,button3,button4;
    JSpinner spinner1,spinner2;
    
    public ViewBooks()
    {
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 600);
        panel.setLayout(null);
        panel.setBackground( Color.pink);

	label1 = new JLabel("ISBN No.");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(40,50, 90, 30);
	panel.add(label1);

	label2 = new JLabel("Title");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label2.setBounds(40, 80, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Author");
	label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(40, 110, 90, 30);
	panel.add(label3);

	label4 = new JLabel("Publisher");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(40, 140, 90, 30);
	panel.add(label4);

	label5 = new JLabel("Edition");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(40, 170, 90, 30);
	panel.add(label5);

	label6 = new JLabel("Volume");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(40, 200, 90, 30);
	panel.add(label6);

	label7 = new JLabel("Genre");
	label7.setFont(new Font("Times New Roman",Font.BOLD,15));
        label7.setForeground(Color.black);
	label7.setBounds(40, 230, 90, 30);
	panel.add(label7);
        
        
        label8 = new JLabel("Pages");
	label8.setFont(new Font("Times New Roman",Font.BOLD,15));
        label8.setForeground(Color.black);
	label8.setBounds(40, 260, 90, 30);
	panel.add(label8);
        
        label9 = new JLabel("Price");
	label9.setFont(new Font("Times New Roman",Font.BOLD,15));
        label9.setForeground(Color.black);
	label9.setBounds(40, 290, 90, 30);
	panel.add(label9);
        
        label10 = new JLabel("Stock");
	label10.setFont(new Font("Times New Roman",Font.BOLD,15));
        label10.setForeground(Color.black);
	label10.setBounds(40, 320, 90, 30);
	panel.add(label10);

	textField1 = new JTextField();
	textField1.setBounds(150,60,430,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel.add(textField1);
	

	textField2 = new JTextField();
	textField2.setBounds(150, 90, 430, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
	panel.add(textField2);

	textField3 = new JTextField();
	textField3.setBounds(150, 120, 430, 20);
        textField3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        textField3.setCaretColor(Color.black);
	panel.add(textField3);

	textField4 = new JTextField();
	textField4.setBounds(150, 150, 430, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        textField4.setCaretColor(Color.black);
	panel.add(textField4);

//        textField5 = new JTextField();
//	textField5.setBounds(150, 180, 430, 20);
//        textField5.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField5.setForeground(Color.black);
//        textField5.setBackground(Color.white);
//        textField5.setCaretColor(Color.black);
//	panel.add(textField5);
//
//	textField6 = new JTextField();
//	textField6.setBounds(150, 210, 430, 20);
//        textField6.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField6.setForeground(Color.black);
//        textField6.setBackground(Color.white);
//        textField6.setCaretColor(Color.black);
//	panel.add(textField6);

         SpinnerModel value1 =   new SpinnerNumberModel(1,1,1000,1); //initial value  //minimum value//maximum value //step    
          spinner1 = new JSpinner(value1);   
            spinner1.setBounds(150, 180, 430, 20);    
            panel.add(spinner1);  
            
           SpinnerModel value2 =   new SpinnerNumberModel(1,1,1000,1); //initial value  //minimum value//maximum value //step    
          spinner2 = new JSpinner(value2);   
            spinner2.setBounds(150, 210, 430, 20);    
            panel.add(spinner2);  

	textField7 = new JTextField();
	textField7.setBounds(150, 240, 430, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        textField7.setCaretColor(Color.black);
	panel.add(textField7);
        
        textField8 = new JTextField();
	textField8.setBounds(150, 270, 430, 20);
        textField8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
        textField8.setCaretColor(Color.black);
	panel.add(textField8);
        
        textField9 = new JTextField();
	textField9.setBounds(150, 300, 430, 20);
        textField9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
        textField9.setCaretColor(Color.black);
	panel.add(textField9);
        
        textField10 = new JTextField();
	textField10.setBounds(150, 330, 430, 20);
        textField10.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField10.setForeground(Color.black);
        textField10.setBackground(Color.white);
        textField10.setCaretColor(Color.black);
	panel.add(textField10);
    
        
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(590,60,70,20);
        
        
        button2=new JButton("Back");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(170,400,90,30);
        
        button3=new JButton("Update");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(290,400,90,30);
        
        
        button4=new JButton("Delete");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setForeground(Color.white);
        button4.setBackground(Color.black);
        button4.setBounds(410,400,90,30);
        
        
        
       
      
        panel.add(button1);
        panel.add(button2);
       panel.add(button3);
      panel.add(button4);
      
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("View Books");
        this.setSize(700,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(panel);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    try{
        Conn c = new Conn();
        if(e.getSource()==button1)
       {
          
           
           String query = "SELECT * FROM Books WHERE ISBN =?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
           ps.setString(1,textField1.getText());
          
           
           ResultSet rs = ps.executeQuery();
           
         if(rs.next())
           {
              
               textField2.setText(rs.getString("Title"));
               textField3.setText(rs.getString("Author"));
               textField4.setText(rs.getString("Publisher"));
               spinner1.setValue(Integer.parseInt(rs.getString("Edition")));
               spinner2.setValue(Integer.parseInt(rs.getString("Volume")));
               textField7.setText(rs.getString("Genre"));
               textField8.setText(rs.getString("Pages"));
               textField9.setText(rs.getString("Price"));
               textField10.setText(rs.getString("stocks"));
               
           }
         else{
                              
                                 JOptionPane.showMessageDialog(null, "ISBN No. not available!", "", JOptionPane.INFORMATION_MESSAGE);
                                textField2.setText("");
                               textField3.setText("");
                                textField4.setText("");
                                spinner1.setValue(0);
                                spinner2.setValue(0);
                               textField7.setText("");
                               textField8.setText("");
                               textField9.setText("");
                               textField10.setText("");
         }                   
           
       
        
        
          
          
       
       }
    
        
           else if(e.getSource()==button2)
            {
                setVisible(false);
                //new AdminFirstScreen().setVisible(true);
         
            }
            
            else if(e.getSource()==button3)
            {
                                if(textField2.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct ISBN No.", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                   
                                
                                String query = "UPDATE Books SET Title=?,Author=?,Publisher=?,Edition=?,Volume=?,Genre=?,Pages=?,Price=?,stocks=? WHERE ISBN=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
                                
                                  String s1 = spinner1.getValue().toString();
                                 String s2 = spinner2.getValue().toString();
                                
                                ps.setString(1,textField2.getText());
                                ps.setString(2,textField3.getText());
                                ps.setString(3,textField4.getText());
                                ps.setString(4, s1);
                                ps.setString(5, s2);
                                ps.setString(6,textField7.getText());
                                ps.setString(7,textField8.getText());
                                ps.setString(8,textField9.getText());
                                ps.setString(9,textField10.getText());
                                ps.setString(10,textField1.getText());
                                  
                                
                                
                                 int count = ps.executeUpdate();
                                
	    			 JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                            
                                }
                                textField1.setText("");
                                textField2.setText("");
                               textField3.setText("");
                                textField4.setText("");
                                spinner1.setValue(0);
                                spinner2.setValue(0);
                               textField7.setText("");
                               textField8.setText("");
                               textField9.setText("");
                               textField10.setText("");
         
            }
            else if(e.getSource()==button4)
            {
                if(textField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "BOOK does not exist!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "This will permanently delete the Book details from system.\nDo you want to delete this Book details?", "", JOptionPane.YES_NO_OPTION);
                
                    //System.out.println(answer);
                    if(answer==0)
                    {
                        
                        
                       
                        
                         String query1 = "DELETE FROM Books WHERE ISBN=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                       // System.out.println(count1+" records deleted"); 
                        
                        JOptionPane.showMessageDialog(null, "Book Details Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
                        //this.setVisible(false);
                       
                    }
                    else if(answer==1)
                    {
                
                        this.setVisible(true);
                    }
                    else
                    {
                            this.setVisible(true);
                     }
                                textField1.setText("");
                                textField2.setText("");
                               textField3.setText("");
                                textField4.setText("");
                                spinner1.setValue(0);
                                spinner2.setValue(0);
                               textField7.setText("");
                               textField8.setText("");
                               textField9.setText("");
                               textField10.setText("");
                }
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new ViewBooks();
    }

   
   
}