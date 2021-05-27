package Level_1;
import java.util.*;

public class EJ2 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    double n1 = e.nextInt();
    System.out.println("Ingrese otro numero: ");
    double n2 = e.nextInt();
    
    System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
    System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
    System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
    System.out.println(n1 + " % " + n2 + " = " + (n1%n2));

    e.close();
  }
}