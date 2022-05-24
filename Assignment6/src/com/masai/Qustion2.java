// Even Sum in Columns

package com.masai;

public class Qustion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<arr.length;i++) {
			int sumCol=0;
			for(int j=0;j<arr[i].length;j++) {
				if( arr[i][j]%2==0 ) {
					sumCol+=arr[i][j];
				}
			}
			System.out.println(sumCol);
		}
		

	}

}
