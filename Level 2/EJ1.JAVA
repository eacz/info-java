import java.util.*;
public class EJ1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    Scanner e2 = new Scanner(System.in);
    List<String> ciudades  = new ArrayList<>();
    String ciudad;
    int resp = 1;
    while (resp == 1){
      System.out.println("Ingrese una ciudad: ");
      ciudad = e.nextLine();
      ciudades.add(ciudad);
      System.out.println("Desea agregar otra ciudad? 1-si 0-no");
      resp = e2.nextInt();
    }
    for(int i = 0; i < ciudades.size(); i++){
      System.out.println("#" + (i+1) + " - " + ciudades.get(i));
    }
  }
}