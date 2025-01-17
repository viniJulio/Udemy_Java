package PROJETO;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Exibir todas as opções para o usuario
        // e pedir para ele escolher

        int opcao;

        do{
            
            System.out.println("Calculadora java");
            System.out.println("1. adição");
            System.out.println("2. subtração");
            System.out.println("3. multiplicação");
            System.out.println("4. divisão");
            System.out.println("0. sair");
            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4) {

                //resgatar numeros do usuario
                System.out.println("Digite o primeiro numero");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;
                //encontrar o resultado 

                switch (opcao) {
                    case 1:
                        resultado = adicionar (num1, num2);
                        break;
                    case 2:
                        resultado = subtrair (num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                    if (num2 !=0) {
                        resultado = dividir (num1, num2);
                    }else{
                        System.out.println("divisão por 0");
                        operacaoValida = false;
                    }
                        break;
                    default:
                    operacaoValida = false;
                        break;
                }

                //mostrar resultado
               if (operacaoValida) {
                System.out.println("RESULTADO: " + resultado);
               }

            }else if(opcao != 0){
                System.out.println("opcao invalida");
            }

        }while(opcao !=0);

        //Liberar resursos da memória
        System.out.println("CALCULADORA ENCERRDA");
        scanner.close();
    }

    public static double adicionar (double a, double b){
        return a + b;
    }
    
    public static double subtrair (double a, double b){
        return a - b;
    }
    
    public static double multiplicar (double a, double b){
        return a * b;
    }
    
    public static double dividir (double a, double b){
        return a / b;
    }

}
