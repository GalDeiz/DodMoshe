package com.company.dodMoshe;

/**
 * Created by hackeru on 10/22/2018.
 */
public class Mouse extends Animal {
    private String type = "Mouse";

    public Mouse(String name) {
        super(name);
    }
    public void die(){
        System.out.println(this.getName()+": this mouse is dead!");
        setAlive(false);
    }

    @Override
    public String getName() {
        return super.getName()+" The "+type;
    }
    @Override
    public void makeSound() {
      if(isAlive()){
        System.out.println(this.getName()+": squick squick!");
    }else{
        System.out.println(this.getName()+": The mouse is dead!");
    }
    }
}
