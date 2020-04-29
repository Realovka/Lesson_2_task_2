package com.company;

public class Main {

    public static void main(String[] args) {
        int i, a;
        a = 1;
        for (i = 3; i <= 24; i += 3) {
            a *= 2;
            System.out.println("Через " + i + " часов будет " + a + " амёб");
        }
    }
}
