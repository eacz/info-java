package Ejercicios_propuestos;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class EJ5 {
  public static void main(String[] args) {
    Scanner eString = new Scanner(System.in);
    String filePath ="Ejercicios_propuestos\\ej5archivo.txt";
    File file = new File(filePath);
    String path = file.getAbsolutePath();
  
    ArrayList<Empleado> empleados = LeerArchivoPorLineas(path);
    
    System.out.println("Ingrese una letra para buscar personas con un apellido que empiece con esa letra");
    String letra = eString.nextLine();
    Empleado[] empleadosConLetra = EmpleadoWithLetterOnLastname(letra, empleados);
    System.out.println("Los empleados con un apellido que empieza con la letra " + letra + " son: ");
    for(int i = 0; i < empleadosConLetra.length; i++){
      if(empleadosConLetra[i] != null){
        System.out.println(empleadosConLetra[i]);
      }
    }
    System.out.println();

    Empleado[] jovenYViejo = getOlderAndYoungerEmpleado(empleados);
    System.out.println("El empleado mas joven es " + jovenYViejo[0]);
    System.out.println("El empleado mas viejo es " + jovenYViejo[1]);
    System.out.println();
    
    Empleado[] pobreYRico = getPoorestAndRichest(empleados);
    System.out.println("El empleado mas pobre es " + pobreYRico[0]);
    System.out.println("El empleado mas rico es " + pobreYRico[1]);
    System.out.println();
    eString.close();
  }
  

  //el empleado en la posicion 1 es el mas pobre y el empleado en la posicion 2 es el mas rico
  //sorry por el nombre jajaja
  public static Empleado[] getPoorestAndRichest(ArrayList<Empleado> empleados){
    Empleado[] pobreYRico = new Empleado[2];
    Empleado pobre = empleados.get(0), rico=empleados.get(0);
    for(int i = 0; i<empleados.size(); i++){
      if(empleados.get(i).sueldo > rico.sueldo){
        rico = empleados.get(i);
      }
      if(empleados.get(i).sueldo < pobre.sueldo){
        pobre = empleados.get(i);
      }
    }
    pobreYRico[0] = pobre;
    pobreYRico[1] = rico;
    return pobreYRico;
  }

  //el empleado en la posicion 1 es el mas joven y el empleado en la posicion 2 es el mas viejo
  public static Empleado[] getOlderAndYoungerEmpleado(ArrayList<Empleado> empleados){
    Empleado[] jovenYViejo = new Empleado[2];
    Empleado joven = empleados.get(0), viejo = empleados.get(0);
    for(int i = 0; i < empleados.size(); i++){
      if(empleados.get(i).getEdad() > viejo.getEdad()){
        viejo = empleados.get(i);
      }
      if(empleados.get(i).getEdad() < joven.getEdad()){
        joven = empleados.get(i);
      }
    }

    jovenYViejo[0] = joven;
    jovenYViejo[1] = viejo;

    return jovenYViejo;
  }

  public static ArrayList<Empleado> LeerArchivoPorLineas(String filename){
    String line = null;
    ArrayList<Empleado> empleados = new ArrayList<>();
    try {
      FileReader r = new FileReader(filename);
      BufferedReader br = new BufferedReader(r);

      while((line = br.readLine()) != null){
        Empleado e = createEmpleadoFromString(line);
        empleados.add(e);
      }

      br.close();
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (Error e){
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return empleados;
  }

  public static Empleado createEmpleadoFromString(String empleadoString){
    // Nombre[0] Apellido[1] FechaNacimiento[2] Sueldo[3]
    String[] campos = empleadoString.split(",");
    String nombre = campos[0];
    String apellido = campos[1];
    LocalDate fechaNacimiento = parseFecha(campos[2]);
    double sueldo = parseSueldo(campos[3]);

    Empleado e = new Empleado(nombre, apellido, fechaNacimiento, sueldo);
    return e;
  }

  public static LocalDate parseFecha (String fechaString){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate fecha = LocalDate.parse(fechaString, formatter);
    return fecha;
  }

  public static double parseSueldo (String sueldoString){
    return Double.parseDouble(sueldoString);
  }

  public static Empleado[] EmpleadoWithLetterOnLastname(String letra,ArrayList<Empleado> empleados){
    Empleado[] empleadosMatch = new Empleado[empleados.size()];
    int j = 0;
    for(int i = 0; i<empleados.size(); i++){
      if(empleados.get(i).apellido.toUpperCase().startsWith(letra.toUpperCase())){
        empleadosMatch[j] = empleados.get(i);
        j++;
      }
    }
    return empleadosMatch;
  }
}
