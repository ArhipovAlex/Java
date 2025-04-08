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
        String connectionString =
        "jdbc:sqlserver://localhost:1433;"+
                "DataSource=DESKTOP-CU1U64A;" +
                "Database=PD_212;" +
                "user=PHP;" +
                "password=111;" +
                "ConnectTimeout=30;Encrypt=True;" +
                "TrustServerCertificate=True;";
        Connector connector = new Connector(connectionString);
        String query =
                "SELECT " +
                        "FORMATMESSAGE(N'%s %s %s', last_name, first_name, middle_name) AS N'Студент', "+
                        "group_name, "+
                        "direction_name "+
                        "FROM Students JOIN Groups ON ([group]=group_id) JOIN Directions ON (direction=direction_id)";
        System.out.println(query);
        String scalarQuery = "SELECT COUNT(*) FROM Students";
        System.out.println(connector.Scalar(scalarQuery));
        connector.Select(query);

    }
}