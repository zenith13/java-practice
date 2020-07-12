/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class LinkList
{

	public void setData()
	{
		List<String> s = new CopyOnWriteArrayList<>();
		s.add(2, "");
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(5);
		Node d = new Node(7);
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
	}

}
