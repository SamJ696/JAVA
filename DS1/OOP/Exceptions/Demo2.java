package com.DS1.OOP.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void show () {

        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        }

        catch (IOException e){
            System.out.println("Could Not Read Data");
        }

        // FINALLY BLOCK WILL ALWAYS GET EXECUTED NO MATTER EXCEPTIONS ARE THERE OR NOT.
        finally {
            if (reader != null){
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
