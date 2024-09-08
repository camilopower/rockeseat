package world;
import java.util.HashMap;
import java.util.Map;



public class colecao {



    public static void main(String[] args) {

    

        Map<String, Integer> notas = new HashMap<>();
 notas.put("dani", 9);
 notas.put("vini", 10);
 notas.put("elias", 10);
    


 
for (Map.Entry<String, Integer> entry : notas.entrySet()) {
    String key = entry.getKey ();
    Integer value = entry.getValue();

    
    System.out.println("A chave é " + key + " é o valor " + value);




    
}

    }

}
