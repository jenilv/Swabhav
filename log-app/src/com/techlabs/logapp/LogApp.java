package com.techlabs.logapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogApp {

	public static void main(String[] args) {

		File file = new File("E:\\Jenil\\java\\db_app.log");
		List<String> infos = new ArrayList<>();
		List<String> errors = new ArrayList<>();
		List<String> warnings = new ArrayList<>();
		List<String> all = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				if (st.contains("INFO")) {
					infos.add(st);
					all.add(st);
				} else if (st.contains("ERROR")) {
					errors.add(st);
					all.add(st);
				} else if (st.contains("WARNING")) {
					warnings.add(st);
					all.add(st);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (args.length != 0) {
			String input = args[0];
			if (input.contains("error")) {
				printLogs(errors);
			} else if (input.contains("warning")) {
				printLogs(warnings);
			} else if (input.contains("info")) {
				printLogs(infos);
			}
		} else {
			printLogs(all);
		}
	}

	private static void printLogs(List<String> list) {
		for (String log : list) {
			System.out.println(log);
		}
	}

}
