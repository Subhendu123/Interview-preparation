package com.personal.hackerank;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		// TODO Auto-generated method stub
		if(player1.score < player2.score)
			return -1;
		else if(player1.score > player2.score)
			return 1;// player1 shoudl come before player 2
		else {
			// AMY DAVID - Amy first so -1
			return player1.name.compareTo(player2.name) > 0 ? 1 : -1;
		}
	}

}
