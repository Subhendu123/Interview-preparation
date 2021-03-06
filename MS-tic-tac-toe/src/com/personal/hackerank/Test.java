package com.personal.hackerank;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

//import com.sun.tools.classfile.Opcode.Set;

public class Test {

	public static void main(String[] args){
		
//		System.out.println("zabaa".compareTo("zbaa"));
		
		Person P1 = new Person("FN1", "LN1");
		
		Person P2 = new Person("FN2", "LN2");
		
		Map<Person, String> map = new HashMap<Person, String>();
		
		map.put(P1, "FNAME");
		map.put(P2, "2nd");
		
		map.put(new Person("FN1", "LN1"), "OVER");// m1
		
		System.out.println(map.size());//3
		System.out.println(map);//null 
		
		
		
		java.util.Set<Person> set = new HashSet<Person>();
		set.add(P2);
		set.add(null);
		set.add(P1);
		for(Person p : set) {
			System.out.println(p);
		} 
	}

}

