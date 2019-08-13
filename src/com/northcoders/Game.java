package com.northcoders;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner scanner;
    private Room currentRoom = null;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void startGame() {
        System.out.println("Welcome, what is your name?");
        String username = scanner.next();
        player = new Player(username);
        System.out.println("Hi, " + username);
    }

    public boolean canContinue() {
        return player.getLives() > 0 && currentRoom != null;
    }

    public Choice getRoomChoice() {
        ArrayList<Choice> choices = currentRoom.getChoices();
        for (int i = 0 ; i < choices.size() ; i++) {
            System.out.println(i + ")  " + choices.get(i).getMsg());
        }
        int playerChoice = Integer.parseInt(scanner.next());
        return choices.get(playerChoice);
    }

    public void printCurrentMessage() {
        System.out.println(currentRoom.getDescription());
    }
}
