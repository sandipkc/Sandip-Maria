package com.java.project.examples;

import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.toList;



public class StreamFiltering{

    public static void main(String...args){

        // Filtering with predicate
        List<Dish> vegetarianMenu =
            Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());
 
        System.out.println("Printing ONLY Vegetarian Dishes ");
        vegetarianMenu.forEach(System.out::println);

      

        // Truncating a stream
        List<Dish> dishesLimit3 =
            Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList());

        System.out.println("Printing ONLY 3 Dishes having calories greater than 300 ");
        
        dishesLimit3.forEach(System.out::println);
        
        
        
     // Filtering unique elements
        
        System.out.println("Printing ONLY numbers divisble by 2 ");
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .distinct()
               .forEach(System.out::println);

        
        
        
    }
}