package Laba1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");

        int YearOld = in.nextInt();

        int currentYear = 2024; // текущий год
        int age = currentYear - YearOld;

        System.out.println("Ваш год рождения: " + age);
        in.close();
    }
}