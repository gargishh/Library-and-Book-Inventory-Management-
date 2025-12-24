
package bookinventorylibrarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequestBooks extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,textField4;
    JTextField textField1,textField2,textField3,textField5,textField6,textField7,textField8,textField9,textField10;
    JComboBox comboBox ;
    JPanel panel;
    JButton button1,button2,button3,button4,button5;
    JSpinner spinner1,spinner2;
    
    public RequestBooks()
    {
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 600);
        panel.setLayout(null);
        panel.setBackground( Color.pink);//255, 253, 204

	label1 = new JLabel("Book Title");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(40,55, 90, 30);
	panel.add(label1);

	label2 = new JLabel("Book Author");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label2.setBounds(40, 85, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Requests");
	label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(40, 115, 90, 30);
	panel.add(label3);
        
        label4 = new JLabel("Order Placed to");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(40, 145, 120, 30);
	panel.add(label4);

	label5 = new JLabel("Date");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(40, 175, 120, 30);
	panel.add(label5);

	textField1 = new JTextField();
	textField1.setBounds(150,60,330,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel.add(textField1);
	

	textField2 = new JTextField();
	textField2.setBounds(150, 90, 330, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
	panel.add(textField2);

	textField3 = new JTextField();
	textField3.setBounds(150, 120, 330, 20);
        textField3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        textField3.setCaretColor(Color.black);
	panel.add(textField3);

	
        String []options ={"---Select---"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(150,150,330,20);
        panel.add(comboBox);
        
        textField4 = new JLabel();
	textField4.setBounds(150, 180, 330, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
	panel.add(textField4);
        
         java.util.Date date = new java.util.Date();  
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
         String strDate= formatter.format(date);  
        textField4.setText(strDate);
        
        
       
       
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(490,60,70,20);
        
        
        button2=new JButton("Add");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(100,260,90,30);
        
        button3=new JButton("Update");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(220,260,90,30);
        
        
        button4=new JButton("Delete");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setForeground(Color.white);
        button4.setBackground(Color.black);
        button4.setBounds(340,260,90,30);
        
        button5=new JButton("Back");
        button5.addActionListener(this);
        button5.setFocusable(false);
        button5.setForeground(Color.white);
        button5.setBackground(Color.black);
        button5.setBounds(460,260,90,30);
        
        
       
      
        panel.add(button1);
        panel.add(button2);
       panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Place Orders");
        this.setSize(600,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(panel);
        
        
        try{
            Conn c = new Conn();
            String query ="Select fname from VENDOR";
            PreparedStatement ps = c.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                comboBox.addItem(rs.getString("fname"));
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
         /*String ch = (String)comboBox.getSelectedItem();
        if(!ch.equals("---Select---"))
        textField4.setText(ch);*/
        
        
        
        
        
        
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
         String Title = textField1.getText();
       
    try{
        Conn c = new Conn();
         String regex = "[1-9]+[0-9]*";
//        [1-9]+ will make sure that the expression starts with a number different than 0.
//
//[0-9]* will make sure to allow the expression to have zeros after the first digit.
  
        // Compile the ReGex
        
        Pattern p3 = Pattern.compile(regex);
        Matcher m3 = p3.matcher(textField3.getText());
        String item = (String)comboBox.getSelectedItem();
    
          if(e.getSource()==button1)
       {
          
          
           String query = "SELECT * FROM REQUEST WHERE  Title LIKE ?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
            ps.setString(1,"%"+ Title+"%");
          
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next())
           {
               textField1.setText(rs.getString("Title"));
               textField2.setText(rs.getString("Author"));
               textField3.setText(rs.getString("Requests"));
               comboBox.setSelectedItem(rs.getString("Vendor"));
               textField4.setText(rs.getString("date"));
              
           }
           else
           {
             JOptionPane.showMessageDialog(null, "Book Request Not found!!!", "", JOptionPane.INFORMATION_MESSAGE);

           }
           
           
           
           
       
       }
        else if (e.getSource()==button2)
        {
            if(m3.matches()==false)
            {
                JOptionPane.showMessageDialog(null, "Provide Correct Request number", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(item.equals("---Select---"))
            {
                JOptionPane.showMessageDialog(null, "Select a Vendor", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            String query = "INSERT INTO Request(Title,Author,Requests,Vendor,date) VALUES(?,?,?,?,?)";
		PreparedStatement ps = c.con.prepareStatement(query);
             
		ps.setString(1, textField1.getText());
		ps.setString(2, textField2.getText());
                ps.setString(3, textField3.getText());
                ps.setString(4, (String)comboBox.getSelectedItem());
                 ps.setString(5, textField4.getText());
                int count = ps.executeUpdate();
		if (count > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        comboBox.setSelectedIndex(0);
                        
            }
        }
        
         
            
            else if(e.getSource()==button3)
            {
                                if(textField2.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct Book Title", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                   
                                
                                String query = "UPDATE Request SET Title=?,Author=?,Requests=?,Vendor=?,date=? WHERE Title=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
                                
                                
                               ps.setString(1,textField1.getText());
                                ps.setString(2,textField2.getText());
                                ps.setString(3,textField3.getText());
                                ps.setString(4, (String)comboBox.getSelectedItem());
                                ps.setString(5,textField4.getText());
                                 ps.setString(6,textField1.getText());
                                  
                                
                                
                                 int count = ps.executeUpdate();
                                if(count>0)
	    			 JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                              else
                                   JOptionPane.showMessageDialog(null, "Book details does not exist", "", JOptionPane.INFORMATION_MESSAGE); 
                                }
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        comboBox.setSelectedIndex(0);
                       
         
            }
            else if(e.getSource()==button4)
            {
                if(textField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Requested Book not found!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "Delete requested Book details?", "", JOptionPane.YES_NO_OPTION);
                
                    //System.out.println(answer);
                    if(answer==0)
                    {
                        
                        
                       
                        
                         String query1 = "DELETE FROM REQUEST WHERE Title=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                       // System.out.println(count1+" records deleted"); 
                        
                        JOptionPane.showMessageDialog(null, "Book Details Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
                        //this.setVisible(false);
                        
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        comboBox.setSelectedIndex(0);
                        
                       
                    }
                    else if(answer==1)
                    {
                
                        this.setVisible(true);
                    }
                    else
                    {
                            this.setVisible(true);
                     }
                }
            }
          else if(e.getSource()==button5)
            {
                setVisible(false);
                //new AdminFirstScreen().setVisible(true);
         
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new RequestBooks();
    }

   
   
}