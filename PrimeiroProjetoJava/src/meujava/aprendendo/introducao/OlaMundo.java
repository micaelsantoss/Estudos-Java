package meujava.aprendendo.introducao;

public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá: " + args[0]);
       System.out.println("HElLO, WORLD");
        int number = 23;
        String name = "Mike";
        double pi = 3.14;

        System.out.println(number);
        System.out.println(name);
        System.out.println(pi);

        float num1 = 5;
        float num2 = 10;

        calc(num1, num2);
    }

    static void calc(float x, float y){
        float sum = x + y;
        float subtraction = x - y;
        float multiplication = x * y;
        float division = x / y;

        System.out.println("Sum: " + sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
