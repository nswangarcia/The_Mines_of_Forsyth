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
        Run run = new Run();
        run.run();
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