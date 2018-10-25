package com.company.dodMoshe;

/**
 * Created by hackeru on 10/22/2018.
 */
public class Cat extends Animal {
    private String type = "Cat";

    public Cat(String name) {
        super(name);
    }
    public void drinkMilk(){
        if (Cow.getMilk()>0){
            System.out.println(this.getName()+":Sh'p Sh'p, the cat is drinking.");
            Cow.changeMilk(-1);
        }else{
            System.out.println(this.getName()+": There is no more milk to drink!");
        }
    }
    public void eatMouse (Mouse mouse){
        if(mouse.isAlive()){
            System.out.println(this.getName()+": Nim Nam Num! im eating: "+mouse.getName());
            mouse.setAlive(false);
        }else{
            System.out.println(this.getName()+":"+mouse.getName()+ " is dead, give me " +
                    "another mouse");
        }
    }
    @Override
    public String getName() {
        return super.getName()+" The "+type;
    }
    @Override
    public void makeSound() {
        if(isAlive()){
            System.out.println(this.getName()+": Mew mew!");
        }else{
            System.out.println(this.getName()+": The cat is dead!");
        }
    }
}
