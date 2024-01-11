package com.test;

import java.util.Scanner;

public class DiamondPattern {
	
	public void getPattern(int size) {
		
		for(int index1=1;index1<=size;index1++) {
			for(int index2=1;index2<=size-index1;index2++) {
				System.out.print(" ");
			}
			for(int index2=1;index2<=index1;index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int index1=1;index1<size;index1++) {
			for(int index2=0;index2<index1;index2++) {
				System.out.print(" ");
			}
			for(int index2=size-1;index2>=index1;index2--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size : ");
		int size = scanner.nextInt();
		DiamondPattern diamondPattern = new DiamondPattern();
		diamondPattern.getPattern(size);
		scanner.close();
	}

}
