package hacker.rank;/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

 abstract class Test{

}

public class HackerRankDemo
{
	public static void main(String args[])
	{
		//first
		int [] list = new int[]{1, 2, 3};
		int sum=0;
		for(int i=0; i< list.length; i++)
		{
			sum+=list[i];
		}

		//Triplets
		List<Integer> a = Arrays.asList(1,5,12);
		List<Integer> b = Arrays.asList(10,15,2);
		List<Integer> c = new ArrayList<>();
		int asum=0;
		int bsum=0;
		for(int i =0; i<a.size();i++)
		{
			if(a.get(i) > b.get(i))
			{
				asum+=1;
			}
			else if(a.get(i) < b.get(i))
			{
				bsum+=1;
			}
		}
		c.add(asum);
		c.add(bsum);
		System.out.println(asum+"  "+bsum);

		//very big sum
		long[] bigsumlist = new long[]{600, 400};
		long sum1=0;
		for(int j=0; j< bigsumlist.length; j++)
		{
			sum1+=bigsumlist[j];
		}

		//Diagonal Difference:Given a square matrix, calculate the absolute difference between the sums of its diagonals.

		List<List<Integer>> array = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.addAll(Arrays.asList(11, 2, 4));
		List<Integer> row2 = new ArrayList<>();
		row2.addAll(Arrays.asList(4, 5, 6));
		List<Integer> row3 = new ArrayList<>();
		row3.addAll(Arrays.asList(10, 8, -12));
		//diag1=7; diag2=8  diff -1

		array.addAll(Arrays.asList(row1,row2,row3));

		int firstDiagonalSum = 0;
		int secondDiagonalSum= 0;
		for(int i = 0; i<array.size();i++)
		{
				firstDiagonalSum+= array.get(i).get(i);
				secondDiagonalSum+=array.get(i).get(array.size() - 1 - i);
		}
		int result = firstDiagonalSum-secondDiagonalSum;
		System.out.println(firstDiagonalSum);
		System.out.println(secondDiagonalSum);
		System.out.println(Math.abs(result));

		//Plus Minus
		//Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.
		int[] plusminusarray = new int[]{1, 2, 0, 0, -3, -4, -2};
		float countPlus=0;
		float countMinus=0;
		float countZero=0;

		for(int i=0; i< plusminusarray.length;i++)
		{
			if(plusminusarray[i] >0)
			{
				countPlus+=1;
			}
			else if(plusminusarray[i]<0){
				countMinus+=1;
			}
			else {
				countZero+=1;
			}
		}
		System.out.println(countPlus/plusminusarray.length);
		System.out.println(countMinus/plusminusarray.length);
		System.out.println(countZero/plusminusarray.length);

		//Staircase
		//Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
		//
		//Write a program that prints a staircase of size .
		int n=5;
		for(int i=1; i<=n ;i++)
		{
			for (int j = 1; j <= n-1; j++)
			{
				if(j <= n-i)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("#");
				}
			}
			System.out.println();
		}

		//Mini-Max Sum
		//Given five positive integers, find the minimum and maximum valueass that can be calculated by summing exactly four of the five integers.

		int[] minmax= new int[]{2, 4, 2, 5, 9};
		Arrays.sort(minmax);
		long minsum=0;
		long maxsum=0;
		for (int i =0; i<minmax.length-1;i++)
		{
			minsum+=minmax[i];
		}
		for (int i =(minmax.length-1); i>0;i--)
		{

			maxsum+=minmax[i];
		}
		System.out.println(minsum);
		System.out.println(maxsum);


		//BirthDayCandles
		int[] candles = new int[]{4, 2, 3, 4, 5, 7};
		int max = candles[0];
		for(int i=1; i<candles.length; i++)
		{
			if(max < candles[i])
			{
				max = candles[i];
			}
		}
		System.out.println("Largent integer is "+max);
		int count=0;
		for(int i=0; i<candles.length; i++)
		{
			if(candles[i] == max)
			{
				count+=1;
			}
		}
		System.out.println("Count is "+ count);

		//Time Conversion
		//Convert from 12h to24h

//		System.out.println("TIME CONVERSION STARTS");
				String time = "12:00:00PM";
		////		String ampm= s.substring(s.length()-2);
		////		String split[] = s.split(":");
		////		switch (ampm){
		////			case "AM": {
		////				String resultAm= split[0]+":"+split[1]+":"+split[2].substring(0,2);
		////				System.out.println(resultAm);
		////				System.out.println("2");
		////			}
		////			case "PM":	{
		////				System.out.println("3");
		////				System.out.println("4");
		////			}
		////		}
		////
		String tArr[] = time.split(":");
		for(int i=0; i<tArr.length;i++)
		{
			System.out.println(tArr[i]);
		}
		String AmPm = tArr[2].substring(2,4);
		int hh,mm,ss;
		hh = Integer.parseInt(tArr[0]);
		mm = Integer.parseInt(tArr[1]);
		ss = Integer.parseInt(tArr[2].substring(0,2));

		String checkPM = "PM",checkAM ="AM";
		int h = hh;
		if(AmPm.equals(checkAM) && hh==12)
			h=0;
		else if(AmPm.equals(checkPM)&& hh<12)
			h+=12;

		System.out.printf("%02d:%02d:%02d",h,mm,ss);




		//Fizz buzz problem

		for(int i=1; i<=100;i++){
			if(i%3 == 0 && i%5 ==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3 == 0){
				System.out.println("Fizz");
			}
			else if(i%5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}
