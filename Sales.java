
package bookinventorylibrarymanagementsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Sales extends JFrame implements ActionListener
{
    JLabel label1,label2,label3,label4,label5;
    JSpinner spinner1,spinner2;
    JDateChooser dateChooser1;
    JTextArea textArea;
    JPanel panel;
    JButton button1,button2;
    JComboBox  comboBox1,comboBox2;
  Sales()
  {
      
      panel = new JPanel();
      panel.setBackground(Color.pink);
      panel.setBounds(0, 0, 1400,800);
      panel.setLayout(null);
      
        label1 = new JLabel("Date");
	label1.setFont(new Font("Times New Roman",Font.BOLD,20));
        label1.setForeground(Color.black);
	label1.setBounds(100,75, 90, 30);
	panel.add(label1);
        

	label2 = new JLabel("Month");
        label2.setFont(new Font("Times New Roman",Font.BOLD,20));
        label1.setForeground(Color.black);
	label2.setBounds(100,135, 90, 30);
	panel.add(label2);

	label3 = new JLabel("Year");
	label3.setFont(new Font("Times New Roman",Font.BOLD,20));
        label3.setForeground(Color.black);
	label3.setBounds(100, 195, 90, 30);
	panel.add(label3);
        
        label4 = new JLabel("Check By");
	label4.setFont(new Font("Times New Roman",Font.BOLD,20));
        label4.setForeground(Color.black);
	label4.setBounds(100, 255, 90, 30);
	panel.add(label4);
        
        label5 = new JLabel("Check For");
	label5.setFont(new Font("Times New Roman",Font.BOLD,20));
        label5.setForeground(Color.black);
	label5.setBounds(100, 315, 90, 30);
	panel.add(label5);
      
        dateChooser1 = new JDateChooser();
        dateChooser1.setBounds(195, 80, 250, 20);
        panel.add(dateChooser1);
      
       /*String[] monthStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"}; //get month names
        SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
        JSpinner spinner1 = new JSpinner(monthModel);  
        spinner1.setBounds(190, 165, 200, 30);    
        panel.add(spinner1); */ 
        
        Date today = new Date();
        spinner1 = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner1, "MM");    
        spinner1.setEditor(editor);
        spinner1.setBounds(195, 140, 250, 20);    
        panel.add(spinner1);
        
        today = new Date();
        spinner2 = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.YEAR));
        JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinner2, "yyyy");    
        spinner2.setEditor(editor2);
        spinner2.setBounds(195, 200, 250, 20);    
        panel.add(spinner2);
        
        String[] options1 = {"---Select---","Particular Date","Particular Month and Year","Only Year"};
        comboBox1 = new JComboBox(options1);
        comboBox1.setBounds(195,260,250,20);//(135,205,250,20);
        comboBox1.addActionListener(this);
        panel.add(comboBox1);
        
        String[] options2 = {"---Select---","Membership","Books Sold to Members","Books sold to General Customer","Total Charge(inc. fine) from Readers","Fine from Members"};
        comboBox2 = new JComboBox(options2);
        comboBox2.setBounds(195,320,250,20);//(135,205,250,20);
        comboBox2.addActionListener(this);
        panel.add(comboBox2);
        
        
        
        button1 = new JButton("Check");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(240,370,90,40);
        panel.add(button1);
        
  
        
        textArea = new JTextArea();
	textArea.setBounds(80,430, 430, 100); 
        textArea.setFont(new Font("Times New Roman",Font.BOLD,16));
        textArea.setForeground(Color.black);
        textArea.setBackground(Color.white);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
	panel.add(textArea);
        
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setTitle("Sales");
      this.setSize(600,600);
      this.setVisible(true);
      this.setLayout(null);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int x = (screenSize.width - this.getWidth()) / 2;
      int y = (screenSize.height - this.getHeight()) / 2;
      this.setLocation(x, y);
      this.add(panel);
      
      
      
      
  }
    

  
    @Override
    public void actionPerformed(ActionEvent ae) {
         try{
             Conn c = new Conn();
        if(ae.getSource()==button1)
        {
                
                
            String combo1 = (String)comboBox1.getSelectedItem();
            String combo2 = (String)comboBox2.getSelectedItem();
            if(combo1.equals("---Select---"))
            {
                 JOptionPane.showMessageDialog(null, "Select a particular date/month/year to check the sales", "", JOptionPane.WARNING_MESSAGE); 
            }
            else if(combo2.equals("---Select---"))
                {
                 JOptionPane.showMessageDialog(null, "Select a particular field to check for the sales", "", JOptionPane.WARNING_MESSAGE); 
            }
           else if(combo1.equals("Particular Date") && combo2.equals("Membership"))
            {
                if(dateChooser1.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Select a Date", "", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
                String strDate = dFormat.format(date);
                String query1 = "select sum(price) from membership where enrolldate like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,strDate);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(price)"));
                    }
                }
                    
            }
            else if(combo1.equals("Particular Date") && combo2.equals("Books Sold to Members"))
            {
                if(dateChooser1.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Select a Date", "", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                String query1 = "select sum(grandtotal) from BUYBOOKSMEM where memdop like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,strDate);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(grandtotal)"));
                    }
                }
                    
            }
            
             else if(combo1.equals("Particular Date") && combo2.equals("Books sold to General Customer"))
            {
                if(dateChooser1.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Select a Date", "", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                String query1 = "select sum(totalprice) from BUYBOOKSgen where cusdop like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,strDate);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalprice)"));
                    }
                }
                    
            }
            
            
            else if(combo1.equals("Particular Date") && combo2.equals("Total Charge(inc. fine) from Readers"))
            {
                if(dateChooser1.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Select a Date", "", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                String query1 = "select sum(totalcharge) from readers where date like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,strDate);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalcharge)"));
                    }
                }
                    
            } 
            
            
            
            else if(combo1.equals("Particular Date") && combo2.equals("Fine from Members"))
            {
                if(dateChooser1.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Select a Date", "", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Date date = dateChooser1.getDate();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy");
                String strDate = dFormat.format(date);
                String query1 = "select sum(fine) from returnbook2 where today like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,strDate);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(fine)"));
                    }
                }
                    
            } 
           else if(combo1.equals("Particular Month and Year") && combo2.equals("Membership"))
            {
               
               
                  // String s1 = spinner1.getValue().toString();
                    Date date = (Date)spinner1.getValue();
                SimpleDateFormat dFormat = new SimpleDateFormat("MM");
                String strDate = dFormat.format(date);
                   //System.out.println(strDate);
                   //String s2 = spinner2.getValue().toString();
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(price) from membership where enrolldate like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate+'-'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(price)"));
                    }
                
                    
            } 
            
            
             else if(combo1.equals("Particular Month and Year") && combo2.equals("Books Sold to Members"))
            {
               
               
                  // String s1 = spinner1.getValue().toString();
                    Date date = (Date)spinner1.getValue();
                SimpleDateFormat dFormat = new SimpleDateFormat("MM");
                String strDate = dFormat.format(date);
                   //System.out.println(strDate);
                   //String s2 = spinner2.getValue().toString();
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(grandtotal) from BUYBOOKSMEM where memdop like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate+'-'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(grandtotal)"));
                    }
                
                    
            } 
            
             else if(combo1.equals("Particular Month and Year") && combo2.equals("Books sold to General Customer"))
            {
               
               
                  // String s1 = spinner1.getValue().toString();
                    Date date = (Date)spinner1.getValue();
                SimpleDateFormat dFormat = new SimpleDateFormat("MM");
                String strDate = dFormat.format(date);
                  // System.out.println(strDate);
                   //String s2 = spinner2.getValue().toString();
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(totalprice) from BUYBOOKSgen where cusdop like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate+'-'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalprice)"));
                    }
                
                    
            }
            
             else if(combo1.equals("Particular Month and Year") && combo2.equals("Total Charge(inc. fine) from Readers"))
            {
               
               
                  // String s1 = spinner1.getValue().toString();
                    Date date = (Date)spinner1.getValue();
                SimpleDateFormat dFormat = new SimpleDateFormat("MM");
                String strDate = dFormat.format(date);
                   //System.out.println(strDate);
                   //String s2 = spinner2.getValue().toString();
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(totalcharge) from readers where date like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate+'-'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalcharge)"));
                    }
                
                    
            }
            
            
            else if(combo1.equals("Particular Month and Year") && combo2.equals("Fine from Members"))
            {
               
               
                  // String s1 = spinner1.getValue().toString();
                    Date date = (Date)spinner1.getValue();
                SimpleDateFormat dFormat = new SimpleDateFormat("MM");
                String strDate = dFormat.format(date);
                   //System.out.println(strDate);
                   //String s2 = spinner2.getValue().toString();
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(fine) from returnbook2 where today like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate+'-'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(fine)"));
                    }
                
                    
            }
            
            
            
            
            
            
            
            
            
            
            
            
            else if(combo1.equals("Only Year") && combo2.equals("Membership"))
            {
               
               
                 
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(price) from membership where enrolldate like ? ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate2);
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(price)"));
                    }
                
                    
            } 
            
            
             else if(combo1.equals("Only Year") && combo2.equals("Books Sold to Members"))
            {
               
               
                
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(grandtotal) from BUYBOOKSMEM where memdop like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(grandtotal)"));
                    }
                
                    
            } 
            
             else if(combo1.equals("Only Year") && combo2.equals("Books sold to General Customer"))
            {
               
               
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(totalprice) from BUYBOOKSgen where cusdop like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalprice)"));
                    }
                
                    
            }
            
             else if(combo1.equals("Only Year") && combo2.equals("Total Charge(inc. fine) from Readers"))
            {
               
               
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                   //System.out.println(strDate2);
                String query1 = "select sum(totalcharge) from readers where date like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(totalcharge)"));
                    }
                
                    
            }
            
            
            else if(combo1.equals("Only Year") && combo2.equals("Fine from Members"))
            {
               
               
                 
                   Date date2 = (Date)spinner2.getValue();
                SimpleDateFormat dFormat2 = new SimpleDateFormat("YYYY");
                String strDate2 = dFormat2.format(date2);
                  // //System.out.println(strDate2);
                String query1 = "select sum(fine) from returnbook2 where today like ?  ";
               
                    PreparedStatement ps1 = c.con.prepareStatement(query1);
                    ps1.setString(1,'%'+strDate2+'%');
                    ResultSet resultSet1 = ps1.executeQuery();
                    while(resultSet1.next())
                    {
                        textArea.setText(resultSet1.getString("sum(fine)"));
                    }
                
                    
            }
            
            
            
            
        }
        
        
        
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        
    }
   
      public static void main(String args[])
    {
        new Sales();
    }
}
