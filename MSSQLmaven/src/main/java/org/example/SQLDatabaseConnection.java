package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabaseConnection {
    String connectionString =
            "jbdc:sqlserver://localhost:1433"+
            "DataSource=DESKTOP-CU1U64A;" +
                    "Database=PD_212;" +
                    "user=PHP;" +
                    "password=111;" +
                    "ConnectTimeout=30;Encrypt=True;" +
                    "TrustServerCertificate=True;";
    Connection connection;
    public SQLDatabaseConnection()
    {
        try(Connection connection = DriverManager.getConnection(connectionString))
        {
            this.connection = connection;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

}
