package com.company.dodMoshe;

/**
 * Created by hackeru on 10/22/2018.
 */
public abstract class Animal {
    private String name;
    private boolean isAlive;

    public Animal(String name) {
        this.name = name;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }


    public boolean isAlive() {
      return  isAlive;
    }

    public void setAlive(boolean isItAlive) {
        isAlive = isItAlive;
    }

     public abstract void makeSound ();

}
