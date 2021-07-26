package com.personal.hackerank;

public class GoldmanSachs_MN_Problem {
	
	public static void main(String[] args) {
//		System.out.println("MMMMO".matches("(.*)M(.*)(.*)N(.*)"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MNMMNNM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("NMMNMNNM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("NNNMM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MNNNMMM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MNN"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MNM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MN"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MM"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("NN"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("NM"));
	}
	
	
	static int findPossibleSmallestNumberMatchingPattern(String pattern) {
		
        if(pattern == null || pattern.isEmpty() || pattern.trim().isEmpty() || !pattern.matches("(.*)[M-N](.*)"))
        return -1;
        
        if(pattern.equals("M"))
        	return 21;
        if(pattern.equals("N"))
        	return 12;
        
        String op = "";
        
        boolean startsWithM = false;
        if(pattern.charAt(0) == 'M')
            startsWithM = true;
        for(int i =0; i<pattern.length();i++){
        	 if(i==0 && startsWithM){
        		 // 2 digit population
        		 int countOfM = howManyMorNsLeft(pattern.substring(i+1), 'M'); 
        		 op = String.valueOf((countOfM+2) * 10 + (countOfM+1));
             }
             else if(i==0 && !startsWithM){
            	// 2 digit population
        		 int countOfM = howManyMorNsLeft(pattern.substring(i+1), 'M'); 
        		 op = String.valueOf((countOfM+1) * 10 + (countOfM+2));
                 
             }
             else {
            	 // 1 digit population for rest of the string
            	 if(pattern.charAt(i) == 'N'){
                     op = op + calculateNValue(op);
                 }
                 if(pattern.charAt(i) == 'M'){
                     int countOfM = howManyMorNsLeft(pattern.substring(i), 'M');
                     op = op + String.valueOf(countOfM);
                 }
                 
             }
           
        }
        return Integer.parseInt(op);
    }
   
    private static String calculateNValue(String op) {
    	
    	int highest = 0;
    	for(int i=0;i<op.length();i++) {
    		int intValue = Integer.parseInt(String.valueOf(op.charAt(i)));
    		if(intValue > highest) {
    			highest = intValue;
    		}
    	}
    	return String.valueOf(highest + 1);
    	
    }
    
    static int howManyMorNsLeft(String pattern, char regex){
        int count = 0;
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i) == regex)
                count++;
        }
        return count;
    }

}
