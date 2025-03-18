package Laba1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя: ");
        String name = in.nextLine();
        System.out.println("введите фамилию: ");
        name = in.nextLine();
        System.out.println("введите отчество: ");
        name = in.nextLine();
        System.out.println("имя: " + name);
        System.out.println("фамилию: " + name);
        System.out.println("отчество: " + name);
        in.close();
    }
}