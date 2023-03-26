import java.util.Random;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) { //Piedra, papel o tijera, con las condiciones de que el jugador sea mayor a 18 y menor a 100 años para poder jugar. Al final diciendo quien gano, si la maquina o el jugador //
        
        
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();

        //Variables//
        int edad, seleccion, opcion;
        


        //Proceso//
        System.out.println("Digite la edad: ");
        edad = lectura.nextInt();

        System.out.println();

        if (edad < 18) {
            System.out.println("No puede jugar");
        } else if (edad > 100) {
            System.out.println("Excede el número de edad, no puede jugar");
        } else {
            System.out.println("Puede jugar, continue");

           
                System.out.println("El juego es piedra, papel o tijera. Escoja su opción:\n1.Piedra\n2.Papel\n3.Tijera");
                seleccion = lectura.nextInt();

                
                System.out.println();

                opcion = aleatorio.nextInt(3) + 1;

                if (seleccion == opcion) {
                    System.out.println("Empate");
                    System.out.println("La opcion elegida por la maquina es: " + opcion);
                    System.out.println();
                } else if ((seleccion == 1 && opcion == 3) || (seleccion == 2 && opcion == 1) || (seleccion == 3 && opcion == 2)) {
                    System.out.println("Gana el jugador");
                    System.out.println("La opcion elegida por la maquina fue: " + opcion);
                    System.out.println();
                } else {
                    System.out.println("Gana la computadora");
                    System.out.println("La opcion elegida por la maquina fue: " + opcion);
                    System.out.println();

                }

              
        }   

        lectura.close();   
    }
}
