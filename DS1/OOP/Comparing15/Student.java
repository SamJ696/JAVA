package com.DS1.OOP.Comparing15;

public class Student implements Comparable<Student>{

    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // diff == 0 -> Both are equal
        // diff > 0 -> passed argument has less marks.

        return diff;

    }
}
