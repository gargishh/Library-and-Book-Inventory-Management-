
package BookInventoryLibraryManagementSystem;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewStaff extends JFrame implements ActionListener{

     JPanel panel;
     JTextField textField1,textField2,textField3,textField4,textField5,textField7,textField8,textField9,textField10;
     JButton button1,button2,button3,button4;
     JLabel labelimage,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
       JSpinner spinner1,spinner2;
       JComboBox comboBox,comboBoxD;
       JTextArea area;
   

   

    public ViewStaff() {
        
        
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 600);
        panel.setLayout(null);
        panel.setBackground( Color.pink);

     
        
        
        label1 = new JLabel("Phone No.");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(40, 50, 90, 30);
	panel.add(label1);
        
	label2 = new JLabel("First Name");
	label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label2.setForeground(Color.black);
	label2.setBounds(40,80, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Last Name");
        label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(40, 110, 90, 30);
	panel.add(label3);

	label4 = new JLabel("Age");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(40, 140, 90, 30);
	panel.add(label4);

	label5 = new JLabel("Gender");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(40, 170, 90, 30);
	panel.add(label5);

	label6 = new JLabel("Address");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(40, 200, 90, 30);
	panel.add(label6);

	

	label7 = new JLabel("Email Id");
	label7.setFont(new Font("Times New Roman",Font.BOLD,15));
        label7.setForeground(Color.black);
	label7.setBounds(40, 280, 90, 30);
	panel.add(label7);
        
        
        label8 = new JLabel("Designation");
	label8.setFont(new Font("Times New Roman",Font.BOLD,15));
        label8.setForeground(Color.black);
	label8.setBounds(40, 310, 90, 30);
	panel.add(label8);
        
        label9 = new JLabel("Salary");
	label9.setFont(new Font("Times New Roman",Font.BOLD,15));
        label9.setForeground(Color.black);
	label9.setBounds(40, 340, 90, 30);
	panel.add(label9);
        
        
        textField1 = new JTextField();
	textField1.setBounds(150, 60, 330, 20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel.add(textField1);

	textField2 = new JTextField();
	textField2.setBounds(150,90,330,20);
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

    
        
	textField4 = new JTextField();
	textField4.setBounds(150, 150, 330, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        textField4.setCaretColor(Color.black);
	panel.add(textField4);
        
             String ch[] = {"---Select---","Male","Female"};
        comboBox = new JComboBox(ch);
        comboBox.setBounds(150,180,330,20);
        comboBox.addActionListener(this);
        panel.add(comboBox);

	/*textField4 = new JTextField();
	textField4.setBounds(150, 150, 330, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        textField4.setCaretColor(Color.black);
	panel.add(textField4);*/
       

//        textField5 = new JTextField();
//	textField5.setBounds(150, 180, 330, 20);
//        textField5.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField5.setForeground(Color.black);
//        textField5.setBackground(Color.white);
//        textField5.setCaretColor(Color.black);
//	panel.add(textField5);

    area=new JTextArea();  
    area.setBounds(150, 210, 330, 60); 
    area.setFont(new Font("Times New Roman",Font.BOLD,16));
    area.setForeground(Color.black);
    area.setBackground(Color.white);
    area.setCaretColor(Color.black);
    area.setLineWrap(true);
    panel.add(area);
        
	

        /* SpinnerModel value1 =   new SpinnerNumberModel(0,0,1000,1); //initial value  //minimum value//maximum value //step    
          spinner1 = new JSpinner(value1);   
            spinner1.setBounds(150, 180, 330, 20);    
            panel.add(spinner1);  
            
           SpinnerModel value2 =   new SpinnerNumberModel(0,0,1000,1); //initial value  //minimum value//maximum value //step    
          spinner2 = new JSpinner(value2);   
            spinner2.setBounds(150, 210, 330, 20);    
            panel.add(spinner2);  */

	textField7 = new JTextField();
	textField7.setBounds(150, 280, 330, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        textField7.setCaretColor(Color.black);
	panel.add(textField7);
        
        /*textField8 = new JTextField();
	textField8.setBounds(150, 270, 330, 20);
        textField8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
        textField8.setCaretColor(Color.black);
	panel.add(textField8);*/
        
        String ch1[] = {"---Select---","Staff","Librarian"};
        comboBoxD = new JComboBox(ch1);
        comboBoxD.setBounds(150,310,330,20);
        comboBoxD.addActionListener(this);
        panel.add(comboBoxD);
        
        
        textField9 = new JTextField();
	textField9.setBounds(150, 340, 330, 20);
        textField9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
        textField9.setCaretColor(Color.black);
	panel.add(textField9);
        
//        textField10 = new JTextField();
//	textField10.setBounds(150, 370, 330, 20);
//        textField10.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField10.setForeground(Color.black);
//        textField10.setBackground(Color.white);
//        textField10.setCaretColor(Color.black);
//	panel.add(textField10);
        
       
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(480,60,70,20);
        
        
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
        this.setTitle("View Staffs");
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
          
             String regexemail = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        //Compile regular expression to get the pattern
        Pattern patternm = Pattern.compile(regexemail);
        Matcher matchm = patternm.matcher(textField7.getText());
            
            // Regex to check string
        // contains only digits
        String regex = "[1-9]+[0-9]*";
//        [1-9]+ will make sure that the expression starts with a number different than 0.
//
//[0-9]* will make sure to allow the expression to have zeros after the first digit.
  
        // Compile the ReGex
        
        Pattern p3 = Pattern.compile(regex);
        Matcher m3 = p3.matcher(textField4.getText());
        
         Pattern p6 = Pattern.compile("[6-9][0-9]{9}"); //(0/91)?[7-9][0-9]{9}
        Matcher m6 = p6.matcher(textField1.getText());
  
        Pattern p9 = Pattern.compile(regex);
        Matcher m9 = p9.matcher(textField9.getText());
        if(e.getSource()==button1)
       {
          
           //textField1.setEditable(false);
           String query = "SELECT * FROM STAFF WHERE phoneno=?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
           ps.setString(1,textField1.getText());
          
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next())
           {
              
               textField2.setText(rs.getString("fname"));
               textField3.setText(rs.getString("lname"));
               textField4.setText(rs.getString("age"));
               comboBox.setSelectedItem(rs.getString("gender"));
               area.setText(rs.getString("address"));
               textField7.setText(rs.getString("mail"));
               comboBoxD.setSelectedItem(rs.getString("designation"));
               textField9.setText(rs.getString("salary"));
              
               
           }
           else
                          {  JOptionPane.showMessageDialog(null, "Phone No. not available!", "", JOptionPane.INFORMATION_MESSAGE);
                          
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    comboBox.setSelectedIndex(0);
                    area.setText("");
                    textField7.setText("");
                    comboBoxD.setSelectedIndex(0);
                    textField9.setText("");
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
                                     JOptionPane.showMessageDialog(null, "Provide Correct Phone No.", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                   if(textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")
                  
                   ||area.getText().equals("")||textField7.getText().equals("") ||textField9.getText().equals("") )
                {
                                        JOptionPane.showMessageDialog(null, "Provide all details!", "", JOptionPane.WARNING_MESSAGE);

                }
               
                  else if( m3.matches()==false )
                {
                     JOptionPane.showMessageDialog(null, "Enter correct Age ", "", JOptionPane.WARNING_MESSAGE); 
                }
                   else if(comboBox.getSelectedItem().equals("---Select---"))
                {
                    JOptionPane.showMessageDialog(null,"Select Gender","",JOptionPane.WARNING_MESSAGE);
                }
                else if(m6.matches()==false)
                {
                     JOptionPane.showMessageDialog(null, "Enter correct Phone No.  ", "", JOptionPane.WARNING_MESSAGE); 
                }
                     else if( matchm.matches()==false )
                {
                     JOptionPane.showMessageDialog(null, "Enter correct Email ", "", JOptionPane.WARNING_MESSAGE); 
                }
                 else if(comboBoxD.getSelectedItem().equals("---Select---"))
                {
                    JOptionPane.showMessageDialog(null,"Select Designation","",JOptionPane.WARNING_MESSAGE);
                }
               
                  else if( m9.matches()==false )
                {
                     JOptionPane.showMessageDialog(null, "Enter correct Salary ", "", JOptionPane.WARNING_MESSAGE); 
                }
                                else
                                {
                                   
                                
                                String query = "UPDATE STAFF SET fname=?,lname=?,age=?,gender=?,address=?,mail=?,designation=?,salary=? WHERE phoneno=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
                                
                                
                                
                                ps.setString(1,textField2.getText());
                                ps.setString(2,textField3.getText());
                                ps.setString(3,textField4.getText());
                                ps.setString(4,(String)comboBox.getSelectedItem());
                                ps.setString(5,area.getText());
                                ps.setString(6,textField7.getText());
                                ps.setString(7,(String)comboBoxD.getSelectedItem());
                                ps.setString(8,textField9.getText()); 
                                ps.setString(9,textField1.getText());  
                                
                                
                              ps.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                               
                                }
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    comboBox.setSelectedIndex(0);
                    area.setText("");
                    textField7.setText("");
                    comboBoxD.setSelectedIndex(0);
                    textField9.setText("");
         
            }
            else if(e.getSource()==button4)
            {
                if(textField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Staff does not exist!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "This will permanently delete the Staff details from system.\nDo you want to delete this details?", "", JOptionPane.YES_NO_OPTION);
                
                    //System.out.println(answer);
                    if(answer==0)
                    {
                        
                        
                       
                        
                         String query1 = "DELETE FROM STAFF WHERE phoneno=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                       // System.out.println(count1+" records deleted"); 
                        
                        JOptionPane.showMessageDialog(null, "Staff Details Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
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
                    comboBox.setSelectedIndex(0);
                    area.setText("");
                    textField7.setText("");
                    comboBoxD.setSelectedIndex(0);
                    textField9.setText("");
                }
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new ViewStaff();
    }

   
   
}