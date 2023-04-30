package com.bl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    private char[] board;
    private char playerLetter;
    private char computerLetter;

    public TicTacToeGame() {
        board = new char[10];
        Arrays.fill(board, ' ');
    }

    public void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a letter (X or O): ");
        String letter = scanner.nextLine().toUpperCase();
        while (!letter.equals("X") && !letter.equals("O")) {
            System.out.print("Invalid letter. Choose X or O: ");
            letter = scanner.nextLine().toUpperCase();
        }
        playerLetter = letter.charAt(0);
        if (playerLetter == 'X') {
            computerLetter = 'O';
        } else {
            computerLetter = 'X';
        }
        System.out.println("You chose " + playerLetter + " and computer chose " + computerLetter);
    }

    public void printBoard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9] + " ");
    }

    public boolean isSpaceFree(int index) {
        return board[index] == ' ';
    }

    public void makeMove(int index, char letter) {
        board[index] = letter;
    }



    public void setCell(int index, char symbol) {
        board[index] = symbol;
    }
    public boolean isBoardFull() {
        for (int i = 1; i < board.length; i++) {
            if (isSpaceFree(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinner(char letter) {
        return (board[1] == letter && board[2] == letter && board[3] == letter) ||
                (board[4] == letter && board[5] == letter && board[6] == letter) ||
                (board[7] == letter && board[8] == letter && board[9] == letter) ||
                (board[1] == letter && board[4] == letter && board[7] == letter) ||
                (board[2] == letter && board[5] == letter && board[8] == letter) ||
                (board[3] == letter && board[6] == letter && board[9] == letter) ||
                (board[1] == letter && board[5] == letter && board[9] == letter) ||
                (board[3] == letter && board[5] == letter && board[7] == letter);
    }


    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.printBoard();

    }
}
