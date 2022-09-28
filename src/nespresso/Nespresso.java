package nespresso;
/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */

import Entidades.Cafetera;
import Servicio.ServCafe;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ServCafe sc = new ServCafe();
        Cafetera cafe = new Cafetera();

        int opcion;

        do {
            System.out.println("||Nespresso||");
            System.out.println("-----------------------------");
            System.out.println("** Responda con SI o No ** ");
            System.out.println("Menu" + "\n"
                    + "1-Llenar cafetera" + "\n"
                    + "2-Servir taza" + "\n"
                    + "3-Vaciar" + "\n"
                    + "4-Agregar cafe" + "\n"
                    + "5- salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sc.llenarCafetera(cafe);
                    System.out.println(" ");
                    break;
                case 2:
                    sc.servirTaza(cafe);
                    System.out.println(" ");
                    break;
                case 3:
                    sc.vaciarCafetera(cafe);
                    System.out.println(" ");
                    break;
                case 4:
                    sc.agregarCafe(cafe);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Salir");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

    }

}
