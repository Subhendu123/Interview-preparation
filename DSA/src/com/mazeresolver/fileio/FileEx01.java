package com.mazeresolver.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx01
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int print = 0;
		File f = new File("C:\\MISCwsEclipse\\sql scripts");

		if (f.exists())
		{
			String[] fileList = f.list();
			if (fileList == null || fileList.length == 0)
				print = -1;
			else
			{
				for (String s : fileList)
				{
					if (new File(f, s).isFile())
						System.out.println(s);
				}
			}
		}
//		File f1 = new File("..\\src\\com\\mazeresolver\\fileio", "text.txt");
//		f1.createNewFile();
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(70);
		fw.write("Subhendu");
		fw.write('\n');
		fw.write("Das");
		fw.flush();
		fw.close();
		FileReader reader = new FileReader("abc.txt");
		int i = reader.read();
		while (i != -1)
		{
			System.out.print((char) i);
			i = reader.read();
		}
		reader.close();
		// 2nd approach
		FileReader reader2 = new FileReader("abc.txt");
		char[] ch = new char[1];
		int i2 = reader2.read(ch);
		System.out.println(ch);
		reader.close();
	}

}
