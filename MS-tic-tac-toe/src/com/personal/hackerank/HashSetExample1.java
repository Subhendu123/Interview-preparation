package com.personal.hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Player> hashSet = new HashSet<Player>();
		hashSet.add(new Player("SUBHENDU",100));
		hashSet.add(new Player("Rahul",100));
		hashSet.add(new Player("KRISHANU",170));
		hashSet.add(new Player("Ghoton",100));
		hashSet.add(new Player("KAKA",500));
		hashSet.add(new Player("Gumpe",150));
//		Comparator c = new Checker();
		
//		Arrays.sort(hashSet.toArray(), c);
		
		Iterator itrHash = hashSet.iterator();
		while(itrHash.hasNext())
			System.out.println(itrHash.next());
		
		System.out.println("------*********** ------");
		
		TreeSet<Player> treeSet = new TreeSet<Player>(new Checker());
		treeSet.addAll(hashSet);
		Iterator<Player> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
