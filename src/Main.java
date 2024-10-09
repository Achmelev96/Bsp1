// Aleksandr Chmelev, 12321956

public class Bsp01 {

    public static void main(String[] args) {

        // Teil 1
        int number = SavitchIn.readInt();
        System.out.println("? Integer (> 0): " + number);
        double result = Math.ceil(Math.log10(number));
        System.out.println("Anzahl der Stellen: " + result);

        //Teil 2
        System.out.println("Hunderterstelle: " + (number / 100));
    }

}