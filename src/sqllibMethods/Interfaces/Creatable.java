package sqllibMethods.Interfaces;

import sqllibMethods.Implements.Create;
import sqllibMethods.Secrets;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String query, Secrets secrets) {
        create.createNewTable(query, secrets);
    }
}
