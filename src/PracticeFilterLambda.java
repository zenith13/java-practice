/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PracticeFilterLambda
{
	public  static void main (String [] args){

//		Person p1 = new Person("john", "mumbai");
//		Person p2 = new Person("john1", "pune");
//		Person p3 = new Person("john2", "mumbai");
//		Person p4 = new Person("john3", "delhi");

//		List<Person> persons = new ArrayList<>();
//		persons.add(p1);
//		persons.add(p2);
//		persons.add(p3);
//		persons.add(p4);

		// new person should have only person from mumbai
		//List<Person> newPerson = persons.stream().filter(person -> person.getCity().equals("mumbai")).collect(Collectors.toList());

//		 persons.stream().map(s -> {
//			return new ArrayList();
//		}).collect(Collectors.toList());

		 List<String> names = Arrays.asList("anton", "jake");

		List<Person> p= names.stream().map(s -> {
			Person p1 = new Person();
			p1.setName(s);
			return p1;
		}).collect(Collectors.toList());

		//newPerson.forEach(s -> System.out.println(s.getName()+ s.getCity()));
	}

	private static Person getPerson(String s)
	{
		Person p = new Person();
		p.setName(s);
		return p;
	}
}

class Person{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
