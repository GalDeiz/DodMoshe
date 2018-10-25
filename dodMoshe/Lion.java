package com.company.dodMoshe;

/**
 * Created by hackeru on 10/22/2018.
 */
public class Lion extends Animal {
    private String type = "Lion";
    boolean fur;

    public Lion(String name) {
        super(name);

    }

    @Override
    public String getName() {
        return super.getName()+" The "+type;
    }

    @Override
    public void makeSound() {
        if(isAlive()){
            System.out.println(this.getName()+": ROAAAAR!");
        }
        //else{
        //    System.out.println(this.getName()+": is dead!");
        //}
    }
    public void eatCow(Cow cow){
        if (cow.isAlive()){
            System.out.println(this.getName()+":NAM NAM NAM, im eating a cow!");
            cow.setAlive(false);
        }else{
            System.out.println(this.getName()+": "+cow.getName()+" is dead, give me another cow!");
        }
    }
    public void rest (){
        String sleepSound = " zZZzzzZzzZzzZzz";
        String inJungle = "In the jungle, the mighty jungle a lion sleeps tonnnnight";
        System.out.println(this.getName()+": "+inJungle);
        System.out.println(this.getName()+": "+sleepSound);
    }
}
