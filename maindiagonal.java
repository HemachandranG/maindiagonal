package maindiagonal;

import java.util.Scanner;

public class diagonal {

	public static int diagonal(int[][]A) {
		int sum=0;
		int n = 0;
		for(int i=0;i<n;i++)
		{
			sum+=A[i][i];
		}
		return sum;

	}
	public static void main(String[] args) {
        Scanner b=new Scanner (System.in);
        System.out.println("enter the values:");
        int n=b.nextInt();
		int[][] A=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=b.nextInt();
			}
		int value=diagonal(A);
		System.out.println(value);
			
	}
	}
}
