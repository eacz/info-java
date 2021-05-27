package Level_1;
import java.util.*;

public class EJ3 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int n = e.nextInt();
    for(int i = 1; i <= n; i++ ){
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      System.out.println("");
    }
    e.close();
  }
}