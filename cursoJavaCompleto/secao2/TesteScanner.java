package secao2;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        

        // testeando scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem para usuario entender o que precisa digitar
        System.out.println("Digite seu nome: ");

        // resgata p valor do terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Ola, " + nome + "!");

        //nextInt
        System.out.println("Digite sua idade:");

        int idade = scanner.nextInt();

        System.out.println("Você tem " + idade + " anos");
    
     

        // problema do nextLine

        System.out.println("Digite um numero");

        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto");

        String txt = scanner.nextLine();

        System.out.println("os dados são, n = " + n + " e txt = " + txt);

        // Fechamento do scanner, para evitar memory leak
        scanner.close();
    }
}
