import java.util.*;

public class EJ6 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    int resultado = 1;
    System.out.println("Ingrese la base: ");
    int base = e.nextInt();
    System.out.println("Ingrese la potencia: ");
    int potencia = e.nextInt();
    for(int i = 0; i < potencia; i++){
      resultado*=base;
    }
    System.out.println(base + " elevado a " + potencia + " = " + resultado);
  }
}