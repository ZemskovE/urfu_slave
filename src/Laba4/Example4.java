package Laba4;

import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        int arr[][];
        Random random = new Random();
        int heigth = 8;
        int length = 11;
        arr = new int[heigth][length];
        for (int i=0; i < heigth; i++) {
            for (int j=0; j < length; j++) {
                arr[i][j] = random.nextInt(1, 3);
            }
        }
        for (int i=0; i < heigth; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}