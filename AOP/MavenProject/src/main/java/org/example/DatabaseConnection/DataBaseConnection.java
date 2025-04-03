package org.example.DatabaseConnection;

public class DataBaseConnection {

    private String connection;

    public void init(){
        connection = "Connected to bank database";
        System.out.println("Database Connection Established: "+connection);
    }


    public void destroy(){
        connection = null;
        System.out.println("Database Connection Closed");
    }
}
