import java.util.*;
public class EJ3 {
  public static void main(String[] args) {
    /* Se puede hacer todo con un mismo array, pero decidí tratarlo por arrays separados 
      para mantener los valores de cada array
    */
    List<String> baraja  = new ArrayList<>(
      Arrays.asList("A","1","2","3","4","5","6","7","8","9","J","Q","K")
    );
    System.out.println("Elementos de la baraja: ");
    for(int i = 0; i < baraja.size(); i++){
      System.out.println(baraja.get(i));
    }

    List<String> barajaInv = baraja;
    Collections.reverse(barajaInv);
    System.out.println("Elementos de la baraja de forma inversa: ");
    for(int i = 0; i < barajaInv.size(); i++){
      System.out.println(barajaInv.get(i));
    }

    List<String> barajaMezclada = baraja;
    Collections.shuffle(barajaMezclada);
    System.out.println("Elementos de la baraja mezclados: ");
    for(int i = 0; i < barajaMezclada.size(); i++){
      System.out.println(barajaMezclada.get(i));
    }
  }
}