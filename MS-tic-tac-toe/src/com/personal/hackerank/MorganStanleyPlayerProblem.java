package com.personal.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MorganStanleyPlayerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> availablePlayers = new ArrayList<Integer>();
		availablePlayers.add(4);
		availablePlayers.add(10);
//		availablePlayers.add(15);
		availablePlayers.add(9);
//		availablePlayers.add(7);
//		availablePlayers.add(3);
//		availablePlayers.add(8);
		int minNoOfPlayers = 2;
		int minLevel = 4;
		int maxLevel = 10;
		int numberOfTeams = getNumberOfTeams(availablePlayers, minNoOfPlayers, minLevel, maxLevel);
		System.out.println(numberOfTeams);
	}

	private static int getNumberOfTeams(List<Integer> availablePlayers, int minNoOfPlayers, int minLevel,
			int maxLevel) {
		List<Integer> squad = availablePlayers.stream().filter(availablePlayer -> availablePlayer.compareTo(minLevel) >= 0
				&& availablePlayer.compareTo(maxLevel) <= 0)
		.collect(Collectors.toList());
		availablePlayers.stream().filter(availablePlayer -> availablePlayer.compareTo(minLevel) >= 0
				&& availablePlayer.compareTo(maxLevel) <= 0);
		System.out.println(availablePlayers);
		
		if(squad.size() < minNoOfPlayers)
			return 0;
		else if(squad.size() == minNoOfPlayers)
			return 1;
		else
			return (fact(squad.size()) / fact(minNoOfPlayers)) / fact(squad.size()-minNoOfPlayers) + 1;
	}
	
	public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

}
