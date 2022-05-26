package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) {
        long n = sc.nextLong();
        double sneg = 1, s = 1, kv = 3;
        while (n > 1 && s != 0) {
            s /= 9;
            sneg += s * kv;
            kv *= 4;
            n--;
        }
        out.println(sneg);
    }
}