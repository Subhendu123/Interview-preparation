package com.personal.hackerank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample02 {

	public static void main(String[] args) {
		
		HashMap<IntegerArgument, Integer> map = new HashMap<IntegerArgument, Integer>();
		
//		Player player1 = new Player("SUBHENDU",100);
//		Player player2 = new Player("Rahul",100);
//		Player player3 = new Player("Krishanu",200);
//		Player player4 = new Player("Ghoton",170);
		
		IntegerArgument input1 = new IntegerArgument(1);
		IntegerArgument input2 = new IntegerArgument(1);
		IntegerArgument input3 = new IntegerArgument(1);
		
	
		map.put(input1, 1);
		map.put(input2, 2);
		
		for(IntegerArgument p : map.keySet()) {
			System.out.println(p + " values -  "+map.get(p));
		}
		System.out.println(map.get(input3));
	}
	
}
