package sqllibMethods.Interfaces;

import sqllibMethods.Implements.Delete;
import sqllibMethods.Secrets;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query, Secrets credentials) {
        delete.deleteTable(query, credentials);
    }
}
