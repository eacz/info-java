package Level_2;
import java.util.*;

public class EJ2 {
  public static void main(String[] args) {
    List<Integer> nros  = new ArrayList<>();
    nros.add(2);
    nros.add(4);
    nros.add(7);
    nros.add(3);
    nros.add(9);
    for(int i = 0; i < nros.size(); i++){
      System.out.println(nros.get(i));
    }
    System.out.println("El tamaño de la lista es " + nros.size());
    nros.add(0, 10);
    nros.add(11);
    for(int i = 0; i < nros.size(); i++){
      System.out.println(nros.get(i));
    }
    System.out.println("El tamaño de la lista es " + nros.size());
  }
}