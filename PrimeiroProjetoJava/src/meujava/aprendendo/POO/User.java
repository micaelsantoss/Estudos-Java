package meujava.aprendendo.POO;

public class User {

    //Deixar variáveis privadas para não serem modificadas diretamente fora da classe
    private String firstName;
    private String lastName;
    private Adress adress = new Adress();

    //CONSTRUCTOR
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //SETTER
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastNameName(String lastName){
        this.lastName = lastName;
    }

    public void setAdress(String street, String zipCode, String number){
        this.adress.street = street;
        this.adress.zipCode = zipCode;
        this.adress.number = number;
    }

    //GETTER
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Adress getAdress(){
        return adress;
    }

    public String completeName(){
        return firstName + " " + lastName;
    };
}
