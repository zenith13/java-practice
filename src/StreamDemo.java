/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo
{
	public static void main(String args[])
	{

		Vehicle v1 = new Vehicle("red", "sedan");
		Vehicle v2 = new Vehicle("blue", "sedan");
		Vehicle v3 = new Vehicle("green", "sedan");
		Vehicle v4 = new Vehicle("yellow", "sedan");

		Set<Vehicle> vehicles = new HashSet<>();
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.add(v1);

//		Set<String> test = new HashSet<>();
//		test.add("a");
//		test.add("b");
//		test.add("c");
//		test.add("d");
//		test.add("x");
//		test.add("e");
//		for(String s: test){
//			System.out.println(s);
//		}
//		test.stream().forEach(System.out::println);
		vehicles.stream().forEach(System.out::println);

		//skip take a long, which indicates the first n values ti skip
		vehicles.stream().skip(3).forEach(System.out::println);
		System.out.println(vehicles.stream().count());

		vehicles.stream().sorted().forEach(System.out::println);

		//another way of using stream
		Stream.of(vehicles).forEach(System.out::println);

		List<Vehicle> filterVehicle = vehicles.stream().filter(s->s.getColor().startsWith("g")).collect(Collectors.toList());
		System.out.println(filterVehicle.size());
	}
}
