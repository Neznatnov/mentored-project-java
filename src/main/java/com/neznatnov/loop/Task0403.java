package com.neznatnov.loop;

import java.util.Scanner;

public class Task0403 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit){
            String line = scanner.nextLine();
            if (line.equals("ENTER")){
                isExit = true;
            }else {
                int number = Integer.parseInt(line);
                sum = sum + number;
            }

        }
        System.out.println(sum);
    }
}