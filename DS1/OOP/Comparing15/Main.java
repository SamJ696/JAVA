package com.DS1.OOP.Comparing15;

public class Main {
    public static void main(String[] args) {
        Student samyak = new Student(13,98.7f) ;
        Student yugam = new Student(23, 94.5f);

        if (samyak.compareTo(yugam) > 0){
            System.out.println("Samyak has more marks.");
        }


        // If an array of students is created, and we hide the compareTo function.
        // Then the compiler would get confused as to sort the array on basis of which parameter.
        // If compareTo function is not hidden then as marks are being compared in the method.
        // The array of students would be sorted according to the marks.
        // We have to create a toString method in order to print array.toString.
    }
}
