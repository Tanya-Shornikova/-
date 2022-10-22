package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("vvedite massiv");
        int[] f = new int[first.nextInt()];

        for (int i = 0; i < f.length; i++) {
            f[i] = first.nextInt();
        }
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

    }
}
