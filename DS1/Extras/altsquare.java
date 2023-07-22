package com.DS1.Extras;
import java.util.Scanner;

public class altsquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count=-5;
        int count2=0;

        for (int i=1; i<=n; i++){
            if (i%2!=0){
                count+=6;
                for (int j=1; j<=5; j++) {
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
            else {
                count+=4;
                for (int k=1; k<=5; k++){
                    System.out.print(count + " ");
                    count--;
                }
                System.out.println();
            }
        }
    }
}
