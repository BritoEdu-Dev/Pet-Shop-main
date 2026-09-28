package Abstration.PetShop;

import java.util.Scanner;


public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        var option = -1;

        do {

            System.out.println(" ---- Choose one option ---- ");
            System.out.println(" --> 1 - Take a shower in Abstration.PetShop.Pet ");
            System.out.println(" --> 2 - Refuel the machine with water ");
            System.out.println(" --> 3 - Refuel the machine with shampoo ");
            System.out.println(" --> 4 - Check the water of machine ");
            System.out.println(" --> 5 - Check the shampoo of machine ");
            System.out.println(" --> 6 - Check if has pet in shower ");
            System.out.println(" --> 7 - Put the pet in machine ");
            System.out.println(" --> 8 - Remove the pet from the machine ");
            System.out.println(" --> 9 - Clean the machine ");
            System.out.println(" --> 0 - Exit ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> CheckIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);

                default -> System.out.println("Invalid Option");
            }

        } while (true);

    }

    private static void setWater(){
        System.out.println("Trying put the water in machine");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Trying put the shampoo in machine");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("In this moment the machine has with " + amount + " liter(s) of water");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("In this moment the machine has with " + amount + " liter(s) of shampoo");
    }

    private static void CheckIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Is has a pet in machine" : "Don't have a pet in machine");
    }

    public static void setPetInPetMachine(){
        var name = "";

        while (name == null || name.isEmpty()) {

            System.out.println("Enter the name of pet: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);

        petMachine.setPet(pet);

    }


}