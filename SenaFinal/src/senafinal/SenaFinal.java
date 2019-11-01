
package senafinal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SenaFinal {

    public static void main(String[] args) {
     int año=2019,edads,i;
     String nombre;
     Scanner edad = new Scanner(System.in);
      System.out.println("Ingrese su nombre");
      nombre = edad.nextLine();
     System.out.println("Ingrese su Año de nacimiento");
      i= edad.nextInt();
     System.out.println("Su año es:"+i);
      
     edads = i-año;
      System.out.println("Su edad es:"+edads);
     
    }
    
}
