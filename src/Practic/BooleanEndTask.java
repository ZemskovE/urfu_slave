package Practic;

public class BooleanEndTask {
    public static void main(String[] args) {
        int temp = 24;
        boolean warm = temp >= 23;
        boolean rainy = false;
        int time = 20;
        boolean night = time >=21;
        if (warm && !night) System.out.println("Гулять");
        if (!warm || night || rainy) System.out.println("Читать книгу");

    }
}

