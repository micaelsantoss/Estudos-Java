package meujava.aprendendo.POO;

import java.util.List;

public class ArrayList {
    public static void main(String[] args){
        List<User> users = new java.util.ArrayList<>();

        int i = 0;
        while (i < 10){
            User actual = new User("nome " + i, "sobrenome " + i);
            users.add(actual);

            System.out.println(users.get(i).getFirstName());
            System.out.println(users.get(i).getLastName());

            i++;
        }


    }
}

