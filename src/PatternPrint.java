/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

public class PatternPrint
{
	public static void main(String args[]){

		int n =5;
		for(int i =1; i < n ; i++)
		{
			for(int j = 1; j <=i ; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}



		for (int i = 1; i < n ; i++){
			for (int j= 1 ; j< n ; j++)
			{
				if(j < n-i)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("#");
				}
			}
			System.out.println();
		}

	}
}


//1
//11
//111
//1111
//11111
//     1  4w 1p
//    11  3w 2p
//   111``2w 3p
//  1111  1w 4p
// 11111  0w 5p
