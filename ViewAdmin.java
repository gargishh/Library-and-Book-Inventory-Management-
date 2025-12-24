
package BookInventoryLibraryManagementSystem;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewAdmin extends JFrame implements ActionListener{

     JPanel panel;
     JTextField textField1,textField3,textField4,textField5,textField7,textField8,textField9,textField10;
     JButton button1,button2,button3,button4;
     JLabel labelimage,textField2,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
       JSpinner spinner1,spinner2;
       JComboBox comboBox,comboBoxD;
       JTextArea area;
   

   

    public ViewAdmin() {
        
        
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 600);
        panel.setLayout(null);
        panel.setBackground( Color.pink);

     
        
        
        label1 = new JLabel("Admin ID");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(40, 50, 120, 30);
	panel.add(label1);
        
	label2 = new JLabel("Userame");
	label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label2.setForeground(Color.black);
	label2.setBounds(40,80, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Name");
        label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(40, 110, 90, 30);
	panel.add(label3);

	label4 = new JLabel("Email ID");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(40, 140, 90, 30);
	panel.add(label4);

	
	label5 = new JLabel("Address");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(40, 170, 90, 30);
	panel.add(label5);

	

	label6 = new JLabel("Phone No.");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(40, 250, 90, 30);
	panel.add(label6);
        
        
       
        
        textField1 = new JTextField();
	textField1.setBounds(150, 60, 330, 20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel.add(textField1);

	textField2 = new JLabel();
	textField2.setBounds(150,90,330,20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        //textField2.setBackground(Color.white);
       // textField2.setCaretColor(Color.black);
        //textField2.setEnabled(false);
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
        
  

    area=new JTextArea();  
    area.setBounds(150, 180, 330, 60); 
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
	textField7.setBounds(150, 250, 330, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        textField7.setCaretColor(Color.black);
	panel.add(textField7);
        

       
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
        this.setTitle("View Admin");
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
         String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(textField4.getText());
     
                Pattern p = Pattern.compile("[6-9][0-9]{9}"); //(0/91)?[7-9][0-9]{9}
        Matcher m = p.matcher(textField7.getText());
        if(e.getSource()==button1)
       {
          
           //textField1.setEditable(false);
           String query = "SELECT * FROM ACCOUNT WHERE BINARY shopMemberID=?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
           ps.setString(1,textField1.getText());
          
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next())
           {
              
               textField2.setText(rs.getString("username"));
               textField3.setText(rs.getString("name"));
               textField4.setText(rs.getString("mail"));
               area.setText(rs.getString("address"));
               textField7.setText(rs.getString("number"));
              
              
               
           }
           else
           {  JOptionPane.showMessageDialog(null, "Admin ID not available!", "", JOptionPane.INFORMATION_MESSAGE);
          
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    area.setText("");
                    textField7.setText("");
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
                                     JOptionPane.showMessageDialog(null, "Provide Correct Admin ID", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                if(textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")||textField4.getText().equals("")
                                       ||area.getText().equals("") ||textField7.getText().equals(""))
           {
                JOptionPane.showMessageDialog(null, "Provide all Details", "", JOptionPane.INFORMATION_MESSAGE);
           }
//           else if(textField2.getText().length()<8)
//           {
//               JOptionPane.showMessageDialog(null, "Username must contain 8 letters", "", JOptionPane.INFORMATION_MESSAGE);
//           }
            else if(textField3.getText().length()<3)
           {
               JOptionPane.showMessageDialog(null, "Name should contain atleast 3 characters", "", JOptionPane.INFORMATION_MESSAGE);
           }
           
           else if(match.matches()==false)
           {
                JOptionPane.showMessageDialog(null, "Give a valid gmail \n ex: example.someone@gmail.com", "", JOptionPane.INFORMATION_MESSAGE);
           }
           else if(m.matches()==false)
           {
               JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "", JOptionPane.INFORMATION_MESSAGE);
           }
           
                                else
                                {
                                   
                                     
                  String queryUsername = "SELECT username FROM ACCOUNT where username=?";
             PreparedStatement psUser = c.con.prepareStatement(queryUsername);
                                    psUser.setString(1,textField2.getText());
                                        
                                     ResultSet rsUser = psUser.executeQuery();
                                     if(rsUser.next())
                                     {
                                        
                                         
//                                        if(textField2.getText().equals(rsUser.getString("username")))
//                                       {
//                                             JOptionPane.showMessageDialog(null, "Username already Exists", "", JOptionPane.INFORMATION_MESSAGE);
//                                              //System.out.println("It already exists");
//                                       }
//                                      
//                                     }   else{ 
                                
                                String query = "UPDATE ACCOUNT SET name=?,mail=?,address=?,number=? WHERE  shopMemberID=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
                                
                                
                                
                                //ps.setString(1,textField2.getText());
                                ps.setString(1,textField3.getText());
                                ps.setString(2,textField4.getText());
                                ps.setString(3,area.getText());
                                ps.setString(4,textField7.getText());
                                ps.setString(5,textField1.getText());  
                                
                                
                              ps.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                               textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    area.setText("");
                    textField7.setText("");
                                }
                    
                                }
         
            }
            else if(e.getSource()==button4)
            {
                if(textField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Admin does not exist!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "This will permanently delete the Admin details from system.\nDo you want to delete this details?", "", JOptionPane.YES_NO_OPTION);
                
                    //System.out.println(answer);
                    if(answer==0)
                    {
                        
                        
                       
                        
                         String query1 = "DELETE FROM Account WHERE shopMemberID=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                       // System.out.println(count1+" records deleted"); 
                        
                        JOptionPane.showMessageDialog(null, "Admin Details Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
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
                    area.setText("");
                    textField7.setText("");
                }
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new ViewAdmin();
    }

   
   
}