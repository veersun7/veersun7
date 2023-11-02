package com.nirm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
	public static void main(String args[]) throws Exception
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(92);
        list.add(13);
        list.add(36);
        list.add(82);
        System.out.println("Array List: " + list);
      
	int maxList = Collections.max(list);
        int minList = Collections.min(list);
     
        System.out.println("Minimum value of list is: "
                           + minList);
        System.out.println("Maximum value of list is: "
                           + maxList);
    }
}