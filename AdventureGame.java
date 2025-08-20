import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inventory = new String[2];
        int health;
        health = 100;
        System.out.println("### Welcome to the One-Class Adventure!");
        System.out.println("You are starting your journey with " + health + " HP\n");
                System.out.println("You walk into a forest and see a shiny object.");
        System.out.print("Pick it up? (yes/no): ");
        String pick = scanner.nextLine();
        if (pick.equals("yes")) {
            inventory[0] = "Sword of Truth";
            System.out.println("You picked up the " + inventory[0]);
        } else if (pick.equals("no")) {
            System.out.println("You decided to walk past it.");
        } else {
            health = health - 10;
            System.out.println("A snake bites you for being indecisive! Health: " +
                    health);
        }
        System.out.println("\nA wild ogre appears!");
        if (inventory[0].equals("Sword of Truth")) {
            System.out.println("You bravely fight the ogre with your sword!");
            health = health + 20;
        } else {
            System.out.println("You have no weapon. The ogre smashes you.");
            health =- 25;
        }
        System.out.println("Your final health is: " + health);
        if (health >= 0) {
            System.out.println("You survived. Well done hero!");
        } else {
            System.out.println("You have perished. Game over!");
        }
        scanner.close();
    }
}