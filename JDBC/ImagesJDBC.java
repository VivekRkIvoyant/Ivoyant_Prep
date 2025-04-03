package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ImagesJDBC {


    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/student";

            String username = "root";
            String password = "VIVEKRK31122002";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url,username,password);
            Statement statement = con.createStatement();

            String query = "create table images(iID int(20) primary key auto_increment, img blob)";
            statement.executeUpdate(query);

            System.out.println("Table Created");

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

