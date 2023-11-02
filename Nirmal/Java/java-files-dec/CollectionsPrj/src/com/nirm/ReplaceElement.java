package com.nirm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceElement {
    public static void main(String[] args) {          
         List<String> list = Arrays.asList("one", "two", "one", "four", "one");  
            System.out.println("Original List:- "+list);  
            Collections.replaceAll(list, "one", "three");  
            System.out.println("After replace:- "+list);  
          }  
}  