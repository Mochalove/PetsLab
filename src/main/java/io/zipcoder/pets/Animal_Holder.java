package io.zipcoder.pets;

import java.util.Scanner;

public class Animal_Holder {
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);
        System.out.println("How many Pet(s) do you have? :");
        String name = "";
        robot.nextInt();
        String helper = robot.next();
       // String whatkindofpet = "What kind of Pet(s) do you have? :";
      //  String whatisyourpetsname = "What is your Pet(s) name? :";

        switch(helper){
            case "Peacock" : while (true) {
               Peacock pp = new Peacock();
                System.out.println("What is your Peacock(s) name? :");
                name = robot.nextLine();
                System.out.println("The noise they make sounds like this" + pp.speak() + "Your Pet(s) name is" + name);
                break;
            }


        }

    }
}
