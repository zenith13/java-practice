/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import data.Baloon;
import data.Circle;

public class VariableDemo
{
	private String name;
	private static String CONS;
	private DateDemo d1;
	public static void main(String args[])
	{
		VariableDemo v = new VariableDemo();
		v.callBack();
		String s;
		DateDemo d;
		System.out.println("hey"+CONS+"new");

		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.getRadius());
		circle = (Circle) changeValue(circle);
		System.out.println(circle.getRadius());
		testBaloon();
	}

	private static void testBaloon()
	{

		Baloon red = new Baloon("Red"); // memory reference = 50
		Baloon blue = new Baloon("Blue"); // memory reference = 100

		swap(red, blue);
		System.out.println("After the swap method executes:");
		System.out.println("`red` color value = " + red.getColor());
		System.out.println("`blue` color value = " + blue.getColor());

		changeValue(blue);
		System.out.println("After the changeValue method executes:");
		System.out.println("`blue` color value = " + blue.getColor());
	}

	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

	private static void changeValue(Baloon balloon) { // balloon = 100
		balloon.setColor("Red"); // balloon = 100
		balloon = new Baloon("Green"); // balloon = 200
		balloon.setColor("Blue"); // balloon = 200
	}

	private static Object changeValue(Circle circle)
	{
		circle.setRadius(20);
		circle = new Circle();
		circle.setRadius(30);
		return circle;
	}


	private static void changeValue1(final Circle circle)
	{
		circle.setRadius(20);
	}


	private void callBack(){
		System.out.println("hello"+name+d1);
	}
}
