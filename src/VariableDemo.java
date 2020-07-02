/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

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
	}
	private void callBack(){
		System.out.println("hello"+name+d1);
	}
}
