package com.nirm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElement {
	public static void main(String[] args) {
		
		 List <Integer> rotate_list = new ArrayList<>();
	
		 rotate_list.add(120);
		 rotate_list.add(202);
		 rotate_list.add(304);
		 rotate_list.add(406);
		 rotate_list.add(508);
		 rotate_list.add(601);
		 rotate_list.add(709);
		 rotate_list.add(802);
		
		 System.out.println(  "Before Rotation" + rotate_list);
		 Collections.rotate(rotate_list, 5);
		 System.out.println("Right Rotation 5" + rotate_list);
		 Collections.rotate(rotate_list, -3);
		 System.out.println("Left Rotation 3" + rotate_list);
			
	    }
	}
