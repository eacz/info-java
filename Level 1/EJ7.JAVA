import java.util.*;

public class EJ7 {
  
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    System.out.println("Ingrese una palabra en minuscula: ");
    String palabra = e.nextLine();
    String palabraMayuscula = "";
    for(int i = 0; i < palabra.length(); i++){
      palabraMayuscula += UppercaseArcaico(palabra.charAt(i));
    }
    System.out.println(palabraMayuscula);
  }


  public static char UppercaseArcaico(char c){
    switch(c){
        case 'a':
            return 'A';
        case 'b':
            return 'B';
        case 'c':
            return 'C';
        case 'd':
            return 'D';
        case 'e':
            return 'E';
        case 'f':
            return 'F';
        case 'g':
            return 'G';
        case 'h':
            return 'H';
        case 'i':
            return 'I';
        case 'j':
            return 'J';
        case 'k':
            return 'K';
        case 'm':
            return 'M';
        case 'n':
            return 'N';
        /* al intentar compilar se rompe al usar la ñ xd
        case 'ñ':
            return 'Ñ';
        */
        case 'l':
            return 'L';
        case 'o':
            return 'O';
        case 'p':
            return 'P';
        case 'q':
            return 'Q';
        case 'r':
            return 'R';
        case 's':
            return 'S';
        case 't':
            return 'T';
        case 'u':
            return 'U';
        case 'v':
            return 'V';
        case 'w':
            return 'W';
        case 'x':
            return 'X';
        case 'y':
            return 'Y';
        case 'z':
            return 'Z';
        default:
            return c;
    }
  }

}