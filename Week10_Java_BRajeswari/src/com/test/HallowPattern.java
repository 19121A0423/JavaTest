package com.test;

import java.util.Scanner;

public class HallowPattern {
	
	public void getPattern(int size) {
		
		for(int index1=0;index1<size;index1++) {
			for(int index2=0;index2<size;index2++) {
				if(index1==0 || index2==0 || index1==size-1 || index2==size-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size : ");
		int size = scanner.nextInt();
		HallowPattern hallowPattern = new HallowPattern();
		hallowPattern.getPattern(size);
		scanner.close();
	}

}
