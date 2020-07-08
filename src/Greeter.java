/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * hello
 */
public class Greeter
{

	public void greet(Greeting greeting)
	{
		greeting.perform();
	}

	public static void main(String args[])
	{

		//Java 7 solution

		//sort by color

		List<Vehicle> vehicles = new ArrayList<>();
				Collections.sort(vehicles, new Comparator<Vehicle>()
				{
					@Override public int compare(Vehicle o1, Vehicle o2)
					{
						return o1.getColor().compareTo(o2.getColor());
					}
				});

		//java 8
		//simce comparator has only one abstract method we can use lambda
		//Collections.sort(vehicles, (v1, v2)-> v1.getColor().compareTo(v2.getColor()));

		//Streams...iterate over collections
		//helps in running in multiple threads
		//you dont define the order, this this can be achieved in parallel
		//

		Greeter greeter = new Greeter();
		Greeting hello = new HelloWorldGreeting();


		Greeting greetLambda = () -> System.out.println("hello");

		greeter.greet(hello);
		greeter.greet(System.out::println);
		greeter.greet(greetLambda);

		//Addition add = (a,b) -> a+b;

	}
	interface Addition{
		public int add(int a, int b);
}

}
