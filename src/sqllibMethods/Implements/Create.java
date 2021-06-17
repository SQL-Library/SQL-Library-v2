package sqllibMethods.Implements;

import sqllibMethods.Interfaces.Creatable;
import sqllibMethods.Secrets;

public class Create extends SQL implements Creatable {

    public void createNewTable(String query, Secrets credentials) {
        SQLCommand(query, credentials);
    }

    public void createNewObject(String query) {

    }
}
