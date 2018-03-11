package pl.sdacademy;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] tablica = {5, 4, 2, 9, 2, 4, 7};
        System.out.println(Arrays.toString(tablica));
        bubbleSort(tablica);

    }

    private static void bubbleSort(int[] tablica) {

        for (int j = 0; j < tablica.length-1; j++) {
            for (int i = 0; i < tablica.length-1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int pwd = tablica[i];
                    tablica[i] = tablica[i+1];
                    tablica[i+1] = pwd;
                }
            }
        }
        System.out.println(Arrays.toString(tablica));
    }
}