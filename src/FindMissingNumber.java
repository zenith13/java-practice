/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class FindMissingNumber
{
	public  static void main(String args[]) throws IOException
	{
		int sumOfAllNumbers = 0;
		int sumOfNumbersPresent = 0;
		int blankSpace = 0;
		int[] theNumbers = {1, 2, 3, 4, 0, 6, 7, 8, 9, 10};
		for (int i = 0; i < theNumbers.length; i++) {
			sumOfAllNumbers += i + 1;
			sumOfNumbersPresent += theNumbers[i];
			if (theNumbers[i] == 0)
				blankSpace = i;
		}
		System.out.println("Missing number = " + (sumOfAllNumbers - sumOfNumbersPresent) + " at location " + blankSpace +" of the array");
	}
}
