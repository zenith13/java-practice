/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package file.handling;

import data.Circle;
import data.Shape;

public class FileHandling
{
    public static void main(String[] args)
    {
        Shape p = null;
        if(p instanceof Circle c)
        {
            System.out.println(c.getRadius());
        }

        Double x = 1.0;
        Double y = 2.0;
        System.out.println(x.compareTo(y));
    }
}
