package com.neznatnov.loop;

import java.util.Scanner;

public class Task0406 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("enough")) {
                break;

            } else {
                System.out.println(line);
            }
        }
    }
}