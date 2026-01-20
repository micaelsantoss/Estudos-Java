package meujava.aprendendo.megasena;

import java.util.Random;

public class MegaSena {
    public static void main(String[] args){
        Random generate = new Random();

        int cont = 0;

        while(cont < 6){
            int number = generate.nextInt(60); //gera numeros de 1 a 60

            System.out.println(number);

            cont++;
        }
    }
}
