package Laba3;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("Oooops, something wrong !");}
        }
    }
    // 1. Напишите программу, в которой пользователь вводит целое число в диапазоне от 1 до 7
// а программа определяет по этому числу день недели.
// Если введенное пользователем число выходит за допустимый диапазон, выводится сообщение о том
// что введено некорректное значение.
// Используйте оператор выбора switch.
//Flawless victory