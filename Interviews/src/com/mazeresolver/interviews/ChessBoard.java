package com.mazeresolver.interviews;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
	private static int count  = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//20 my - 19 act
		System.out.println(reductionCost(list));

	}
	
	public static int reductionCost(List<Integer> num) {
	    // Write your code here
		int temp = 0;
		int length = num.size();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		while(true) {
			//loop
			
			int i = getRandomValue(num.size());
			int j = getRandomValue(num.size()) + 1;
//			System.out.println(j);
			if(j < num.size() && i > -1) {
			temp = num.get(i).intValue() + num.get(j).intValue();
			num.remove(i);
			num.remove(i);
			num.add(temp);
			list.add(temp);
//			System.out.println(num);
			}
			if(i == -1) {
				int sum = 0;
				for(Integer val : list) {
					sum = sum + val;
				}
				output.add(sum);
				break;
			}
				
		}
//		System.out.println(list);
		int result = 0;
		for(Integer op : output) {
			if(op > result)
				result = op;
		}
		return result;

	    }

	private static int getRandomValue(int length) {
		// TODO Auto-generated method stub
		if(count < length) {
			count++;
			if(count == 0)
				return 0;
			return count;
		}else {
			return -1;
		}
		
	}

}
