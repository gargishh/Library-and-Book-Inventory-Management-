
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

public class Reader extends JFrame implements ActionListener{
    JLabel label00,label01,label02,label03,label04,label05,label06,label07,label08,label09,label0,label1,label2,label3,label4,
            label5,label6,label7,label8,label9,label10,label11,textField08,textField2,textField3,textField4,textField5,
            textField6,textField7,textField8,textField9,labelid;
    JTextField textField01,textField02,textField03,textField05,textField06,textField07,textField1,textField10,textFieldID;
    JTextArea textField04;
    JPanel panel1,panel2;
    JButton button1,button2,button3,buttond,buttonm,buttonp;
    JSpinner spinner1;
    SpinnerModel value1 ;
    JDateChooser dateChooser;
    JComboBox comboBoxState;
    
    public Reader()
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
        
        label11 = new JLabel("Fine Amount");
	label11.setFont(new Font("Times New Roman",Font.BOLD,15));
        label11.setForeground(Color.black);
	label11.setBounds(100, 405, 90, 30);
	panel1.add(label11);

	textField1 = new JTextField();
	textField1.setBounds(200,80,250,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
	panel1.add(textField1);
        
        textFieldID = new JTextField();
	textFieldID.setBounds(200,110,250,20);
        textFieldID.setFont(new Font("Times New Roman",Font.BOLD,20));
        textFieldID.setForeground(Color.black);
        textField1.setCaretColor(Color.black);
        textFieldID.setBackground(Color.white);
        
	panel1.add(textFieldID);
	

	textField2 = new JLabel();
	textField2.setBounds(200, 140, 250, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
//        textField2.setCaretColor(Color.black);
	panel1.add(textField2);

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
  
        
        textField10 = new JTextField();
	textField10.setBounds(200, 410, 250, 20);
        textField10.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField10.setForeground(Color.black);
        textField10.setBackground(Color.white);
        textField10.setCaretColor(Color.black);
	panel1.add(textField10);
    
       
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(470,80,70,20);
        panel1.add(button1);
        
//        button2=new JButton("Total");
//        button2.addActionListener(this);
//        button2.setFocusable(false);
//        button2.setForeground(Color.white);
//        button2.setBackground(Color.black);
//        button2.setBounds(280,380,90,30);
//        
      
        
        
//        button4=new JButton("Delete");
//        button4.addActionListener(this);
//        button4.setFocusable(false);
//        button4.setForeground(Color.white);
//        button4.setBackground(Color.red);
//        button4.setBounds(390,1000,90,30);
        
        
        
       
      
        
//        panel1.add(button2);
      
        
      
      
       label00 = new JLabel();
        label00.setText("Reader Details");
        label00.setBounds(250,20,250,50);
        label00.setForeground(Color.black);// set font color of text
        label00.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel2.add(label00);
        
       label01 = new JLabel();
        label01.setText("Member ID");
        label01.setBounds(100,65,170,50);
        label01.setForeground(Color.black);// set font color of text
        label01.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(label01);
        
        label02 = new JLabel();
        label02.setText("Phone No.");
        label02.setBounds(100,95,170,50);
        label02.setForeground(Color.black);// set font color of text
        label02.setFont(new Font("Times New Roman", Font.BOLD, 15));
         panel2.add(label02);
         
        label03 = new JLabel();
        label03.setText("Name");
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
        label05.setText("Email");
        label05.setBounds(100,220,170,50);
        label05.setForeground(Color.black);// set font color of text
        label05.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label05);
         
        label06 = new JLabel();
        label06.setText("Reading Hours");
        label06.setBounds(100,250,170,50);
        label06.setForeground(Color.black);// set font color of text
        label06.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label06); 
         
        label07 = new JLabel();
        label07.setText("Date");
        label07.setBounds(100,280,170,50);
        label07.setForeground(Color.black);// set font color of text
        label07.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label07);
         
        label08 = new JLabel();
        label08.setText("Charge/Hour");
        label08.setBounds(100,315,170,50);
        label08.setForeground(Color.black);// set font color of text
        label08.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label08);
