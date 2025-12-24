
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

public class BookDetails  {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1,textField2;
    JButton button1,button2;
  JScrollPane sp ;

   BookDetails() {
 frame1 = new JFrame();
         defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);
                  
        defaultTableModel.addColumn("ISBN");
        defaultTableModel.addColumn("Title");
         defaultTableModel.addColumn("Author");
        defaultTableModel.addColumn("Publisher");
        defaultTableModel.addColumn("Edition");
        defaultTableModel.addColumn("Volume");
        defaultTableModel.addColumn("Genre");
        defaultTableModel.addColumn("Pages");
        defaultTableModel.addColumn("Price");
        defaultTableModel.addColumn("Stocks");
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
               
                
                  String query1 = "select * from books";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    
                    ResultSet resultSet1 = ps1.executeQuery();
           
       
        
        
          double sum =0;
   
            while (resultSet1.next()) {
            	

                String ISBN= resultSet1.getString("ISBN");
                String Title = resultSet1.getString("Title");
                String Author = resultSet1.getString("Author");
                String Publisher = resultSet1.getString("Publisher");
                String Edition = resultSet1.getString("Edition");
                String Volume = resultSet1.getString("Volume");
                String Genre = resultSet1.getString("Genre");
                String Pages = resultSet1.getString("Pages");
                String Price = resultSet1.getString("Price");
                String stocks = resultSet1.getString("stocks");
               
                
               
               
                    defaultTableModel.addRow(new Object[]{ISBN,Title,Author,Publisher,Edition,Volume,Genre,Pages,Price,
                        stocks});//Adding row in Table
//                   this.setVisible(true);
            
               
            
           
            }      
           

       
       

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }
      
        
      


    }

    public static void main(String[] args) {
        new BookDetails();
    }

   
    

   
    }

