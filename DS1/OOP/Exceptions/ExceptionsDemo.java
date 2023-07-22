package com.DS1.OOP.Exceptions;

public class ExceptionsDemo {

    public static void show() throws Exception {
//        try {
//        var reader = new FileReader("file.txt");
//        var value = reader.read();
//        new SimpleDateFormat().parse("");
//        }

        if (true) {
            throw new Exception("Hello");
        }
        // CATCHING MULTIPLE EXCEPTIONS.
//        catch (IOException | ParseException e){
//            System.out.println("Could Not Read Data.");
//        }
    }

    // RUNTIME EXCEPTIONS.

    // ARITHMETIC EXCEPTION
    // THROWS WHEN WE DIVIDE A NUMBER BY ZERO.

    // NULL POINTER EXCEPTION.
    // PRINTING TOUPPERCASE AN INPUT AND INPUT PROVIDED AS NULL.

    // ILLEGAL ARGUMENT EXCEPTION.
    // ARGUMENT PASSED IN THE METHOD IS NOT ACCEPTED.

    // INDEX OUT OF BOUNDS EXCEPTION.
    // ACCESSING AN ELEMENT IN AN ARRAY OR STRING USING INVALID INDEX.

    // ILLEGAL STATE EXCEPTION.
    // IF WE CALL A METHOD AND UNDERLYING OBJECT IS NOT IN RIGHT STATE


    // ERROR EXCEPTIONS --> STACK OVERFLOW AND OUT OF MEMORY ERROR.
}
