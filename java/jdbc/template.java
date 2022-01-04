package jdbc;
import java.sql.*;

public class test1 {

    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN = "jdbc:mysql://localhost/java";
    
    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
        conn = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
        System.out.println("Connected");
        Statement smtp = null;
        String sql = "";
        smtp = conn.createStatement();
        /*sql = "CREATE TABLE doctor(id int(5) PRIMARY KEY, name varchar(50), dept varchar(50), gender varchar(2),  experience int(2));";
        smtp.executeUpdate(sql);
        sql = "INSERT INTO doctor values(101, 'sumit', 'e', 'g', 9);";
        smtp.executeUpdate(sql);
        sql = "INSERT INTO doctor values(102, 'harsha', 'e', 'g', 10);";
        smtp.executeUpdate(sql);
        sql = "SELECT * FROM doctor;";
        ResultSet res = smtp.executeQuery(sql);*/
        
        /*sql = "CREATE TABLE salary(id int(5) PRIMARY KEY, basic float(2));";
        smtp.executeUpdate(sql);
        sql = "INSERT INTO salary values(101, 2000.00);";
        smtp.executeUpdate(sql);
        sql = "INSERT INTO salary values(102, 2500.00);";
        smtp.executeUpdate(sql);
        sql = "SELECT * FROM salary;";
        ResultSet res = smtp.executeQuery(sql);*/
        
        sql = "SELECT name, basic FROM doctor a, salary b WHERE a.id=b.id;";
        ResultSet res = smtp.executeQuery(sql);
        while(res.next())
        {
            String a = res.getString("name");
            Double b = res.getDouble("basic");
            System.out.println(a + " - " + b + ".");
        }
        /*res.next();
        int a = res.getInt("count(*)");
        System.out.println(a);*/
        res.close();
        smtp.close();
        conn.close();
        System.out.println("Bye!!");
    }
}
