package com.neznatnov.loop;

public class Task0407 {
    public static void main(String[] args) {
     int sum = 0;
     int number =0;
     while (number <= 100) {
         if (number%3 == 0) {
             number++;
             continue;
         }

         sum = number + sum;
         number++;
     }
        System.out.println(sum);

}
}
