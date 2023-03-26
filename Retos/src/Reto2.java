import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) { /*Hacer un programa que dependiendo de los datos registrados de su bebé se le asigne la dosis a aplicar
        - Primero va a preguntar el nombre del bebé
        - Segundo va a preguntar la eps del bebé
        - Tercero Va a preguntar el medico por el cual fue tratado
        - Cuarto Va a preguntar los meses del bebé
        Dependiendo de esos datos se aplica esta formula para saber la dosis a aplicar:dosis = peso + 15 / meses * 15 * 10 */
        
        Scanner lectura = new Scanner(System.in);

        //*Variables */

        int peso, meses, dosis; 
        String nom, doc, eps; 

        //*Proceso */

        System.out.println("Por favor digite el nombre de su bebé");
        nom = lectura.nextLine();

        System.out.println("En cual eps se encuentra su bebé?");
        eps = lectura.nextLine();

        System.out.println("Cual es es el nombre de su médico");
        doc = lectura.nextLine(); 

        System.out.println("Por favor digite el peso de su bebé");
        peso = lectura.nextInt();

        System.out.println("Por favor digite los meses que tiene su bebé");
        meses = lectura.nextInt(); 

        dosis = peso + 15 / meses * 15 * 10;


        System.out.println("El nombre del bebé es: "+nom);
        System.out.println("La eps del bebé es: "+eps);
        System.out.println("El nombre del doctor que los atendera es: "+doc);
        System.out.println("La dosis a aplicar es: "+dosis);

        lectura.close();

    }

}