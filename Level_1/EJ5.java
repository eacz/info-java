package Level_1;
import java.util.*;

public class EJ5 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    int resultado = 0;
    System.out.println("Ingrese la dos numeros: ");
    int n1 = e.nextInt();
    int n2 = e.nextInt();
    for(int i = 0; i < n2; i++){
      resultado+=n1;
    }
    System.out.println(n1 + " * " + n2 + " = " + resultado);
    e.close();
  }
}