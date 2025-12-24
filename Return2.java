
package bookinventorylibrarymanagementsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Return2 extends JFrame implements ActionListener{
    JLabel labelid,label00,label01,label02,label03,label04,label05,label06,label07,label08,label09,label010,label011,label012,label0,label1,
            label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,textField03,textField04,
            textField06,textField07,textField08,textField09,textField010,textField011,textField2,textField3,textField4,textFieldID,
            textField5,textField6,textField7,textField8,textField9,textField1;
    JTextField textField01,textField02,textField012;
    JTextArea textField05;
    JPanel panel1,panel2;
    JButton bookViewButton,backButton,returnButton,buttond,buttonm,memberViewButton;
    JSpinner spinner1;
    SpinnerModel value1 ;
    JDateChooser dateChooser1,dateChooser2;
    JComboBox comboBox,comboBoxState;
    
    public Return2()
    {
        panel1 = new JPanel();
        panel1.setBounds(0,0, 600, 600);
        //panel1.setBounds(601, 0, 601, 600);
        panel1.setLayout(null);
        panel1.setBackground( Color.pink);
        
        
        panel2 = new JPanel();
        //panel2.setBounds(0,0, 600, 600);
        panel2.setBounds(601, 0, 601, 600);
        panel2.setLayout(null);
        //panel2.setBackground( new Color(177, 236, 252));//255, 254, 229
            panel2.setBackground( new Color(185,242,251));//185,242,251 //185,238,252//255, 253, 204
        label0 = new JLabel("Book Details");
	label0.setFont(new Font("Times New Roman",Font.BOLD,25));
        label0.setForeground(Color.black);
	label0.setBounds(220,20, 250, 50);
	panel1.add(label0);
        
	label1 = new JLabel("ISBN No.");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(100,75, 90, 30);
	panel1.add(label1);
        
        
        labelid = new JLabel("Book ID");
	labelid.setFont(new Font("Times New Roman",Font.BOLD,15));
        labelid.setForeground(Color.black);
	labelid.setBounds(100,105, 90, 30);
	panel1.add(labelid);

	label2 = new JLabel("Title");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label2.setBounds(100, 135, 90, 30);
	panel1.add(label2);

	label3 = new JLabel("Author");
	label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(100, 165, 90, 30);
	panel1.add(label3);

	label4 = new JLabel("Publisher");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(100, 195, 90, 30);
	panel1.add(label4);

	label5 = new JLabel("Edition");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(100, 225, 90, 30);
	panel1.add(label5);

	label6 = new JLabel("Volume");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(100, 255, 90, 30);
	panel1.add(label6);

	label7 = new JLabel("Genre");
	label7.setFont(new Font("Times New Roman",Font.BOLD,15));
        label7.setForeground(Color.black);
	label7.setBounds(100, 285, 90, 30);
	panel1.add(label7);
        
        
        label8 = new JLabel("Pages");
	label8.setFont(new Font("Times New Roman",Font.BOLD,15));
        label8.setForeground(Color.black);
	label8.setBounds(100, 315, 90, 30);
	panel1.add(label8);
        
   
        
        label9 = new JLabel("Price");
	label9.setFont(new Font("Times New Roman",Font.BOLD,15));
        label9.setForeground(Color.black);
	label9.setBounds(100, 345, 90, 30);
	panel1.add(label9);
        
       label10 = new JLabel("Book State");
	label10.setFont(new Font("Times New Roman",Font.BOLD,15));
        label10.setForeground(Color.black);
	label10.setBounds(100, 375, 90, 30);
	panel1.add(label10);
        
      /*  label11 = new JLabel("Fine Amount");
	label11.setFont(new Font("Times New Roman",Font.BOLD,15));
        label11.setForeground(Color.black);
	label11.setBounds(100, 405, 90, 30);
	panel1.add(label11);*/

       String[] options = {"---Select---"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(200,80,250,20);//(135,205,250,20);
        comboBox.addActionListener(this);
        panel1.add(comboBox);
        
	/*textField1 = new JLabel();
	textField1.setBounds(200,80,250,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        //textField1.setCaretColor(Color.black);
	panel1.add(textField1);*/
	

	textField2 = new JLabel();
	textField2.setBounds(200, 110, 250, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
//        textField2.setCaretColor(Color.black);
	panel1.add(textField2);
        
        textFieldID = new JLabel();
	textFieldID.setBounds(200, 140, 250, 20);
        textFieldID.setFont(new Font("Times New Roman",Font.BOLD,20));
        textFieldID.setForeground(Color.black);
        textFieldID.setBackground(Color.white);
//        textField2.setCaretColor(Color.black);
	panel1.add(textFieldID);
        
	textField3 = new JLabel();
	textField3.setBounds(200, 170, 250, 20);
        textField3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
   //     textField3.setCaretColor(Color.black);
	panel1.add(textField3);

	textField4 = new JLabel();
	textField4.setBounds(200, 200, 250, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
   //     textField4.setCaretColor(Color.black);
	panel1.add(textField4);

        textField5 = new JLabel();
	textField5.setBounds(200, 230, 250, 20);
        textField5.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
    //    textField5.setCaretColor(Color.black);
	panel1.add(textField5);

	textField6 = new JLabel();
	textField6.setBounds(200, 260, 250, 20);
        textField6.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
    //    textField6.setCaretColor(Color.black);
	panel1.add(textField6);

  
//            
//           SpinnerModel value2 =   new SpinnerNumberModel(0,0,1000,1); //initial value  //minimum value//maximum value //step    
//          spinner2 = new JSpinner(value2);   
//            spinner2.setBounds(200, 200, 250, 20);    
//            panel1.add(spinner2);  

	textField7 = new JLabel();
	textField7.setBounds(200, 290, 250, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
//        textField7.setCaretColor(Color.black);
	panel1.add(textField7);
        
        textField8 = new JLabel();
	textField8.setBounds(200, 320, 250, 20);
        textField8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
       // textField8.setCaretColor(Color.black);
	panel1.add(textField8);
        
	/*textFieldisbn = new JLabel();
	textFieldisbn.setBounds(200,320,250,20);
        textFieldisbn.setFont(new Font("Times New Roman",Font.BOLD,20));
        textFieldisbn.setForeground(Color.black);
        textFieldisbn.setBackground(Color.white);
       // textFieldisbn.setCaretColor(Color.black);
	panel1.add(textFieldisbn);*/
        
        textField9 = new JLabel();
	textField9.setBounds(200, 350, 250, 20);
        textField9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
      //  textField9.setCaretColor(Color.black);
	panel1.add(textField9);
        
          /* value1 =   new SpinnerNumberModel(1,1,1000,1); //initial value  //minimum value//maximum value //step    
          spinner1 = new JSpinner(value1);   
            spinner1.setBounds(200, 350, 250, 20);    
            panel1.add(spinner1); */
              
       
  
        
     
    
        String[] options1 = {"Original","Damaged"};
        comboBoxState = new JComboBox(options1);
        comboBoxState.setBounds(200,380,250,20);//(135,205,250,20);
        comboBoxState.addActionListener(this);
        panel1.add(comboBoxState);
        
        bookViewButton = new JButton("View");
        bookViewButton.addActionListener(this);
        bookViewButton.setFocusable(false);
        bookViewButton.setForeground(Color.white);
        bookViewButton.setBackground(Color.BLACK);
        bookViewButton.setBounds(470,80,70,20);
        panel1.add(bookViewButton);
        
        backButton=new JButton("Back");
        backButton.addActionListener(this);
        backButton.setFocusable(false);
        backButton.setForeground(Color.white);
        backButton.setBackground(Color.black);
        backButton.setBounds(280,450,90,30);
        panel1.add(backButton);

        
      
      
       label00 = new JLabel();
        label00.setText("Return Details");
        label00.setBounds(250,20,250,50);
        label00.setForeground(Color.black);// set font color of text
        label00.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel2.add(label00);
        
       label01 = new JLabel();
        label01.setText("Membership ID");
        label01.setBounds(100,65,170,50);
        label01.setForeground(Color.black);// set font color of text
        label01.setFont(new Font("Times New Roman", Font.BOLD, 15));
         panel2.add(label01);
         
        label02 = new JLabel();
        label02.setText("Name");
        label02.setBounds(100,95,170,50);
        label02.setForeground(Color.black);// set font color of text
        label02.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label02);
        
        label03 = new JLabel();
        label03.setText("Email");
        label03.setBounds(100,125,170,50);
        label03.setForeground(Color.black);// set font color of text
        label03.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label03);
        
        label04 = new JLabel();
        label04.setText("Address");
        label04.setBounds(100,155,170,50);
        label04.setForeground(Color.black);// set font color of text
        label04.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label04);
         
        label05 = new JLabel();
        label05.setText("Phone No.");
        label05.setBounds(100,215,170,50);
        label05.setForeground(Color.black);// set font color of text
        label05.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label05); 
         
         
//         
        label06 = new JLabel();
        label06.setText("Membership ");
        label06.setBounds(100,245,170,50);
        label06.setForeground(Color.black);// set font color of text
        label06.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label06);

        label07= new JLabel();
        label07.setText("Issue Date");
        label07.setBounds(100,275,170,50);
        label07.setForeground(Color.black);// set font color of text
        label07.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label07);
         
         
        label08= new JLabel();
        label08.setText("Return Date");
        label08.setBounds(100,305,170,50);
        label08.setForeground(Color.black);// set font color of text
        label08.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label08);
         
        label09= new JLabel();
        label09.setText("Today");
        label09.setBounds(100,335,170,50);
        label09.setForeground(Color.black);// set font color of text
        label09.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label09);
         
         
        label010= new JLabel();
        label010.setText("Late Return(days)");
        label010.setBounds(100,365,170,50);
        label010.setForeground(Color.black);// set font color of text
        label010.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label010);
         
        label011= new JLabel();
        label011.setText("Total Fine Amount");
        label011.setBounds(100,395,170,50);
        label011.setForeground(Color.black);// set font color of text
        label011.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label011);
         
    

	textField02 = new JTextField();
	textField02.setBounds(230, 80, 270, 20);
        textField02.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField02.setForeground(Color.black);
        textField02.setBackground(Color.white);
        textField02.setCaretColor(Color.black);
	panel2.add(textField02);
        
        memberViewButton = new JButton();
        memberViewButton.setBounds(500,80,70,20);
        memberViewButton.addActionListener(this);
        memberViewButton.setText("View");
        memberViewButton.setFocusable(false);
        memberViewButton.setBackground(Color.black);
        memberViewButton.setForeground(Color.white);
        memberViewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(memberViewButton);
        
        
	textField03 = new JLabel();
	textField03.setBounds(230, 110, 270, 20);
        textField03.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField03.setForeground(Color.black);
        textField03.setBackground(Color.white);
	panel2.add(textField03);

	textField04 = new JLabel();
	textField04.setBounds(230, 140, 270, 20);
        textField04.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField04.setForeground(Color.black);
        textField04.setBackground(Color.white);
        //textField04.setCaretColor(Color.black);
	panel2.add(textField04);
        
        textField05 = new JTextArea();
	textField05.setBounds(230,170, 270, 60); 
        textField05.setFont(new Font("Times New Roman",Font.BOLD,16));
        textField05.setForeground(Color.black);
        textField05.setBackground(Color.white);
        //textField05.setBackground(new Color(185,242,251));
        //textField05.setCaretColor(Color.black);
        textField05.setEditable(false);
        textField05.setLineWrap(true);
	panel2.add(textField05);
        
        textField06 = new JLabel();
	textField06.setBounds(230, 230, 270, 20);
        textField06.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField06.setForeground(Color.black);
        textField06.setBackground(Color.white);
        //textField06.setCaretColor(Color.black);
	panel2.add(textField06);
        
        textField07 = new JLabel();
	textField07.setBounds(230, 260, 270, 20);
        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField07.setForeground(Color.black);
        textField07.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField07);
      
        textField08 = new JLabel();
	textField08.setBounds(230, 290, 270, 20);
        textField08.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField08.setForeground(Color.black);
        textField08.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField08);
        
        textField09 = new JLabel();
	textField09.setBounds(230, 320, 270, 20);
        textField09.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField09.setForeground(Color.black);
        textField09.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField09);
       
        textField010 = new JLabel();
	textField010.setBounds(230, 350, 270, 20);
        textField010.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField010.setForeground(Color.black);
        textField010.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField010);
        
        textField011 = new JLabel();
	textField011.setBounds(230, 380, 270, 20);
        textField011.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField011.setForeground(Color.black);
        textField011.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField011);
        
        textField012 = new JTextField();
	textField012.setBounds(230, 410, 270, 20);
        textField012.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField012.setForeground(Color.black);
        textField012.setBackground(Color.white);
        textField012.setCaretColor(Color.black);
	panel2.add(textField012);
      
        textField012.setText("0");

        
        returnButton=new JButton("Return Book");
        returnButton.addActionListener(this);
        returnButton.setFocusable(false);
        returnButton.setForeground(Color.white);
        returnButton.setBackground(Color.BLACK);
        returnButton.setBounds(280,450,150,30);
        panel2.add(returnButton);
    
         Date date = new Date();  
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
         String strDate= formatter.format(date);  
        textField010.setText(strDate);
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Return Books");
        this.setSize(1200,550);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(panel1);
        this.add(panel2);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    try{
        Conn c = new Conn();
        
    
        
        if(e.getSource()==memberViewButton)
        {
                 String queryCus = "SELECT * FROM ISSUE2 WHERE binary memberid = ?";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                 ps.setString(1,textField02.getText());
                 ResultSet rs = ps.executeQuery();
                  comboBox.removeAllItems();
                  comboBox.addItem("---Select---");
                 while(rs.next())
                 {
                     comboBox.addItem(rs.getString("ISBN"));
                    /* textField2.setText(rs.getString("Title"));
                     textField3.setText(rs.getString("Author"));
                     textField4.setText(rs.getString("Publisher"));
                     textField5.setText(rs.getString("Edition"));
                     textField6.setText(rs.getString("Volume"));
                     textField7.setText(rs.getString("Genre"));
                     textField8.setText(rs.getString("Pages"));
                     //textFieldisbn.setText(rs.getString("ISBN"));
                     textField9.setText(rs.getString("Price"));*/
                     textField02.setText(rs.getString("memberid"));
                     textField03.setText(rs.getString("memname"));
                     textField04.setText(rs.getString("mail"));
                     textField05.setText(rs.getString("address"));
                     textField06.setText(rs.getString("phoneno"));
                     textField07.setText(rs.getString("membership"));
                    
                 } 
                     
                
                            if(textField03.getText().equals("") && textField04.getText().equals("")&&textField05.getText().equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "Member has not issued any book", "", JOptionPane.INFORMATION_MESSAGE);
                            }      
                 
        }
         else if(e.getSource()==bookViewButton)
         {
              
                                if(comboBox.getSelectedItem().equals("---Select---"))
                                {
                                     JOptionPane.showMessageDialog(null, "Select ISBN number", "", JOptionPane.INFORMATION_MESSAGE); 
                                }

                                 
                                  String query = "SELECT * FROM ISSUE2 WHERE ISBN =? and memberid=?";
           
                                    PreparedStatement ps = c.con.prepareStatement(query);
          
           
                                     ps.setString(1,(String)comboBox.getSelectedItem());
                                     ps.setString(2,textField02.getText());
          
           
                                        ResultSet rs = ps.executeQuery();
                                 
                                if(rs.next())
                                {
                                   textField2.setText(rs.getString("Title"));
                                   textFieldID.setText(rs.getString("id"));
                                    textField3.setText(rs.getString("Author"));
                                    textField4.setText(rs.getString("Publisher"));
                                    textField5.setText(rs.getString("Edition"));
                                    textField6.setText(rs.getString("Volume"));
                                    textField7.setText(rs.getString("Genre"));
                                    textField8.setText(rs.getString("Pages"));
                                    textField9.setText(rs.getString("Price"));
                                     textField08.setText(rs.getString("issueDate"));
                                    textField09.setText(rs.getString("returnDate"));
                                   
                                }
                                else
                                {
                                    textField2.setText("");
                                    textFieldID.setText("");
                                    textField3.setText("");
                                    textField4.setText("");
                                    textField5.setText("");
                                    textField6.setText("");
                                    textField7.setText("");
                                    textField8.setText("");
                                    textField9.setText("");
                                    textField08.setText("");
                                    textField09.setText("");
                                   
                                    
                                }
                                
                                
                                  SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String dateBeforeString = textField09.getText();
                        String dateAfterString = textField010.getText();

	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween = 
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
	      int days = (int)daysBetween;
              if(days<=0)
              {
                  days =0;
                  String strDay = Integer.toString(days);
                  textField011.setText(strDay);
                  JOptionPane.showMessageDialog(null, "Book returned within due date!", "", JOptionPane.INFORMATION_MESSAGE);
              }
              else
              {
               String strDay = Integer.toString(days);
                  textField011.setText(strDay);
                  JOptionPane.showMessageDialog(null, "Late return!!!", "", JOptionPane.INFORMATION_MESSAGE);   
              }
                                   
              
         
         }
               else if(e.getSource()==returnButton)
            {
                String item = (String)comboBox.getSelectedItem();
                String state = (String)comboBoxState.getSelectedItem();
                
//                if(textField1.getText().equals(""))
//               {
//                   JOptionPane.showMessageDialog(null, "Provide Membership ID", "", JOptionPane.WARNING_MESSAGE);
//               }
                if(item.equals("----Select---"))
               {
                   JOptionPane.showMessageDialog(null, "No Books available to return!", "", JOptionPane.WARNING_MESSAGE);
               }
                else if(textField8.getText().equals("")||textField9.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Select ISBN number", "", JOptionPane.WARNING_MESSAGE);
               }  
                 if(textField012.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Fine field cannot be blank!", "", JOptionPane.WARNING_MESSAGE);
               }
                else {

//ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,state,memberid,memname,mail,address,phoneno,membership,issueDate,returnDate,today,late,fine
                    
                        String query = "INSERT INTO RETURNBOOK2 (ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,state,memberid,memname,mail,address,phoneno,membership,issueDate,returnDate,today,late,fine,id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                                PreparedStatement ps = c.con.prepareStatement(query);
                               
                                
                                
                                ps.setString(1,(String)comboBox.getSelectedItem());
                                ps.setString(2,textField2.getText());
                                ps.setString(3,textField3.getText());
                                ps.setString(4,textField4.getText());
                                ps.setString(5,textField5.getText());
                                ps.setString(6,textField6.getText());
                                ps.setString(7,textField7.getText());
                                ps.setString(8,textField8.getText());
                                ps.setString(9,textField9.getText());
                                ps.setString(10,(String)comboBoxState.getSelectedItem());
                                ps.setString(11,textField02.getText());
                                ps.setString(12,textField03.getText());
                                ps.setString(13,textField04.getText());
                                ps.setString(14,textField05.getText());
                                ps.setString(15,textField06.getText());
                                ps.setString(16,textField07.getText());
                                ps.setString(17,textField08.getText());
                                ps.setString(18,textField09.getText());
                                ps.setString(19,textField010.getText());
                                ps.setString(20,textField011.getText());
                                 ps.setString(21,textField012.getText());
                                 ps.setString(22,textFieldID.getText());
                                
                                
                                
                                
                                 int count = ps.executeUpdate();
                                 
                        
                                 
                                 
                                 
                     String query4 = "SELECT IssueNo FROM MEMBERSHIP WHERE binary memberid=?";
               
                                PreparedStatement ps4 = c.con.prepareStatement(query4);
                                ps4.setString(1,textField02.getText());
                                ResultSet resultSet1 = ps4.executeQuery();
                                
                               if(resultSet1.next()) 
                                {  
                                    String s = resultSet1.getString("IssueNo");
                
                
                                    int stock = Integer.parseInt(s);
                                     //System.out.println(stock);   
                                   stock--;
               
                                     String updatedStock = Integer.toString(stock);
                                      //System.out.println(updatedStock); 
                                      
                                      String query5 = "UPDATE MEMBERSHIP SET IssueNo=? WHERE binary memberid=?";
                                  PreparedStatement ps5 = c.con.prepareStatement(query5);
                                      ps5.setString(1,updatedStock);
                                       ps5.setString(2,textField02.getText());
                                       ps5.executeUpdate();
                                }
                     
                                 String query2 = "SELECT stocks FROM Books WHERE ISBN=?";
               
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,(String)comboBox.getSelectedItem());
                                ResultSet resultSet = ps2.executeQuery();
                                
                               if(resultSet.next()) 
                                {  
                                    String s = resultSet.getString("stocks");
                
                
                                    int stock = Integer.parseInt(s);
                                     //System.out.println(stock);   
                                   stock++;
               
                                     String updatedStock = Integer.toString(stock);
                                      //System.out.println(updatedStock); 
                                      
                                      String query3 = "UPDATE Books SET stocks=? WHERE ISBN=?";
                                  PreparedStatement ps3 = c.con.prepareStatement(query3);
                                      ps3.setString(1,updatedStock);
                                       ps3.setString(2,(String)comboBox.getSelectedItem());
                                       ps3.executeUpdate();
                                }
                 JOptionPane.showMessageDialog(null, "Book Returned Successfully!", "", JOptionPane.INFORMATION_MESSAGE);
                 
                 
                               String query11 = "DELETE FROM ISSUE2 WHERE binary memberid=? AND ISBN=?";
                        PreparedStatement ps11 = c.con.prepareStatement(query11);  
                        ps11.setString(1,textField02.getText());
                          ps11.setString(2,(String)comboBox.getSelectedItem());
          
           
                         
  
                        ps11.executeUpdate(); 
                       // System.out.println(count1+" records deleted");
                                    
                             
                                
                                

                                //textField1.setText("");
                                textField2.setText("");
                                textField3.setText("");
                                textField4.setText("");
                                textField5.setText("");
                                comboBox.removeAllItems();
                                textField6.setText("");
                                textField7.setText("");
                                textField8.setText("");
                                textField9.setText("");
                               // textField11.setText("");
                                comboBoxState.setSelectedIndex(0);
                               //textField13.setText("");
                               //textField01.setText("");
                                textField02.setText("");
                                textField03.setText("");
                                textField04.setText("");
                                textField05.setText("");
                                textField06.setText("");
                                textField07.setText("");
                                textField08.setText("");
                                textField09.setText("");
                                textField010.setText("");
                                textField011.setText("");
                                textField012.setText("");
                                textFieldID.setText("");

                }
                
            }
            else if(e.getSource()==backButton)
            {
                    this.setVisible(false);
                   // new MemberFirstScreen().setVisible(true);
            }
    }

         
                      
    
      
          
       
    
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new Return2();
    }

   
   
}