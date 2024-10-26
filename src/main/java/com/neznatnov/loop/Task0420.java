package com.neznatnov.loop;

import java.util.Scanner;

public class Task0420 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        while(true){
            inputNumber = scanner.nextInt();
            if(inputNumber == number){
                System.out.println("Загадочное число равно"+" "+inputNumber);
                break;
            }else {
                System.out.println("Попробуй еще раз");
            }

        }
    }
}
