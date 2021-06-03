package Ejercicios_propuestos;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
      Scanner e = new Scanner(System.in);
      System.out.println("Ingrese un numero para calcular el factorial");
      int n = e.nextInt();
      int factorial = factorial(n);

      System.out.println("El factorial de " + n + " es " + factorial);
      e.close();
    }

    public static int factorial(int n){
      if(n<=1) return n;
      else return n*factorial(n-1);
    }
}
