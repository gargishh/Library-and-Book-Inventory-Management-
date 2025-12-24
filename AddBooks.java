
package bookinventorylibrarymanagementsystem;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddBooks extends JFrame implements ActionListener{

     JPanel panel;
     JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10;
     JButton button1,button2;
     JLabel labelimage,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
       JSpinner spinner1,spinner2;
   

   

    public AddBooks() {
        
        
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
        
        button1 = new JButton();
        button1.setBounds(250, 400, 100,30);
        button1.addActionListener(this);
        button1.setText("Add");
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel.add(button1);
                
        button2 = new JButton();
        button2.setBounds(380, 400, 100,30);
        button2.addActionListener(this);
        button2.setText("Back");
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));

	
	
	panel.add(button2);

	
        
	
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add Books");
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
    
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c = new Conn();
            // Regex to check string
        // contains only digits
        String regex = "[1-9]+[0-9]*";
//        [1-9]+ will make sure that the expression starts with a number different than 0.
//
//[0-9]* will make sure to allow the expression to have zeros after the first digit.
  
        // Compile the ReGex
        Pattern p8 = Pattern.compile(regex);
        Matcher m8 = p8.matcher(textField8.getText());
        
        Pattern p9 = Pattern.compile(regex);
        Matcher m9 = p9.matcher(textField9.getText());
        
         Pattern p10 = Pattern.compile(regex);
        Matcher m10 = p10.matcher(textField10.getText());
  
      
            if(ae.getSource() == button1){
                if(textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")||textField4.getText().equals("")
                    ||spinner1.getValue().equals("")||spinner2.getValue().equals("")
                   ||textField7.getText().equals("") ||textField8.getText().equals("") ||textField9.getText().equals("")||textField10.getText().equals("") )
                {
                                        JOptionPane.showMessageDialog(null, "Provide all details!", "", JOptionPane.WARNING_MESSAGE);

                }
                else if(textField1.getText().length()!=13)
                {
                    JOptionPane.showMessageDialog(null, "Wrong ISBN number", "", JOptionPane.WARNING_MESSAGE);   
                }
                else if(m8.matches()==false )
                {
                     JOptionPane.showMessageDialog(null, "Enter correct number in Pages ", "", JOptionPane.WARNING_MESSAGE); 
                }
                  else if( m9.matches()==false )
                {
                     JOptionPane.showMessageDialog(null, "Enter correct number in  Price ", "", JOptionPane.WARNING_MESSAGE); 
                }
                    else if( m10.matches()==false)
                {
                     JOptionPane.showMessageDialog(null, "Enter correct number in  Stocks", "", JOptionPane.WARNING_MESSAGE); 
                }
               else {    
                           String queryUsername = "SELECT ISBN FROM Books where ISBN=?";
             PreparedStatement psUser = c.con.prepareStatement(queryUsername);
                                    psUser.setString(1,textField1.getText());
                                        
                                     ResultSet rsUser = psUser.executeQuery();
                                     if(rsUser.next())
                                     {
                                        
                                         
                                        if(textField1.getText().equals(rsUser.getString("ISBN")))
                                       {
                                             JOptionPane.showMessageDialog(null, "ISBN number already Exists", "", JOptionPane.INFORMATION_MESSAGE);
                                              
                                       }
                                      
                                     }   else{
                        
                        String query = "INSERT INTO Books(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,stocks) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = c.con.prepareStatement(query);
                String s1 = spinner1.getValue().toString();
                String s2 = spinner2.getValue().toString();
		ps.setString(1, textField1.getText());
		ps.setString(2, textField2.getText());
		ps.setString(3, textField3.getText());
		ps.setString(4, textField4.getText());
		ps.setString(5, s1);
		ps.setString(6, s2);
                ps.setString(7, textField7.getText());
                ps.setString(8, textField8.getText());
                ps.setString(9, textField9.getText());
                ps.setString(10, textField10.getText());
                
                

		int count = ps.executeUpdate();
		if (count > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
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
                
                
		ps.close();
                                     }
                }
            }
            else if(ae.getSource() == button2){
                this.setVisible(false);
		//new AdminFirstScreen().setVisible(true);

            }
            c.con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
     public static void main(String[] args) {
	new AddBooks().setVisible(true);
    }
}
