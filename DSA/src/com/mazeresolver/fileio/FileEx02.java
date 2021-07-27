package com.mazeresolver.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx02
{

	public static void main(String[] args) throws IOException
	{

		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write(69);
		writer.newLine();
		writer.write("My name is Subhendu Das.");
		writer.write("\tAnd I m writing this using Buffered Writer");
		writer.newLine();
		writer.newLine();
		writer.append('c');
		writer.flush();
//		fw.close(); - not required, the bufferedwriter will close it internally (as it uses)
		writer.close();

		FileReader fr = new FileReader("abc.txt");
		BufferedReader reader = new BufferedReader(fr);

		String iterator = reader.readLine();
		while (iterator != null)
		{
			System.out.println(iterator);
			iterator = reader.readLine();
		}
		reader.close();
	}

}
