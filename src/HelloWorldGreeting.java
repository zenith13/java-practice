/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

public class HelloWorldGreeting implements Greeting
{
	@Override public void perform()
	{
		System.out.println("hello world");
	}
}
