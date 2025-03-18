package Laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("День недели:");
        String firstname = in.nextLine();

        System.out.println("Число:");
        int day = in.nextInt();

        System.out.println("Месяц:");
        String name = in.next();

        System.out.println("День недели:" + firstname);
        System.out.println("Число:" + day);
        System.out.println("Месяц:" + name);
        in.close();
    }
}
