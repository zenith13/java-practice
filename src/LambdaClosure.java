/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class LambdaClosure
{
	public static void main(String args[]){


		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("red", "sedan"));
		vehicles.add(new Vehicle("blue", "sedan"));
		vehicles.add(new Vehicle("green", "sedan"));


		vehicles.stream().map(v->{
			List<Integer> s = new ArrayList<>();
			s.add(v.getColor().length());
			return s;
		}).forEach(s-> System.out.println(s));


		vehicles.stream().filter(s-> true).count();
		vehicles.stream().peek(v-> v.setColor(v.getColor().toUpperCase())).forEach(v-> System.out.println(v.getColor()));

		vehicles.stream().peek(v-> System.out.println("hello")).forEach(v-> System.out.println(v.getColor()));

		//Map operation
		//Returns stream thus is intermediate operation.
		//Takes an object and return another object.

		List<List<String>> list = Arrays.asList(
				Arrays.asList("a", "x"),
				Arrays.asList("b"));
		System.out.println(list);

		System.out.println(list
				.stream()
				.flatMap(Collection::stream).map(String::toUpperCase)
				.collect(Collectors.toList()));
	}



}
