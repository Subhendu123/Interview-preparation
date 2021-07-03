package com.personal.hackerank;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Player> treeSet = new TreeSet<Player>(new Checker());
		treeSet.add(new Player("SUBHENDU",100));
		treeSet.add(new Player("Rahul",100));
		treeSet.add(new Player("KRISHANU",170));
		treeSet.add(new Player("Ghoton",100));
		treeSet.add(new Player("KAKA",500));
		treeSet.add(new Player("Gumpe",150));
		
		Iterator<Player> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
