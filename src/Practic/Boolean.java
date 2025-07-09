package Practic;

public class Boolean {
    public static void main(String[] args) {
        int temp = 19;
        boolean hot = temp >= 25;
        boolean cold = temp <= 20;
        int time = 21;
        boolean itsnight = time > 22 || time < 6;
        if (hot && !itsnight)
            System.out.println("Кондиционер включен");
        else if (cold)
            System.out.println("Кондиционер выключен");
        else
            System.out.println("ничего не происходит");
    }
}