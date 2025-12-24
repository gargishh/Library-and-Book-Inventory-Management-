
package bookinventorylibrarymanagementsystem;




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

public class StatisticsForMembership  {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1,textField2;
    JButton button1,button2;
  JScrollPane sp ;

   StatisticsForMembership() {
 frame1 = new JFrame();
         defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);
                  
   //defaultTableModel = new DefaultTableModel();
       // memname,mail,address,phoneno,membership,price,memberid,enrolldate,expirydate
        defaultTableModel.addColumn("Member Name");
        defaultTableModel.addColumn("Email ID");
         defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Phone No.");
        defaultTableModel.addColumn("Membership");
        defaultTableModel.addColumn("Member ID");
        defaultTableModel.addColumn("Enroll Date");
        defaultTableModel.addColumn("Expiry Date");
        defaultTableModel.addColumn("Price");
         defaultTableModel.addColumn("Books Issued");
        defaultTableModel.addColumn("Total Income");
                   // frame1.setVisible(true);
                     sp = new JScrollPane(table);
                    table.setAutoCreateRowSorter(true);
                  
                  
               
		frame1.setTitle("Database Results");
		frame1.setSize(800, 300);
		frame1.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (screenSize.width - frame1.getWidth()) / 2;
                int y = (screenSize.height - frame1.getHeight()) / 2;
                frame1.setLocation(x, y);
                frame1.add(sp);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    try {
                 
               
                   
        	
           	Conn c = new Conn();
               
                
                  String query1 = "select * from MEMBERSHIP ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    
                    ResultSet resultSet1 = ps1.executeQuery();
           
       
        
        
          int sum =0;
   
            while (resultSet1.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                // ,,,,,,,,
                String memname= resultSet1.getString("memname");
                String mail = resultSet1.getString("mail");
                String address = resultSet1.getString("address");
                String phoneno = resultSet1.getString("phoneno");
                String membership = resultSet1.getString("membership");
                String price = resultSet1.getString("price");
                String memberid = resultSet1.getString("memberid");
                String enrolldate = resultSet1.getString("enrolldate");
                String expirydate = resultSet1.getString("expirydate");
                String issue = resultSet1.getString("issueNo");
                
                  int cost = Integer.parseInt(price);
                
               
                
                sum = sum+cost;
                
                String TotalPrice = Integer.toString(sum);
               
                    defaultTableModel.addRow(new Object[]{memname,mail,address,phoneno,membership,memberid,enrolldate,expirydate,price,issue,TotalPrice});//Adding row in Table
//                   this.setVisible(true);
            
               
            
           
            }      
           

       
       

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }
      
        
      


    }

    public static void main(String[] args) {
        new StatisticsForMembership();
    }

   
    

   
    }
