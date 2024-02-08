//Database Connection Code...
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class DB_Connection {
     
    public static Connection connection() //This is a Method, inside the DB_Connection Class.. The type of this Method is "Connection"...
        {   
           try{      
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student/userDB","root","");
                return conn;
               }
           
            catch(Exception e){    
                System.out.println(e);
                return null;
                }
        }        
}
//This is all the Database Connection Code.....