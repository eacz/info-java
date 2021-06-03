package Ejercicios_propuestos;

import java.io.*;

public class EJ3 {
  public static void main(String[] args) {
    String filename = "C:\\Users\\andy\\Documents\\INFO\\Java\\Ejercicios\\Ejercicios_propuestos\\alumnos.txt";
    LeerArchivo(filename);
  }

  public static void LeerArchivo(String filename){
    String line = null;
    try {
      FileReader r = new FileReader(filename);
      BufferedReader br = new BufferedReader(r);

      while((line = br.readLine()) != null){
        System.out.println(line);
      }

      br.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (Error e){
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
