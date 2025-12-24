
package bookinventorylibrarymanagementsystem;

import java.sql.*;

public class Conn {
    Connection con;
    Statement st;
    public Conn()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/BOOK";
            String username = "root";
            String password ="sreejitabanerjeebppimt";
           // Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            st = con.createStatement();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args)
    {
        new Conn();
    }
}


