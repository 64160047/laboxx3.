/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.oxlab2;

import java.util.Scanner;

/**
 *
 * @author minnie
 */
public class Oxlab2 {

   
    public static boolean start;
    public static String startgame;
    public static String[][] table = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    public static String turn;
    public static int row;
    public static int col;
    public static boolean end = false;
    public static String continute;

    public static void main(String[] args) {
        printWelcome();
        inputStartgame();
        if (start == false) {
            System.out.println("---- BYE BYE SEE YAAA 👋🏻 ----");
            end = true;
        }
        while (!end) {
            printTurn();
            inputRowCol();
        }
    }

    public static void printWelcome() {
        System.out.println("WELCOME OX GAME 👀");
    }

    public static void inputStartgame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start XO Games? (Y/N) : ");
        startgame = sc.nextLine().toLowerCase();
        while (!startgame.equals("y") && !startgame.equals("n")) {
            System.out.print("Start XO Games? (Y/N) : ");
            startgame = sc.nextLine().toLowerCase();
        }
        if (startgame.equals("n")) {
            start = false;
        } else {
            start = true;
            printTable();
            inputFirstturn();
        }
    }

    public static void printTable() {
        System.out.println(" ----------- ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("  " + table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ----------- ");

    }

    public static void inputFirstturn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Who first player? (X/O) : ");
        turn = sc.nextLine().toLowerCase();
        while (!turn.equals("x") && !turn.equals("o")) {
            System.out.print("Who first player? (X/O) : ");
            turn = sc.nextLine().toLowerCase();
        }
        if (turn.equals("x")) {
            turn = "x";
        }
        if (turn.equals("o")) {
            turn = "o";
        } else {
            return;
        }
        System.out.println("--------------------------------");

    }

    public static void printTurn() {
        System.out.println("Now " + turn.toUpperCase() + " turn");
    }

    public static void inputRowCol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input row, column : ");
        row = sc.nextInt();
        col = sc.nextInt();
        if (((row > 0 && row < 4) && (col > 0 && col < 4))) {
            if (table[row - 1][col - 1].equals("-")) {
                table[row - 1][col - 1] = turn.toUpperCase();

            } else {
                System.out.println(" Plese input again ‼️ ");
                return;
            }
            printTable();
            isWin();
            changeTurn();
        } else {
            System.out.println(" Plese input again ‼️");
            return;
        }

    }

    public static void changeTurn() {
        if (turn.equals("x")) {
            turn = "o";
        } else {
            turn = "x";
        }
    }

    public static void isWin() {
        if (checkCol() || checkRow() || checkObliquely()) {
            System.out.println(" ----- Congratulations ----- ");
            System.out.println("       Who the winner 🏆  is " + turn.toUpperCase());
            System.out.println("--------------------------------");
            if (inputContinute()) {
                resetTable();
            } else {
                end = true;
            }
        }
        if (end == false) {
            if (checkDraw()) {
                System.out.println("****** Game over ******");
                System.out.println("  -----    Draw   -----  ");
                System.out.println("---------------------------");
                if (inputContinute()) {
                    resetTable();
                } else {
                    end = true;
                }
            }
        }

    }

    public static boolean checkCol() {
        for (int i = 0; i < table[row - 1].length; i++) {
            if (!table[i][col - 1].toLowerCase().equals(turn)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRow() {
        for (int j = 0; j < table[row - 1].length; j++) {
            if (!table[row - 1][j].toLowerCase().equals(turn)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkObliquely() {
        if (row - 1 == col - 1) {
            for (int i = 0; i < table.length; i++) {
                if (!table[i][i].toLowerCase().equals(turn)) {
                    return false;
                }
            }
            return true;
        }
        if ((row + col) - 2 == table.length - 1) {
            for (int i = 0; i < table.length; i++) {
                if (!table[i][table.length - 1 - i].toLowerCase().equals(turn)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j].toLowerCase().equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean inputContinute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do You want to play again (Y/N) 🚪 : ");
        continute = sc.next();
        while (!continute.toLowerCase().equals("n") && !continute.toLowerCase().equals("y")) {
            System.out.print("Do You want to play again (Y/N) 🚪 : ");
            continute = sc.next().toLowerCase();
        }
        if (continute.equals("n")) {
            end = true;
            System.out.println("    ----- See yaaa 💖 ----- ");
            return false;
        }
        return true;
    }

    public static void resetTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = "-";
            }
        }

    }



     

}
