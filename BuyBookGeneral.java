
package bookinventorylibrarymanagementsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuyBookGeneral extends JFrame implements ActionListener{
    JLabel tellAtale,textField01,label00,label01,label02,label03,label04,label05,label06,label07,label0,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10;
    JTextField textField02,textField03,textField05,textField06,textField07,textField1;//,textFieldBOOKID;
    JTextArea textField04,textArea;
    JPanel panel1,panel2,panel3;
    JButton button1,button2,button3,buttond,buttonp,buttonBill,buttonBillTotal,buttonPrint;
    JSpinner spinner1;
    SpinnerModel value1 ;
    JDateChooser dateChooser;
    ArrayList<Double> amount = new ArrayList<Double>();
    public BuyBookGeneral()
    {
        panel1 = new JPanel();
        panel1.setBounds(0,0, 450, 600);
        //panel1.setBounds(601, 0, 601, 600);
        panel1.setLayout(null);
        panel1.setBackground( Color.pink);
        
        
        
        
        panel2 = new JPanel();
        //panel2.setBounds(0,0, 600, 600);
        panel2.setBounds(451, 0, 453, 600);
        panel2.setLayout(null);
        //panel2.setBackground( new Color(177, 236, 252));//255, 254, 229
            panel2.setBackground( new Color(185,242,251));//185,242,251 //185,238,252//255, 253, 204
            
            
       /* panel3 = new JPanel();
        panel3.setBounds(904,0, 450, 600);
        //panel1.setBounds(601, 0, 601, 600);
        panel3.setLayout(null);
        panel3.setBackground( Color.white);*/
        
        label0 = new JLabel("Book Details");
	label0.setFont(new Font("Times New Roman",Font.BOLD,25));
        label0.setForeground(Color.black);
	label0.setBounds(160,20, 250, 50);
	panel1.add(label0);
        
	label1 = new JLabel("ISBN No.");
	label1.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label1.setBounds(30,75, 90, 30);
	panel1.add(label1);
        
/*        bookId = new JLabel("Book Id.");
	bookId.setFont(new Font("Times New Roman",Font.BOLD,15));
        bookId.setForeground(Color.black);
	bookId.setBounds(30,105, 90, 30);
	panel1.add(bookId);*/

	label2 = new JLabel("Title");
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        label1.setForeground(Color.black);
	label2.setBounds(30, 135, 90, 30);
	panel1.add(label2);

	label3 = new JLabel("Author");
	label3.setFont(new Font("Times New Roman",Font.BOLD,15));
        label3.setForeground(Color.black);
	label3.setBounds(30, 165, 90, 30);
	panel1.add(label3);

	label4 = new JLabel("Publisher");
	label4.setFont(new Font("Times New Roman",Font.BOLD,15));
        label4.setForeground(Color.black);
	label4.setBounds(30, 195, 90, 30);
	panel1.add(label4);

	label5 = new JLabel("Edition");
	label5.setFont(new Font("Times New Roman",Font.BOLD,15));
        label5.setForeground(Color.black);
	label5.setBounds(30, 225, 90, 30);
	panel1.add(label5);

	label6 = new JLabel("Volume");
	label6.setFont(new Font("Times New Roman",Font.BOLD,15));
        label6.setForeground(Color.black);
	label6.setBounds(30, 255, 90, 30);
	panel1.add(label6);

	label7 = new JLabel("Genre");
	label7.setFont(new Font("Times New Roman",Font.BOLD,15));
        label7.setForeground(Color.black);
	label7.setBounds(30, 285, 90, 30);
	panel1.add(label7);
        
        
        label8 = new JLabel("Pages");
	label8.setFont(new Font("Times New Roman",Font.BOLD,15));
        label8.setForeground(Color.black);
	label8.setBounds(30, 315, 90, 30);
	panel1.add(label8);
        
       
        
        label9 = new JLabel("Price");
	label9.setFont(new Font("Times New Roman",Font.BOLD,15));
        label9.setForeground(Color.black);
	label9.setBounds(30, 345, 90, 30);
	panel1.add(label9);
        
        label10 = new JLabel("Quantity");
	label10.setFont(new Font("Times New Roman",Font.BOLD,15));
        label10.setForeground(Color.black);
	label10.setBounds(30, 375, 90, 30);
	panel1.add(label10);
        
         label11 = new JLabel("Total Price");
	label11.setFont(new Font("Times New Roman",Font.BOLD,15));
        label11.setForeground(Color.black);
	label11.setBounds(30, 455, 90, 30);
	panel1.add(label11);

	textField1 = new JTextField();
	textField1.setBounds(115,80,250,20);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        
	panel1.add(textField1);
	
/*           textFieldBOOKID = new JTextField();
	textFieldBOOKID.setBounds(115, 110, 250, 20);
        textFieldBOOKID.setFont(new Font("Times New Roman",Font.BOLD,20));
        textFieldBOOKID.setForeground(Color.black);
        textFieldBOOKID.setBackground(Color.white);
//        textField2.setCaretColor(Color.black);
	panel1.add(textFieldBOOKID);
*/
	textField2 = new JLabel();
	textField2.setBounds(115, 140, 360, 20);
        textField2.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
//        textField2.setCaretColor(Color.black);
	panel1.add(textField2);
        
     

	textField3 = new JLabel();
	textField3.setBounds(115, 170, 250, 20);
        textField3.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
   //     textField3.setCaretColor(Color.black);
	panel1.add(textField3);

	textField4 = new JLabel();
	textField4.setBounds(115, 200, 250, 20);
        textField4.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
   //     textField4.setCaretColor(Color.black);
	panel1.add(textField4);

        textField5 = new JLabel();
	textField5.setBounds(115, 230, 250, 20);
        textField5.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
    //    textField5.setCaretColor(Color.black);
	panel1.add(textField5);

	textField6 = new JLabel();
	textField6.setBounds(115, 260, 250, 20);
        textField6.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
    //    textField6.setCaretColor(Color.black);
	panel1.add(textField6);
 

	textField7 = new JLabel();
	textField7.setBounds(115, 290, 250, 20);
        textField7.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
//        textField7.setCaretColor(Color.black);
	panel1.add(textField7);
        
        textField8 = new JLabel();
	textField8.setBounds(115, 320, 250, 20);
        textField8.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
       // textField8.setCaretColor(Color.black);
	panel1.add(textField8);
        
      
        
        textField9 = new JLabel();
	textField9.setBounds(115, 350, 250, 20);
        textField9.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
      //  textField9.setCaretColor(Color.black);
	panel1.add(textField9);
        
       
        
           value1 =   new SpinnerNumberModel(1,1,1111,1); //initial value  //minimum value//maximum value //step    
          spinner1 = new JSpinner(value1);   
            spinner1.setBounds(115, 380, 250, 20);    
            panel1.add(spinner1); 
        
        textField10 = new JLabel();
	textField10.setBounds(115, 460, 250, 20);
        textField10.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField10.setForeground(Color.black);
        textField10.setBackground(Color.white);
       // textField10.setCaretColor(Color.black);
	panel1.add(textField10);
    
       
        
        button1 = new JButton("View");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(200,110,70,20);
        
        
        button2=new JButton("Total");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(180,410,90,30);
        
      
        
        
//        button4=new JButton("Delete");
//        button4.addActionListener(this);
//        button4.setFocusable(false);
//        button4.setForeground(Color.white);
//        button4.setBackground(Color.red);
//        button4.setBounds(390,300,90,30);
        
        
        
       
      
        panel1.add(button1);
        panel1.add(button2);
      
        
      
      
       label00 = new JLabel();
        label00.setText("Customer Details");
        label00.setBounds(160,20,250,50);
        label00.setForeground(Color.black);// set font color of text
        label00.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel2.add(label00);
        
//       label01 = new JLabel();
//        label01.setText("Customer ISBN");
//        label01.setBounds(30,65,170,50);
//        label01.setForeground(Color.black);// set font color of text
//        label01.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        panel2.add(label01);
        
        label02 = new JLabel();
        label02.setText("Phone No.");
        label02.setBounds(30,95,170,50);
        label02.setForeground(Color.black);// set font color of text
        label02.setFont(new Font("Times New Roman", Font.BOLD, 15));
         panel2.add(label02);
         
        label03 = new JLabel();
        label03.setText("Name");
        label03.setBounds(30,125,170,50);
        label03.setForeground(Color.black);// set font color of text
        label03.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label03);
        
        label04 = new JLabel();
        label04.setText("Address");
        label04.setBounds(30,155,170,50);
        label04.setForeground(Color.black);// set font color of text
        label04.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label04);
        
        label05 = new JLabel();
        label05.setText("Email");
        label05.setBounds(30,230,170,50);
        label05.setForeground(Color.black);// set font color of text
        label05.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        panel2.add(label05);
         
        label06 = new JLabel();
        label06.setText("Date of Purchase");
        label06.setBounds(30,260,170,50);
        label06.setForeground(Color.black);// set font color of text
        label06.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
         panel2.add(label06); 
         
         
