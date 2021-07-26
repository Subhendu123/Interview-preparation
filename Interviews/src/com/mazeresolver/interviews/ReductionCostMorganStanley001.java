package com.mazeresolver.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ReductionCostMorganStanley001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		// 20 my - 19 act
		System.out.println("SUM IS "+reductionCostImpl(list));
		
		find2ndHighest();

	}

	public static int reductionCostImpl(List<Integer> input) {

		int sum = 0;
		
		while(true) {
			Collections.sort(input);
			int tempSum = input.get(0) + input.get(1);
			sum = sum + tempSum;
			input.remove(0);
			input.remove(0);
			input.add(tempSum);
			if(input.size() == 1)
				break;
		}
		return sum;
	}

	public static void find2ndHighest() {
		int[] input = {1,2,3,1,5,10,15};
		
		int high = 0;
		int prevHigh = high;
		int thirdHigh = prevHigh;
		for(int i=0;i<input.length;i++) {
			if(input[i] > high) {
				thirdHigh = prevHigh;
				prevHigh = high;
				high = input[i];
			}
		}
		
		System.out.println(prevHigh);
		System.out.println(high);
		System.out.println(thirdHigh);
	}

	
}
