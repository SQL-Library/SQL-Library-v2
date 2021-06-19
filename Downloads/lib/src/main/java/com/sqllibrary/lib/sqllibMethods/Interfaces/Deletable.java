package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.Delete;
import com.sqllibrary.lib.sqllibMethods.Secrets;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query, Secrets credentials) {
        delete.deleteTable(query, credentials);
    }
}
