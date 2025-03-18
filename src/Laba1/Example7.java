package Laba1;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя и возраст: ");
        String name = in.nextLine();
        System.out.println(name);
        in.close();
    }
}