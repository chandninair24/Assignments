import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  
class Transaction{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Capgemini123");  
con.setAutoCommit(false);  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into student values(101,'chandni'");
stmt.executeUpdate("insert into student values(102,'jaipal'");  
con.commit();  
con.close();  
}}  
