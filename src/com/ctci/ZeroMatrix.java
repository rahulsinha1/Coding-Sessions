package com.ctci;

// If an element in an M*N matrix is zero, set its entire row and column to zero
public class ZeroMatrix {

    // This algorithm takes O(n) space. An optimized algorithm is implemenmted below this one
    public void setZero(int [] [] matrix)
    {
        if(matrix.length == 0 || matrix[0].length ==0)
        {
            throw new IllegalArgumentException("Not a valid matrix");
        }

        // Initializing n
        int noRows = matrix.length;
        int noColumns = matrix[0].length;

        //Initializing bit vectors to track rows and columns containing zero
        int [] rowVector = new int[noRows];
        int [] columnVector = new int[noColumns];

        for(int i =0;i<noRows;i++)
        {
            for(int j =0; j<noColumns ;j++)
            {
                if (matrix[i][j] ==0 )
                {
                    rowVector[i] =1;
                    columnVector[j] =1;
                }
            }
        }

        //Nullify rows
        for(int i = 0; i< rowVector.length;i++)
        {
            if (rowVector[i]==1)
            {
                nullifyRow(matrix,i);
            }
        }

        for(int j =0; j< columnVector.length;j++) {
            if (columnVector[j] == 1) {
                nullifyColumn(matrix, j);
            }
        }
    }

    void nullifyRow(int[][] matrix, int row)
    {
        for(int j =0; j< matrix[0].length;j++)
        {
            matrix[row][j] =0;
        }
    }

    void nullifyColumn(int[][] matrix, int column)
    {
        for(int i =0; i< matrix[0].length;i++)
        {
            matrix[i][column] =0;
        }
    }


    public void zeroMatrix(int[] [] matrix)
    {
        //Input validation
        if(matrix.length == 0 || matrix[0].length ==0)
        {
            throw new IllegalArgumentException("Not a valid matrix");
        }

        boolean firstRowZero;
        boolean firstColumnZero;

        //Checking if first row has zero
        for(int j =0; j< matrix[0].length;j++)
        {
            if(matrix [0][j] ==0 )
            {
                firstRowZero = true;
                break;
            }
        }

        //Checking if first column has zero
        for(int i =0; i< matrix.length;i++)
        {
            if(matrix [i][0] ==0 )
            {
                firstColumnZero = true;
                break;
            }
        }

        // Keeping track of zeroes using first row and column
        for(int i = 1; i< matrix.length;i++){
            for(int j = 1; j< matrix.length;j++)
            {
                if (matrix[i][j] == 0 )
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //Nullifying rows
        for(int i = 1; i<matrix.length;i++)
        {
            if(matrix[i][0] ==0)
            {
                nullifyRow(matrix,i);
            }
        }

        //Nullifying columns
        for(int j = 1; j<matrix[0].length;j++)
        {
            if(matrix[0][j] ==0)
            {
                nullifyColumn(matrix,j);
            }
        }


    }

    public static void main(String[] args) {
        ZeroMatrix z = new ZeroMatrix();
        int[][] matrix = {{1, 2, 3,4}, {5, 0, 7, 8}, {9, 10, 11, 12}, {13, 14, 0, 16}};
        printMatrix(matrix);
        z.zeroMatrix(matrix);
        System.out.println("After zero Matrix operation: \n");
        printMatrix(matrix);

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

