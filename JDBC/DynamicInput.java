package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInput {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String uname = "root";
            String pass = "VIVEKRK31122002";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);

            String query = "INSERT INTO table1 (tName,tCity) values (?,?)";
            PreparedStatement statement = con.prepareStatement(query);

            BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name: ");


            String name = bR.readLine();
            System.out.println("Enter the City: ");

            String city = bR.readLine();

            statement.setString(1,name);
            statement.setString(2,city);

            statement.executeUpdate();
//            mandate message
            System.out.println("Record inserted");

            con.close();

        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


