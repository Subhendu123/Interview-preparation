package com.personal.hackerank;

public class Finastra {

	public static void main(String[] args) {
//		System.out.println("ABC");
		
//		String s = String.valueOf(ar);
		int N = 80;
		String s = new String();
		if(N > 0) {
			s = String.valueOf(N);
		}
		else {
			s = String.valueOf((-1)*N);
		}
		char[] ar = new char[s.length()+1];
		int j = 0;
		boolean is5Inserted = false;
		for(int i =0;i< s.length();i++) {
			if(s.charAt(i) < '5' && !is5Inserted) {
				is5Inserted = true;
				char temp = s.charAt(i);
				ar[j] = '5';
				ar[j+1]=temp;
				j=j+2;
			}else {//6
				ar[j] = s.charAt(i);
				j++;
			}
		}
		if(!is5Inserted && N < 0) {
			s = "-5" + s;
			ar = s.toCharArray();
		}
		if(!is5Inserted && N > 0) {
			s = s + "5";
			ar = s.toCharArray();
		}
		
//		return Integer.valueOf(String.valueOf(ar).trim());
		System.out.println(Integer.valueOf(String.valueOf(ar).trim()));
		
		
	}

}
