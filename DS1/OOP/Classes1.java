package com.DS1.OOP;

public class Classes1 {

    public static void main(String[] args) {

        Student student1 = new Student("Samyak Jain", 15, 92.45f);
        Student student2 = new Student();
        Student student3 = new Student(student1);

//        student1.name = "Samyak";
//        student1.rno = 16;
//        student1.marks = 92.3f;

        System.out.println(student1.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);

        // By Default Constructor. Everything would be empty.
        // Student student2 = new Student("Aman", 18, 95.6);


        // Will print the original name whether it is on the function without pararmeter
//      // or it is given in as an argument.
        student1.print();

        // This will change the name to Aman Gupta as the funtion defined below.
        // Changes the name parameter to the argument which we will pass.
        student1.changename("Aman Gupta");


        // Will print the changed name which was passed as an argument.
        student1.print();


        System.out.println(student2.name);
        System.out.println(student2.rno);
        System.out.println(student2.marks);

        System.out.println(student3.name);


        // POINTING TO SAME OBJECT IN HEAP.
        // CHANGE IN ONE LEADS TO CHANGE IN ANOTHER.
        Student one = new Student();
        Student two = one;

        two.name = "Something";
        System.out.println(one.name);

    }






    static class Student {
        String name;
        int rno;
        float marks;


        // WILL PRINT THE REQUIRED SENTENCE WITH NAME THAT IS ASSOCIATED WITH THE STUDENT THROUGH WHICH THIS IS CALLED.
        void print () {
            System.out.println("Hello! My name is " + name);
        }


        // WILL UPDATE THE NAME VARIABLE TO THE ARGUMENT PASSED.
        void changename(String newname){
            name = newname;
        }


        // STUDENT FUNCTION WITHOUT ARGUMENTS.
        Student () {
            this.name = "Akshay";
            this.rno = 12;
            this.marks = 89.45f;
        }

        // STUDENT FUNCTION WITH ARGUMENTS.
        // HERE IF THE VARIABLE NAME IS DIFFERENT FROM THOSE DEFINED THEN WE CAN DIRECTLY UPDATE VARIABLE WITHOUT USING THIS.
        Student (String name, int rno, float marks){
            this.name = name;
            this.rno = rno;
            this.marks = marks;
        }


        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        // It won't destroy until memory is loaded and there is a need to free the memory.
        // In Java, we can't free memory manually, but we can instruct what to do when it automatically destroys obejcts.
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object Destroyed");
        }
    }
}


