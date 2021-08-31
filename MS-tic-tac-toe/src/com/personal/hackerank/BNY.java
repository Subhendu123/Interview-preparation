package com.personal.hackerank;

public class BNY
{

	public static void main(String[] args)
	{

		String s1 = "SALLY";
		String s2 = "HARRY";

		StringBuffer str2 = new StringBuffer(s2);

		char[] input1 = s1.toCharArray();

		StringBuffer finalOutput = new StringBuffer();
		int j = 0;

		while (true)
		{
			if (j > s1.length())
				break;

			str2 = new StringBuffer(s2);
//			System.out.println(s1.substring(j) + " : " + str2);
			StringBuffer output = new StringBuffer();

			for (int i = j; i < s1.length(); i++)
			{
				int newElmtPos = str2.indexOf(input1[i] + "");
				// existence check
				if (newElmtPos > -1)
				{
					int lastElmntPos = str2.lastIndexOf("*");
					if (newElmtPos > lastElmntPos)
					{
						int index = str2.indexOf(input1[i] + "");
						str2.replace(index, index + 1, "*");
						output.append(input1[i]);
					}
				}
			}
			if (finalOutput.length() == 0)
			{
				finalOutput = output;
			} else
			{
				finalOutput = output.length() > finalOutput.length() ? output : finalOutput;
			}
			j++;
		}

//		System.out.println("FINAL!!!!!!!");
		System.out.println(finalOutput);

	}

}
