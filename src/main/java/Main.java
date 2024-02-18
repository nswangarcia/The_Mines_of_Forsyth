/**
 * File: Main.java.
 * Author: Nicole Garcia
 * Date: 02/12/2024
 */

import enemies.Enemy;
import factory.EnemyFactory;

import java.util.Random;
import java.util.Scanner;


/**
 * Main class.
 */
public class Main {

    /**
     * Main constructor.
     */
    public Main() {
    }

    /**
     * Main method.
     * @param args main arguments
     */
    public static void main(String[] args) {
        init();
        playOrSimulateGame();
    }

    public static void playOrSimulateGame() {
        Scanner in = new Scanner(System.in);
        System.out.println("\tWould you like to play the game or run a simulation of the game?");
        System.out.println("\t1: Play Game");
        System.out.println("\t2: Run Simulation");
        String input = in.nextLine();
        while (!input.equals("1") && !input.equals("2")) {
            System.out.println("\tSorry, invalid choice, try again.");
            input = in.nextLine();
        }
        if (input.equals("1")) {
            System.out.println("\tYou have chosen to play the game!" +
                    "\n*********************************************");
            Run run  = new Run();
        } else {
            System.out.println("\tSimulating game..." +
                    "\n*********************************************");
            SimulateGame simulateGame = new SimulateGame();
        }
    }

    /**
     * Initialize The Mines of Forsyth.
     * @return boolean
     */
    public static boolean init() {
        System.out.println("*********************************************");
        System.out.println("*                WELCOME TO                 *");
        System.out.println("*           THE MINES OF FORSYTH:           *");
        System.out.println("*           DUNGEON CRAWLER GAME            *");
        System.out.println("*********************************************");
        return true;
    }
}