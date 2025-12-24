
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

public class IssueBook2 extends JFrame implements ActionListener{
    JLabel textField01,label00,label01,label02,label03,label04,label05,label06,label07,
            label08,label09,label0,label1,label2,label3,label4,label5,label6,label7,label8,label9,
            label10,label11,textField2,textField3,textField4,textField5,textField6,textField7,textField8,
            textField9,textField10,textField03,textField04,textField06,textField07,textField08,textField09,textField010,labelID;
    JTextField textField02,textField1,textFieldID;
    JTextArea textField05;
    JPanel panel1,panel2;
    JButton button1,button2,button3,buttond,buttonp;
   
    JDateChooser dateChooser1,dateChooser2;
    
    public IssueBook2()
    {
        panel1 = new JPanel();
        panel1.setBounds(0,0, 600, 800);
        //panel1.setBounds(601, 0, 601, 600);
        panel1.setLayout(null);
        panel1.setBackground( Color.pink);
        
        
        panel2 = new JPanel();
        //panel2.setBounds(0,0, 600, 600);
        panel2.setBounds(601, 0, 901, 800);
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
        
        labelID = new JLabel("Book ID");
	labelID.setFont(new Font("Times New Roman",Font.BOLD,15));
        labelID.setForeground(Color.black);
	labelID.setBounds(100,105, 90, 30);
	panel1.add(labelID);

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
        textFieldID.setBackground(Color.white);
        textFieldID.setCaretColor(Color.black);
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

//         SpinnerModel value1 =   new SpinnerNumberModel(0,0,1000,1); //initial value  //minimum value//maximum value //step    
//          spinner1 = new JSpinner(value1);   
//            spinner1.setBounds(200, 230, 250, 20);    
//            panel1.add(spinner1);  
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
        
       
        
          
        
       
    
       
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(470,80,70,20);
        
  
        
        
//        button4=new JButton("Delete");
//        button4.addActionListener(this);
//        button4.setFocusable(false);
//        button4.setForeground(Color.white);
//        button4.setBackground(Color.red);
//        button4.setBounds(390,1000,90,30);
        
        
        
       
      
        panel1.add(button1);
//        panel1.add(button2);
      
        
      
      
       label00 = new JLabel();
        label00.setText("Member Details");
        label00.setBounds(250,20,250,50);
        label00.setForeground(Color.black);// set font color of text
        label00.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel2.add(label00);
        

        
        label01 = new JLabel();
        label01.setText("Membership ID");
        label01.setBounds(100,95,170,50);
        label01.setForeground(Color.black);// set font color of text
        label01.setFont(new Font("Times New Roman", Font.BOLD, 15));
         panel2.add(label01);
         
        label02 = new JLabel();
        label02.setText("Name");
        label02.setBounds(100,125,170,50);
        label02.setForeground(Color.black);// set font color of text
        label02.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label02);
        
        label03 = new JLabel();
        label03.setText("Email");
        label03.setBounds(100,155,170,50);
        label03.setForeground(Color.black);// set font color of text
        label03.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label03);
        
        label04 = new JLabel();
        label04.setText("Address");
        label04.setBounds(100,185,170,50);
        label04.setForeground(Color.black);// set font color of text
        label04.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label04);
         
        label05 = new JLabel();
        label05.setText("Phone No.");
        label05.setBounds(100,255,170,50);
        label05.setForeground(Color.black);// set font color of text
        label05.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label05); 
         
         
//         
        label06 = new JLabel();
        label06.setText("Membership ");
        label06.setBounds(100,285,170,50);
        label06.setForeground(Color.black);// set font color of text
        label06.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label06);

        label07= new JLabel();
        label07.setText("Issue Date");
        label07.setBounds(100,315,170,50);
        label07.setForeground(Color.black);// set font color of text
        label07.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label07);
         
         
        label08= new JLabel();
        label08.setText("Return Date");
        label08.setBounds(100,345,170,50);
        label08.setForeground(Color.black);// set font color of text
        label08.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label08);
         
      /*  label09= new JLabel();
        label09.setText("Grand Total");
        label09.setBounds(100,370,170,50);
        label09.setForeground(Color.black);// set font color of text
        label09.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label09);*/
         
