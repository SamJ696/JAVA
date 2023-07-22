package com.DS1.OOP.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void show () {

        // THIS IS TRY WITH RESOURCES STATEMENT.
        // IN THIS STRUCTURE WE DON'T NEED TO CLOSE IT IN THE FINAL BLOCK.
        // WHEN WE'LL COMPILE THIS CODE JAVA WILL TRANSLATE THIS CODE TO THE FINAL BLOCK WHICH HAD WRITTEN IN DEMO2.
        // AND EXPLICITLY CLOSE THE READER OBJECT.
        // IMPLEMENT AUTO CLOSEABLE INTERFACE.
        // WE CAN MORE OBJECTS IN TRY. NOT LIMITED TO 1.
        try (var reader = new FileReader("file.txt");) {
            var value = reader.read();
        }

        catch (IOException e){
            System.out.println("Could Not Read Data");
        }
    }
}
