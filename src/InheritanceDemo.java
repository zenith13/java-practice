/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;


public class InheritanceDemo
{
	public static void main(String args[])
	{
		List<Test3> t = new ArrayList<>();
		Test3 t3 = new Test3();
		Test4 t4 = new Test4();
		Test1 t1 = new Test1();
		t.add(t3);
		t.add(t4);
	}
}
class Test1{};

class Test2 extends Test1{}

class Test3 extends Test1{}
class Test4 extends Test3{}
