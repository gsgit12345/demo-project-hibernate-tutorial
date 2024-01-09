package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    //https://stackoverflow.com/questions/60964196/how-does-spring-boot-connect-localhost-mysql-in-k8s
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try{
            //default.svc.cluster.local
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:8080/practice","root","password");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            System.out.println( "Hello World!" );
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        e.printStackTrace();
        }
    }
}



