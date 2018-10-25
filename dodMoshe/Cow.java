package com.company.dodMoshe;


public class Cow extends Animal {
    private static int milk = 0;
    private int milked = 0;
    private String type = "Cow";

    public Cow(String name) {
        super(name);
    }
    public void giveMilk(){

        if(this.isAlive() && this.milked<2) {
            System.out.println(this.getName() + ":Floom Floom, the cow is been milked!");
            changeMilk(1);
            this.milked++;

        }else if(this.isAlive() && this.milked>=2){
            System.out.println(this.getName()+": The cow is already been milked twice, you cant milk her anymore");

        }else if (!this.isAlive()){
            System.out.println(this.getName()+":There is no cow to milk, she is dead.");
        }
    }
    public void die(){
        System.out.println(this.getName()+": this cow is dead!");
        setAlive(false);
    }
    public void eat(){

        if (this.milked!=0 && this.isAlive()){
            System.out.println(this.getName()+": Gruf gruf, im eating grass");
            this.milked--;
        }else{
            System.out.println(this.getName()+": Is full, she cant eat anymore");
        }
    }
    public static int getMilk( ) {
        return milk;
    }
    public static void changeMilk(int milkAmount){

        milk+=milkAmount;
    }
    @Override
    public String getName() {
        return super.getName()+" The "+type;
    }

    @Override
    public void makeSound() {
        if (this.isAlive()) {
            System.out.println(this.getName()+":MOOOOOO");
        }else{
            System.out.println(this.getName()+": The cow is dead!");
        }
    }

}
