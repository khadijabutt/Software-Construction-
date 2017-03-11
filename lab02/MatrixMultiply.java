/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiply;
/**
 *
 * @author Khadija
 */
public class MatrixMultiply {

    public static int[][] multiply(int a[][], int b[][]) {
        int row1, row2, col2, sum=0;      //declaring variables 
        row1 = a.length;
        row2 = b.length;
        col2= b[0].length;
       
        int c[][]=new int[row1][col2];
         for ( int i = 0 ; i < row1 ; i++ )
         {
            for ( int j = 0 ; j < col2  ; j++ )
            {   
               for ( int k = 0 ; k < row2 ; k++ )
               {
                  sum = sum + a[i][k]*b[k][j];      //calculationg each entry of product matrix
               }
 
               c[i][j] = sum;     //inserting values in product matrix
               sum = 0;
            }
         }
        return c;
    }
    public static int[][] strassen(int a[][], int b[][]) {
   
		
		int row = a.length;
		int[][] c = new int [row][row];
		
		if(row == 1)
			c[0][0] = a[0][0] * b[0][0];
		
		else
		{
		
		int  M1 = ((a[0][0] + a[1][1])*(b[0][0]+ b[1][1]));
		int  M2 = ((a[1][0] + a[1][1])*b[0][0]);
		int  M3 = (a[0][0]*(b[0][1]-b[1][1]));
		int  M4 = (a[1][1]*(b[1][0]-b[0][0]));
		int  M5 = ((a[0][0]+a[1][1])*b[1][1]);
		int  M6 = ((a[1][0]-a[0][0])*(b[0][0]+ b[1][1]));
		int  M7 = ((a[0][1]- a[1][1])*(b[1][0]+b[1][1]));
		
		 c[0][0] = M1 + M4 - M5 + M7;
		 c[0][1] = M3 + M5;
		 c[1][0] = M2 + M4;
		 c[1][1] = M1 - M2 + M3 + M6;
		
		}
		
		return c;
		
    }    
}
