package com.shmormius;

import java.util.Scanner;

import com.shmormius.entity.*;

public class Game {
    private Initializer initializer;
    private Scanner scanner;

    Player player;

    public Game(){
        initializer = new Initializer();
        scanner = new Scanner(System.in);
    }
    
    public void start(){
        intro();
        player = initializer.initializePlayer();
    }

    public void intro(){
        System.out.println("Welcome: press any key to continue");
        scanner.nextLine();
    }
}

