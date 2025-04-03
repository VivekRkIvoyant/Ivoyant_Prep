package org.example.DatabaseConnection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class)) {
            DatabaseOperations databaseOperations = context.getBean(DatabaseOperations.class);
            DataBaseConnection dataBaseConnection = context.getBean(DataBaseConnection.class);

            dataBaseConnection.init();
            databaseOperations.init();
            databaseOperations.transactions();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

