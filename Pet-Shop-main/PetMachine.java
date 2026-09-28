package Abstration.PetShop;

public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower(){

        if (this.pet == null){
            System.out.println("Put the pet in the machine to start the shower");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("The pet " + pet.getName() + " is clean");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("The capacity of water in machine is on max");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("The capacity of shampoo in machine is on max");
            return;
        }

        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("The machine is dirty, to put the pet, clean the machine");
            return;
        }

        if (hasPet()){
            System.out.println("The pet " + this.pet.getName() + " is on the machine right now");
            return;
        }


        this.pet = pet;
        System.out.println("The pet " + pet.getName() + " is put on the machine");
    }

    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("The pet " + this.pet.getName() + " is put outside the machine!");

        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("The machine is clean!");
    }

}