//         
//        label09 = new JLabel();
//        label09.setText("Total Charge");
//        label09.setBounds(100,325,170,50);
//        label09.setForeground(Color.black);// set font color of text
//        label09.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
//         panel2.add(label09);
         
        button3=new JButton("Total Charge");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(100,365,150,30);
        panel2.add(button3);


        
        textField01 = new JTextField();
	textField01.setBounds(230,80,270,20);
        textField01.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField01.setForeground(Color.black);
        textField01.setBackground(Color.white);
        textField01.setCaretColor(Color.black);
	panel2.add(textField01);
        
	buttonm = new JButton();
        buttonm.setBounds(500,80,70,20);
        buttonm.addActionListener(this);
        buttonm.setText("view");
        buttonm.setFocusable(false);
        buttonm.setBackground(Color.black);
        buttonm.setForeground(Color.white);
        buttonm.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(buttonm);

	textField02 = new JTextField();
	textField02.setBounds(230, 110, 270, 20);
        textField02.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField02.setForeground(Color.black);
        textField02.setBackground(Color.white);
        textField02.setCaretColor(Color.black);
	panel2.add(textField02);
        
        buttonp = new JButton();
        buttonp.setBounds(500,110,70,20);
        buttonp.addActionListener(this);
        buttonp.setText("view");
        buttonp.setFocusable(false);
        buttonp.setBackground(Color.black);
        buttonp.setForeground(Color.white);
        buttonp.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(buttonp);
        
        
	textField03 = new JTextField();
	textField03.setBounds(230, 140, 270, 20);
        textField03.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField03.setForeground(Color.black);
        textField03.setBackground(Color.white);
        textField03.setCaretColor(Color.black);
	panel2.add(textField03);

	
	textField04 = new JTextArea();
	textField04.setBounds(230,170, 270, 60); 
        textField04.setFont(new Font("Times New Roman",Font.BOLD,16));
        textField04.setForeground(Color.black);
        textField04.setBackground(Color.white);
        textField04.setCaretColor(Color.black);
        textField04.setLineWrap(true);
	panel2.add(textField04);
      
        textField05 = new JTextField();
	textField05.setBounds(230, 235, 270, 20);
        textField05.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField05.setForeground(Color.black);
        textField05.setBackground(Color.white);
        textField05.setCaretColor(Color.black);
	panel2.add(textField05);
        
//        textField06 = new JTextField();
//	textField06.setBounds(230, 230, 270, 20);
//        textField06.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField06.setForeground(Color.black);
//        textField06.setBackground(Color.white);
//        textField06.setCaretColor(Color.black);
//	panel2.add(textField06);
        //Date today = Calendar. getInstance(). getTime();
       SpinnerModel value1 =   new SpinnerNumberModel(1,0,1000,1); //initial value  //minimum value//maximum value //step    
          spinner1 = new JSpinner(value1);   
            spinner1.setBounds(230, 265, 270, 20);    
            panel2.add(spinner1);
            
            
        dateChooser = new JDateChooser();
         dateChooser.setBounds(230, 295, 270, 20);
         panel2.add(dateChooser);
        // dateChooser.getMinSelectableDate();
        
        textField07 = new JTextField();
	textField07.setBounds(230, 330, 270, 20);
        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField07.setForeground(Color.black);
        textField07.setBackground(Color.white);
        //textField07.setOpaque(true);
       textField07.setCaretColor(Color.black);
	panel2.add(textField07);
        
      
        
        textField08 = new JLabel();
	textField08.setBounds(260, 370, 240, 20);
        textField08.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField08.setForeground(Color.black);
        textField08.setBackground(Color.white);
        textField08.setOpaque(true);
       // textField08.setCaretColor(Color.black);
	panel2.add(textField08);
                
        buttond = new JButton();
        buttond.setBounds(240, 420, 150, 30);
        buttond.addActionListener(this);
        buttond.setText("Generate Bill");
        buttond.setFocusable(false);
        buttond.setBackground(Color.black);
        buttond.setForeground(Color.white);
        buttond.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(buttond);
        
