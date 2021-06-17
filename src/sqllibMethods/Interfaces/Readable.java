package sqllibMethods.Interfaces;

import sqllib.Implements.Read;
import sqllib.Secrets;

import java.util.LinkedList;

public interface Readable {

    Read read = new Read();

    static LinkedList<String[]> readDB(String tableName, String[] columnLabels, Secrets credentials) {
        return read.readDB(tableName, columnLabels, credentials);
    }
}
