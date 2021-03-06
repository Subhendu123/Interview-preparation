package com.personal.hackerank;

import java.util.Arrays;

public class MShackerrankString {

	public static void main(String[] args) {
		String s = "baccc";
		Exception e;
		int k = 2;
		// Inputs Recommended: baccc baazbb zbbaaa zqqbqbba
		String output = getLargestString(s, k);
		System.out.println(output);
	}

	private static String getLargestString(String s, int k) {
		boolean isTrimReqd = false;
		char[] a = s.toCharArray();
		char[] tempOutput = a.clone();
		char[] finalOutput = new char[s.length()];
		int index = 0;
		// Sort the input array alphabetically
		Arrays.sort(tempOutput);
		//Reverse the array - so that it can be lexicographically compared
		for (int i = tempOutput.length - 1; i > -1; i--, index++) {
			finalOutput[index] = tempOutput[i];
		}

		for (int i = 0; i < finalOutput.length; i++) {
			for (int j = i + 1, duplicate = 0; j < finalOutput.length; j++) {
				if (finalOutput[i] == finalOutput[j]) {
					duplicate++;
					// Check if the duplicate is found more than the acceptable no. of times
					if (duplicate == k) {
						if (j + 1 == finalOutput.length) {
							// Trim this last character - as no replacement found - reached the end of the string
							isTrimReqd = true;
						} else {
							// swap
							char temp = finalOutput[j];
							finalOutput[j] = finalOutput[j + 1];
							finalOutput[j + 1] = temp;
						}
					}
				}
			}
		}
		return isTrimReqd ? new String(finalOutput).substring(0, finalOutput.length - 1) : new String(finalOutput);
	}

}
