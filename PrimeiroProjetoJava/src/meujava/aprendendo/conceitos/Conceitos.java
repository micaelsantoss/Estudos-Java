package meujava.aprendendo.conceitos;

import java.util.Scanner;

public class Conceitos {
    public static void main(String[] args){
        //java interativo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine(); //lendo a entrada de dados

        System.out.println(name);

        //Tipos não primitivos
        Integer y = 5;
        y.toString(); // nesses tipos podemos chamar alguns metódos

    }
}
