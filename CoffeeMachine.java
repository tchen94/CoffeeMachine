package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cup = 9;
    private int money = 550;
    private Scanner scanner;

    public CoffeeMachine(Scanner scanner) {
        this.scanner = scanner;
    }

    public void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String buyInput = scanner.nextLine();

        switch (buyInput) {
            case "1":
                if (water - 250 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans - 16 < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cup - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    water -= 250;
                    coffeeBeans -= 16;
                    cup -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water - 350 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk - 75 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans - 20 < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cup - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    cup -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water - 200 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk - 100 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans - 12 < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cup - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    cup -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                break;
        }
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterToFill = Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkToFill = Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansToFill = Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many cups of coffee you will need:");
        int cupsToFill = Integer.parseInt(scanner.nextLine());

        water += waterToFill;
        milk += milkToFill;
        coffeeBeans += beansToFill;
        cup += cupsToFill;
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                cup + " of disposable cups\n" +
                "$" + money + " of money");
    }

    public void UserInterface() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            System.out.println("");

            if (input.equals("exit")) {
                break;
            } else if (input.equals("buy")) {
                buy();
            } else if (input.equals("fill")) {
                fill();
            } else if (input.equals("take")) {
                take();
            } else if (input.equals("remaining")) {
                remaining();
            }

            System.out.println("");
        }
    }

    public void start() {
        UserInterface();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMaker = new CoffeeMachine(scanner);

        coffeeMaker.start();

    }
}




