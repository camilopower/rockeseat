package excecoes;

public class excecoes {
 
    public static void main(String[] args) throws Exception {
   
     try{
    
        validarNumero();

     } catch (Exception e) {
   
        System.out.println("deu ruim");

    }
}
        


        public static void validarNumero() throws Exception{

        


         int numero = 10;
         if(numero < 100)
         throw new Exception("o numero é menor que 100");


    }
}








