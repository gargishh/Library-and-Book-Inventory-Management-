
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

public class SearchBooks implements ActionListener {

    JFrame frame1,frame2,frame3;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1,label2;
    JTextField  textField1;
    JButton button1,button2;
  JScrollPane pane ;
  JComboBox comboBox;

   SearchBooks() {

       
        table = new JTable();
        //Object[] columns = {"ISBN","title","Author","Publisher","Edition","Volume","genre","Pages","Price","stocks"};
        defaultTableModel = new DefaultTableModel();
        
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
        
        frame1 = new JFrame();
       
        
        
        
        label1 = new JLabel();
        label1.setText("Enter Title");
        label1.setBounds(350,50,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label2 = new JLabel();
        label2.setText("Enter Genre");
        label2.setBounds(350,100,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        textField1 = new JTextField();
        textField1.setBounds(460,60,400,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        
       /* textField2 = new JTextField();
        textField2.setBounds(460,110,400,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);*/
        String[] options = {"---Select---"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(460,110,400,20);//(135,205,250,20);
        comboBox.addActionListener(this);
                
        
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
       frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.getContentPane().setLayout(null);
        frame1.setTitle("Search Books");
        frame1.setVisible(true);
        //frame1.setResizable(false);
        frame1.getContentPane().setBackground(Color.pink);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame1.getWidth()) / 2;
        int y = (screenSize.height - frame1.getHeight()) / 2;
        frame1.setLocation(x, y);
          frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.add(label1);
        frame1.add(label2);
        frame1.add(textField1);
        //frame1.add(textField2);
        frame1.add(comboBox);
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
        try{
            Conn c = new Conn();
        String queryCus = "SELECT distinct(genre) FROM books ";
                 PreparedStatement ps = c.con.prepareStatement(queryCus);
                
                 ResultSet rs = ps.executeQuery();
                  //comboBox.removeAllItems();
                  //comboBox.addItem("---Select---");
                 while(rs.next())
                 {
                     comboBox.addItem(rs.getString("genre"));
                 }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      


    }

    public static void main(String[] args) {
        new SearchBooks();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

      String Title = textField1.getText().toString();//getting text of username text field and storing it in a String variable
           
            String Genre = comboBox.getSelectedItem().toString();
           
             try {
                 
               if (ae.getSource() == button1) {
//                   button1.setEnabled(false);
//                   button1.setText("Click Reset ");
                   defaultTableModel.setRowCount(0); 
        	
           	Conn c = new Conn();
                 if(!Title.equals("") || Genre.equals(""))
            {
                
                  String query1 = "select * from Books WHERE Title LIKE ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,"%"+ Title+"%");
                    ResultSet resultSet1 = ps1.executeQuery();
           
       
        
        
        
   
            while (resultSet1.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                 
                String ISBN= resultSet1.getString("ISBN");
                String title = resultSet1.getString("Title");
                String Author = resultSet1.getString("Author");
                String Publisher = resultSet1.getString("Publisher");
                String Edition = resultSet1.getString("Edition");
                String Volume = resultSet1.getString("Volume");
                String genre = resultSet1.getString("Genre");
                String Pages = resultSet1.getString("Pages");
                String Price = resultSet1.getString("Price");
                String stocks = resultSet1.getString("stocks");
                
                
               
                    defaultTableModel.addRow(new Object[]{ISBN,title,Author,Publisher,Edition,Volume,genre,Pages,Price,stocks});//Adding row in Table
//                   this.setVisible(true);
            }
               
            }
            else if(Title.equals("") || !Genre.equals(""))
            {    
                  String query2 = "select * from Books WHERE Genre LIKE ? ";
               
                    PreparedStatement ps2 = c.con.prepareStatement(query2);
                    ps2.setString(1,"%"+ Genre+"%");
                    ResultSet resultSet2 = ps2.executeQuery();
           
       
        
        
        
   
            while (resultSet2.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                 
                String ISBN2= resultSet2.getString("ISBN");
                String title2 = resultSet2.getString("Title");
                String Author2 = resultSet2.getString("Author");
                String Publisher2 = resultSet2.getString("Publisher");
                String Edition2 = resultSet2.getString("Edition");
                String Volume2 = resultSet2.getString("Volume");
                String genre2 = resultSet2.getString("Genre");
                String Pages2 = resultSet2.getString("Pages");
                String Price2 = resultSet2.getString("Price");
                String stocks2 = resultSet2.getString("stocks");
                
                
               
                    defaultTableModel.addRow(new Object[]{ISBN2,title2,Author2,Publisher2,Edition2,Volume2,genre2,Pages2,Price2,stocks2});//Adding row in Table




            }
            }
            else if(!Title.equals("") && !Genre.equals(""))
            {
               String query3 = "select * from Books WHERE Title LIKE ? ";
               
                    PreparedStatement ps3 = c.con.prepareStatement(query3);
                    ps3.setString(1,"%"+ Title+"%");
                    ResultSet resultSet3 = ps3.executeQuery();
           
       
        
        
        
   
            while (resultSet3.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                 
                String ISBN= resultSet3.getString("ISBN");
                String title = resultSet3.getString("Title");
                String Author = resultSet3.getString("Author");
                String Publisher = resultSet3.getString("Publisher");
                String Edition = resultSet3.getString("Edition");
                String Volume = resultSet3.getString("Volume");
                String genre = resultSet3.getString("Genre");
                String Pages = resultSet3.getString("Pages");
                String Price = resultSet3.getString("Price");
                String stocks = resultSet3.getString("stocks");
                
                
               
                    defaultTableModel.addRow(new Object[]{ISBN,title,Author,Publisher,Edition,Volume,genre,Pages,Price,stocks});//Adding row in Table
//                   this.setVisible(true);
            }
                
            }      
       

        }
               
        if (ae.getSource() == button2) {
            
            button1.setEnabled(true);
            button1.setText("View Books");
           textField1.setText("");//resetting the value of username text field
           comboBox.setSelectedIndex(0);
           defaultTableModel.setRowCount(0);
           
        }

    }
             catch(Exception e)
             {
                 System.out.println(e);
             }


    }
    

   
    }
