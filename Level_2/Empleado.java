package Level_2;

public class Empleado {
  int horasTrabajadas;
  int valorPorHora;
  String nombre;
  String apellido;
  String DNI;


  public Empleado(int horasTrabajadas, int valorPorHora, String nombre, String apellido, String DNI){
    this.DNI = DNI;
    this.horasTrabajadas = horasTrabajadas;
    this.valorPorHora = valorPorHora;
    this.apellido = apellido;
    this.nombre = nombre;
  }
  @Override
  public String toString() {
    return this.nombre + " " + this.apellido;
  }
}