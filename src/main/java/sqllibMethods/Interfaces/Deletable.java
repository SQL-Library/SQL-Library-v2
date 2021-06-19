package sqllibMethods.Interfaces;

import sqllibMethods.Implements.Delete;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query, Secrets credentials) {
        delete.deleteTable(query, credentials);
    }
}
