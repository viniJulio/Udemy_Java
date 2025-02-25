package secao2;

public class Variavel {

    public static void main(String[] args) {

        String nome = "Vinicios";

        System.out.println(nome);
        
        //atribuicao de variavel com outra

        String teste = "Teste";

        String testando = teste;

        System.out.println(teste);

        //long

        long numeroGrande = 99999999999999999L; // ao usar o long deve atribuir o L no fim do numero;
           
        long populacaoMundial = 7_800_000_000L; //7 mihoes e oitocentos mil

        //int numeroGrandedois = numeroGrande; -> int nao comporta numeros grandes

        System.out.println(numeroGrande);
    
        // Strings

        String firstName = "Vinicios";
        String lastName = "Julio";

        System.out.println(firstName + " " + lastName);

        System.out.println("O meu nome é: " + firstName + " " + lastName);
    
        String fullName = firstName + "" + lastName;
        
        System.out.println(fullName);

        // char - Se 1 caractere resolver, o char ocupa menos espaco na memoria

        char letra = 'A'; // -> char nao aceita aspas duplas (" ")
        System.out.println(letra);

        String letra2 = "A";
        System.out.println(letra2);

        char simbolo = '$';
        System.out.println(simbolo);

        // int

        int n = 42;

        System.out.println(n);
        System.out.println(n + 10);
        System.out.println(n * 10);
        System.out.println(n / 5);

        // double



        double preco = 30.5;

        System.out.println(preco);

        System.out.println(preco - 25);

        System.out.println(preco / 2);

        double valorComD = 12.1D; // se usa o D ou d em alguns casos para identificar o double

        // OP. aritimeticos

        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(22 + 4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        // NA DIVISAO PELO MENOS 1 DOS NUMEROS DEVE SER COM . PARA PODER RETORNAR UM DOUBLE

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 3);

        // divisão por modulo (resto)

        System.out.println(10 % 3);

        // incremento

        int x = 5;

        x++;
        x++;
        x++;
        x++;

        // amplamente usado em loops -> for, while - estruturas de repetição
        
        System.out.println(x);

        // decremento

        int y = 5;

        y--;
        y--;

        System.out.println(y);

        // atribuicao de valor

        int a = 10;

        a += 5; // = a = a + 5;
        
        System.out.println(a);

        int b = 10;

        b -= 5;

        System.out.println(b -= a);


        // type casting - mudando o tipo de dado

        // implicito (widening)
        int numero2 = 50;

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        // explicito (narrowing)

        double valorDouble = 9.76;
        
        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        //numero arredondado pra baixo perdendo casas decimais (perdendo dados)

        char letra3 = 'A';

        int codigoAscii = (int) letra3;

        System.out.println(codigoAscii);
        // casting de char para int


        //constante
        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        //var
        var z = 10;

        System.out.println(z);

        z = 5;

        System.out.println(z);

        var texto2 = "teste";

        var doubleTeste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleTeste);

        

    }

  
}
