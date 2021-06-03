package Ejercicios_propuestos;

import java.util.Scanner;

public class EJ1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    System.out.println("Ingrese dos numeros para sumarlos: ");
    int n1 = e.nextInt();
    int n2 = e.nextInt();
    int result = sumar(n1,n2);
    System.out.println("El resultado es: " + result);

    e.close();
  }


  public static int sumar(int n1, int n2){
    return n1+n2;
  }
}
