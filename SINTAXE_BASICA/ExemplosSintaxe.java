package SINTAXE_BASICA;

public class ExemplosSintaxe {
    
public static void main(String[] args) {
    
    // 1- Impressão de texto

    System.out.println("Podemos imprimir isso aqui, e numeros tbm " + 45);

    // 2- Tipos primitivos

    // Variavel = colocar dados
    // int = inteiro
    int idade = 28;
    int anoAtual = 2025;

    System.out.println("Sua idade é " + idade + " anos");
    System.out.println("O ano é " + anoAtual);

    double altura = 1.70;

    System.out.println( "Altura " + altura);

    //Textos = Strings

    String meunome = "Vinicios";

    System.out.println("Meu nome é: " + meunome);

    // boolean => true or false
    boolean estaLogado = true;
    boolean temAcesso = false;

    System.out.println("Esta logado? " + estaLogado);
    System.out.println("Acesso: " + temAcesso);

    //3- Variaveis

    int numero;

    numero = 1;

    System.out.println(numero);

    numero = 2;

    System.out.println( numero);

    // A atribuição precisa ser do mesmo tipo declarado (linguagem tipada)

    // 4- Operadores lógicos
    // Aritimeticos

    int a = 10;
    int b = 3;
    double c = 10;
    double d = 3;
    System.out.println(" A - B = " + (a - b));
    System.out.println(" A + B = " + (a + b));
    System.out.println(" A / B = " + (a / b));
    System.out.println(" A * B = " + (a * b));

    System.out.println("C / D = " + (c / d));

    // operador de incremento e decremento
    int contador = 0;

    contador++;

    System.out.println("valor contador: " + contador);

    contador--;
    contador--;
    contador--;

    System.out.println("valor contador: " + contador);

    // operador composto
    // resumir operação

    System.out.println("Operador composto soma: " + (a += 5));
    System.out.println("Operador composto subtração: " + (b -= 5));
    System.out.println("Operador composto multiplicação: " + (a *= 5));

    System.out.println("a agora tem valor de = " + a);
    System.out.println("b agora tem valor de = " + b);



}

}
