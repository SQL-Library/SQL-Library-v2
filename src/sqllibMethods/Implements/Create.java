package sqllibMethods.Implements;

import sqllibMethods.Interfaces.Creatable;
import sqllibMethods.Secrets;

public class Create extends SQL implements Creatable {

    public void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) {

        String query = String.format("CREATE TABLE %s(", tableName);

        for (int i=0; i<columns.length; i++) {

        }
        query += ")";
        SQLCommand(query, credentials);
    }

    public void createNewObject(String query) {

    }
}
