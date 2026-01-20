package meujava.aprendendo.calculadora;

public class Calculate {
    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")){
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            subtract(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiplication(x, y);
        } else if (args[0].equals("dividir")) {
            division(x, y);
        } else {
            System.out.println("Por favor, digite a o que você quer calcular:");
        }
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void subtract(int x, int y){
        System.out.println(x - y);
    }

    static void multiplication(int x, int y){
        System.out.println(x * y);
    }

    static void division(int x, int y){
        System.out.println(x / y);
    }


}
