package pl.sdacademy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Roulette {

    private static int checkPlayerInput(int playerNumber, int gameNumber, int playerBid) {

        int gamePrize;
        if (playerNumber == gameNumber) {
            gamePrize = 3 * playerBid;
            System.out.println("Brawo! Liczba " + playerNumber + " jest poprawna! Wygrałeś " + gamePrize + " złotych.");
        } else {
            gamePrize = -playerBid;
            System.out.println("Wypadła liczba " + gameNumber + ". Straciłeś " + playerBid + " zł.");
        }
        return gamePrize;
    }

    private static int oneNumberGame(int gameMoney) {

        int gamePrize;
        System.out.println("Obstaw liczbę z zakresu od 0 do 36.");
        Random random = new Random();
        int gameNumber = random.nextInt(36);
        Scanner scanner = new Scanner(System.in);
        try {
            int playerNumber = scanner.nextInt();
            if (playerNumber > 36 || playerNumber < 0) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
                oneNumberGame(gameMoney);
            } else {
                int playerBid = 0;
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    System.out.println("Wybierz kwotę, którą chcesz postawić. Twój obecny stan konta: " + gameMoney + " zł.");
                    playerBid = scanner.nextInt();
                    if (playerBid > gameMoney) {
                        System.out.println("Brak wystarczającej kwoty na koncie. Spróbuj ponownie.\n");
                    } else break;
                }
                gamePrize = checkPlayerInput(playerNumber, gameNumber, playerBid);
                gameMoney = gamePrize + gameMoney;
                System.out.println("Twój stan konta: " + gameMoney + " zł.\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
            oneNumberGame(gameMoney);
        }
        return gameMoney;
    }

    private static int evenOrOdd(int gameMoney) {

        int gamePrize;
        System.out.println("Wciśnij 1 - liczba nieparzysta\nWciśnij 2 - liczba parzysta");
        Random random = new Random();
        int gameNumber = random.nextInt(36);
        Scanner scanner = new Scanner(System.in);
        try {
            int playerChoice = scanner.nextInt();
            if (playerChoice != 1 && playerChoice != 2) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
                evenOrOdd(gameMoney);
            } else {
                int playerBid = 0;
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    System.out.println("Wybierz kwotę, którą chcesz postawić. Twój obecny stan konta: " + gameMoney + " zł.");
                    playerBid = scanner.nextInt();
                    if (playerBid > gameMoney) {
                        System.out.println("Brak wystarczającej kwoty na koncie. Spróbuj ponownie.\n");
                    } else break;
                }
                switch (playerChoice) {
                    case 1:
                        if (gameNumber % 2 != 0) {
                            gamePrize = 2 * playerBid;
                            gameMoney = gamePrize + gameMoney;
                            System.out.println("Brawo! Wylosowana liczba " + gameNumber + " jest nieparzysta. Wygrałeś " + gamePrize + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                        } else {
                            gamePrize = -playerBid;
                            gameMoney = gamePrize + gameMoney;
                            System.out.println("Niestety, wylosowana liczba " + gameNumber + " nie jest nieparzysta. Straciłeś " + playerBid + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                        }
                        break;
                    case 2:
                        if (gameNumber % 2 == 0) {
                            gamePrize = 2 * playerBid;
                            gameMoney = gamePrize + gameMoney;
                            System.out.println("Brawo! Wylosowana liczba " + gameNumber + " jest parzysta. Wygrałeś " + gamePrize + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                        } else {
                            gamePrize = -playerBid;
                            gameMoney = gamePrize + gameMoney;
                            System.out.println("Niestety, wylosowana liczba " + gameNumber + " nie jest parzysta. Straciłeś " + playerBid + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                        }
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
            evenOrOdd(gameMoney);
        }
        return gameMoney;
    }


    private static int rightInterval(int gameMoney) {

        int gamePrize;
        System.out.println("Wciśnij 1 - przedział liczb 1-12\nWciśnij 2 - przedział liczb 13-24\nWciśnij 3 - przedział liczb 25-36");
        Random random = new Random();
        int gameNumber = random.nextInt(36);
        Scanner scanner = new Scanner(System.in);
        try {
            int playerChoice = scanner.nextInt();
            if (playerChoice != 1 && playerChoice != 2 && playerChoice != 3) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
                rightInterval(gameMoney);
            } else {
                int playerBid = 0;
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    System.out.println("Wybierz kwotę, którą chcesz postawić. Twój obecny stan konta: " + gameMoney + " zł.");
                    playerBid = scanner.nextInt();
                    if (playerBid > gameMoney) {
                        System.out.println("Brak wystarczającej kwoty na koncie. Spróbuj ponownie.\n");
                    } else break;
                }
                    switch (playerChoice) {
                        case 1:
                            if (gameNumber > 0 && gameNumber < 13) {
                                gamePrize = 2 * playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Brawo! Wylosowana liczba " + gameNumber + " należy do przedziału 1-12. Wygrałeś " + gamePrize + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            } else {
                                gamePrize = -playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Niestety, wylosowana liczba " + gameNumber + " nie należy do przedziału 1-12. Straciłeś " + playerBid + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            }
                            break;
                        case 2:
                            if (gameNumber > 12 && gameNumber < 25) {
                                gamePrize = 2 * playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Brawo! Wylosowana liczba " + gameNumber + " należy do przedziału 13-24. Wygrałeś " + gamePrize + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            } else {
                                gamePrize = -playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Niestety, wylosowana liczba " + gameNumber + " nie należy do przedziału 13-24. Straciłeś " + playerBid + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            }
                            break;
                        case 3:
                            if (gameNumber > 24 && gameNumber < 37) {
                                gamePrize = 2 * playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Brawo! Wylosowana liczba " + gameNumber + " należy do przedziału 25-36. Wygrałeś " + gamePrize + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            } else {
                                gamePrize = -playerBid;
                                gameMoney = gamePrize + gameMoney;
                                System.out.println("Niestety, wylosowana liczba " + gameNumber + " nie należy do przedziału 25-36. Straciłeś " + playerBid + " zł.\nTwój stan konta: " + gameMoney + " zł.\n");
                            }
                            break;
                    }
                }
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
            rightInterval(gameMoney);
        }
        return gameMoney;
    }

    private static int gameStart(int gameMoney) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy przy stole! Koło się kręci. Wybierz co chcesz obstawić:" +
                "\nWciśnij 1 - dokładna liczba. Stawka 3:1" +
                "\nWciśnij 2 - parzyste/nieparzyste. Stawka 2:1" +
                "\nWciśnij 3 - przedział liczbowy. Stawka 2:1");

        try {
            int playerChoice = scanner.nextInt();
            if (playerChoice > 0 && playerChoice < 4) {
                switch (playerChoice) {
                    case 1:
                        gameMoney = oneNumberGame(gameMoney);
                        break;
                    case 2:
                        gameMoney = evenOrOdd(gameMoney);
                        break;
                    case 3:
                        gameMoney = rightInterval(gameMoney);
                        break;
                }
            } else {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
                gameStart(gameMoney);
            }
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.\n");
            gameStart(gameMoney);
        }
        return gameMoney;
    }

    public static void main(String[] args) {

        int gameMoney = 1000;

        while (gameMoney > 0) {


            gameMoney = gameStart(gameMoney);

        }
        System.out.println("Koniec gry. Straciłeś wszystkie pieniądze.");
    }
}