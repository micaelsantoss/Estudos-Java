package meujava.aprendendo.conceitos;

public class ManipulandoStrings {
    public static void main(String[] args){
        // Manipulação de Strings
        System.out.println("Manipulando Strings");
        String texto = "  Ola mundo, esse é o novo mundo  ";
        System.out.println(texto.length()); //tamanho da string
        System.out.println(texto + "concatenada"); //concatenação
        System.out.println(texto.contains("novo")); //verificar se há algo específico
        System.out.println(texto.indexOf("mundo")); //index que inicia a primeira palavra procurada
        System.out.println(texto.lastIndexOf("mundo")); //tamanho da string
        System.out.println(texto.toUpperCase()); //mudar para maiúsculo
        System.out.println(texto.toLowerCase()); //mudar para minusculo
        System.out.println(texto.trim()); //retirar espaços em branco
        System.out.println(texto.substring(9)); //palavra que começa no inex em questão
        System.out.println(texto.equals("ola")); //ver se tem palavras iguais
    }
}
