package Practic;

public class Airconditional {
    public static void main(String[] args) {
        int temp = 19;
        if (temp > 25)
            System.out.println("Кондиционер включен");
        else if (temp < 22)
            System.out.println("Кондиционер выключен");
        else
            System.out.println("ничего не происходит");
    }
}
