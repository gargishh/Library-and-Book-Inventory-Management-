package bookinventorylibrarymanagementsystem;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;


public class AdminFirstScreen extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JButton button1,button2,button3;
    JTextField textField1,textField2;
    JPanel panel;
    JMenuItem itemAdmin,itemBook,itemViewBook,itemSearchBook,itemRequestBook,itemMember,itemViewMember,itemViewMemberBooks ,
            itemBuyBooks,itemBuyBooksMem,itemSales,itemActiveIssue,itemIssueBooks,itemReader,itemReturnBooks,itemBookDetails,itemStaffDetails,itemVendorDetails,
            itemOrderDetails,itemBuyGen,itemBuyMem,
            itemMembershipStatistics,itemIssueStatistics,itemReturnStatistics,itemReaderStatistics,itemStaff,itemViewStaff,
            itemAddVendor,itemViewVendor,itemLogout;
            
    JMenuBar menu;
    JMenu fileAdmin,file1,file2,file3,file4,file5,fileStaff,filesales,fileVendor,file6;
    AdminFirstScreen(String S)
    {
        
        menu = new JMenuBar();
        
          menu.setBackground(Color.white);
          
         fileAdmin = new JMenu("Admin");
         file1 = new JMenu("Books");
         file2 = new JMenu("Member");
         file3 = new JMenu("Buy Books");
         file4 = new JMenu("Library");
         file5 = new JMenu("History");
         fileStaff = new JMenu("Staff Members");
         filesales = new JMenu("Sales");
         fileVendor = new JMenu("Vendors");
         file6 = new JMenu("Logout");
        
         itemAdmin = new JMenuItem("View");
         itemAdmin.addActionListener(this);
         fileAdmin.add(itemAdmin);
         
         itemBook = new JMenuItem("Add");
         itemBook.addActionListener(this);
         file1.add(itemBook);
         
         itemViewBook = new JMenuItem("View");
         itemViewBook.addActionListener(this);
         file1.add(itemViewBook);
     
        itemSearchBook = new JMenuItem("Search");
        itemSearchBook.addActionListener(this);
        file1.add(itemSearchBook);
        
        
        itemRequestBook = new JMenuItem("Request Orders");
        itemRequestBook.addActionListener(this);
        file1.add(itemRequestBook);
        
         itemMember = new JMenuItem("Buy Membership");
         itemMember.addActionListener(this);
         file2.add(itemMember);
        
      
         itemViewMember = new JMenuItem("View Members");
         itemViewMember.addActionListener(this);
         file2.add(itemViewMember);
         
         itemViewMemberBooks = new JMenuItem("View Issued Books");
         itemViewMemberBooks .addActionListener(this);
         file2.add(itemViewMemberBooks );
         
         itemBuyBooks = new JMenuItem("General");
         itemBuyBooks.addActionListener(this);
         file3.add(itemBuyBooks);
         
         
         itemBuyBooksMem = new JMenuItem("Member");
         itemBuyBooksMem.addActionListener(this);
         file3.add(itemBuyBooksMem);
         
         
         
         itemIssueBooks =  new JMenuItem("Issue");
         itemIssueBooks.addActionListener(this);
         file4.add(itemIssueBooks);
         
         
         itemReturnBooks =  new JMenuItem("Return");
         itemReturnBooks.addActionListener(this);
         file4.add(itemReturnBooks);
         
         
        itemReader =  new JMenuItem("Reader");
        itemReader.addActionListener(this);
        file4.add(itemReader);
        
        itemSales =  new JMenuItem("Sales");
        itemSales.addActionListener(this);
        filesales.add(itemSales);
         
        itemBookDetails = new JMenuItem("All Books");
         itemBookDetails.addActionListener(this);
         file5.add(itemBookDetails);
         
         itemStaffDetails = new JMenuItem("Staff History");
         itemStaffDetails.addActionListener(this);
         file5.add(itemStaffDetails);
        
         itemVendorDetails = new JMenuItem("Vendor History");
         itemVendorDetails.addActionListener(this);
         file5.add(itemVendorDetails);
         
         itemOrderDetails = new JMenuItem("Order History");
         itemOrderDetails.addActionListener(this);
         file5.add(itemOrderDetails);
         
         itemReaderStatistics = new JMenuItem("Reader History");
         itemReaderStatistics.addActionListener(this);
         file5.add(itemReaderStatistics);
         
         itemBuyGen = new JMenuItem("Books sold(General)");
         itemBuyGen.addActionListener(this);
         file5.add(itemBuyGen);
         
         itemBuyMem = new JMenuItem("Books sold(Member)");
         itemBuyMem.addActionListener(this);
         file5.add(itemBuyMem);
         
         
         itemMembershipStatistics = new JMenuItem("Membership History");
         itemMembershipStatistics.addActionListener(this);
         file5.add(itemMembershipStatistics);
         
         itemActiveIssue =  new JMenuItem("Active Issues");
         itemActiveIssue.addActionListener(this);
         file5.add(itemActiveIssue);
         
         itemIssueStatistics = new JMenuItem("Issue History");
         itemIssueStatistics.addActionListener(this);
         file5.add(itemIssueStatistics);
         
         itemReturnStatistics = new JMenuItem("Return History");
         itemReturnStatistics.addActionListener(this);
         file5.add(itemReturnStatistics);
         
         
         
        itemStaff = new JMenuItem("Add");
        itemStaff.addActionListener(this);
        fileStaff.add(itemStaff);
        
        itemViewStaff = new JMenuItem("View");
        itemViewStaff.addActionListener(this);
        fileStaff.add(itemViewStaff);
        
        
        itemAddVendor = new JMenuItem("Add");
        itemAddVendor.addActionListener(this);
        fileVendor.add(itemAddVendor);
        
        itemViewVendor = new JMenuItem("View");
        itemViewVendor.addActionListener(this);
        fileVendor.add(itemViewVendor);
        
        itemLogout=new JMenuItem("Logout");
        itemLogout.addActionListener(this);
        file6.add(itemLogout);
        
        menu.add(fileAdmin);
        menu.add(file1);
        menu.add(file3);
        menu.add(file2);
        menu.add(file4);
        menu.add(fileStaff);
        menu.add(fileVendor); 
        menu.add(filesales);
        menu.add(file5);
        menu.add(file6);
        
        
  
        
        
        
        
       
//         panel = new JPanel();
//        panel.setBounds(0,0,1000,0);
//        panel.setBackground(Color.white);
//        panel.setLayout(null);
       
 
        ImageIcon icon1 = new ImageIcon("src/BookInventoryLibraryManagementSystem/Images/Book5.jpg"); // load the image to a icon
        Image img1 = icon1.getImage(); // transform it 
        Image newimg1 = img1.getScaledInstance(1366,768,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon1 = new ImageIcon(newimg1);  // transform it back
        label1 = new JLabel(icon1);
        label1.setBounds(0,0,1366,768);
        label1.setForeground(Color.white);// set font color of text
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setText("Welcome back to Tell A Tale "+S);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 60));// set font of text
        
         /*JLabel background = new JLabel(icon1);
          background.setBounds(0,0,1366,768);
        background.setForeground(Color.WHITE);// set font color of text
        background.setFont(new Font("Times New Roman", Font.BOLD, 60));// set font of text*/
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setLayout(null);
        this.setVisible(true);
       
        //this.setResizable(false);
       /* Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
       System.out.println(screenSize.width);
       System.out.println(screenSize.height);*/
        
        
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        //this.add(panel);
        this.setJMenuBar(menu);
        this.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
         
         if(e.getSource()==itemAdmin)
         {
             new ViewAdmin();
           
         }
         else if(e.getSource()==itemBook)
         {
             new AddBooks();
           
         }
         else if(e.getSource()==itemViewBook)
         {
            // this.setVisible(false);
             new ViewBooks();
         }
        else if(e.getSource()==itemSearchBook)
         {
           
             new SearchBooks();
         }
          else if(e.getSource()==itemRequestBook)
         {
           
             new RequestBooks();
         }
          else if(e.getSource()==itemMember)
         {
           
             new BuyMembership();
         }
           else if(e.getSource()==itemViewMember)
         {
             //this.setVisible(false);
             new ViewMembers();
         }
           else if(e.getSource()==itemViewMemberBooks )
           {
               new ViewMemberBooksIssued();
           }
        
         else if(e.getSource()==itemBuyBooks)
         {
          
            new BuyBookGeneral();
         }
          else if(e.getSource()==itemBuyBooksMem)
         {
          
            new BuyBookMember();
         }
           else if(e.getSource()==itemSales)
         {
          
            new Sales();
         }
          else if(e.getSource()==itemActiveIssue)
         {
             //this.setVisible(false);
             new ActiveIssue();
         }
         else if(e.getSource()==itemIssueBooks)
         {
             //this.setVisible(false);
             new IssueBook2();
         }
         
         else if(e.getSource()==itemReturnBooks)
         {
            
             new Return2();
         }
         else if(e.getSource()==itemReader)
         {
            
             new Reader();
         }
            else if(e.getSource()==itemStaff)
         {
             new AddStaff();
         }
         else if(e.getSource()==itemViewStaff)
         {
            new ViewStaff();
         }
          else if(e.getSource()==itemAddVendor)
         {
            new AddVendor();
         }
           else if(e.getSource()==itemViewVendor)
         {
            new ViewVendor();
         }
          else if(e.getSource()==itemBookDetails )
           {
               new BookDetails();
           }
         else if(e.getSource()==itemStaffDetails )
           {
               new StaffDetails();
           } 
          else if(e.getSource()==itemVendorDetails )
           {
               new VendorDetails();
           } 
            else if(e.getSource()==itemOrderDetails )
           {
               new OrderDetails();
           }
          else if(e.getSource()==itemReaderStatistics)
         {
             new ReaderStatistics();
         }
          else if(e.getSource()==itemBuyGen)
         {
             new BookSoldGen();
         }
           else if(e.getSource()==itemBuyMem)
         {
             new BookSoldMem();
         }
         else if(e.getSource()==itemMembershipStatistics)
         {
             new StatisticsForMembership();
         }
         else if(e.getSource()==itemIssueStatistics)
         {
             new Issue2Statistics();
         }
         else if(e.getSource()==itemReturnStatistics)
         {
             new ReturnStatistics();
         }
        
      
         else if(e.getSource()==itemLogout)
         {
             this.setVisible(false);
             new Login().setVisible(true);
         }
        /* else if(e.getSource()==button1)
        {
            //System.out.println("Button 1");
            this.setVisible(false);
            //new BuyMembership().setVisible(true);
            
        }
        else if(e.getSource()==button2)
        {
            //System.out.println("Button 2");
            //this.setVisible(false);
            //new Login().setVisible(true);
         //   new SearchCD();
        }
         else if(e.getSource()==button3)
        {
            //System.out.println("Button 2");
            setVisible(false);
           // new Login().setVisible(true);
        }*/
    }
    public static void main(String[] args)
    {
        String S=" ";
        new AdminFirstScreen(S);
    }
}