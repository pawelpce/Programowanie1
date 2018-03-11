package pl.sdacademy;

public class Fibonacci {


    static int fibonacciNumber(int n) {

        int num0 = 0, num1 = 1, num2 = 1;

        for (int i = 0; i < n; i++) {
            num0 = num1;
            num1 = num2;
            num2 = num1+num0;
        } return num0;
    }


    static int fibonacciReccursion (int n){

        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fibonacciReccursion(n-2) + fibonacciReccursion(n-1);

    }

    public static void main(String[] args) {

        int fibonacciNumber = fibonacciReccursion(30);
        System.out.println(fibonacciNumber);

        int fibonacciNumber2 = fibonacciNumber(30);
        System.out.println("\n" + fibonacciNumber2);
    }

}

