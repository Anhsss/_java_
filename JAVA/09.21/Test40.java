package edu;
//import java.util.Scanner;
//import java.util.Random;

public class Test40{
	public static void main(String[] args) {
		int[][] A = new int[2][3];	
		int[][] B = new int[3][4];	
		int[][] C = new int[2][4];	
		 
		for(int i = 0; i < 2; i++) {	
			for(int j = 0; j < 4; j++) {	
				for(int k = 0; k < 3; k++) {	
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		 
		}
	}
}