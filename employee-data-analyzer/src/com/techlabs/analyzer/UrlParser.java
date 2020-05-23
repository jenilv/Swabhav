package com.techlabs.analyzer;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UrlParser implements IParsable {

	private String url;

	public UrlParser(String url) {
		this.url = url;
	}

	@Override
	public List<Employee> loadEmployees() {
		try {
			List<Employee> employees = new ArrayList<>();
			Scanner scanner = new Scanner(new URL(url).openStream());
			while (scanner.hasNext()) {
				String line = scanner.next();
				String[] lineSplit = line.replaceAll("'", "").split(",");
				int employeeId = Integer.parseInt(lineSplit[0]);
				String employeeName = lineSplit[1];
				String designation = lineSplit[2];
				int managerId = Integer.parseInt(lineSplit[3].equals("NULL") ? "0" : lineSplit[3]);
				SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yy");
				Date dateOfJoining = null;
				try {
					dateOfJoining = sdf.parse(lineSplit[4]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				int salary = Integer.parseInt(lineSplit[5].equals("NULL") ? "0" : lineSplit[5]);
				int commission = Integer.parseInt(lineSplit[6].equals("NULL") ? "0" : lineSplit[6]);
				int departmentNumber = Integer.parseInt(lineSplit[7].equals("NULL") ? "0" : lineSplit[7]);
				employees.add(new Employee(employeeId, employeeName, designation, managerId, dateOfJoining, salary,
						commission, departmentNumber));
			}
			scanner.close();
			return employees;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
