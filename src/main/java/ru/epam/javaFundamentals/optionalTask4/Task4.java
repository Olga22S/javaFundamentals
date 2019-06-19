package ru.epam.javaFundamentals.optionalTask4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int matrixSize = scanner.nextInt();
		int[][] matrix = getMatrix(matrixSize);	
		int maxMatrixNumber = 0;
		int rowMaxNumber = 0;
		int columnMaxNumber = 0;	
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (maxMatrixNumber <= matrix[i][j]) {
					maxMatrixNumber = matrix[i][j];
					rowMaxNumber = i;
					columnMaxNumber = j;
				}
			}
		}	
		int[][] newMatrix = getMatrixWithoutMaxNumberRowAndColumn(matrix, rowMaxNumber, columnMaxNumber);
		printMatrix(matrix);
		System.out.println("\nMaximum number in matrix: " + maxMatrixNumber);			
		printMatrix(newMatrix);	
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
	
	private static int[][] getMatrix(int matrixSize){
		Random random = new Random();
		int[][] matrix = new int[matrixSize][matrixSize];
		int min = -'M';
		int max = 'M';
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.ints(1, min, max + 1).findFirst().getAsInt();
			}
		}
		return matrix;
	}
	private static int[][] getMatrixWithoutMaxNumberRowAndColumn(int[][] matrix, int row, int column){
		int new_row = 0;
		int new_column = 0;
		int matrixSize = matrix.length;
		int newMatrixSize = matrixSize - 1;
		int[][] newMatrix = new int[newMatrixSize][newMatrixSize];

		for (int i = 0; i < matrixSize; i++) {
			if (i != row) {
				for (int j = 0; j < matrixSize; j++) {
					if (j != column) {
						newMatrix[new_row][new_column] = matrix[i][j];
						new_column++;
					}
				}
				new_column = 0;
				new_row++;
			}
		}	
		return newMatrix;
	}
}
