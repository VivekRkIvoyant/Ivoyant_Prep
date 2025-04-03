package org.example.DatabaseConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public DataBaseConnection dataBaseConnection(){
        return new DataBaseConnection();
    }

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public DatabaseOperations databaseOperations(){
        return new DatabaseOperations();
    }
}
