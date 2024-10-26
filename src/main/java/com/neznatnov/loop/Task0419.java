package com.neznatnov.loop;

import java.util.Scanner;

public class Task0419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int x = 0;
        while (x<=number){
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
    }
}
