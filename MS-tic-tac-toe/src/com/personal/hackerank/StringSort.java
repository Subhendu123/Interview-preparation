package com.personal.hackerank;

public class StringSort {
	public static final String ASC = "Ascending";

	public static void main(String[] args) {
		String s = "zabbaxxc";
		char[] strArr = sortInDemand(s, ASC);
		System.out.println(new String(strArr));
	}

	private static char[] sortInDemand(String inputString, String sortingOrder) {
		char[] strArr = inputString.toCharArray();

		for (int i = 0; i < inputString.length(); i++) {
			int tempASCII = (int) strArr[i];
			int index = i;
			for (int j = i + 1; j < inputString.length(); j++) {
				if (sortingOrder.equalsIgnoreCase(ASC) ? tempASCII > (int) strArr[j] : tempASCII < (int) strArr[j]) {
					tempASCII = (int) strArr[j];
					index = j;
				}
			}
			if (index != i) {
				char temp = strArr[i];
				strArr[i] = strArr[index];
				strArr[index] = temp;
			}
		}
		return strArr;
	}

}
