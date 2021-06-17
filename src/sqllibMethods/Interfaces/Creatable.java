package sqllibMethods.Interfaces;

import sqllibMethods.Implements.Create;
import sqllibMethods.Secrets;

import java.io.IOException;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) throws IOException {
        if (columns.length != dataTypes.length) throw new IOException("columns and data types length do not match.");
        if (tableName == null || columns == null || dataTypes == null || credentials == null) throw new IOException("cannot pass in null arguments.");
        create.createNewTable(tableName, columns, dataTypes, credentials);
    }
}
