package com.techlabs.composite.html.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.techlabs.composite.html.Control;
import com.techlabs.composite.html.ControlGroup;

public class CompositeTest {

	public static void main(String[] args) {
		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		ControlGroup p1 = new ControlGroup("p");
		p1.addControl(new ControlGroup("span"));
		p1.addControl(new Control("input", "text", "first name"));
		ControlGroup p2 = new ControlGroup("p");
		p2.addControl(new ControlGroup("span"));
		p2.addControl(new Control("input", "text", "password"));
		ControlGroup p3 = new ControlGroup("p");
		p3.addControl(new ControlGroup("span"));
		p3.addControl(new Control("input", "submit", "login"));
		div.addControl(p1);
		div.addControl(p2);
		div.addControl(p3);
		body.addControl(div);
		html.addControl(body);
		System.out.println(html.parseHtml().toString());

		File file = new File("./test.html");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(html.parseHtml().toString());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
