package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.RunSQLCommand;

public interface CanRunSQLCommand {

    RunSQLCommand runCommand = new RunSQLCommand();

    static void runSQLCommand(String query, Secrets credentials) {
        runCommand.runSQLCommand(query, credentials);
    }
}
