package edu;
//import java.util.Scanner;
//import java.util.Random;

public class Test39{
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		int[][] b = new int[4][5];
		int[][] c = new int[3][5];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				for(int k = 0; k < a[i].length; k++) {
					System.out.print("i = " + i + " j = " + j + " k = " + k + "\n");
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	}
}