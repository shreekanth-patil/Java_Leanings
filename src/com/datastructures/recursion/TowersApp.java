package com.datastructures.recursion;

public class TowersApp {

	static int nDisks = 3;

	public static void main(String[] args) {
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int topN, char from_tower, char intermidiate_tower, char to_tower) {
		if (topN == 1)
			System.out.println("Disk 1 from " + from_tower + " to " + to_tower);
		else {
			doTowers(topN - 1, from_tower, to_tower, intermidiate_tower); // from-->inter
			System.out.println("Disk " + topN + " from " + from_tower + " to " + to_tower);
			doTowers(topN - 1, intermidiate_tower, from_tower, to_tower); // inter-->to
		}
	}

}
