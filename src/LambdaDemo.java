/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import kotlin.reflect.jvm.internal.impl.utils.NumbersKt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaDemo
{

	public static void main(String args[])
	{
		LambdaDemo d = new LambdaDemo();
		d.testMethod();
	}


	private void testMethod(){
		List<String> sourceList = new ArrayList<>(Arrays.asList("sales", "market"));
		sourceList.stream().sorted(String::compareTo).collect(Collectors.toCollection(()-> new HashSet<>()));
		//sourceList.stream().filter(new String("s")::startsWith).forEach(System.out::println);
		//sourceList.stream().map(String::).forEach(System.out::println);

		Target t = new Target();

		List<PriceRow> priceRowList = new ArrayList<>();
		for(String s: sourceList){
			priceRowList.add(getPriceRow(s));
		}

		t.setResult(priceRowList);
		LambdaDemo a = new LambdaDemo();
		t.setResult(sourceList.stream().map(a::getPriceRow).collect(Collectors.toList()));
	}

	private PriceRow getPriceRow(String code){
		PriceRow p = new PriceRow();
		p.setName(code);
		return  p;
	}

	private void test(){
	List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		numbers.stream()
				.sorted((a, b) -> a.compareTo(b));
		numbers.stream()
				.sorted(Integer::compareTo).forEach(s-> System.out.println());
	}

}


class Target{
	private List<PriceRow> result;

	public List<PriceRow> getResult()
	{
		return result;
	}

	public void setResult(List<PriceRow> result)
	{
		this.result = result;
	}
}

class PriceRow{
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
