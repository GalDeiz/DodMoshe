package com.company.dodMoshe;

import java.util.ArrayList;

public class Farmer {
        private int tools;
        private String name;
        private int skillLevel;

    public Farmer(int tools, String name, int skillLevel) {

        if (tools > 5){
            this.tools = 5;
        }else if (tools < 1)
            this.tools = 1;
        else {
            this.tools = tools;
        }
        this.name = name;

        if (skillLevel > 5){
            this.skillLevel = 5;
        }else if (skillLevel < 1)
            this.skillLevel = 1;
        else {
            this.skillLevel = skillLevel;
        }
    }
    public int getTools() {
        return tools;
    }
    public String getName() {
        return name;
    }
    public int getSkillLevel() {
        return skillLevel;
    }
    public String identify (){

     return   toString();
    }
    public void sing () {

        System.out.println("Ledod moshe haya hava, iya iya HOO!!!!!!!!!!!!!");
        int cowCount = 0 ;
        int lionCount = 0 ;
        int catCount = 0;
        int mouseCount = 0 ;

        for (int i = 0; i < Main.animals.size() ; i++) {

            if (Main.animals.get(i)instanceof Cow){
                cowCount++;
            }else if(Main.animals.get(i)instanceof Cat){
                catCount++;
            }else if(Main.animals.get(i)instanceof Mouse){
                mouseCount++;
            }else if (Main.animals.get(i)instanceof Lion){
                lionCount++;
            }
        }
        System.out.println("Ve ba hava hayu:");
        System.out.print(cowCount+" Cows "+ catCount+" Cats "+ lionCount+" Lions "+mouseCount+" Mouses. ");
        System.out.println("");
        System.out.println("Hiya Hiya Hoo!!!!");
    }
    @Override
    public String toString() {
        return "Farmer{" +
                "tools=" + tools +
                ", name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }

}
