package myPackage;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        boolean condition = true;
        Management m = new Management();
        while (condition) {
            try {
                System.out.println("Select from following");
                System.out.println("1 - Add new customer");
                System.out.println("2 - Print list of customer in each room");
                System.out.println("3 - Quit");

                int userChoice = Integer.parseInt(sc.nextLine());
                System.out.println("----");

                switch (userChoice) {
                    case 1:
                        m.addCustomer();
                        break;
                    case 2:
                        m.printRooms();
                        break;
                    case 3:
                        System.out.println("Quit");
                        condition = false;
                }

            } catch (Exception e) {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }

}
