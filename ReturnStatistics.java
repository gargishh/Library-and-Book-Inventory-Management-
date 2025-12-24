
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

public class ReturnStatistics  {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1,textField2;
    JButton button1,button2;
  JScrollPane sp ;

   ReturnStatistics() {
 frame1 = new JFrame();
         defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);

  
        defaultTableModel.addColumn("Member ID");
        defaultTableModel.addColumn("Member Name");
        defaultTableModel.addColumn("Email ID");
        defaultTableModel.addColumn("Phone No.");
        defaultTableModel.addColumn("Book ID");
         defaultTableModel.addColumn("Issue Date");
        defaultTableModel.addColumn("Return Date");
       defaultTableModel.addColumn("Title");
       defaultTableModel.addColumn("Author");
       defaultTableModel.addColumn("Today");
       defaultTableModel.addColumn("Late Return");
       defaultTableModel.addColumn("Book state");
       defaultTableModel.addColumn("Fine Amount");
       defaultTableModel.addColumn("Total Fine Collected");
       
       
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
               
                
                  String query1 = "select * from RETURNBOOK2 ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    
                    ResultSet resultSet1 = ps1.executeQuery();
           
       
        
        
         
                    int sum =0;
            while (resultSet1.next()) {
            	
            	//memberid,memname,mail,phoneno,ISBN,issueDate,returnDate,Title,Author,,,,
                String memberid= resultSet1.getString("memberid");
                String memname = resultSet1.getString("memname");
                String mail = resultSet1.getString("mail");
                String phoneno = resultSet1.getString("phoneno");
                String Id = resultSet1.getString("id");
                String issueDate = resultSet1.getString("issueDate");
                String returnDate = resultSet1.getString("returnDate");
                String Title = resultSet1.getString("Title");
                String Author = resultSet1.getString("Author");
                String today = resultSet1.getString("today");
                String state = resultSet1.getString("state");
                String lateReturn = resultSet1.getString("late");
                
                String fineAmount = resultSet1.getString("fine");
                  int cost = Integer.parseInt(fineAmount);
               
                sum = sum+cost;
                
                String totalfineAmount = Integer.toString(sum);
                
              
               
                    defaultTableModel.addRow(new Object[]{memberid,memname,mail,phoneno,Id,issueDate,returnDate,Title,Author,today,lateReturn,state,fineAmount,totalfineAmount});//Adding row in Table
//                   this.setVisible(true);
            
               
            
           
            }      
           

       
       

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }
      
        
      


    }

    public static void main(String[] args) {
        new ReturnStatistics();
    }

   
    

   
    }
