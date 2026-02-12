package meujava.aprendendo.POO;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int qtd = 2;
        User[] users = new User[qtd];

        System.out.println("Cadastro de Usuários: ");

        for(int i = 0; i < qtd; i++){
            String firstName;
            String lastName;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            firstName = scanner.nextLine();

            System.out.println("Digite o seu sobrenome: ");
            lastName = scanner.nextLine();

            User user = new User();
            user.setFirstName(firstName);
            user.setLastNameName(lastName);

            users[i] = user;
        }

        System.out.println("Lista de usuários cadastrados: ");
        for(int i = 0; i < users.length; i++){
            String completeName = users[i].completeName();
            System.out.println((i+1) + " - " + completeName);
        }

    }
}
