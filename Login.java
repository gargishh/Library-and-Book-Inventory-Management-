
package bookinventorylibrarymanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3,labelid;
    JButton button1,button2,button3;
    JTextField textField1,textField2,textFieldID;
    JComboBox comboBox;
    JPanel panel;
    Login()
    {
     
        
        label1 = new JLabel();
        label1.setText("Userame");
        label1.setBounds(10,90,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       // label1.setBackground(Color.red);
        //label1.setOpaque(true);
        
        label2 = new JLabel();
        label2.setText("Password");
        label2.setBounds(10,120,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
       /* 
        label3 = new JLabel();
        label3.setText("Role");
        label3.setBounds(10,165,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
        
        String[] options = {"Admin","Member"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(90,175,150,20);
        */
        
        button1 = new JButton();
        button1.setBounds(30,220,100,30);
        button1.addActionListener(this);
        button1.setText("Login");
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button2 = new JButton();
        button2.setBounds(145,220,100,30);
        button2.addActionListener(this);
        button2.setText("SignUp");
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button3 = new JButton();
        button3.setBounds(65,260,170,30);
        button3.addActionListener(this);
        button3.setText("Forget Password");
        button3.setFocusable(false);
        button3.setBackground(Color.black);
        //button3.setBorderPainted( false );
        button3.setForeground(Color.white);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        

        
        textField1 = new JTextField();
        textField1.setBounds(90,105,150,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        
        
        textField2 = new JPasswordField();
        textField2.setBounds(90,135,150,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
        
        
        
        
        
        JPanel Panel  = new JPanel();
        Panel.setBackground(Color.pink);
        Panel.setBounds(0, 0, 300, 400);
        Panel.setLayout(null);
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(button1);
        Panel.add(button2);
        Panel.add(button3);
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Login");
        this.setSize(300,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
       // this.setBackground(Color.pink); 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        //this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        this.add(Panel);
        //this.add(label1);
        //this.add(label2);
        
       
        
       
        
        
    
        
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
            
    try{
        Conn c = new Conn();
        String s ="";
        if(e.getSource()==button1)
       {
          //System.out.println( textField.getText());
          String query = "SELECT name,username,password FROM ACCOUNT WHERE BINARY username =? AND BINARY password=?";
           PreparedStatement ps = c.con.prepareStatement(query);
           
            ps.setString(1,textField1.getText());
           ps.setString(2,textField2.getText());
         
           ResultSet rs = ps.executeQuery();
          
        if(rs.next())
           {
               
         s = rs.getString("name");
            setVisible(false);
               new AdminFirstScreen(s).setVisible(true);
          
              
           }
         else
            JOptionPane.showMessageDialog(null, "Invalid Username or password", "", JOptionPane.INFORMATION_MESSAGE);
           
           
           
       }
    
        
           else if(e.getSource()==button2)
            {
          setVisible(false);
            new SignUp().setVisible(true);
         
            }
            
            else if(e.getSource()==button3)
            {
                 setVisible(false);
          new ForgotPassword().setVisible(true);
         
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
       
    
     public static void main(String[] args)
    {
        new Login();
    }

  
}

