
package loginandsignup;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
           c = DriverManager.getConnection("jdbc:mysql:///ServiceApp", "root", "student");
           s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
