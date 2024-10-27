package com.neznatnov.loop;

public class Task0421 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            number++;
            if ((number % 2) == 0) {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}