//         
//         label07 = new JLabel();
//        label07.setText("Grand Total");
//        label07.setBounds(30,325,170,50);
//        label07.setForeground(Color.black);// set font color of text
//        label07.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
//         panel2.add(label07);


        
//        textField01 = new JLabel();
//	textField01.setBounds(140,80,270,20);
//        textField01.setFont(new Font("Times New Roman",Font.BOLD,20));
////        textField01.setForeground(Color.black);
////        textField01.setBackground(Color.white);
////        textField01.setCaretColor(Color.black);
//	panel2.add(textField01);
	

	textField02 = new JTextField();
	textField02.setBounds(140, 110, 240, 20);
        textField02.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField02.setForeground(Color.black);
        textField02.setBackground(Color.white);
        textField02.setCaretColor(Color.black);
	panel2.add(textField02);
        
        buttonp = new JButton();
        buttonp.setBounds(380,110,70,20);
        buttonp.addActionListener(this);
        buttonp.setText("View");
        buttonp.setFocusable(false);
        buttonp.setBackground(Color.black);
        buttonp.setForeground(Color.white);
        buttonp.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(buttonp);
        
        
	textField03 = new JTextField();
	textField03.setBounds(140, 140, 270, 20);
        textField03.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField03.setForeground(Color.black);
        textField03.setBackground(Color.white);
        textField03.setCaretColor(Color.black);
	panel2.add(textField03);

	textField04 = new JTextArea();
	textField04.setBounds(140,170, 270, 60); 
        textField04.setFont(new Font("Times New Roman",Font.BOLD,16));
        textField04.setForeground(Color.black);
        textField04.setBackground(Color.white);
        textField04.setCaretColor(Color.black);
        textField04.setLineWrap(true);
        panel2.add(textField04);
        
        textField05 = new JTextField();
	textField05.setBounds(140, 240, 270, 20);
        textField05.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField05.setForeground(Color.black);
        textField05.setBackground(Color.white);
        textField05.setCaretColor(Color.black);
	panel2.add(textField05);
        
