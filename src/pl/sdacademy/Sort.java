package pl.sdacademy;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] tablica = {5, 4, 2, 9, 2, 4, 7};
        System.out.println(Arrays.toString(tablica));
        bubbleSort(tablica);
        insertionSort(tablica);

    }

    private static void bubbleSort(int[] tablica) {

        for (int j = 0; j < tablica.length - 1; j++) {
            for (int i = 0; i < tablica.length - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int pwd = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = pwd;
                }
            }
        }
        System.out.println(Arrays.toString(tablica));
    }


    private static void insertionSort(int[] tablica) {

            for (int i = 1; i < tablica.length; i++) {
                int counter = 1;
                int n = i;
                while (i - counter >= 0) {
                    if (tablica[n] < tablica[n-1]) {
                        int pwd = tablica[n];
                        tablica[n] = tablica[n-1];
                        tablica[n-1] = pwd;
                        counter++;
                        n--;
                    } else
                    break;
                }
            }
        System.out.println(Arrays.toString(tablica));
        }
}