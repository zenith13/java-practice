/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

import java.io.Serializable;


public class Car extends Vehicle implements Serializable
{
	public Car(String color, String type)
	{
		super(color, type);
	}
}
