package pessoa;

public class testedepessoa {
    

public static void main(String[] args) {
pessoa2 pessoa1 = new pessoa2();

pessoa1.cpf =  "3332222";
pessoa1.nome = "daniele";
pessoa1.idade = 33;


    System.out.println(pessoa1.imprimirDadosDapessoa());


   pessoa2 pessoa3 = new pessoa2();

   pessoa3.cpf = "211212121";
   pessoa3.nome = "maria";
   pessoa3.idade = 19;

    System.out.println(pessoa3.imprimirDadosDapessoa());






}

}

