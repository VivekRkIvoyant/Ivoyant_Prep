package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbc {
    public static void main(String[] args){
        try {
            String url= "jdbc:mysql://localhost:3306/student";


            String uname = "root";
            String pass = "VIVEKRK31122002";
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url,uname,pass);

            Statement st = con.createStatement();
            String query = "select * from table1";


            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("ID: " + rs.getInt("tID") +
                        ", Name: " + rs.getString("tName") +
                        ", City: " + rs.getString("tCity"));
            }

            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
