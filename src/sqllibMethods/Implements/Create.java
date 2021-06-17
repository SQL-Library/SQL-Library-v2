package sqllibMethods.Implements;

import sqllibMethods.Interfaces.Creatable;
import sqllibMethods.Secrets;

public class Create extends SQL implements Creatable {

    public void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) {

        String query = String.format("CREATE TABLE %s(", tableName);

        for (int i=0; i<columns.length; i++) {
            if (i != columns.length-1) query += columns[i] += " " + dataTypes[i] + ",";
            else query += columns[i] += " " + dataTypes[i];
        }

        query += ")";
        System.out.println(query);
        SQLCommand(query, credentials);
    }

    public void insertIntoTable() {
        // complete function
    }
}
