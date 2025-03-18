package Laba1;
import java.util.Scanner;

public class Example9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите месяц:");
        String firstname = in.nextLine();

        System.out.println("введите количество дней:");
        int day = in.nextInt();


        System.out.println("Месяц:" + firstname + " количество дней " + day);


        in.close();
    }
}