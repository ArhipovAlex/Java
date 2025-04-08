/*package org.example;

import java.sql.*;

public class Connector {
    String connectionString;
    Connection connection;
    public Connector(String connectionString)
    {
        this.connectionString = connectionString;
        try {

        connection = DriverManager.getConnection(connectionString);
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    public int Scalar(String query)
    {
        int scalar =-1;
        try(Statement statement = connection.createStatement())
        {
            scalar = statement.executeUpdate(query);
            System.out.println(scalar);
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        return scalar;
    }
    public void Select(String query)
    {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();

            while (resultSet.next()) {
                for(int i=1;i<=metaData.getColumnCount(); i++){
                    System.out.print(resultSet.getObject(i) + "\t");
                }
                System.out.println();
            }
            resultSet.close();
            //connection.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}*/
