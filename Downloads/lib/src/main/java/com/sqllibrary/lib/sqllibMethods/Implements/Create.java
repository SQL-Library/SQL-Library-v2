package com.sqllibrary.lib.sqllibMethods.Implements;

import com.sqllibrary.lib.sqllibMethods.Interfaces.Creatable;
import com.sqllibrary.lib.sqllibMethods.Secrets;

public class Create extends SQL implements Creatable {

    public void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) {

        String query = String.format("CREATE TABLE %s(", tableName);

        for (int i=0; i<columns.length; i++) {
            if (i != columns.length-1) query += columns[i] + " " + dataTypes[i] + ",";
            else query += columns[i] + " " + dataTypes[i];
        }

        query += ")";
        SQLCommand(query, credentials);
    }

    public void insertIntoTable(String tableName, String[] columns, String[] dataTypes, String[] values, Secrets credentials) {
        String query = String.format("INSERT INTO %s(", tableName);

        for (int i=0; i<columns.length; i++) {
            if (i != columns.length-1) query += columns[i] + ",";
            else query += columns[i];
        }

        query += ")\n";
        System.out.println(query);
        query += "VALUES (";

        // also check which datatype it is to remove '' when its a number(contains INT, float (check sql data types)) and keep '' if its a text/longtext
        for (int i=0; i<columns.length; i++) {
            if (i != columns.length-1) query += "'" + values[i] + "',";
            else query += "'" + values[i] + "'";
        }

        query += ")";
        SQLCommand(query, credentials);
    }

    public void createNewColumn(String tableName, String columnName, String dataType, Secrets credentials) {
        String query = String.format("ALTER TABLE %s\nADD %s %s", tableName, columnName, dataType);
        System.out.println(query);
        SQLCommand(query, credentials);
    }
}
