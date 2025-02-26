package sessao5;

public class Condicionais {
    public static void main(String[] args) {
        // o que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // Operadores de compara 

        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);
        
        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        System.out.println(x >= 10);

        System.out.println(x < 10);

        System.out.println(x <= 10);

        // Atribuicao e comparacao
        int n = 5;
        int m = 10;

        System.out.println(n == 12);

        System.out.println(n == m);

        System.out.println(n = 12);

        // Comparacao de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals("Java"));

        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str2.equalsIgnoreCase("JaVa");

        // if

        int numero = 10;

        if (numero > 125) {

            System.out.println("O numero é maior que 5");
            
        }

        // Se a função retorna um boolean posso usar o equals().

        String texto = "teste";

        if (texto.equals("texto")) {

            System.out.println("o testo é: " + texto);
            
        }

        // else

        int q = 10;

        if (q > 10) {
            
            System.out.println("Q é maior que 10");

        } else {

            System.out.println("Insira um numero maior que 10");
            
        }

        // else if

        double nota = 8.5;

        if (nota == 10) {
            System.out.println("voce tirou nota maxima");
        }

        else if (nota >= 9) {
            System.out.println("Nota muito boa");
        }
        
        else if(nota >= 7) {
            System.out.println("Acima da media");
        }
        
        else {

            System.out.println("Abaixo da media");
            
        }

        int num = 5;

        if (num > 3 && num < 5){
            System.out.println("Alguma coisa");
        } else if(num == 5){
            System.out.println("outra coisa");
        }

    }
}

