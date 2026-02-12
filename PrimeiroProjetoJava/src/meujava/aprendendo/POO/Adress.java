package meujava.aprendendo.POO;

public class Adress {
    public String street;
    public String zipCode;
    public String number;

    public String toString() {
        return "Rua: " + street + ", N: " + number + " (CEP: " + zipCode + ")";
    }
}
