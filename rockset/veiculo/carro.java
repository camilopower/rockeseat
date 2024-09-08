package veiculo;

public class carro implements veiculo {

    @Override
    public void acelerar() {
        System.out.println("acelerando o carro");
      
    }

    @Override
    public void frear() {
        System.out.println("freando o carro");
    
    }
    
}
