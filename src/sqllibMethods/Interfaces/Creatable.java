package sqllibMethods.Interfaces;

import sqllib.Implements.Create;
import sqllib.Secrets;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String query, Secrets secrets) {
        create.createNewTable(query, secrets);
    }
}
