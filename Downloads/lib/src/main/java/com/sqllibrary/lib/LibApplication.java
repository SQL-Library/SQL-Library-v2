package com.sqllibrary.lib;

import com.sqllibrary.lib.sqllibMethods.Interfaces.Creatable;
import com.sqllibrary.lib.sqllibMethods.Interfaces.Readable;
import com.sqllibrary.lib.sqllibMethods.Interfaces.Secrets;
import java.io.IOException;
import java.util.LinkedList;

public class LibApplication {

	public static void main(String[] args) throws IOException {
		Secrets credentials = new Secrets();

		credentials.setUrl("jdbc:postgresql://localhost/test");
		credentials.setUsername("apinan");
		credentials.setPassword("admin");

		String[] columnsLabels = {"first_name", "last_name", "username", "friends", "companies"};
		print(Readable.readDB("users", columnsLabels, credentials));

		System.out.println("Success -----------------");

		String[] columns = {"vehicleId", "make", "model", "derivative", "PRIMARY"};
		String[] dataTypes = {"INT NOT NULL", "VARCHAR(64)", "VARCHAR(128)", "VARCHAR(255)", "KEY(vehicleId)"};
		Creatable.createNewTable("someTable", columns, dataTypes, credentials);

		System.out.println("Success -----------------");
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
