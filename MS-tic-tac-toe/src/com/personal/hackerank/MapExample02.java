package com.personal.hackerank;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

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
		
		new ChildMain();
		
		// 1 -> []
	
		map.put(input1, 1);// 9 -> [1]
		map.put(input2, 2);// 9 -> [2]
		
		HashMap<String, Integer> mapForTree = new HashMap<String, Integer>();
		
		mapForTree.put("A", 1);
//		mapForTree.put(null, null);
		mapForTree.put("B", 2);
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
		Set s = mapForTree.entrySet();
		Set treeset = mapForTree.entrySet();
		treeset.add(2);
		treeset.forEach( t -> System.out.println(t));
//		new TestMain002().m(null);
	}
	
}

abstract class TestMain003{
	public TestMain003() {
		// TODO Auto-generated constructor stub
		System.out.println("test main 003 - abs");
	}
}
class ChildMain extends TestMain003 {
	
}

class TestMain002{

	public void m(String args){
	 System.out.println("String");
	}
	
	public void m (Object sb){
		System.out.println("Object");
	}
}

