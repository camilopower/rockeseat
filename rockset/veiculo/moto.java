package veiculo;

public class moto implements veiculo {

    @Override
    public void acelerar() {
       System.out.println("acelerando a moto");
    }

    @Override
    public void frear() {
        System.out.println("freando a moto");
    }
    
}
