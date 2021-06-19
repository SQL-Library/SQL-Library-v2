package com.sqllibrary.lib.sqllibMethods.Interfaces;

import com.sqllibrary.lib.sqllibMethods.Implements.RunSQLCommand;
import com.sqllibrary.lib.sqllibMethods.Secrets;

public interface CanRunSQLCommand {

    RunSQLCommand runCommand = new RunSQLCommand();

    static void runSQLCommand(String query, Secrets credentials) {
        runCommand.runSQLCommand(query, credentials);
    }
}
