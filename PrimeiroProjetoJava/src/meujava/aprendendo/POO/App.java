package meujava.aprendendo.POO;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        /*
            METÓDO SEM CONSTRUTOR

            User userA = new User();
            userA.setFirstName("Micael");
            userA.setLastNameName("Silva");
            userA.setAdress("Alirio rocha", "38400-000", "2523");

            System.out.println(userA.getAdress());
        */

        //METÓDO COM CONSTRUTOR
        User userA = new User("Micael", "Santos");
        userA.setAdress("Alirio rocha", "38400-000", "2523");

        System.out.println(userA.getAdress());

    }
}
