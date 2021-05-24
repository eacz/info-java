import java.util.*;
public class EJ4 {
  public static void main(String[] args) {
    List<Integer> horasTrabajadas  = new ArrayList<>(
      Arrays.asList(27,40,45,30,42)
    );

    List<Integer> valorPorHora  = new ArrayList<>(
      Arrays.asList(500, 450, 700, 500, 400)
    );

    List<Integer> sueldos  = new ArrayList<>();
    for(int i = 0; i < horasTrabajadas.size(); i++){
      sueldos.add(horasTrabajadas.get(i) * valorPorHora.get(i));
    }
    int sueldoSemanal = 0;
    for(int i = 0; i < sueldos.size(); i++){
      sueldoSemanal+=sueldos.get(i);
    }
    System.out.println("Sueldo Semanal: " + sueldoSemanal);
  }
}