package meujava.aprendendo.conceitos;

import java.util.Scanner;

public class CompararStrings {
    public static void main(String[] args){
        String password = "123456";

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass)); //usamos o equals para comparar ao invés de
        // ==, pois o == compara também o endereço

    }
}
