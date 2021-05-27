package Level_2;
import java.util.*;
import Level_2.Empleado;
public class EJ6 {
  public static void main(String[] args) {
    Empleado emp1 = new Empleado(40, 200, "Rodrigo", "Perez", "43023943");
    Empleado emp2 = new Empleado(30, 250, "Esteban", "Lopez", "43242343");
    Empleado emp3 = new Empleado(35, 300, "Maria", "Suarez", "40000000");
    Empleado emp4 = new Empleado(25, 210, "Rodrigo", "Moralez", "35023120");
    Empleado emp5 = new Empleado(42, 180, "Juan", "Gordillo", "29321843");

    Set<Empleado> empleados = new HashSet<>(){{
      add(emp1);
      add(emp2);
      add(emp3);
      add(emp4);
      add(emp5);
    }};
    Map<String, Integer> sueldos = new HashMap<>();

    for(Empleado e : empleados){
      sueldos.put(e.DNI, (e.horasTrabajadas*e.valorPorHora));
    }

    System.out.println(sueldos.get(emp1.DNI));
    

  }
}

