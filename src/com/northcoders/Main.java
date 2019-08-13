package com.northcoders;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game hauntedHouse = new Game();

        // rooms
        Room startRoom = new Room("startGame", "You walk up to the mansion, lightning crackles through the sky in a predictable attempt to build tension... What do you do?");
        Room entrance = new Room("entrance", "With a trembling hand you reach out and try the door... it swings open. Nothing but pitch black ahead... you can't go any further");


        // startRoom choices
        Choice enter = new Choice(entrance, "Enter the mansion");
        Choice exitGame = new Choice(null, "Run away, this is terrifying!");
        startRoom.addChoice(enter);
        startRoom.addChoice(exitGame);

        // entrance choices
        Choice backOutside = new Choice(startRoom, "Turn back");
        entrance.addChoice(backOutside);
        entrance.addChoice(exitGame);


        // setup and start game
        Scanner scanner = new Scanner(System.in);
        hauntedHouse.setScanner(scanner);

        hauntedHouse.setCurrentRoom(startRoom);
        hauntedHouse.startGame();

        while (hauntedHouse.canContinue()) {
            hauntedHouse.printCurrentMessage();
            Choice playerChoice = hauntedHouse.getRoomChoice();
            Room nextRoom = playerChoice.getTargetRoom();
            hauntedHouse.setCurrentRoom(nextRoom);
        }

        System.out.println("Thanks for playing!");
    }
}
