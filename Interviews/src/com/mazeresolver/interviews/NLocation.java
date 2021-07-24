package com.mazeresolver.interviews;

import java.util.HashMap;
import java.util.Map;

public class NLocation {

	public static void main(String[] args) {
		System.out.println(countHighest(10));
	}

	public static int countHighest(int input) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int in = input;
		while (in > 0) {
			int i = in;
			int count = 0;
			while (i > 1) {
				if (i % 2 == 0)
					i = i / 2;
				else
					i = 3 * i + 1;
				count++;
			}
			map.put(in, count);
			in--;
		}
		int highestKey = 0;
		int highestVal = 0;
		for (Integer key : map.keySet()) {
			Integer val = map.get(key);
			if (val > highestVal) {
				highestKey = key;
				highestVal = val;
			}
		}
		
		return highestKey;

	}

}
