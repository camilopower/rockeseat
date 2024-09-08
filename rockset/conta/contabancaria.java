package conta;

public class contabancaria {

  private  String numero;
  private  String titular;
  private  double saldo;

//getter e setters

public contabancaria() {
   this.saldo = 0.0;

}



public void setNumero(String numero){
   this.numero = numero;


}

public String Getnumero() {
  return this.numero;

}



public void setTitular(String titular){
    this.titular = titular;

}

public String getTitular() {
   return titular;

}


public void setSaldo(double saldo){
   this.saldo = saldo;

}

public double getSaldo() {
   return saldo;

}






    //depositar

    void depositar(double valor) {
        if(valor > 0){
       saldo = saldo + valor;
         System.out.println("deposito de R$" + valor + " . saldo atual R$ " + saldo);
         
         } else {
            System.out.println(" O valor de depósito é invalido");

         }

        }

    
    //sacar

    void sacar(double valor){
if  (valor > 0 && valor <= saldo){
    saldo = saldo - valor;
     System.out.println("saque de R$" + valor + ". Saldo atual R$ " + saldo);




    }

    

    }

    public void setSaldo(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSaldo'");
    }

}