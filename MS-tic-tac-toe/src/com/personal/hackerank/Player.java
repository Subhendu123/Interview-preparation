package com.personal.hackerank;

import java.util.Comparator;

public class Player{
	
	String name;
    int score;
    
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return 5;
	}

	
//	@Override
//	public int compareTo(Player player) {
//		if(player.score < this.score)
//			return -1;
//		else if(player.score > this.score)
//			return 1;// player1 should come before player 2
//		else {
//			// AMY DAVID - Amy first so -1
//			return player.name.compareTo(this.name) > 0 ? -1 : 1;
//		}
//	}

	
    

}
