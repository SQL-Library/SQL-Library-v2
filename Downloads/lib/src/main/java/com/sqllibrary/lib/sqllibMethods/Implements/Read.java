package com.sqllibrary.lib.sqllibMethods.Implements;

import com.sqllibrary.lib.sqllibMethods.Interfaces.Secrets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class Read extends SQL {

    public LinkedList<String[]> readDB(String tableName, String[] columnLabels, Secrets credentials) {
        LinkedList<String[]> databaseData = new LinkedList<>();

        try {
            // get a connection to database
            Connection connection = DriverManager.getConnection(credentials.getUrl(), credentials.getUsername(), credentials.getPassword());

            // create a statement
            Statement statement = connection.createStatement();

            // insert data into database
            String query = String.format("SELECT * FROM %s", tableName);
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                String[] rowContents = new String[columnLabels.length];

                for (int i=0; i<columnLabels.length; i++) {
                    rowContents[i] = result.getString(columnLabels[i]);
                }

                databaseData.add(rowContents);
            }

            // close connection to server
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseData;
    }
}
