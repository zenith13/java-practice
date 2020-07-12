/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

public class Node
{

		private int data;
		private Node next;
		Node(int data){
			this.data=data;
		}

		public int getData()
		{
			return data;
		}

		public void setData(int data)
		{
			this.data = data;
		}

		public Node getNext()
		{
			return next;
		}

		public void setNext(Node next)
		{
			this.next = next;
		}

}
