package com.company.dodMoshe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        System.out.println("What is the farmer's name?");
        String x = s.next();
        System.out.println("What tools does he have? 1.Axe 2.Hoe 3.Shovel 4.Truck 5.All");
        int y = s.nextInt();
        System.out.println("From 1 - 5 how skilled is he? ");
        int z = s.nextInt();

//regionCreationOfAnimals
        Cow edna = new Cow ("Edna");
        Cow hedva = new Cow ("Hedva");
        Cow para = new Cow ("Para");
        Cow maruma = new Cow ("Maruma");
        Cow grizelda = new Cow ("Grizelda");
        Cat tom = new Cat ("Tom");
        Cat mizi = new Cat ("Mizi");
        Mouse jerry = new Mouse ("Jerry");
        Mouse miki = new Mouse ("Miki");
        Mouse tobi = new Mouse ("Tobi");
        Mouse barvaz = new Mouse ("Barvaz");
        Lion simba = new Lion ("Simba");

        animals.add(edna);
        animals.add(hedva);
        animals.add(para);
        animals.add(maruma);
        animals.add(grizelda);
        animals.add(tom );
        animals.add(mizi);
        animals.add(jerry) ;
        animals.add(miki);
        animals.add(tobi);
        animals.add(barvaz);
        animals.add(simba);

//endregionOf
        Farmer farmer1 = new Farmer(y,x,z);

       // hedva.giveMilk();
       // hedva.giveMilk();
       // hedva.giveMilk();
       // hedva.eat();
       // hedva.eat();
       // hedva.eat();
       // hedva.giveMilk();
       // hedva.giveMilk();
       // hedva.giveMilk();
       // System.out.println(Cow.getMilk());
       // tom.drinkMilk();
       // tom.drinkMilk();
       // tom.drinkMilk();
       // tom.drinkMilk();
       // simba.eatCow(edna);
       // simba.eatCow(edna);
       // edna.giveMilk();
       // tom.eatMouse(jerry);
       // tom.eatMouse(jerry);
       // edna.makeSound();
       // hedva.makeSound();
       // simba.makeSound();
       // jerry.makeSound();
       // tom.drinkMilk();
       // edna.giveMilk();
       // hedva.giveMilk();
       // grizelda.giveMilk();
       // simba.rest();
        System.out.println(farmer1.identify());
        farmer1.sing();
    }//




}
