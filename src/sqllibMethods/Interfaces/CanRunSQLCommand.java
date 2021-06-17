package sqllibMethods.Interfaces;

import sqllibMethods.Implements.RunSQLCommand;
import sqllibMethods.Secrets;

public interface CanRunSQLCommand {

    RunSQLCommand runCommand = new RunSQLCommand();

    static void runSQLCommand(String query, Secrets credentials) {
        runCommand.runSQLCommand(query, credentials);
    }
}
