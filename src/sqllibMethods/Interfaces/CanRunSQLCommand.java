package sqllibMethods.Interfaces;

import sqllibMethods.Implements.RunSQLCommand;

public interface CanRunSQLCommand {

    RunSQLCommand runCommand = new RunSQLCommand();

    static void runSQLCommand(String query, Secrets credentials) {
        runCommand.runSQLCommand(query, credentials);
    }
}
