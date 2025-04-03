package JDBC;

import java.sql.*;

public class TableJdbc {

    public static void main(String[] args){
        try{
            String url= "jdbc:mysql://localhost:3306/student";
            String uname = "root";
            String pass = "VIVEKRK31122002";
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();


            String query = "create table table1(tID int(20) primary key auto_increment, tName varchar(20) not null, tCity varchar(20) not null)";
            st.executeUpdate(query);
            System.out.println("Table created in database");


            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
