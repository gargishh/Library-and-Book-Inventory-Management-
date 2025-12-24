
package BookInventoryLibraryManagementSystem;




import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ViewMemberBooksIssued implements ActionListener {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1,textField2;
    JButton button1,button2;
  JScrollPane pane ;

   ViewMemberBooksIssued() {

       
        table = new JTable();
        //Object[] columns = {"ISBN","title","Author","Publisher","Edition","Volume","genre","Pages","Price","stocks"};
        defaultTableModel = new DefaultTableModel();
        //memberid,memname,mail,phoneno,ISBN,Title,Author,issueDate,returnDate
        defaultTableModel.addColumn("Member ID");
        defaultTableModel.addColumn("Member Name");
         defaultTableModel.addColumn("Email ID");
        defaultTableModel.addColumn("Phone No.");
        defaultTableModel.addColumn("ISBN");
        defaultTableModel.addColumn("Title");
        defaultTableModel.addColumn("Author");
        defaultTableModel.addColumn("Issue Date");
        defaultTableModel.addColumn("Return Date");
        
        
        frame1 = new JFrame();
       
        
        
        
       /* label1 = new JLabel();
        label1.setText("Enter Title");
        label1.setBounds(350,50,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));*/
        
        label2 = new JLabel();
        label2.setText("Enter Member Id");
        label2.setBounds(320,100,150,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        /*
        textField1 = new JTextField();
        textField1.setBounds(460,60,400,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);*/
        
        textField2 = new JTextField();
        textField2.setBounds(460,110,400,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
        
        
        button1 = new JButton();
        button1.setBounds(480,150,150,30);
        button1.addActionListener(this);
        button1.setText("View Books");
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button2 = new JButton();
        button2.setBounds(700,150,120,30);
        button2.addActionListener(this);
        button2.setText("Reset ");
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));

        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
       
        frame1.setSize(1000,500);
       
        frame1.getContentPane().setLayout(null);
        frame1.setTitle("Books Issued by Member");
        frame1.setVisible(true);
        frame1.getContentPane().setBackground(Color.pink);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame1.getWidth()) / 2;
        int y = (screenSize.height - frame1.getHeight()) / 2;
        frame1.setLocation(x, y);
          frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame1.add(label1);
        frame1.add(label2);
      //  frame1.add(textField1);
        frame1.add(textField2);
        frame1.add(button1);
        frame1.add(button2);
       
        
//        defaultTableModel.setColumnIdentifiers(columns);
        table.setModel(defaultTableModel);
        table.setAutoCreateRowSorter(true); // setAutoCreateRowSorter () is only used to sort the rows when you click on the table header.
//        table.setBackground(Color.white);
//        table.setForeground(Color.black);
        table.setRowHeight(30);
        table.setEnabled(false);
     
        
        
       pane = new JScrollPane(table);
//       pane.setForeground(Color.red);
//       pane.setBackground(Color.black);
       pane.setBounds(10,200,1350,500);
       frame1.getContentPane().add(pane);
        
        
        
      


    }

    public static void main(String[] args) {
        new ViewMemberBooksIssued();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

      //String Title = textField1.getText().toString();//getting text of username text field and storing it in a String variable
           
            String id = textField2.getText().toString();
           
             try {
                 
               if (ae.getSource() == button1) {
                   button1.setEnabled(false);
                   button1.setText("Click Reset ");
                   
        	
           	Conn c = new Conn();
                 if(!id.equals("") )
            {
                
                  String query1 = "select * from ISSUE2 WHERE memberid=? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,textField2.getText());
                    ResultSet resultSet1 = ps1.executeQuery();
           
       /*("Member ID");
        defaultTableModel.addColumn();
         defaultTableModel.addColumn();
        defaultTableModel.addColumn();
        defaultTableModel.addColumn();
        defaultTableModel.addColumn();
        defaultTableModel.addColumn();
        defaultTableModel.addColumn();
        defaultTableModel.addColumn();*/
        
        
        
   
            while (resultSet1.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                
                 
                String MemberId= resultSet1.getString("memberid");
                String MemberName= resultSet1.getString("memname");
                String EmailID= resultSet1.getString("mail");
                String PhoneNo = resultSet1.getString("phoneno");
                String ISBN = resultSet1.getString("ISBN");
                String Title = resultSet1.getString("Title");
                String Author = resultSet1.getString("Author");
                String IssueDate= resultSet1.getString("issueDate");
                String ReturnDate = resultSet1.getString("returnDate");
                
                
                
               
                    defaultTableModel.addRow(new Object[]{MemberId,MemberName,EmailID,PhoneNo,ISBN,Title,Author,IssueDate,ReturnDate});//Adding row in Table
//                   this.setVisible(true);
            }
               
            }
            
                 
               











              
                

        }
               
        if (ae.getSource() == button2) {
            
            button1.setEnabled(true);
            button1.setText("View Books");
           //textField1.setText("");//resetting the value of username text field
           textField2.setText("");
           defaultTableModel.setRowCount(0);
           
        }

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }


    }
    

   
    }

