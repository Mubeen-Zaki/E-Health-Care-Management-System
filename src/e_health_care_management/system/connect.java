/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_health_care_management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Md Mubeen Ali Zaki
 */

    
public class connect{
    static Connection C = null;
    connect() 
    {
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","12MMAZ11");
          }
          catch(Exception e)
          {
              System.out.println("hello");
          }
    }
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection C;
            C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","12MMAZ11");
            Statement stmt=C.createStatement();
          //  stmt.executeUpdate("Create table appointdetails(Name text,DOB text,Gender text,Address text,State text,Pincode int,Contact int,DoctorName text,Timings text,Date text,Department text,LoginID int);Create table appointdetails(Name text,DOB text,Gender text,Address text,State text,Pincode int,Contact int,DoctorName text,Timings text,Date text,Department text,LoginID int);");
          //  stmt.executeUpdate("Create table patient(Name text,DOB text,Gender text,Address text,State text,City text,Pincode int,BloodGroup text,Contact int,LoginID int)");
          // stmt.executeUpdate("Create table doctor(Name text,DOB text,Gender text,Address text,Qualification text,Specialization text,Contact int,LoginID int)");
          // stmt.executeUpdate("Create table logindoc(LoginID int,Password text)");
          //  stmt.executeUpdate("Create table logindoc(LoginID int,Password text)");
           // stmt.executeUpdate("Create table medicine(Name text,InStock int,Manufacture text,Expiry text)");
           // stmt.executeUpdate("Create table roomdetails(RoomNo int,Type text,Charges text)");
           // stmt.executeUpdate("Create table warddetails(WardNo int,Type text,NoOfbeds int,Charges text)");
           // stmt.executeUpdate("Create table docleave(Name text,Department text,Designation text,Address text,Contact int,LeaveFrom int,LeaveTo int,Days int,Reason text,Type text,Sign text)");              
        } 
        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    
}
