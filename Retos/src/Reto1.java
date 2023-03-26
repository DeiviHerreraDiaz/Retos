import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) { //Realizar un programa sobre un horno que contiene una temperatura de 350°C, pero queremos hacer una conversión de esos grados a fahrenheit o kelvin si el usuario lo desea

        Scanner lectura = new Scanner(System.in);


        //*Variables */
        double TemHor=350, TemHor2; 
        String elegir;


        //*Proceso */
        System.out.println("Su horno tiene la temperatura de 350°C, Conversión a fahrenheit o Kelvin");

        elegir = lectura.nextLine();

        switch (elegir){

            case "fahrenheit":
            TemHor2 = TemHor + 32;
            System.out.println("Su horno necesita "+TemHor2+" grados fahrenheit");
            break; 

            case "kelvin":
            TemHor2 = TemHor + 273.15;
            System.out.println("Su horno necesita "+TemHor2+" grados kelvin");
            break;

        }

        lectura.close();
        
    }
    
}