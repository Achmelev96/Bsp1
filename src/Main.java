// Aleksandr Chmelev, 12321956

public class Bsp01 {

    public static void main(String[] args) {

        // Teil 1
        int number = SavitchIn.readInt();
        int number1 = number;
        System.out.println("? Integer (> 0): ");
        int n = 0;
        while (number != 0) {
            number = number / 10;
            n++;
        }
        System.out.println("Anzahl der Stellen: " + n);

        //Teil 2
        System.out.println("Hunderterstelle: " + (number1/100) % 10);
    }
}