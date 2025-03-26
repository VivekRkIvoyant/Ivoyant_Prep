package JDBC;

import java.sql.*;

public class InsertData {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String uname = "root";
            String pass = "VIVEKRK31122002";
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, uname, pass);

            String query = "INSERT INTO table1 (tName,tCity) values (?,?)";
            PreparedStatement statement = con.prepareStatement(query);

//            set values to query
            statement.setString(1,"Vivek");
            statement.setString(2,"Davangere");

            statement.executeUpdate();
//            mandate message
            System.out.println("Record inserted");

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

