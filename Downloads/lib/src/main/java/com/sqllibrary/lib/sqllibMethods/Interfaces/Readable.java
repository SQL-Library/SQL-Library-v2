package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.Read;
import com.sqllibrary.lib.sqllibMethods.Secrets;

import java.util.LinkedList;

public interface Readable {

    Read read = new Read();

    static LinkedList<String[]> readDB(String tableName, String[] columnLabels, Secrets credentials) {
        return read.readDB(tableName, columnLabels, credentials);
    }
}
