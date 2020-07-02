/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

public class SolveProblems
{
	public static void main(String args[])
	{
		findCharacterFrequency("hello");
	}


	private static void findCharacterFrequency(String s)
	{

		//convert to char array
		char[] input = s.toCharArray();

		//maintain a array to keep the frequency
		int freq[] = new int[input.length];


		for (int i = 0; i < input.length; i++)
		{
			freq[i]=1;
			//we dont want to compare the current literal this 1+1
			for (int j = i+1; j < input.length; j++)
			{
				if(input[i]== input[j])
				{
					//increase the frequence
					freq[i]++;
					//so that it is not counted again
					input[j] = '0';
				}
			}

		}
		for(int i = 0; i <freq.length; i++) {
			if(input[i] != ' ' && input[i] != '0')
				System.out.println(input[i] + "-" + freq[i]);
		}
	}
}
