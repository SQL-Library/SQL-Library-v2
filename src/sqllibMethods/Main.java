package sqllibMethods;

import sqllibMethods.Interfaces.Readable;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Secrets credentials = new Secrets();

        credentials.setUrl("jdbc:postgresql://localhost/test");
        credentials.setUsername("apinan");
        credentials.setPassword("admin");

//        String[] columnsLabels = {"first_name", "last_name", "username", "friends", "companies"};
//        print(Readable.readDB("users", columnsLabels, credentials));
    }

    public static void print(LinkedList<String[]> databaseData) {
        for (String[] s : databaseData) {
            for (String item : s) {
                System.out.print(item + ",");
            }

            System.out.println();
        }
    }
}
