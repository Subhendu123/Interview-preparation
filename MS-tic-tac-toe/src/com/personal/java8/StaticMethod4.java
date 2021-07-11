package com.personal.java8;

import java.util.ArrayList;
import java.util.List;

import com.personal.hackerank.Player;

interface Interf1 {
	static void m() {
	}
	public static void main(String[] args) {
		Player p;
		p = new Player("SD", 100);
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(p);
		System.out.println(playerList);
	}
}


public class StaticMethod4 implements Interf1{

	public static void main(String[] args) {
		Interf1.m();
		Interf1.main(args);
		StaticMethod4 test = new StaticMethod4();
//		test.m();
//		StaticMethod4.m();
//		m();
	}

	

}
