package Level_1;
import java.util.*;


public class EJ8 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    System.out.println("Ingrese: ciudad - direccion - nombre - edad");
    String ciudad = e.nextLine();
    String direccion = e.nextLine();
    String nombre = e.nextLine();
    int edad = e.nextInt();
    String todojunto = ciudad + " - " + direccion + " - " + edad + " - " + nombre;
    System.out.println(todojunto);
    e.close();
  }
}