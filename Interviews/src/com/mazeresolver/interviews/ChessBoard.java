package com.mazeresolver.interviews;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

	public static void main(String[] args) {

		System.out.println("Same Row!!");
		System.out.println(minMoves(9, 4, 4, 4, 8)); // 2
		System.out.println("--------------------------------");

		System.out.println("Different!!");
		System.out.println(minMoves(7, 6, 6, 0, 1)); // 5
		System.out.println("**********************");
		System.out.println("Same Column");
		System.out.println(minMoves(7, 5, 2, 1, 2)); //2
		
		System.out.println("Different!!");
		System.out.println(minMoves(8, 7, 4, 6, 7)); // 5

	}

	private static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {

		// TODO Validate the inputs

		//In case both has same cols.
		if(Math.abs(startRow - endRow) % 4 == 0 && startCol == endCol) {
			return (Math.abs(startRow - endRow) / 4 ) * 2;
		}
		
		int count = 0;
		int currentRow = startRow;
		int currentCol = startCol;

		System.out.println("{" + currentRow + "," + currentCol + "}");
		while (true) {

			if (currentRow == endRow && currentCol == endCol)
				break;

			if (Math.abs(currentCol - endCol) == 1) {
				System.out.println(currentRow + " , "+currentCol);
				if (currentCol >= endCol) {
					// go to the left
					currentCol = currentCol - 1;
				} else {
					currentCol = currentCol + 1;
				}
				if (currentRow >= endRow) {
					// go to the left
					currentRow = currentRow - 2;
				} else {
					currentRow = currentRow + 2;
				}

			} else {
				if (currentCol >= endCol) {
					// go to the left
					currentCol = currentCol - 2;
				} else {
					currentCol = currentCol + 2;
				}
				if (currentRow >= endRow) {
					// go to the left
					currentRow = currentRow - 1;
				} else {
					currentRow = currentRow + 1;
				}
			}

			System.out.println("{" + currentRow + "," + currentCol + "}");
			count++;

		}
		return count;
	}
}
