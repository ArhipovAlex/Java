package org.example;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String connectionString =
                "jdbc:sqlserver://localhost:1433;"+
                        "DataSource=DESKTOP-CU1U64A;" +
                        "Database=PD_212;" +
                        "user=PHP;" +
                        "password=111;" +
                        "ConnectTimeout=30;Encrypt=True;" +
                        "TrustServerCertificate=True;";
        try(Connection connection = DriverManager.getConnection(connectionString))
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Directions");
            while (resultSet.next()){
                byte id = resultSet.getByte("direction_id");
                String name = resultSet.getNString("direction_name");
                System.out.println(id + "\t" + name);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}