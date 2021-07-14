package com.personal.hackerank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapExample02 {

	public static void main(String[] args) {
		
		HashMap<IntegerArgument, Integer> map = new HashMap<IntegerArgument, Integer>();
		
//		Player player1 = new Player("SUBHENDU",100);
//		Player player2 = new Player("Rahul",100);
//		Player player3 = new Player("Krishanu",200);
//		Player player4 = new Player("Ghoton",170);
		
		IntegerArgument input1 = new IntegerArgument(1);
		IntegerArgument input2 = input1;
		IntegerArgument input3 = input2;
		
		// 1 -> []
	
		map.put(input1, 1);// 9 -> [1]
		map.put(input2, 2);// 9 -> [2]
		
//		System.out.println(map.size());
//		
//		for(IntegerArgument p : map.keySet()) {
//			System.out.println(map.get(p));
//		}
//		System.out.println(map.get(input3));
		// other code
		
		// async. controller 2 calling...
		
		// return ResponseEntity.statuscode.Accepted;
		//sddsds
		new TestMain002().m(null);
	}
	
}

class TestMain002{

	public void m(String args){
	 System.out.println("String");
	}
	
	public void m (Object sb){
		System.out.println("Object");
	}
}

