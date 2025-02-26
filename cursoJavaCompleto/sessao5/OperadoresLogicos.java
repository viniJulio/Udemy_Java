package sessao5;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        //AND

        int idade = 18;
        boolean temCarteiraDeMotorista = true;
        boolean carteiraVencida = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista);

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if ( carteiraVencida == false && idade > 18) {

            System.out.println("Pode passar na blitz de boa");
            
        }else{

            System.out.println("JA ERA");
        
        }
    
        // OR  

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        if ( temGuardaChuva || estaChovendo) {

            System.out.println("Ta protegido e seco");
            
        } else {
            
            System.out.println("Vai molhar");

        }

    }

}