//        textField01 = new JLabel();
//	textField01.setBounds(230,80,270,20);
//        textField01.setFont(new Font("Times New Roman",Font.BOLD,20));
////        textField01.setForeground(Color.black);
////        textField01.setBackground(Color.white);
////        textField01.setCaretColor(Color.black);
//	panel2.add(textField01);
	

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
        
        
	textField03 = new JLabel();
	textField03.setBounds(230, 140, 270, 20);
        textField03.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField03.setForeground(Color.black);
        textField03.setBackground(Color.white);
        //textField03.setCaretColor(Color.black);
	panel2.add(textField03);

	textField04 = new JLabel();
	textField04.setBounds(230, 170, 270, 20);
        textField04.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField04.setForeground(Color.black);
        textField04.setBackground(Color.white);
        //textField04.setCaretColor(Color.black);
	panel2.add(textField04);
        
        textField05 = new JTextArea();
	textField05.setBounds(230,200, 270, 60); 
        textField05.setFont(new Font("Times New Roman",Font.BOLD,16));
        textField05.setForeground(Color.black);
        textField05.setBackground(Color.white);
        //textField05.setBackground(new Color(185,242,251));
        //textField05.setCaretColor(Color.black);
        textField05.setEditable(false);
        textField05.setLineWrap(true);
	panel2.add(textField05);
        
        textField06 = new JLabel();
	textField06.setBounds(230, 270, 270, 20);
        textField06.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField06.setForeground(Color.black);
        textField06.setBackground(Color.white);
        //textField06.setCaretColor(Color.black);
	panel2.add(textField06);
        
        textField07 = new JLabel();
	textField07.setBounds(230, 300, 270, 20);
        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField07.setForeground(Color.black);
        textField07.setBackground(Color.white);
        //textField07.setCaretColor(Color.black);
	panel2.add(textField07);
        
        //Date today = Calendar. getInstance(). getTime();
        dateChooser1 = new JDateChooser();
         dateChooser1.setBounds(230, 330, 270, 20);
         panel2.add(dateChooser1);
       
        dateChooser2 = new JDateChooser();
         dateChooser2.setBounds(230, 360, 270, 20);
         panel2.add(dateChooser2); 
       
         
       

      
        

        
        button3=new JButton("Issue Book");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(280,450,150,30);
        panel2.add(button3);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Issue Books");
        this.setSize(1200,600);
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
           
           String query = "SELECT * FROM Books WHERE ISBN=?";
           
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
               
               
           }
                                    }
                               }
           else
           {
               JOptionPane.showMessageDialog(null, "ISBN NO. Not Found!!!", "", JOptionPane.INFORMATION_MESSAGE);   
                
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
//                spinner1.setValue(1);
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
           }
    
       
       }
    
       
           
           
           
              else if(e.getSource()==buttonp)
            {

                 String queryCus = "SELECT * FROM MEMBERSHIP WHERE binary MEMBERID= ?";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                 ps.setString(1,textField02.getText());
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
               else
              {
                  textField03.setText(rs.getString("memname"));
                     textField04.setText(rs.getString("mail"));
                     textField05.setText(rs.getString("address"));
                     textField06.setText(rs.getString("phoneno"));
                     textField07.setText(rs.getString("membership"));
              }
             
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(null, "Member Not Found!!!", "", JOptionPane.INFORMATION_MESSAGE);
                      
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                textField06.setText("");
                textField07.setText("");
                dateChooser1.setCalendar(null);
                dateChooser2.setCalendar(null);
                 }
           
            }
           
            else if(e.getSource()==button3)
            {
                 String query7 = "SELECT stocks FROM BOOKS WHERE ISBN=?";
               
                                PreparedStatement ps7 = c.con.prepareStatement(query7);
                               ps7.setString(1,textField1.getText());
                                ResultSet resultSet3 = ps7.executeQuery();
                                
                                   if(resultSet3.next()) 
                               {
                                    String st = resultSet3.getString("stocks");
                                    int numst = Integer.parseInt(st);
                                    
                                    if(numst!=0)
                                    /*{
                                         JOptionPane.showMessageDialog(null, "Currently stock unavailable!!", "", JOptionPane.WARNING_MESSAGE);
                                         
                                        textField1.setText("");
                                        textFieldID.setText("");
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
      
      
      
                            else*/
                                    {
      
                                  String query6 = "SELECT IssueNo FROM MEMBERSHIP WHERE MEMBERID=?";
               
                                PreparedStatement ps6 = c.con.prepareStatement(query6);
                                ps6.setString(1,textField02.getText());
                                ResultSet resultSet2 = ps6.executeQuery();
                                
                               if(resultSet2.next()) 
                               {
                                    String n = resultSet2.getString("IssueNo");
                                    int num = Integer.parseInt(n);
                                    
                                      if(num>=6)
                                    {
                                         JOptionPane.showMessageDialog(null, "Member has already 6 Books issued!!!", "", JOptionPane.WARNING_MESSAGE);
                                         
                                       
                                        textFieldID.setText("");
                                        textField03.setText("");
                                        textField04.setText("");
                                        textField05.setText("");
                                       textField06.setText("");
                                        textField07.setText("");
                                        dateChooser1.setCalendar(null);
                                         dateChooser2.setCalendar(null);
                                    }
                                    else
                                    {
                                if(textField2.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct ISBN No.", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                if(textFieldID.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Book ID", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                 else if(textField02.getText().equals("") || textField03.getText().equals("")||textField04.getText().equals("")||textField05.getText().equals(""))
                                 {
                                     JOptionPane.showMessageDialog(null, "Provide All Member details!", "", JOptionPane.INFORMATION_MESSAGE);
                                 }
                           else if(dateChooser1.getDate()==null)
                                {
                                        JOptionPane.showMessageDialog(null, "Provide Issue Date", "", JOptionPane.WARNING_MESSAGE);
                                }
                               else if(dateChooser2.getDate()==null)
                                {
                                        JOptionPane.showMessageDialog(null, "Provide Return Date", "", JOptionPane.WARNING_MESSAGE);
                                }
                                else
                                {
     String queryissue = "SELECT ISBN FROM ISSUE2 WHERE ISBN=? and memberid=?";
                              PreparedStatement psissue = c.con.prepareStatement(queryissue);
           
                                psissue.setString(1,textField1.getText());
                                psissue.setString(2,textField02.getText());
                                
                                 ResultSet resultSetissue = psissue.executeQuery();
                                
                                   if(resultSetissue.next()) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Member has already issued this Book", "", JOptionPane.WARNING_MESSAGE);
                                   }
                                   else{
                      String query = "INSERT INTO ISSUE2(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,memberid,memname,mail,address,phoneno,membership,issueDate,returnDate,id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
		PreparedStatement ps = c.con.prepareStatement(query);
                
		ps.setString(1, textField1.getText());
		ps.setString(2, textField2.getText());
		ps.setString(3, textField3.getText());
		ps.setString(4, textField4.getText());
		ps.setString(5, textField5.getText());
		ps.setString(6, textField6.getText());
                ps.setString(7, textField7.getText());
                ps.setString(8, textField8.getText());
                ps.setString(9, textField9.getText());
                ps.setString(10, textField02.getText());
                ps.setString(11, textField03.getText());
                ps.setString(12, textField04.getText());
                ps.setString(13, textField05.getText());
                ps.setString(14, textField06.getText());
                ps.setString(15, textField07.getText());
                Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                ps.setString(16,strDate);
                Date date2 = dateChooser2.getDate();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("dd-MM-yyy");
                String strDate2 = dFormat2.format(date2);
                ps.setString(17,strDate2);
                ps.setString(18,textFieldID.getText());
                 ps.executeUpdate();
		
                 String queryIssue = "INSERT INTO ISSUEBOOK2(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,memberid,memname,mail,address,phoneno,membership,issueDate,returnDate,id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
		PreparedStatement psIssue = c.con.prepareStatement(queryIssue);
                
		psIssue.setString(1, textField1.getText());
		psIssue.setString(2, textField2.getText());
		psIssue.setString(3, textField3.getText());
		psIssue.setString(4, textField4.getText());
		psIssue.setString(5, textField5.getText());
		psIssue.setString(6, textField6.getText());
                psIssue.setString(7, textField7.getText());
                psIssue.setString(8, textField8.getText());
                psIssue.setString(9, textField9.getText());
                psIssue.setString(10, textField02.getText());
                psIssue.setString(11, textField03.getText());
                psIssue.setString(12, textField04.getText());
                psIssue.setString(13, textField05.getText());
                psIssue.setString(14, textField06.getText());
                psIssue.setString(15, textField07.getText());
                Date dateIssue = dateChooser1.getDate();
                SimpleDateFormat dFormatIssue = new SimpleDateFormat("dd-MM-yyy");
                String strDateIssue = dFormatIssue.format(dateIssue);
                psIssue.setString(16,strDateIssue);
                Date dateIssue2 = dateChooser2.getDate();
                SimpleDateFormat dFormatIssue2 = new SimpleDateFormat("dd-MM-yyy");
                String strDateIssue2 = dFormatIssue2.format(dateIssue2);
                psIssue.setString(17,strDateIssue2);
                psIssue.setString(18,textFieldID.getText());
                           psIssue.executeUpdate();  
                                 
                                 
                                
	    			JOptionPane.showMessageDialog(null, "Book Issued Successfully");
                                
                                  String query4 = "SELECT IssueNo FROM MEMBERSHIP WHERE memberid=?";
               
                                PreparedStatement ps4 = c.con.prepareStatement(query4);
                                ps4.setString(1,textField02.getText());
                                ResultSet resultSet1 = ps4.executeQuery();
                                
                               if(resultSet1.next()) 
                                {  
                                    String s = resultSet1.getString("IssueNo");
                
                
                                    int stock = Integer.parseInt(s);
                                     System.out.println(stock);   
                                   stock++;
               
                                     String updatedStock = Integer.toString(stock);
                                      System.out.println(updatedStock); 
                                      
                                      String query5 = "UPDATE MEMBERSHIP SET IssueNo=? WHERE memberid=?";
                                  PreparedStatement ps5 = c.con.prepareStatement(query5);
                                      ps5.setString(1,updatedStock);
                                       ps5.setString(2,textField02.getText());
                                       ps5.executeUpdate();
                                }
                    
            
                                
                                
                                 
                                 String query2 = "SELECT stocks FROM Books WHERE ISBN=?";
               
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,textField1.getText());
                                ResultSet resultSet = ps2.executeQuery();
                                
                               if(resultSet.next()) 
                                {  
                                    String s = resultSet.getString("stocks");
                
                
                                    int stock = Integer.parseInt(s);
                                     System.out.println(stock);   
                                   stock--;
               
                                     String updatedStock = Integer.toString(stock);
                                      System.out.println(updatedStock); 
                                      
                                      String query3 = "UPDATE Books SET stocks=? WHERE ISBN=?";
                                  PreparedStatement ps3 = c.con.prepareStatement(query3);
                                      ps3.setString(1,updatedStock);
                                       ps3.setString(2,textField1.getText());
                                       ps3.executeUpdate();
                                }
                               
                
                               
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
//                spinner1.setValue(1);
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
               // textField10.setText("");
                textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                textField06.setText("");
                textField07.setText("");
                dateChooser1.setCalendar(null);
                dateChooser2.setCalendar(null);
                textFieldID.setText("");
               // textField08.setText("");
                //textField09.setText("");
                                }
                                    }
                               }
                                    }
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
        new IssueBook2();
    }

   
   
}

