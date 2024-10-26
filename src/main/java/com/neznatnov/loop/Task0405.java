package com.neznatnov.loop;

public class Task0405 {
    public static void main(String[] args) {
        int height = 0;
        while (height < 10) {
            int width = 0;
            while(width < 20){
                if (height == 0 || height == 9 || width == 0 || width == 19){
                    System.out.print("Б");

                }else {
                    System.out.print(" ");

                }
                width++;

            }
            System.out.print("\n");
            height++;
        }
    }
}
