package src;



import java.sql.* ;
public class DB {
    
    static Connection con = null;
    
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management","stmanage","Onel1234");
            
        }   catch(Exception e){
            e.printStackTrace();
        }
            return con;
    }
    }
    
    

