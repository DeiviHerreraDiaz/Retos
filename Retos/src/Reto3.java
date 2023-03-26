import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    
    public static void main(String[] args) { //*Cara o sello, las condiciones es que el jugador sea mayor a 18 y menor a 100 años para poder jugar. Al final diciendo quien gano, la maquina o el jugador  */
        
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();

        //*Variables */

        int seleccion, edad, opcion; 
        


        //*Proceso  */

        System.out.println("Digite la edad: ");
        edad = lectura.nextInt();

        if (edad<18) {
            System.out.println("No puede jugar");
        }   else if (edad>100) {
            System.out.println("Excede el numero de edad, no puede jugar");

        } else {
            System.out.println("Puede jugar, continue");
            System.out.println("Escoja: \n1. Cara\n2. Sello");
            seleccion = lectura.nextInt();

            opcion = aleatorio.nextInt(2) + 1;

            System.out.println("La opcion elegida por la maquina es: "+ opcion);

            if (opcion == seleccion) {
                System.out.println("Ganaste");
            } else { 
                System.out.println("Esta vez gano la maquina");
            }


        }

        
        lectura.close();
    }
}
