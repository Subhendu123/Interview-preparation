package com.mazeresolver.interviews;

public class LoveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// e.g. hello there , 2
		// op: 1 (turu noy)
		// explanation: llohe ereth
		System.out.println(isTuruLove("hello there", 2));
		System.out.println(isTuruLove("abab", 2));
		System.out.println(isTuruLove("abcdabcd", 4));
	}

	public static int isTuruLove(String s, int k) {
		String[] splitted = s.split(" ");
		String op = "";
		for (String str : splitted) {
			if (op.equals(""))
				op = op + str.substring(k).concat(str.substring(0, k));
			else
				op = op.concat(" ").concat(str.substring(k).concat(str.substring(0, k)));
		}
		return op.equals(s) ? 0 : 1;
	}

}
