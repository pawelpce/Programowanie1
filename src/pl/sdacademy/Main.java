package pl.sdacademy;

public class Main {

    public static void main(String[] args) {

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (x == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (x > 0 && x < 5 && y > 0 && y < 5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (x == y || (5-x) == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
