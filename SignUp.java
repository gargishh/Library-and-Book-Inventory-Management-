
package bookinventorylibrarymanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends JFrame implements ActionListener{
   
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
    JTextField textField1,textField2,textField3,textField4,textField6,textField7,textField9;
    JComboBox comboBox ;
    JPanel Panel;
    JButton b1,b2,b3;
  JTextArea textField5;
    public SignUp()
    {
        label1 = new JLabel();
        label1.setText("Admin ID");
        label1.setBounds(10,30,170,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label2 = new JLabel();
        label2.setText("Username");
        label2.setBounds(10,60,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label3 = new JLabel();
        label3.setText("Name");
        label3.setBounds(10,90,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
     
        
        label4 = new JLabel();
        label4.setText("E-mail ID");
        label4.setBounds(10,120,100,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label5 = new JLabel();
        label5.setText("Address");
        label5.setBounds(10,150,100,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label6 = new JLabel();
        label6.setText("Phone no.");
        label6.setBounds(10,225,100,50);
        label6.setForeground(Color.black);// set font color of text
        label6.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label7 = new JLabel();
        label7.setText("Password");
        label7.setBounds(10,255,100,50);
        label7.setForeground(Color.black);// set font color of text
        label7.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label8 = new JLabel();
        label8.setText("Security Question");
        label8.setBounds(10,285,130,50);
        label8.setForeground(Color.black);// set font color of text
        label8.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label9 = new JLabel();
        label9.setText("Answer");
        label9.setBounds(10,315,100,50);
        label9.setForeground(Color.black);// set font color of text
        label9.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
       
        
        textField1 = new JTextField();
        textField1.setBounds(135,45,250,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField1.setCaretColor(Color.black);
        
        textField2 = new JTextField();
        textField2.setBounds(135,75,250,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField2.setCaretColor(Color.black);
        //textField.setText("username");
        
        textField3 = new JTextField();
        textField3.setBounds(135,105,250,20);
        textField3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField3.setCaretColor(Color.black);
        //textField.setText("username");
        
        textField4 = new JTextField();
        textField4.setBounds(135,135,250,20);
        textField4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField4.setCaretColor(Color.black);
        //textField.setText("username");
        
    textField5=new JTextArea();  
    textField5.setBounds(135,165, 250, 60); 
    textField5.setFont(new Font("Times New Roman",Font.BOLD,16));
    textField5.setForeground(Color.black);
    textField5.setBackground(Color.white);
    textField5.setCaretColor(Color.black);
    textField5.setLineWrap(true);
    
        
        
        textField6 = new JTextField();
        textField6.setBounds(135,240,250,20);
        textField6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField6.setCaretColor(Color.black);
        
        
      
        
        textField7 = new JPasswordField();
        textField7.setBounds(135,270,250,20);
        textField7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        textField7.setCaretColor(Color.black);
        
          
        String[] options = {"---Select---","Your nick name?","Your favourite color?","Your pet name?"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(135,300,250,20);
       
        
        textField9 = new JTextField();
        textField9.setBounds(135,330,250,20);
        textField9.setFont(new Font("Times New Roman",Font.PLAIN,15));
        textField9.setForeground(Color.black);
        //textField7.setEditable(false);
        
        
        b1 = new JButton("SignUp");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);// b1.setBackground(new Color(205,255,130));
        b1.setBounds(120,380,90,30);
        
        
        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);//new Color(205,246,246)
        b2.setBounds(230,380,90,30);
        

       
        
        
        Panel  = new JPanel();
        Panel.setBackground(Color.pink);
        Panel.setBounds(0, 0, 450, 500);
        Panel.setLayout(null);
      
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(label3);
        Panel.add(label4);
        Panel.add(label5);
        Panel.add(label6);
        Panel.add(label7);
        Panel.add(label8); 
        Panel.add(label9);
         
       
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(textField3);
        Panel.add(textField4);
        Panel.add(textField5);
        Panel.add(textField6);
        Panel.add(textField7);
        Panel.add(comboBox);
        Panel.add(textField9);
        Panel.add(b1);
        Panel.add(b2);
        
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("SignUp");
        this.setSize(450,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
      
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(Panel);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
        /*if(e.getSource()==b1)
            {
                setVisible(false);
                new Login().setVisible(true);
         
            }*/
    try{
        Conn c = new Conn();
        if(e.getSource()==b1)
       {
            String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(textField4.getText());
     
                Pattern p = Pattern.compile("[6-9][0-9]{9}"); //(0/91)?[7-9][0-9]{9}
        Matcher m = p.matcher(textField6.getText());
 
            boolean numeric=false, lower=false,upper=false,spec=false;
        char[] ch;
            ch = textField7.getText().toCharArray();
       

        for(int i=0;i<ch.length;i++) {
            if(Character.isDigit(ch[i])) numeric=true;
            else if(Character.isLowerCase(ch[i])) lower=true;
            else if(Character.isUpperCase(ch[i])) upper=true;
            else spec=true;
        }
           String select = (String)comboBox.getSelectedItem();
            
           
           if(textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")||textField4.getText().equals("")||textField5.getText().equals("")||textField6.getText().equals("")||textField7.getText().equals("")||textField9.getText().equals(""))
           {
                JOptionPane.showMessageDialog(null, "Provide all Details", "", JOptionPane.INFORMATION_MESSAGE);
           }
           else if(textField2.getText().length()<8)
           {
               JOptionPane.showMessageDialog(null, "Username must contain 8 letters", "", JOptionPane.INFORMATION_MESSAGE);
           }
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
           
           else if(ch.length<8 || ch.length>15 || ((numeric && lower && upper && spec)==false))
           {
                JOptionPane.showMessageDialog(null, "Password should be of length 8 to 15 \n Password should contain atleast 1 digit,\n1 uppercase ,1 lowercase and 1 special character", "", JOptionPane.INFORMATION_MESSAGE);
           }
           else if (select.equals("---Select---"))
           {
               JOptionPane.showMessageDialog(null,"Select any option from security question");
           }
           else if(textField9.getText().length()<3)
           {
               JOptionPane.showMessageDialog(null, "Security answer must contain atleast 3 characters", "", JOptionPane.INFORMATION_MESSAGE);
           }
           
           else
           {
        
                String queryUsername = "SELECT username FROM ACCOUNT where username=?";
             PreparedStatement psUser = c.con.prepareStatement(queryUsername);
                                    psUser.setString(1,textField2.getText());
                                        
                                     ResultSet rsUser = psUser.executeQuery();
                                     if(rsUser.next())
                                     {
                                        
                                         
                                        if(textField2.getText().equals(rsUser.getString("username")))
                                       {
                                             JOptionPane.showMessageDialog(null, "Username already Exists", "", JOptionPane.INFORMATION_MESSAGE);
                                              System.out.println("It already exists");
                                       }
                                      
                                     }   else{                         
               
                                         String query = "INSERT INTO ACCOUNT(shopMemberID,username,name,mail,address,number,password,security,answer) VALUES (?,?,?,?,?,?,?,?,?)";
           PreparedStatement ps = c.con.prepareStatement(query);
           
      
        
        ps.setString(1,textField1.getText());
        ps.setString(2,textField2.getText());
        ps.setString(3,textField3.getText());
        ps.setString(4,textField4.getText());
        ps.setString(5,textField5.getText());
        ps.setString(6,textField6.getText());
        ps.setString(7,textField7.getText());
        ps.setString(8,(String) comboBox.getSelectedItem());
        ps.setString(9,textField9.getText());
          
          
        int count = ps.executeUpdate();
        //System.out.println(count);
        if(count>0){
            //JOptionPane.showMessageDialog(null, "Account Created Successfully ");
            JOptionPane.showMessageDialog(null, "Account Created Successfully", "Account Created", JOptionPane.INFORMATION_MESSAGE);
        }
       textField1.setText("");      
       textField2.setText("");
       textField3.setText("");
       textField4.setText("");
       textField5.setText("");
       textField6.setText("");
       textField7.setText("");
        comboBox.setSelectedIndex(0);
       textField9.setText("");
                                        //}                      
                                     }
           }
       } 
        
           else if(e.getSource()==b2)
            {
                setVisible(false);
                new Login().setVisible(true);
         
            }
            
            
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
     public static void main(String[] args) {
       new SignUp();
    }

   
   
}



