import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        /* Recuerde que tiene que implementar un ciclo, un while o un DoWhile
        
        Diseñar un sistema que nos permita hacer un formulario de registro de 
        usuarios, con la mecánica de un formulario de Google Drive */


        //Variables

        String correo, nom, ape, pro, respuesta;
        int ficha, edad;
        long num;

        System.out.println("Formulario de contacto a instructores: ");

        System.out.println("Formulario enfocado a dar información primordial al instructor de su ficha");

        System.out.println();


        //Pedir datos 

        do {


        System.out.println("Digite el correo Misena o SoySena: *Campo obligatorio*");
        correo = lectura.next();

        System.out.println();

        System.out.print("Digite nombres completos: *Campo obligatorio*");
        nom = lectura.next();

        System.out.println();
        
        System.out.println("Digite apellidos completos: *Campo obligatorio*");
        ape = lectura.nextLine();

        System.out.println();

        System.out.println("Digite su edad: *Campo obligatorio*");
        edad = lectura.nextInt();

        System.out.println();

        System.out.println("Programa: *Campo obligatorio*");
        pro = lectura.next();

        System.out.println();


        System.out.println("Numero de ficha: *Campo obligatorio*");
        ficha = lectura.nextInt();

        System.out.println();

        System.out.println("Numero de celular: ");
        num = lectura.nextLong();


        //Mostrar datos 

        System.out.println();

        System.out.println("Correo Misena / SoySena: "+correo+"\nNombres completos: "+nom+"\nApellidos completos: "+ape+"\nEdad: "+edad+"\nPrograma: "+pro+"\nNumero de ficha: "+ficha+"\nNumero de celular: "+num);

        


       
        System.out.println("Quiere volver a llenar el formulario: s/n");
        respuesta = lectura.next();

        } while (respuesta.equals("s"));

        System.out.println("Hasta luego");
    
        lectura.close();
    }


}
