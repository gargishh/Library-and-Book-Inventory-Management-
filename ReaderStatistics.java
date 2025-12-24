
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

public class ReaderStatistics  {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1,textField2;
    JButton button1,button2;
  JScrollPane sp ;

   ReaderStatistics() {
 frame1 = new JFrame();
         defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);

        defaultTableModel.addColumn("ISBN");
        defaultTableModel.addColumn("Book ID");
        defaultTableModel.addColumn("Title");
         defaultTableModel.addColumn("Author");
        defaultTableModel.addColumn("Publisher");
        defaultTableModel.addColumn("Edition");
        defaultTableModel.addColumn("Volume");
        defaultTableModel.addColumn("Genre");
        defaultTableModel.addColumn("Pages");
        defaultTableModel.addColumn("Price");
        defaultTableModel.addColumn("Book State");
        defaultTableModel.addColumn("Fine Amount");
        defaultTableModel.addColumn("Member Id");
        defaultTableModel.addColumn("Phone No.");
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Reading Hours");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Charge/Hour");
        defaultTableModel.addColumn("Total Charge");
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
               
                
                  String query1 = "select * from Readers ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    
                    ResultSet resultSet1 = ps1.executeQuery();
           
       
        
        
          double sum =0;
   
            while (resultSet1.next()) {

                String ISBN= resultSet1.getString("ISBN");
                String id= resultSet1.getString("id");
                String Title = resultSet1.getString("Title");
                String Author = resultSet1.getString("Author");
                String Publisher = resultSet1.getString("Publisher");
                String Edition = resultSet1.getString("Edition");
                String Volume = resultSet1.getString("Volume");
                String Genre = resultSet1.getString("Genre");
                String Pages = resultSet1.getString("Pages");
                String Price = resultSet1.getString("Price");
                String state = resultSet1.getString("state");
                String fine = resultSet1.getString("fine");
                String memberid = resultSet1.getString("memberid");
                String phoneno = resultSet1.getString("PhoneNo");
                String memname = resultSet1.getString("Name");
                String address = resultSet1.getString("Address");
                String mail = resultSet1.getString("Email");
                String readingHours = resultSet1.getString("readingHours");
                String date = resultSet1.getString("date");
                String hourcharge = resultSet1.getString("hourcharge");
                String totalcharge = resultSet1.getString("totalcharge");
                
                double cost = Double.parseDouble(totalcharge);
               sum = sum+cost;
                
                String TotalIncome = Double.toString(sum);
               
                    defaultTableModel.addRow(new Object[]{ISBN,id,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,state,fine,
                        memberid,phoneno,memname,address,mail,readingHours,date,hourcharge,totalcharge,TotalIncome});//Adding row in Table
//                   this.setVisible(true);
            
               
            
           
            }      
           

       
       

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }
      
        
      


    }

    public static void main(String[] args) {
        new ReaderStatistics();
    }

   
    

   
    }

