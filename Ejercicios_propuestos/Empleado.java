package Ejercicios_propuestos;
import java.time.LocalDate;

public class Empleado {
  double sueldo;
  String nombre;
  String apellido;
  LocalDate fechaNacimiento;


  public Empleado( String nombre, String apellido, LocalDate fechaNacimiento, double sueldo){
    this.fechaNacimiento = fechaNacimiento;
    this.sueldo = sueldo;
    this.apellido = apellido;
    this.nombre = nombre;
  }
  @Override
  public String toString() {
    return this.nombre + " " + this.apellido;
  }

  public int getEdad(){
    LocalDate hoy = LocalDate.now();
    int edad = hoy.getYear() - this.fechaNacimiento.getYear();
    
    if(this.fechaNacimiento.getMonthValue() > hoy.getMonthValue()){
      edad--;    
    } else if((this.fechaNacimiento.getMonth().getValue() == hoy.getMonthValue()) && (hoy.getDayOfMonth() > this.fechaNacimiento.getDayOfMonth())){
      edad--;    
    }

    return edad;
  }
}