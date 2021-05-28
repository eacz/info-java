package Level_2;
import java.util.Scanner;

public class EJ7 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    int n1, n2;
    System.out.println("Ingrese un numero: ");
    n1 = e.nextInt();
    System.out.println("Ingrese otro numero (debe ser mayor al primero)");
    while(true){
      n2 = e.nextInt();
      if(n2 > n1) {
        break;
      }
      System.out.println("Error, el numero no puede ser mayor al primero, ingrese nuevamente");
    }
    String[] arrayFinal = generarArray(n1, n2);

    for(int i = 0; i<arrayFinal.length; i++){
      System.out.println(arrayFinal[i]);
    }
    e.close();
  }
  //n1 es el menor, n2 es el mayor 
  public static String[] generarArray(int n1, int n2){
    int longitudArray = n2 - n1;
    System.out.println(longitudArray);
    String[] arr = new String[longitudArray];
    int j = 0;
    for(int i = n1; i<n2;i++){
      arr[j] = determinarElemento(i);
      j++;
    }
    return arr;
  }

  public static String determinarElemento(int n){
    String s = String.valueOf(n);
    if( n%2 == 0 && n%3 == 0){
      s="FizzBuzz";
    } else if(n%3 == 0){
      s="Buzz";
    } else if(n%2 == 0){
      s="Fizz";
    } 
    return s;
  }

}
