
package BookInventoryLibraryManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;

public class ViewMembers extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,textField6,textField7,textField8,textField9,textField10;
    JTextField textField1,textField2,textField3,textField5;
    JTextArea textField4;
    JComboBox comboBox ;
    JPanel panel;
    JButton button1,button2,button3,button4;
    JSpinner spinner1,spinner2;
    
    public ViewMembers()
    {
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 600);
        panel.setLayout(null);
        panel.setBackground( Color.pink);

	label1 = new JLabel("Membership ID");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(40,20, 120, 30);
	panel.add(label1);

	label2 = new JLabel("Name");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label2.setBounds(40, 50, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Email Id");
	label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(40, 80, 90, 30);
	panel.add(label3);

	label4 = new JLabel("Address");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(40, 110, 90, 30);
	panel.add(label4);

	label5 = new JLabel("Phone No.");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(40, 170, 90, 30);
	panel.add(label5);

	label6 = new JLabel("Membership");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(40, 200, 90, 30);
	panel.add(label6);

	label7 = new JLabel("Price");
	label7.setFont(new Font("Times New Roman",Font.BOLD,15));
        label7.setForeground(Color.black);
	label7.setBounds(40, 230, 90, 30);
	panel.add(label7);
        
        
        label8 = new JLabel("Enroll Date");
	label8.setFont(new Font("Times New Roman",Font.BOLD,15));
        label8.setForeground(Color.black);
	label8.setBounds(40, 260, 120, 30);
	panel.add(label8);
        
        label9 = new JLabel("Expiry Date");
	label9.setFont(new Font("Times New Roman",Font.BOLD,15));
        label9.setForeground(Color.black);
	label9.setBounds(40, 290, 120, 30);
	panel.add(label9);
        
        label10 = new JLabel("Books Issued");
	label10.setFont(new Font("Times New Roman",Font.BOLD,15));
        label10.setForeground(Color.black);
	label10.setBounds(40, 320, 120, 30);
	panel.add(label10);
        
       

	textField1 = new JTextField();
	textField1.setBounds(160,25,280,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel.add(textField1);
	

	textField2 = new JTextField();
	textField2.setBounds(160, 55, 280, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
	panel.add(textField2);

	textField3 = new JTextField();
	textField3.setBounds(160, 85, 280, 20);
        textField3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        textField3.setCaretColor(Color.black);
	panel.add(textField3);

	textField4 = new JTextArea();
        textField4.setBounds(160,110, 280, 60); 
        textField4.setFont(new Font("Times New Roman",Font.BOLD,16));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        textField4.setCaretColor(Color.black);
        textField4.setLineWrap(true);
        panel.add(textField4);

        textField5 = new JTextField();
	textField5.setBounds(160, 175, 280, 20);
        textField5.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
        textField5.setCaretColor(Color.black);
	panel.add(textField5);

	textField6 = new JLabel();
	textField6.setBounds(160, 205, 280, 20);
        textField6.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
        //textField6.setCaretColor(Color.black);
	panel.add(textField6);


	textField7 = new JLabel();
	textField7.setBounds(160, 235, 280, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        //textField7.setCaretColor(Color.black);
	panel.add(textField7);
        
        textField8 = new JLabel();
	textField8.setBounds(160, 265, 280, 20);
        textField8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
        //textField8.setCaretColor(Color.black);
	panel.add(textField8);
        
        textField9 = new JLabel();
	textField9.setBounds(160, 295, 280, 20);
        textField9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
//        textField9.setCaretColor(Color.black);
	panel.add(textField9);
        
     textField10 = new JLabel();
	textField10.setBounds(160, 325, 280, 20);
        textField10.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField10.setForeground(Color.black);
        textField10.setBackground(Color.white);
//        textField9.setCaretColor(Color.black);
	panel.add(textField10);
    
        
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(440,25,70,20);
        
        
        button2=new JButton("Back");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(145,370,90,30);
        
        button3=new JButton("Update");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(265,370,90,30);
        
        
        button4=new JButton("Delete");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setForeground(Color.white);
        button4.setBackground(Color.black);
        button4.setBounds(385,370,90,30);
        
        
        
       
      
        panel.add(button1);
        panel.add(button2);
       panel.add(button3);
      panel.add(button4);
      
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("View Members");
        this.setSize(600,500);
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
          
          // textField1.setEditable(false);
           String query = "SELECT * FROM Membership WHERE binary memberid=?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
           ps.setString(1,textField1.getText());
          
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next())
           {
               
                                    
                                               java.util.Date today = new java.util.Date();  
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
         String strDate= formatter.format(today);  
        
                     
                      SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String dateBeforeString = rs.getString("expirydate");
                        String dateAfterString = strDate;

	       java.util.Date dateBefore = myFormat.parse(dateBeforeString);
	       java.util.Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween = 
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
	      int days = 365+(int)daysBetween;
              System.out.println(days);
              if(days>0)
              {
                
               String strDay = Integer.toString(days);
                  //textField011.setText(strDay);
                  JOptionPane.showMessageDialog(null, "Membership Expired!!!", "", JOptionPane.INFORMATION_MESSAGE);   
              }
               textField2.setText(rs.getString("memname"));
               textField3.setText(rs.getString("mail"));
               textField4.setText(rs.getString("address"));
               textField5.setText(rs.getString("phoneno"));
               textField6.setText(rs.getString("membership"));
               textField7.setText(rs.getString("price"));
               textField8.setText(rs.getString("enrolldate"));
               textField9.setText(rs.getString("expirydate"));
               textField10.setText(rs.getString("issueNo"));
              
               
           }
           else
           {JOptionPane.showMessageDialog(null, "Member ID not found!", "", JOptionPane.INFORMATION_MESSAGE);
            
                                textField2.setText("");
                                textField3.setText("");
                                textField4.setText("");
                                textField5.setText("");
                                textField6.setText("");
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
                                     JOptionPane.showMessageDialog(null, "Provide Correct Membership ID", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                   
                                
                                String query = "UPDATE MEMBERSHIP SET memname=?,mail=?,address=?,phoneno=?WHERE binary memberid=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
                                
                                
                                
                                ps.setString(1,textField2.getText());
                                ps.setString(2,textField3.getText());
                                ps.setString(3,textField4.getText());
                                ps.setString(4,textField5.getText());
                                ps.setString(5,textField1.getText());
                                  
                                
                                
                                 int count = ps.executeUpdate();
                                
	    			
                                
                                
                                 String query2 = "UPDATE ISSUE2 SET  memname=?,mail=?,phoneno=? WHERE binary memberid=?";
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
           
                                ps2.setString(1,textField2.getText());
                                ps2.setString(2,textField3.getText());
                               // ps2.setString(3,textField4.getText());
                                ps2.setString(3,textField5.getText());
                                ps2.setString(4,textField1.getText());

                               
                                
                                
                                 int count2 = ps2.executeUpdate();
                                 
                                 
                               
                                  //new AdminFirstScreen().setVisible(true);
                                  
                                  
                                  
                                String query3 = "UPDATE ISSUEBOOK2 SET  memname=?,mail=?,phoneno=? WHERE binary memberid=?";
                                PreparedStatement ps3 = c.con.prepareStatement(query3);
           
                                ps3.setString(1,textField2.getText());
                                ps3.setString(2,textField3.getText());
                                //ps3.setString(3,textField4.getText());
                                ps3.setString(3,textField5.getText());
                                ps3.setString(4,textField1.getText());

                               
                                
                                
                                 int count3 = ps3.executeUpdate();
                                 
                                 
                                 
                                String query4 = "UPDATE RETURNBOOK2 SET  memname=?,mail=?,phoneno=? WHERE binary memberid=?";
                                PreparedStatement ps4 = c.con.prepareStatement(query4);
           
                                ps4.setString(1,textField2.getText());
                                ps4.setString(2,textField3.getText());
                               // ps4.setString(3,textField4.getText());
                                ps4.setString(3,textField5.getText());
                                ps4.setString(4,textField1.getText());

                               
                                
                                
                                 int count4 = ps4.executeUpdate();
                                  JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                                //setVisible(false);
                                
                                }
                                textField1.setText(""); 
                                textField2.setText("");
                                textField3.setText("");
                                textField4.setText("");
                                textField5.setText("");
                                textField6.setText("");
                                textField7.setText("");
                                textField8.setText("");
                                textField9.setText("");
                                textField10.setText("");
                                
                                  
         
            }
            else if(e.getSource()==button4)
            {
                if(textField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Member does not exist!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "This will permanently delete the Member details from system.\nDo you want to delete this  details?", "", JOptionPane.YES_NO_OPTION);
                
                    //System.out.println(answer);
                    if(answer==0)
                    {
                        
                        
                       
                        
                         String query1 = "DELETE FROM MEMBERSHIP WHERE binary memberid=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                       // System.out.println(count1+" records deleted"); 
                        
                        JOptionPane.showMessageDialog(null, "Member Details Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                       
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
                                textField5.setText("");
                                textField6.setText("");
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
        new ViewMembers();
    }

   
   
}