//         textField07 = new JTextField();
//	textField07.setBounds(230, 340, 270, 20);
//        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField07.setForeground(Color.black);
//        textField07.setBackground(Color.white);
//        textField07.setCaretColor(Color.black);
//	panel2.add(textField07);
        
    
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Reader Details");
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
        
         String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(textField05.getText());
     
        
         Pattern p = Pattern.compile("[6-9][0-9]{9}"); //(0/91)?[7-9][0-9]{9}
        Matcher m = p.matcher(textField02.getText());
        if(e.getSource()==button1)
       {
          
            String query7 = "SELECT stocks FROM BOOKS WHERE ISBN=?";
               
                                PreparedStatement ps7 = c.con.prepareStatement(query7);
                               ps7.setString(1,textField1.getText());
                                ResultSet resultSet3 = ps7.executeQuery();
                                
                                   if(resultSet3.next()) 
                               {
                                    String st = resultSet3.getString("stocks");
                                    int numst = Integer.parseInt(st);
                                    
                                    if(numst==0)
                                    {
                                         JOptionPane.showMessageDialog(null, "Currently stock unavailable!!", "", JOptionPane.WARNING_MESSAGE);
                                         
                                       
                                        textField2.setText("");
                                        textFieldID.setText("");
                                        textField3.setText("");
                                        textField4.setText("");
                                        textField5.setText("");
                                        textField6.setText("");
                                        textField7.setText("");
                                        textField8.setText("");
                                        textField9.setText("");
                                       
                                       
                                    }
      
      
      
                            else
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
             textField5.setText(rs.getString("Edition"));
               textField6.setText(rs.getString("Volume"));
               textField7.setText(rs.getString("Genre"));
               textField8.setText(rs.getString("Pages"));
               textField9.setText(rs.getString("Price"));
              // textFieldID.setText(rs.getString("id"));
               
               
           }
         
    
                                    }
                               }
                                     else
           {
               
                                     JOptionPane.showMessageDialog(null, "ISBN no. not found!", "", JOptionPane.INFORMATION_MESSAGE);

                                        textField2.setText("");
                                        textFieldID.setText("");
                                        textField3.setText("");
                                        textField4.setText("");
                                        textField5.setText("");
                                        textField6.setText("");
                                        textField7.setText("");
                                        textField8.setText("");
                                        textField9.setText("");
           }
                                   
       }
    
        
        else if(e.getSource()==buttonm)
        {
             String queryCus = "SELECT * FROM MEMBERSHIP WHERE binary memberid = ?";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                 ps.setString(1,textField01.getText());
                 ResultSet rs = ps.executeQuery();
                 if(rs.next())
                 {
                     
                                    
                  Date today = new Date();  
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
         String strDate= formatter.format(today);  
        
                     
                      SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String dateBeforeString = rs.getString("expirydate");
                        String dateAfterString = strDate;

	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
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
              else{
                     textField02.setText(rs.getString("phoneno"));
                     textField03.setText(rs.getString("memname"));
                     textField04.setText(rs.getString("address"));
                      textField05.setText(rs.getString("mail"));
                        textField07.setText("0");
                 }
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(null, "Customer do not have any existing membership!Add Customer?", "", JOptionPane.INFORMATION_MESSAGE);
                         
                      textField01.setText("");
                      textField02.setText("");
                      textField03.setText("");
                     textField04.setText("");
                        textField05.setText("");
                 
                 }
        }
           
           
           
              else if(e.getSource()==buttonp)
            {
                
                 String queryCus = "SELECT Name,Address,Email FROM Readers WHERE PhoneNo = ?";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                 ps.setString(1,textField02.getText());
                 ResultSet rs = ps.executeQuery();
                 if(rs.next())
                 {
                     textField03.setText(rs.getString("Name"));
                     textField04.setText(rs.getString("Address"));
                        textField05.setText(rs.getString("Email"));
                       
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(null, "Phone No. not available!Add Customer?", "", JOptionPane.INFORMATION_MESSAGE);
                      
                
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                comboBoxState.setSelectedIndex(0);
                dateChooser.setCalendar(null);
                 textField07.setText("");
                  textField08.setText("");
                      
                    
                 }
             //}
            }
              else if(e.getSource()==button3)
              {
                  if(textField10.getText().equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Set Fine Amount", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                 
                 
                 
                   else if (textField07.getText().equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Set Charge/Hour", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                    else if(!textField01.getText().equals(""))
                  {
                      /*int fine = Integer.parseInt(textField10.getText());
                      int totalCharge = fine;
                      String sch = Integer.toString(totalCharge);
                      
                      textField08.setText(sch);*/
                      String s1 = spinner1.getValue().toString();
                  int fine = Integer.parseInt(textField10.getText());
                  int hour = Integer.parseInt(s1);
                  int charge = Integer.parseInt(textField07.getText());
                  int totalCharge = fine+(hour*charge);
                  String sch = Integer.toString(totalCharge);
                  textField08.setText(sch);
                  }
                   else
                  {
                     
                       String s1 = spinner1.getValue().toString();
                  int fine = Integer.parseInt(textField10.getText());
                  int hour = Integer.parseInt(s1);
                  int charge = Integer.parseInt(textField07.getText());
                  int totalCharge = fine+(hour*charge);
                  String sch = Integer.toString(totalCharge);
                  textField08.setText(sch);
                  }
              }
            else if(e.getSource()==buttond)
            {
                                if(textField2.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct ISBN No.", "", JOptionPane.INFORMATION_MESSAGE);
                                }
//                               else if(textField10.getText().equals(""))
//                                {
//                                    JOptionPane.showMessageDialog(null, "Calculate Total", "", JOptionPane.INFORMATION_MESSAGE);
//                                }
                                  else if(m.matches()==false)
                                 {
                                            JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "", JOptionPane.INFORMATION_MESSAGE);
                                  }
                                 else if(textField02.getText().equals("") || textField03.getText().equals("")||textField04.getText().equals("")||textField05.getText().equals(""))
                                 {
                                     JOptionPane.showMessageDialog(null, "Provide All Customer details!", "", JOptionPane.INFORMATION_MESSAGE);
                                 }
                                      else if(dateChooser.getDate()==null)
                                {
                                        JOptionPane.showMessageDialog(null, "Provide Date", "", JOptionPane.WARNING_MESSAGE);
                                }
                                      else if(textField07.getText().equals(""))
                                      {
                                          JOptionPane.showMessageDialog(null, "Set Charge/hour", "", JOptionPane.WARNING_MESSAGE);
                                      }
                                  else if(textField08.getText().equals(""))
                                      {
                                          JOptionPane.showMessageDialog(null, "Check Total Charge", "", JOptionPane.WARNING_MESSAGE);
                                      }
                                  else  if(match.matches()==false)
                {
                    JOptionPane.showMessageDialog(null, "Invalid Email", "", JOptionPane.WARNING_MESSAGE);
                }
                                     
                                         else{
                                      
                                      
                                      
                                      
                                      
                                      
                                        
                      String queryu = "SELECT Name,Address,Email FROM READERS WHERE PhoneNo = ?";
             PreparedStatement psUser = c.con.prepareStatement(queryu);
           
                                        psUser.setString(1,textField02.getText());
                                     ResultSet rsUser = psUser.executeQuery();
                                        if(rsUser.next())
                                     {
                                        
                                         
                                         if(!textField03.getText().equals(rsUser.getString("Name")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Name does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                         else if(!textField04.getText().equals(rsUser.getString("Address")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Address does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                        else   if(!textField05.getText().equals(rsUser.getString("Email")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Email does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                     
                                        else{
//                   
                      
                      String query = "INSERT INTO Readers(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,state,fine,memberid,PhoneNo,Name,Address,Email,readingHours,date,hourcharge,totalcharge,id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
		PreparedStatement ps = c.con.prepareStatement(query);
                String s1 = spinner1.getValue().toString();
               
		ps.setString(1, textField1.getText());
		ps.setString(2, textField2.getText());
		ps.setString(3, textField3.getText());
		ps.setString(4, textField4.getText());
		ps.setString(5, textField5.getText());
		ps.setString(6, textField6.getText());
                ps.setString(7, textField7.getText());
                ps.setString(8, textField8.getText());
                ps.setString(9, textField9.getText());
                ps.setString(10,(String)comboBoxState.getSelectedItem());
                ps.setString(11, textField10.getText());
                ps.setString(12,textField01.getText());
                ps.setString(13, textField02.getText());
                ps.setString(14, textField03.getText());
                ps.setString(15, textField04.getText());
                ps.setString(16, textField05.getText());
                ps.setString(17, s1);
                Date date = dateChooser.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                ps.setString(18,strDate);
                ps.setString(19,textField07.getText());
               ps.setString(20,textField08.getText());
               ps.setString(21,textFieldID.getText());
                int count = ps.executeUpdate();
		if (count > 0)
                    JOptionPane.showMessageDialog(null, "Generating Bill....");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                textField1.setText("");
                textFieldID.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                spinner1.setValue(1);
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField01.setText("");
                textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                comboBoxState.setSelectedIndex(0);
                dateChooser.setCalendar(null);
                 textField07.setText("");
                  textField08.setText("");
                
                
		
                                        }
                                     }
else
                                        {
                                             
                      String query = "INSERT INTO Readers(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,state,fine,memberid,PhoneNo,Name,Address,Email,readingHours,date,hourcharge,totalcharge,id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
		PreparedStatement ps = c.con.prepareStatement(query);
                String s1 = spinner1.getValue().toString();
               
		ps.setString(1, textField1.getText());
		ps.setString(2, textField2.getText());
		ps.setString(3, textField3.getText());
		ps.setString(4, textField4.getText());
		ps.setString(5, textField5.getText());
		ps.setString(6, textField6.getText());
                ps.setString(7, textField7.getText());
                ps.setString(8, textField8.getText());
                ps.setString(9, textField9.getText());
                ps.setString(10,(String)comboBoxState.getSelectedItem());
                ps.setString(11, textField10.getText());
                ps.setString(12,textField01.getText());
                ps.setString(13, textField02.getText());
                ps.setString(14, textField03.getText());
                ps.setString(15, textField04.getText());
                ps.setString(16, textField05.getText());
                ps.setString(17, s1);
                Date date = dateChooser.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                ps.setString(18,strDate);
                ps.setString(19,textField07.getText());
               ps.setString(20,textField08.getText());
               ps.setString(21,textFieldID.getText());
               
                int count = ps.executeUpdate();
		if (count > 0)
                    JOptionPane.showMessageDialog(null, "Generating Bill....");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                spinner1.setValue(1);
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField01.setText("");
                textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                comboBoxState.setSelectedIndex(0);
                dateChooser.setCalendar(null);
                 textField07.setText("");
                  textField08.setText("");
                  textFieldID.setText("");
                
                                        }
    }

         
 }
      
          
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new Reader();
    }

   
   
}