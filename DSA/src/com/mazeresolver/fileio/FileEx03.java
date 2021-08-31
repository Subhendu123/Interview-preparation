package com.mazeresolver.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx03
{

	public static void main(String[] args) throws IOException
	{
		// 3 constructors can be used - Writer, string file name, File file
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write("My Name is Subhendu");
		pw.println();// can do same thing as buffered writer. As well as the following things
		pw.println(true);
		pw.print("Printing is amazing man!");
		pw.println("See new line without sep method!!! Boy this is amazing!!");
		pw.print(1000);// need to add number not a unicode!!!!
		pw.println("\t need to add number not a unicode!!!!");
		pw.write(100);// will print UNICODE of 100 - D
		pw.print(100);// will print the no 100
		pw.println("This is last line! Fall in love with PW!");
		pw.flush();
		pw.close();

		PrintWriter writer2 = new PrintWriter("file2.txt");
		writer2.write("My Name is kaka");
		writer2.println();// can do same thing as buffered writer. As well as the following things
		writer2.println(true);
		writer2.print("Printing is amazing man!");
		writer2.println("See new line without sep method!!! Boy this is amazing!!");
		writer2.print(2000);// need to add number not a unicode!!!!
		writer2.println("\t need to add number not a unicode!!!!");
		writer2.println("This is last line! Fall in love with PW! Logging off Kaka!");
		writer2.flush();
		writer2.close();

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		PrintWriter output = new PrintWriter(new FileWriter("merged2.txt"));
		String itr = br.readLine();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("file2.txt"));
		String itr2 = bufferedReader.readLine();
		while (itr != null || itr2 != null)
		{
			if (itr != null)
			{
				output.println(itr);
				itr = br.readLine();// reads next line
			} else if (itr2 != null)
			{
				output.println(itr2);
				itr2 = bufferedReader.readLine();// reads next line
			}
		}
		output.flush();
		br.close();
		bufferedReader.close();

		output.close();
	}

}
