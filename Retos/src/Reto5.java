import java.util.Random;
import java.util.Scanner;

public class Reto5 {
    
    public static void main(String[] args) { 
        
        /* Recuerde que tiene que implementar un ciclo, un while o un DoWhile
        Hacer el juego de piedra papel o tijera, y cada uno va asignar el numero de vidas que tendra el juego.

        - Si usted gana mantiene vidas, si pierde va restando vidas */
        

        //Instanciar objetos
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();

        //Variables 
        int vidas, opcion, seleccion;
        String oportunidad = "s";

         
            System.out.println("Piedra, papel o tijera");

            do {

            System.out.println("¿Cuantas vidas desea para el juego?\nRecuerde que si la maquina le gana se le ira restando las vidas registradas");

            vidas = lectura.nextInt();
            
            while (vidas > 0) { // Mientras el jugador tenga vidas.
                opcion = aleatorio.nextInt(3) + 1;

                System.out.println("Escoja su opción:\n1.Piedra\n2.Papel\n3.Tijera");
                seleccion = lectura.nextInt();

                if (seleccion == opcion) {
                    System.out.println("Empate, su numero de vidas es: " + vidas);
                    System.out.println("La opcion elegida por la maquina es: " + opcion);
                    System.out.println();
                } else if ((seleccion == 1 && opcion == 3) || (seleccion == 2 && opcion == 1) || (seleccion == 3 && opcion == 2)) {
                    System.out.println("Gana el jugador, su numero de vidas es: " + vidas);
                    System.out.println("La opcion elegida por la maquina fue: " + opcion);
                    System.out.println();
                } else {
                    vidas--;
                    if (vidas == 0) {
                        System.out.println("Acabas de perder todas tus vidas");
                        
                    } else {
                        System.out.println("Perdiste contra la maquina, el numero de vidas restantes son: " + vidas);
                        System.out.println("La opcion elegida por la maquina fue: "+opcion);
                        System.out.println();
                    }
                }
            }
            System.out.println("Quiere volver a jugar? s/n");
            oportunidad = lectura.next();

            } while (oportunidad.equals("s") );
            System.out.println("Termino el juego");

            lectura.close();
        }
      
    }

    
