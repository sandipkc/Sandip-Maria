package com.java.project.examples;

import java.util.*;
import static java.util.stream.Collectors.toList;


public class StreamMapping{

    public static void main(String...args){

        // map
        List<String> dishNames = Dish.menu.stream()
                                     .map(Dish::getName)
                                     .collect(toList());
        System.out.println("Printing List of DishNames after Mapping :" + dishNames);

        // map
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                                         .map(String::length)
                                         .collect(toList());
        System.out.println("Printing the lenghts of words Hello and World " + wordLengths);
        
        
        

       
    }
}