package POO;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        
        //Criar uma pessoa => instanciar (new)
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Vinicios Julio");
        pessoa1.setIdade(28);
        pessoa1.setPeso(62.10);
        pessoa1.setAltura(1.71);

        System.out.println(
        "Meu nome é " + pessoa1.getNome() + "\n" +
        "Tenho " + pessoa1.getIdade() + " anos" + "\n" +
        "Meu peso é " + pessoa1.getPeso() + " Kg" + "\n" + 
        "Minha altura é " + pessoa1.getAltura());

        Pessoa pessoa2 = new Pessoa("Maria", 44, 1.70, 150);

        System.out.println(pessoa2.getNome());

        System.out.println(pessoa2.calcularImc());

        System.out.println(pessoa1.classificacaoDeImc());

        
        //simplificado
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }
    
}
