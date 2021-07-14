package com.personal.hackerank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MorganStanley02 {

	public static void main(String[] args) {
//		String colors = "wwwbbbbwww";
		String colors = "wwwbb";
		StringBuffer sb = new StringBuffer(colors);
		
		
		 if(colors.length() <= 2){
	            //return "Bob";
	        }
	        else if(colors.length() > 2){
	        	int winIndex = 1;
	        	String tempWinner = "";
	        	while(winIndex > 0) {
	        		if(colors.indexOf("www") >= 0 || colors.indexOf("bbb") >= 0) {
	        			if(winIndex % 2 == 0) {
	        				int i = colors.indexOf("bbb");
			        		System.out.println(i);
			        		sb.deleteCharAt(i+1);
			        		System.out.println(sb);
			        		System.out.println("**bb**");
	        			}else {
	        				int i = colors.indexOf("www");
			        		System.out.println(i);
			        		sb.deleteCharAt(i+1);
			        		System.out.println(sb);
			        		System.out.println("**ww**");
	        			}
		        	
	        		}else {
		        		// this iteration is looser
		        		tempWinner = (winIndex % 2 == 0) ? "Wendy" : "Bob";
		        		break;
		        	}
	        		colors = sb.toString();
	        		winIndex++;
	        	}
	        	System.out.println(tempWinner);
	        	
	        }
	}
	
}



