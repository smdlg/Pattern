package builder;

import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;
	@Override
	public void makerTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("<html><head><title>"+ title + "</title></head><body>");
		writer.println("<h1>"+ title+"</h1>");

	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
