package Laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения:");

        int yearOfBirth = in.nextInt();

        int currentYear = 2024; // текущий год
        int age = currentYear - yearOfBirth;

        System.out.println("Ваш возраст: " + age);
        in.close();
    }
}




