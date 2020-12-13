package com.ctci;

public class RotateMatrix {
    /*
        Doing this algorithm in two steps. Since this an N*N matrix, we can transpose the matrix and then
        flip it symmetrically which would help us in getting a 90 degree rotated matrix

     */
    boolean rotateMatrix(int[][] matrix) {
        int matrixLength = matrix.length;
        if (matrix.length != matrix[0].length) {
            return false;
        } else {
            int temp;
            // Obtaining the transpose of matrix
            for (int i = 0; i < matrixLength; i++) {
                for (int j = 1; j < matrixLength; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Flipping the matrix symmetrically

            for (int i = 0; i < matrixLength; i++) {
                for (int j = 0; j < matrixLength / 2; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrixLength - 1 - j];
                    matrix[i][matrixLength - 1 - j] = temp;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1, 2, 3}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrix(matrix);
        boolean rotated = rm.rotateMatrix(matrix);
        if(rotated) {
            System.out.println("After rotating 90 degree: \n");
            printMatrix(matrix);
        }
        else
        {
            System.out.println("\nNot an N*N matrix");
        }
    }

    // Helper function to print matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();

        }
    }
}