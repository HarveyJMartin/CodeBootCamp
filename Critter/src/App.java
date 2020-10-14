package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Critter harvey = new Critter("Harvey");
        Scanner scanner = new Scanner(System.in);
        displayInstructions();
        while (harvey.isAlive()) {
            System.out.println("What would you like " + harvey.getName() + " to do ?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("Play")) {
                harvey.playGame();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                harvey.sleep();
            }
            harvey.tick();
        }
    }

    private static void displayInstructions() {
        System.out.println("Hello, welcome to your HarvGotchi, here are the rules keep Harveys enjoyment high to keep him alive but not too high or he might die. Keep him well fed so he does not starve. HAVE FUN");
    }
}
