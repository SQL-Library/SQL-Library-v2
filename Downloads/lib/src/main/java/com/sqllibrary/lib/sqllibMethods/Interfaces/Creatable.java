package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.Create;
import com.sqllibrary.lib.sqllibMethods.Secrets;

import java.io.IOException;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) throws IOException {
        if (columns.length != dataTypes.length) throw new IOException("columns and data types length do not match.");
        if (tableName == null || columns == null || dataTypes == null || credentials == null) throw new IOException("cannot pass in null arguments.");
        create.createNewTable(tableName, columns, dataTypes, credentials);
    }

    static void insertIntoTable(String tableName, String[] columns, String[] dataTypes, String[] values, Secrets credentials) throws IOException{
        int len = columns.length;
        if (len != dataTypes.length || len != values.length) throw new IOException("columns, dataTypes, and values length do not match.");
        if (tableName == null || columns == null || dataTypes == null || values == null || credentials == null) throw new IOException("cannot pass in null arguments.");
        // if contains ', ask user to put ''
        create.insertIntoTable(tableName, columns ,dataTypes, values, credentials);
    }

    static void createNewColumn(String tableName, String columnName, String dataType, Secrets credentials) throws IOException{
        if (tableName == null || columnName == null || dataType == null || credentials == null) throw new IOException("cannot pass in null arguments.");
        create.createNewColumn(tableName, columnName, dataType, credentials);
    }
}
