package io.zipcoder.pets;

public class Peacock extends Pets{
    String speak = "";

    @Override
    public String speak() {
        speak = "Haa Haa";
        System.out.println(speak);
        return speak;
    }
}
