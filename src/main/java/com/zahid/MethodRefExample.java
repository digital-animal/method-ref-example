package com.zahid;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodRefExample {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Alex", "Lee", "Cooper", "John", "David", "Jane");
        System.out.println(nameList);
        System.out.println();

        // using anonymous inner class
        System.out.println("# using anonymous inner class");
        nameList.forEach(new Consumer<String>() {
            
            @Override
            public void accept(String name) {
                // System.out.println(name);
                System.out.println(name.toUpperCase());
                // System.out.println(name.length());
            }
        });
        System.out.println();
        
        // using lambda expression
        System.out.println("# using lambda expression");
        // nameList.forEach(name -> System.out.println(name));
        nameList.forEach(name -> System.out.println(name.toUpperCase()));
        // nameList.forEach(name -> System.out.println(name.length()));
        System.out.println();

        // using method reference
        System.out.println("# using method reference");
        nameList.forEach(System.out::println);
        System.out.println();

        List<String> langList = Arrays.asList("Java", "Python", "PHP", "Kotlin", "Rust", "Scala", "Ruby");
        System.out.println(langList);
        System.out.println();

        // sorting langList using anonymous inner class
        System.out.println("# sorting langList using anonymous inner class");
        langList.sort(new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                
                return s1.compareToIgnoreCase(s2);
            }
            
        });
        System.out.println(langList);
        System.out.println();

        // sorting langList using lambda expression
        System.out.println("# sorting langList using lambda expression");
        langList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(langList);
        System.err.println();

        // sorting langList using method reference
        System.out.println("# sorting langList using method reference");
        langList.sort(String::compareToIgnoreCase);
        System.out.println(langList);
        System.out.println();

        // methd reference in build in static functions
        System.out.println("# methd reference in build in static functions: Math.max()");
        // BinaryOperator<Integer> maxima = (x, y) -> Math.max(x, y); // using lambda
        BinaryOperator<Integer> maxima = Math::max; // using method reference
        System.out.println(maxima.apply(4, 9));

        // methd reference in build in static functions
        System.out.println("# methd reference in build in static functions: Integer.sum()");
        // BinaryOperator<Integer> summation = (x, y) -> Integer.sum(x, y); // using lambda
        BinaryOperator<Integer> summation = Integer::sum; // using method reference
        System.out.println(summation.apply(4, 9));
    }
}

