package io.zipcoder.pets;

public class Cat extends Animal_Holder{
    String speak = "";
    public String speak(){
        speak = "Meooooow, fifsk, fifsk";
        System.out.println(speak);
        return speak;
    }
}
