/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;


public class CustomLinkedList
{
	public static void main(String args[]){
		System.out.println("hey");
		List<String> s = new ArrayList<>();
		s.add("sa");
		System.out.println(s.size());


		TreeSet<String> alphabets = new TreeSet<>((a, b) -> b.compareTo(a));
		alphabets.add("l");
		alphabets.add("g");
		alphabets.add("x");
		alphabets.stream().forEach(System.out::println);

		LinkedHashSet<String> alphabets1 = new LinkedHashSet<>();
		alphabets1.add("l");
		alphabets1.add("g");
		alphabets1.add("a");
		alphabets1.stream().forEach(System.out::println);
	}
}

