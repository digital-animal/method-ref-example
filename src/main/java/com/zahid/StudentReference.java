package com.zahid;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.zahid.student.Student;

/**
 * Hello world!
 *
 */
public class StudentReference 
{
    public static void main( String[] args )
    {
        // using lambda expression
        System.out.println("# using lambda expression" );
        Function<Student, String> studentNameParser = (student) -> student.getName();
        Function<Student, Integer> studentAgeParser = (student) -> student.getAge();
        Function<Student, String> studenDescription = (student) -> student.toString();
    
        // using method reference
        Student alex = new Student("Alex", 20);
        System.out.println(studentNameParser.apply(alex));
        System.out.println(studentAgeParser.apply(alex));
        System.out.println(studenDescription.apply(alex));
        System.out.println();

        // constructor reference
        System.out.println("# constructor reference");
        // BiFunction<String, Integer, Student> student = (name, age) -> new Student(name, age); // using lambda
        BiFunction<String, Integer, Student> student = Student::new; // using constructor reference
        System.out.println(student.apply("David", 24));
        System.out.println();
    }
}
