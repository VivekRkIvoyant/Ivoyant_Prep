package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoImages {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String uname = "root";
            String pass = "VIVEKRK31122002";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pass);

            String query = "insert into images (img) values (?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            FileInputStream fis = new FileInputStream("wp12534045.jpg");
            preparedStatement.setBinaryStream(1,fis,fis.available());

            preparedStatement.executeUpdate();
            System.out.println("Image Inserted");

        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
