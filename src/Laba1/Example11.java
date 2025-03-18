package Laba1;
import java.util.Scanner;

public class Example11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите ваше имя:");
        String firstname = in.nextLine();

        System.out.println("введите ваш год рождения:");
        int yearOfBirth = in.nextInt();
        int currentYear = 2024; // текущий год
        int age = currentYear - yearOfBirth;

        System.out.println( firstname + age);

        in.close();
    }
}