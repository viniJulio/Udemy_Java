package ESTRUTURA_DE_CONTROLE;

public class ExemplosControle {

    public static void main(String[] args) {
        


    // 1- if else (condicionais)
    
    // operadores de comparação -> ex: x>y, a == b

    int idade = 18;

    // if -> começa a condição
    // () -> contem a condição a ser avaliada
    // {} -> corpo da condição

    if(idade >= 18){
        System.out.println("Você é maior de idade");
    }

    // if -> validar se algo é verdadeiro
    // else -> executa se o if não executar

    double nota = 6.3;

    if (nota > 7) {

        System.out.println("Você passou");

    } else {
        
        System.out.println("Você ficou de recuperação");

    }

    // else if -> intermediario do if e else, ele valida um bloco também

    int hora = 14;

    if (hora < 12) {

        System.out.println("Bom ida");
        
    } else if (hora < 18) {

        System.out.println("Boa tarde");
        
    }
    
    else {

        System.out.println("Boa noite");
        
    }

    // podendo ter 1 ou mais else if

    // 2- operadores de comparação

    int x = 10;
    int y = 5;

    // = é atribuição
    // == é comparação

    System.out.println("x == y: " + (x == y));
    System.out.println("x == y: " + (x != y));
    System.out.println("x == y: " + (x > y));
    System.out.println("x == y: " + (x < y));
    System.out.println("x == y: " + (x >= y));
    System.out.println("x == y: " + (x <= y));

    boolean o = true;

    if (o) {
        System.out.println("é verdadeiro");
    }

    // operadores lógicos: 
    // && => AND => op1 && op2 => boolean => apenas se as duas op forem true
    // || => OR => op1 || op2 => boolean => se alguma op for true
    // ! => NOT => !valor => altera o valor para o contrario => true <> false

    boolean temDinheiro = true;
    boolean temTempo = false;
    
    if (temDinheiro && temTempo) {
        System.out.println("Pode viajar");     
    } else {
        System.out.println("Não pode viajar");
    }

    // LOOPS - While e For
    // FOCO em FOR
    // Repetir algo até uma condição ser atingida
    // Evita repetição mecanica de código (automatização)

    int contador = 1;  //variável

    while(contador <= 5){ // condição
        System.out.println(contador);
        contador++; //incrementador
        // interação = cada passagem do loop
    }

    for(int i = 1; i<=5; i++) {
    //variável; condição; incrementador   
        System.out.println("valor de i é: " + i);        
    }

    //exemplos práticos

    // analise numerica

    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int somaPar = 0;
    int somaImpar = 0;

    // como eu vou chamr a unidade da minha lista : lista
    for (int num : numeros){

        if (num % 2 == 0) {
            somaPar += num;
        } else {
            somaImpar += num;
        }

        if (num % 3 == 0) {
            System.out.println("O numero " + num + " é multiplo de 3");
       
        }

        if (num > 5 && num < 7) {
            System.out.println("O numero " + num + " está entre 5 e 7");
        }

        }

        System.out.println("soma pares: " + somaPar);
        System.out.println("soma impares: " + somaImpar);

        // break => ejetar o loop
        // continue => pular uma execução

        //variaveis temporarias dos loops podem se repeitr

        for(int i = 1; i<= 10; i++){
            if (i == 2) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.println(i);

        }

    }

}
