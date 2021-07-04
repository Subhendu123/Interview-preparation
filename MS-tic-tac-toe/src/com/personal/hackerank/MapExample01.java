package com.personal.hackerank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample01 {

	public static void main(String[] args) {
		
		LinkedHashMap<Player, Integer> map = new LinkedHashMap<Player, Integer>();
		
		Player player1 = new Player("SUBHENDU",100);
		Player player2 = new Player("Rahul",100);
		Player player3 = new Player("Krishanu",200);
		Player player4 = new Player("Ghoton",170);
		
		
		map.put(player1, 1);
		map.put(player2, 2);
		map.put(player3, 3);
		map.put(null, 0);
		map.put(player4, 4);
		
		// Trying to Sort it using treeMap
//		TreeMap<Player, Integer> treeMap = new TreeMap<Player, Integer>(new Checker());
//		treeMap.putAll(map);
		
		for(Player p : map.keySet()) {
			System.out.println(p + " values -  "+map.get(p));
		}
		
	}
	
}
