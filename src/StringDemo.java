/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StringDemo
{
	public static void main(String args[])
	{
		List<String> a = new ArrayList<>();
		a=null;
		if (CollectionUtils.isEmpty(a) || !a.contains(""))
		{
			System.out.println("hello");
		}
		System.out.println(StringUtils.equalsIgnoreCase(null, ""));

		Vehicle c = new Car("","");
		test(c);

	}
	private static void test(Vehicle b)
	{

	}
}

