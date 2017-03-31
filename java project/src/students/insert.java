package students;


import java.sql.*;

//package students;
public class insert {
    
  void connection (int id ,String fname, String lname, String email,String phone){
  
    try{
    Connection mycon =DriverManager.getConnection("jdbc:mysql://localhost:3306/students?autoReconnect=true&useSSL=false", "root", "kimo");
    
    Statement  mystat=mycon.createStatement();
    String sql ="insert into student "+"(id,fname,lname,phone,email)"+
            "values('"+id+"','"+fname+"','"+lname+"','"+phone+"','"+email+"')";
    mystat.executeUpdate(sql);
    
    }
    catch(Exception exc){
    exc.printStackTrace();
    
    }
 
  }
   
   void insertFun (int id ,String fname, String lname, String email,String phone){
   
   
   
   
   
   }
    
    
    
}
