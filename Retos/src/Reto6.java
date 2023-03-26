import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) { 
        /*Recuerde que tiene que implementar un ciclo, un while o un DoWhile 
         * Hacer un juego de adivina la palabra, por la maquina. Como condicion tenemos el contador de vidas que se iran
         * disminuyendo si el jugador no adivina 
        */

        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();


       //Variables
       
        int elecC, Seleccion, vidas;
        String palabra;
        
        System.out.println("Juego adivina la palabra generada por la maquina, tematica: Animales :D\n1.Perro\n2.Gato\n3.Pez\n4.Caballo\n5.Paloma\n6.Cocodrilo");
        

        System.out.println("Cuantas vidas tendra el jugador: ");
        vidas = lectura.nextInt();    

        elecC = aleatorio.nextInt(6) + 1;

        switch (elecC) {
            case 1:
                palabra="Perro";
                break;
            case 2:
                palabra="Gato";
                break;
            case 3:
                palabra="Pez";
                break;
            case 4:
                palabra="Caballo";
                break;
            case 5:
                palabra="Paloma";
                break;
            case 6:
                palabra="Cocodrilo";
                break;
        default:
        palabra="0";
                break;
        }

        while (vidas > 0) {
            
    
            System.out.println("Escoge el numero de acuerdo a la palabra: ");
            Seleccion = lectura.nextInt();
            
        if (Seleccion == elecC) {
            
            System.out.println("Muy bien, adivinaste la palabra\nEl numero que elegiste fue: "+Seleccion+"\nla palabra es: "+elecC);
            break;
        } else { 
            vidas--;

            System.out.println("Perdiste :(\nTu numero de vidas es: "+vidas);
            if (vidas == 0 ) {

                System.out.println("Perdiste todas tus vidas, lo siento no adivinaste la palabra\nEl numero de la palabra era el "+elecC+" y la palabra era "+palabra);
                
            }
            lectura.close();
        }
    }
    }
}