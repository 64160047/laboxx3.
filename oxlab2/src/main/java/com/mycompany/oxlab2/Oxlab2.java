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

    public static String start;
    public static String[][] board = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};
    public static String turn;
    public static int row;
    public static int col;
    public static boolean play = false;
    public static boolean end;

    public static void main(String[] args) {
        printStartGameOX();
        printShowBoard();

    }

    public static void printStartGameOX() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME OX GAME 👀");
        System.out.print("Start Game ➤➤ (y/n): ");
        start = sc.nextLine().toLowerCase();
        while (!start.equals("n") && !start.equals("y")) {
            System.out.print("Start Game ➤➤ (y/n): ");
            start = sc.nextLine().toLowerCase();
        }
        if (start.equals("n")) {
            play = false;
        } else {
            play = true;
        }
    }

    public static void printShowBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void showTurn() {
        System.out.println("_________________________");
        System.out.println("Next Turn ➤➤ " + turn.toUpperCase());

    }

    public static void printInputRowAndCol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row ➤ ");
        row = sc.nextInt();
        System.out.print("Input column ➤ ");
        col = sc.nextInt();
        if (((row > 0 && row < 4) && (col > 0 && col < 4))) {

            if (board[row - 1][col - 1].equals("_")) {

                board[row - 1][col - 1] = turn.toUpperCase();

            } else {

                while ((!(row > 0 && row < 4) && !(col > 0 && col < 4)) && !(board[row - 1][col - 1].equals("_"))) {

                    System.out.println("Please Input Again.");
                    System.out.print("Input row ➤ ");
                    row = sc.nextInt();
                    System.out.print("Input column ➤");
                    col = sc.nextInt();

                }

                return;
            }

        } else {
            return;
        }
    }

    public static void nextTurn() {
        if (turn.equals("x")) {
            turn = "o";
        } else {
            turn = "x";
        }

    }

    public static void checkWin() {
        if (checkRow() || checkColumn() || checkDiagonal()) {

            System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
            System.out.println("  " + turn + " Win 🏆");
            System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
            if (endGame()) {
                resetTable();
            } else {
                play = false;

            }
        }
        if (play == true) {
            if (checkDraw()) {
                System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
                System.out.println("     Draw     ");
                System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
                if (endGame()) {
                    resetTable();
                } else {
                    play = false;

                }
            }
        }
    }

    public static boolean checkRow() {
        for (int j = 0; j < board[row - 1].length; j++) {
            if (!board[row - 1][j].toLowerCase().equals(turn)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn() {
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j].toLowerCase().equals(turn) && board[1][j].toLowerCase().equals(turn) && board[2][j].toLowerCase().equals(turn)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal() {
        if (board[0][0].toLowerCase().equals(turn) && board[1][1].toLowerCase().equals(turn) && board[2][2].toLowerCase().equals(turn)) {
            return true;
        }

        if (board[0][2].toLowerCase().equals(turn) && board[1][1].toLowerCase().equals(turn) && board[2][0].toLowerCase().equals(turn)) {
            return true;
        }

        return false;
    }
    public static boolean checkDraw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals("_")) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean endGame() {
        Scanner sc = new Scanner(System.in);
        String again = sc.nextLine().toLowerCase();

        while (!again.equals("n") && !again.equals("y")) {

            System.out.print("| Do you want to Exit 🚪 | (y/n): ");
            again = sc.nextLine().toLowerCase();
        }
        if (again.equals("y")) {
            return false;
        }
        return true;

    }
     public static void resetTable() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "_";
            }
        }
        turn = "o";
    }
     

}
