import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();

        /* Recuerde que tiene que implementar un ciclo, un while o un DoWhile
        
        Hacer un juego de dados, tendrá el numero de vidas 
        con la condición de que se va restar la vida cuando el numero del otro sea mayor */

        //Variables

        int vidas1,vidas2, opcion1, opcion2;



        System.out.println("Juego de Dados, dos jugadores");

        System.out.println("Cada uno tendra un numero de vidas que seran ingresadas por ustedes, gana el jugador que mantenga sus vidas");

        System.out.println("Cuantas vidas tendra el jugadro 1: ");
        vidas1 = lectura.nextInt();
        
        System.out.println("Cuantas vidas tendra el jugadro 2: ");
        vidas2 = lectura.nextInt();

        System.out.println();


            
        

        while (vidas1 > 0 && vidas2 > 0) {
            opcion1 = aleatorio.nextInt(6) + 1;
            opcion2 = aleatorio.nextInt(6) + 1;

        if (opcion1 > opcion2) {

            vidas2--;
            System.out.println("Gana el jugador 1\nLo siento jugador 2\nLa suerte del jugador 1 fue: "+opcion1+"\nLa mala suerte del jugador 2 fue: "+opcion2);
            System.out.println("Las vidas del jugador 1 son: "+vidas1);
            System.out.println("Las vidas del jugador 2 son: "+vidas2);

            System.out.println();

            if (vidas2 == 0) {
        
                System.out.println("El jugador 1 perdió todas sus vidas\nFelicidades jugador 2, ganaste!!!");

            }

            System.out.println();

        } else if (opcion1 < opcion2) {
            
            vidas1--;
            System.out.println("Gana el jugador 2\nLo siento jugador 1\nLa suerte del jugador 2 fue: "+opcion2+"\nLa mala suerte del jugador 1 fue: "+opcion1);
            System.out.println("Las vidas del jugador 1 son: "+vidas1);
            System.out.println("Las vidas del jugador 2 son: "+vidas2);

            System.out.println();

            if (vidas1 == 0) {
        
                System.out.println("El jugador 1 perdió todas sus vidas\nFelicidades jugador 2, ganaste!!!");

            }

            System.out.println();

            
                
                
            }
              lectura.close();
        }

    }

    }

