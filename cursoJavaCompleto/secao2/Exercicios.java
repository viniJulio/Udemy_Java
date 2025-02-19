package secao2;

public class Exercicios {
    public static void main(String[] args) {
        
        // Ex1 

        int numero1 = 10;
        int valorDobrado = numero1 += 10;

        System.out.println(valorDobrado);

        // Ex2 

        char letra = 'B';
        int valorAscii = (int) letra;

        System.out.println(valorAscii);

        // Ex3

        double n1 = 15.75;
        double n2 = 20.40;

        double soma = n1 + n2;

        System.out.println(soma);

        //Ex 4

        long numeroLong = 2_000_000_000L;
        
        int numeroInt = (int) numeroLong;

        System.out.println(numeroInt);

        //Ex 5

        String saudacao = "Olá, mundo";
        String mensagem = saudacao + " Bem vindo ao Java!";

        System.out.println(mensagem);
        
    }
}
