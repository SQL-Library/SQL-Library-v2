package sqllibMethods.Implements;

import sqllibMethods.Interfaces.Secrets;

public class RunSQLCommand extends SQL{

    public void runSQLCommand(String query, Secrets credentials) {
        SQLCommand(query, credentials);
    }
}
