package com.personal.hackerank;

public class Opentext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = -5858; // 585
		Integer aN = new Integer(N);
		char[] charArr = aN.toString().toCharArray();
		char[] charArrOp = new char[aN.toString().length()];
		int j =-1;
		boolean firstfiveIsFound = false;
		if(N > 0) {
			for(int i=0;i<charArr.length;i++) {
				if(charArr[i] == '5' && !firstfiveIsFound)
					firstfiveIsFound = true;
				else if(charArr[i] != '5' || firstfiveIsFound) {
					j++;
					charArrOp[j] = charArr[i];
					
				}
				
			}
		}
		else if(N < 0) {
			int index = aN.toString().lastIndexOf("5");
			for(int i=0;i<charArr.length;i++) {
				if(charArr[i] == '5' && index == i)
					firstfiveIsFound = true;
				else if(charArr[i] != '5' || !firstfiveIsFound) {
					j++;
					charArrOp[j] = charArr[i];
					
				}
				
			}
		}
		else {
			//return 0;
		}
		
		int a = Integer.parseInt(String.valueOf(charArrOp).trim());
		System.out.println(a);
		
		
		
	}

}
