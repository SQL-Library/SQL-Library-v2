package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.Create;

import java.io.IOException;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) throws IOException {
        if (columns.length != dataTypes.length) throw new IOException("columns and data types length do not match.");
        if (tableName == null || columns == null || dataTypes == null || credentials == null) throw new IOException("cannot pass in null arguments.");
        create.createNewTable(tableName, columns, dataTypes, credentials);
    }

    static void InsertIntoTable(String tableName, String[] columns, String[] values) {
        // when db is all string values
        // if contains ', ask user to put ''
    }
}
