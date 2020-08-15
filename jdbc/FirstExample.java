package jdbc;
import java.sql.*;

public class FirstExample {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "org.postgresql.Driver";  
	   static final String DB_URL = "jdbc:postgresql://localhost:5432/Training";

	   //  Database credentials
	   static final String USER = "postgres";
	   static final String PASS = "tiger";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("org.postgresql.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT empid, empname, salary FROM employee";
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("empid");
	         String name = rs.getString("empname");
	         double salary = rs.getDouble("salary");
	         
	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", Name: " + name);
	           System.out.println(", salary: " + salary);
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   System.out.println("Goodbye!");
	}
	}