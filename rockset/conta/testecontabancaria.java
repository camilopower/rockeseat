package conta;

public class testecontabancaria {

    public  static void main(String[] args) {


 contabancaria contabancaria1 = new contabancaria();

contabancaria1.setNumero("1234");
contabancaria1.setTitular("jose");



contabancaria1.depositar(50);
contabancaria1.sacar(100);


    
}

}

