package com.DS1.Extras;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;

        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if ((n1+n2)<=n3 || n2+n3<=n1 || n2+n3<=n1){
            System.out.println("Invalid Triangle");
        }
        else {
            System.out.println("Valid Triangle");
        }
    }
}
