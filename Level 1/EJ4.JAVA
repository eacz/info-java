import java.util.*;

public class EJ4{  
  public static void main(String args[]){ 
      Scanner e = new Scanner(System.in);
      int i,fact=1; 
      System.out.println("Ingrese el numero del que desea calcular el factorial: "); 
      int n= e.nextInt();    
      for(i=1;i<=n;i++){    
          fact=fact*i;    
      }    
      System.out.println("El factorial de "+n+" es: "+fact);    
    }  
 }  