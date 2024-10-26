package com.neznatnov.loop;

import java.util.Scanner;

public class Task0402 {
    public static void main(String[] args) {
        String text = " loves me.";

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine() + text;
        int i = 1;
        while (i <= 10) {
            System.out.println(result);
            i++;
        }
    }
}