//        textField06 = new JTextField();
//	textField06.setBounds(140, 140, 270, 20);
//        textField06.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField06.setForeground(Color.black);
//        textField06.setBackground(Color.white);
//        textField06.setCaretColor(Color.black);
//	panel2.add(textField06);
        //Date today = Calendar. getInstance(). getTime();
        dateChooser = new JDateChooser();
         dateChooser.setBounds(145, 275, 270, 20);
         panel2.add(dateChooser);
        // dateChooser.getMinSelectableDate();
        
//        textField07 = new JTextField();
//	textField07.setBounds(140, 260, 270, 20);
//        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField07.setForeground(Color.black);
//        textField07.setBackground(Color.white);
//        textField07.setCaretColor(Color.black);
//	panel2.add(textField07);
        
                
//        buttond = new JButton();
//        buttond.setBounds(280, 280, 150, 30);
//        buttond.addActionListener(this);
//        buttond.setText("Apply Discount");
//        buttond.setFocusable(false);
//        buttond.setBackground(Color.black);
//        buttond.setForeground(Color.white);
//        buttond.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        panel2.add(buttond);
        
//         textField07 = new JTextField();
//	textField07.setBounds(140, 340, 270, 20);
//        textField07.setFont(new Font("Times New Roman",Font.BOLD,20));
//        textField07.setForeground(Color.black);
//        textField07.setBackground(Color.white);
//        textField07.setCaretColor(Color.black);
//	panel2.add(textField07);
        
        button3=new JButton("Add");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(150,330,150,30);
        panel2.add(button3);
       
        
       
        
         
        
        buttonBill = new JButton();
        buttonBill.setBounds(130,400,200,35);
        buttonBill.addActionListener(this);
        buttonBill.setText("Generate Bill");
        buttonBill.setFocusable(false);
        buttonBill.setBackground(Color.black);
        buttonBill.setForeground(Color.white);
        buttonBill.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel2.add(buttonBill);
        
         buttonBillTotal = new JButton();
        buttonBillTotal.setBounds(1050,460,200,35);
        buttonBillTotal.addActionListener(this);
        buttonBillTotal.setText("Calculate Total");
        buttonBillTotal.setFocusable(false);
        buttonBillTotal.setBackground(Color.black);
        buttonBillTotal.setForeground(Color.white);
        buttonBillTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
       buttonPrint = new JButton();
        buttonPrint.setBounds(1050,500,200,35);
        buttonPrint.addActionListener(this);
        buttonPrint.setText("Print Bill");
        buttonPrint.setFocusable(false);
        buttonPrint.setBackground(Color.black);
        buttonPrint.setForeground(Color.white);
        buttonPrint.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        textArea=new JTextArea();  
        textArea.setBounds(904,10, 450, 400); 
        
        textArea.setEditable ( false );
        textArea.setBackground(Color.white);
        textArea.setForeground(Color.black);
        //textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman",Font.PLAIN,20));
        
         JScrollPane  sp= new JScrollPane(textArea);
        // sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        // sp.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
       // sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       // sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        // sp.setSize( 450, 600 );
         sp.setBounds(904,10, 441, 400);
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Sell Books(General Customer)");
        this.setSize(1360,600);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(panel1);
        this.add(panel2);
        this.add(buttonBillTotal);
        this.add(buttonPrint);
        //this.add(panel3);
        this.add(sp);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    try{
        Conn c = new Conn();
         Pattern p = Pattern.compile("[6-9][0-9]{9}"); //(0/91)?[7-9][0-9]{9}
        Matcher m = p.matcher(textField02.getText());
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(textField05.getText());
        
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
               
               
           }
        
                                    }
                               }
                                      else
           {
                JOptionPane.showMessageDialog(null, "ISBN not found!", "", JOptionPane.INFORMATION_MESSAGE);
                // textField1.setText("");
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
           }
       
       }
                                
        
           else if(e.getSource()==button2)
            {
                 String s1 = spinner1.getValue().toString();
            int num = Integer.parseInt(s1);
            int total = Integer.parseInt(textField9.getText())*num;
            String t = Integer.toString(total);
               textField10.setText(t);
         
            }
           
           
           
              else if(e.getSource()==buttonp)
            {

                 String queryCus = "SELECT CusName,CusAddress,CusEmail FROM BUYBOOKSGEN WHERE CusPhoneNo = ?";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                 ps.setString(1,textField02.getText());
                 ResultSet rs = ps.executeQuery();
                 if(rs.next())
                 {
                     textField03.setText(rs.getString("CusName"));
                     textField04.setText(rs.getString("CusAddress"));
                        textField05.setText(rs.getString("CusEmail"));
                        textArea.setText("");
                         textArea.setText("");
                    buttonBillTotal.setEnabled(true);
                    buttonBill.setEnabled(true);
                    buttonp.setEnabled(false);
             
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(null, "Phone No. not available!Add Customer?", "", JOptionPane.INFORMATION_MESSAGE);
                      textField03.setText("");
                      textField04.setText("");
                      textField05.setText("");
                       buttonBillTotal.setEnabled(true);
                    buttonBill.setEnabled(true);
                        buttonp.setEnabled(true);
                 }
             
            }
              else if(e.getSource()==buttonBill)
              {
                   if(m.matches()==false)
                                 {
                                            JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "", JOptionPane.INFORMATION_MESSAGE);
                                  }
                                 else if(textField02.getText().equals("") ||textField03.getText().equals("")||textField04.getText().equals("")||textField05.getText().equals(""))
                                 {
                                     JOptionPane.showMessageDialog(null, "Provide All Customer details!", "", JOptionPane.INFORMATION_MESSAGE);
                                 }
                                 else{
                    DateTimeFormatter newdate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime anow = LocalDateTime.now();
            String name = String.format(textField03.getText());
            String phone = String.format(textField02.getText());
            textArea.append("************************************************" +
                    "\n\tThankyou for shopping at Tale a Tale\t" +
                    "\n************************************************" +
                    "\n Date & Time :- " + newdate.format(anow) +
                    "\n Name:- " + name +
                    "\n Phone Number:- " + phone +
                    "\n************************************************" +
                    "\nName\tQuantity\tPrice");
            buttonBill.setEnabled(false);
              }
              }
              else if(e.getSource()==buttonBillTotal)
              {if(textArea.getText().equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Click on Generate Bill first", "", JOptionPane.WARNING_MESSAGE);
                                }
                               else{
                   Double totalamount=0.0;
        for (Object i : amount) {
            totalamount += Double.parseDouble(i.toString());
        }
        textArea.append("\n============================================" +
                "\nTotal Amount\t\t\t"+totalamount+
                "\n=============================================");
              }
              buttonBillTotal.setEnabled(false);
              }
               else if(e.getSource()==buttonPrint)
               {
                  if(buttonBillTotal.isEnabled()==false)
                   { textArea.print();
                   textArea.setText("");
                    buttonBillTotal.setEnabled(true);
                      textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
               // textField06.setText("");
               // textField07.setText("");
                dateChooser.setCalendar(null);
                buttonp.setEnabled(true);
                buttonBill.setEnabled(true);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Calculate Total Amount", "", JOptionPane.INFORMATION_MESSAGE);
                      
                       
                   }
               }
          
            else if(e.getSource()==button3)
            {
                                if(textField2.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct ISBN No.", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                             /*  else if( textFieldBOOKID.getText().equals(""))
                               {
                                   JOptionPane.showMessageDialog(null, "Provide Book ID.", "", JOptionPane.INFORMATION_MESSAGE);
                               }*/
                               else if(textField10.getText().equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Calculate Total", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                  else if(m.matches()==false)
                                 {
                                            JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "", JOptionPane.INFORMATION_MESSAGE);
                                  }
                                 else if(textField02.getText().equals("") || textField03.getText().equals("")||textField04.getText().equals("")||textField05.getText().equals(""))
                                 {
                                     JOptionPane.showMessageDialog(null, "Provide All Customer details!", "", JOptionPane.INFORMATION_MESSAGE);
                                 }
                     else  if(match.matches()==false)
                {
                    JOptionPane.showMessageDialog(null, "Invalid Email", "", JOptionPane.WARNING_MESSAGE);
                }
                                else if(dateChooser.getDate()==null)
                                {
                                        JOptionPane.showMessageDialog(null, "Provide Date", "", JOptionPane.WARNING_MESSAGE);
                                }
                                else if(textArea.getText().equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Click on Generate Bill first", "", JOptionPane.WARNING_MESSAGE);
                                }
                                else
                                {
                       
                      String queryu = "SELECT CusName,CusAddress,CusEmail FROM BUYBOOKSGEN WHERE CusPhoneNo = ?";
             PreparedStatement psUser = c.con.prepareStatement(queryu);
           
                                        psUser.setString(1,textField02.getText());
                                     ResultSet rsUser = psUser.executeQuery();
                                        if(rsUser.next())
                                     {
                                        
                                         
                                         if(!textField03.getText().equals(rsUser.getString("CusName")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Name does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                         else if(!textField04.getText().equals(rsUser.getString("CusAddress")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Address does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                        else   if(!textField05.getText().equals(rsUser.getString("CusEmail")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Email does not match with previously stored data", "", JOptionPane.INFORMATION_MESSAGE);
                                             
                                        }
                                     
                                        else{ 
                                            
                                            
                                            
                        String query2 = "SELECT stocks FROM Books WHERE ISBN=?";
               
                                String spin = spinner1.getValue().toString();
                                int quantity = Integer.parseInt(spin);
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,textField1.getText());
                                ResultSet resultSet = ps2.executeQuery();
                                
                               if(resultSet.next()) 
                                {  
                                    String s = resultSet.getString("stocks");
                
                
                                     int stock = Integer.parseInt(s);
                                     //System.out.println(stock);   
                                   int curstock = stock - quantity;
                                    if(curstock<0)
                                    {
                                          JOptionPane.showMessageDialog(null, "Only"+stock+" stock/s are available", "", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                          String updatedStock = Integer.toString(curstock);
                                      System.out.println(updatedStock); 
                                      String query3 = "UPDATE Books SET stocks=? WHERE ISBN=?";
                                  PreparedStatement ps3 = c.con.prepareStatement(query3);
                                      ps3.setString(1,updatedStock);
                                       ps3.setString(2,textField1.getText());
                                       ps3.executeUpdate();
                                
                               
                      String query = "INSERT INTO BUYBOOKSGEN(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,Quantity,TotalPrice,CusPhoneNo,CusName,CusAddress,CusEmail,CusDOP) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
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
                ps.setString(10,s1);
                ps.setString(11, textField10.getText());
                ps.setString(12, textField02.getText());
                ps.setString(13, textField03.getText());
                ps.setString(14, textField04.getText());
                ps.setString(15, textField05.getText());
                Date date = dateChooser.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                ps.setString(16,strDate);
               // ps.setString(17,textFieldBOOKID.getText()); 
                
                int count = ps.executeUpdate();
		//if (count > 0)
                  //  JOptionPane.showMessageDialog(null, "Generating Bill....");
		//else
                   // JOptionPane.showMessageDialog(null, "Error");
                
                
                
                
               
       
            //String productId = String.format(textFieldBOOKID.getText());
            String productname = textField2.getText();
            String productprice = String.format(textField10.getText());
            String q = spinner1.getValue().toString();
            int prodQuantity = Integer.parseInt(q);
            amount.add(Double.parseDouble(textField10.getText()));
            textArea.append("\n" + productname + "\t" + prodQuantity + "\t" + productprice);
       
                textField1.setText("");
                //textFieldBOOKID.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                spinner1.setValue(1);
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");/*
                textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                dateChooser.setCalendar(null);*/
                
                                    }
                                }
                
                                        }
                                     }
                
		
                 
                else
                {
                          String query = "INSERT INTO BUYBOOKSGEN(ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,Quantity,TotalPrice,CusPhoneNo,CusName,CusAddress,CusEmail,CusDOP) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  
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
                ps.setString(10,s1);
                ps.setString(11, textField10.getText());
                ps.setString(12, textField02.getText());
                ps.setString(13, textField03.getText());
                ps.setString(14, textField04.getText());
                ps.setString(15, textField05.getText());
                Date date = dateChooser.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                ps.setString(16,strDate);
                
                int count = ps.executeUpdate();
		/*if (count > 0)
                    JOptionPane.showMessageDialog(null, "Generating Bill....");
		else
                    JOptionPane.showMessageDialog(null, "Error");*/
                
                
                
                        String query2 = "SELECT stocks FROM Books WHERE ISBN=?";
               
                                String spin = spinner1.getValue().toString();
                                int quantity = Integer.parseInt(spin);
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,textField1.getText());
                                ResultSet resultSet = ps2.executeQuery();
                                
                               if(resultSet.next()) 
                                {  
                                    String s = resultSet.getString("stocks");
                
                
                                    int stock = Integer.parseInt(s);
                                     //System.out.println(stock);   
                                   stock = stock - quantity;
               
                                     String updatedStock = Integer.toString(stock);
                                      System.out.println(updatedStock); 
                                      
                                      String query3 = "UPDATE Books SET stocks=? WHERE ISBN=?";
                                  PreparedStatement ps3 = c.con.prepareStatement(query3);
                                      ps3.setString(1,updatedStock);
                                       ps3.setString(2,textField1.getText());
                                       ps3.executeUpdate();
                                }
                
                
                
                
        //String productId = String.format(textFieldBOOKID.getText());
            String productname = textField2.getText();
            String productprice = String.format(textField10.getText());
            String q = spinner1.getValue().toString();
            int prodQuantity = Integer.parseInt(q);
            amount.add(Double.parseDouble(textField10.getText()));
            textArea.append("\n" + productname + "\t\t" + prodQuantity + "\t" + productprice);
       
                textField1.setText("");
               // textFieldBOOKID.setText("");
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
                
               /* textField1.setText("");
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
                textField02.setText("");
                textField03.setText("");
                textField04.setText("");
                textField05.setText("");
                dateChooser.setCalendar(null);*/
            
                
                
                
                
                
                
                
                
                
                
                
                
                
                
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
        new BuyBookGeneral();
    }

   
   
}