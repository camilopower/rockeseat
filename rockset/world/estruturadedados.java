package world;
import java.util.ArrayList;
import java.util.List;





public class estruturadedados {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("dani"); 
        nomes.add("vini");
        nomes.add("elias");

        //System.out.println(nomes.get(2));
     //   for ( String nome  : nomes) {
       //     System.out.println("O  nome é" + nome);
     nomes.forEach(nome -> System.out.println("O nome que apareceu foi" + nome));


        
        
    }
    
}

