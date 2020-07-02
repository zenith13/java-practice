/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.io.IOException;
import java.util.function.BiConsumer;


public class ExceptionLambda
{

	public static void main(String args[]) throws IOException
	{
		int[] num = { 2, 4, 6, 7, 9 };
		int key = 0;
		proceess(num, key, (a, b) -> {
			try
			{
				System.out.println(a / b);

			}
			catch (ArithmeticException e)
			{
				System.out.println("exception");    //too verbose // not recommended
			}
		});

		proceess(num, key, (a, b) -> {
			System.out.println(a / b);
		});
	}



	//Biconsumer interface take two argument and does nothing
	private static void proceess(int[] num, int key, BiConsumer<Integer, Integer> consumer)
	{
		for (int i : num)
		{
			//try{
			consumer.accept(i, key);
			//}
			//			catch(ArithmeticException e)
			//			{
			//				System.out.println("exception");
			//			}
			//System.out.println(i+key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer)
	{
		//return consumer;
		return (a, b) ->
				System.out.println(a / b);
	}


}
