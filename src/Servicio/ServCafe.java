package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServCafe {

    public Cafetera llenarCafetera(Cafetera cf) {

        Scanner leer = new Scanner(System.in);

      

        System.out.println("¿Desea llenar la cafetera?");
        String llenar = leer.next();

        if ("si".equals(llenar)) {
            cf.setCapMax(cf.getCantActual() + 500);
            System.out.println("|||||||||||");
            System.out.println("La cafetera esta lista con" + " " + cf.getCapMax() + "ml");
        } else {
            System.out.println("La cafetera contiene" + " " + cf.getCantActual() + "ml");
        }

        return cf;

    }
    
    
    

    public int servirTaza(Cafetera cf) {

        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Tamaño de la taza" + " " + "1- 200ml" + " "
                + "2- 250ml" + " " + "3- 300ml");
        int taza = leer.nextInt();

        if (taza < cf.getCantActual()) {

            switch (taza) {
                case 1:
                    cf.setCantActual(cf.getCantActual() - 200);
                    System.out.println("|||||||||||||||||||");
                    System.out.println("La taza se ha llenado con 200ml de cafe");
                    break;
                case 2:
                    cf.setCantActual(cf.getCantActual() - 250);
                    System.out.println("||||||||||||||||||");
                    System.out.println("La taza se ha llenado con 250ml de cafe");
                    break;
                case 3:
                    cf.setCantActual(cf.getCantActual() - 300);
                    System.out.println("|||||||||||||||||||");
                    System.out.println("La taza se ha llenado con 300ml");
                    break;
                default:
                    System.out.println("Ingrese una opcion");
                }
        }else{
            if(taza>cf.getCantActual()){
               System.out.println("La cantidad de cafe no es suficiente. ¿Desea llenar la taza?");
               String x = leer.nextLine();
               if( x.equalsIgnoreCase("si"))
                    System.out.println("||||||||||||||||||");
                System.out.println("la taza se lleno con"+" "+ cf.getCantActual() + "ml");
               if (x.equalsIgnoreCase("no"))
                    System.out.println("Llenado cancelado");
           }
         }
             
         return taza;

        }
  

    public int vaciarCafetera(Cafetera cf) {

        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("¿Desea vaciar la cafetera?");
        String vaciar = leer.nextLine();
        int restar = 0;

        if (vaciar.equalsIgnoreCase("si")) {
            restar = cf.getCantActual() - cf.getCantActual();
            System.out.println("Cafetera vacia" + "(" + restar + ")");
        } else {
            System.out.println("Cafetera con" + cf.getCantActual() + "ml");
        }
        return restar;
    }

    public int agregarCafe(Cafetera cf) {

        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("¿Desea agregar cafe?");
        String agregar = leer.next();
        int cant = 0;

        if (agregar.equalsIgnoreCase("si")) {
            System.out.println("Cantidad:" + " " + "1-200ml" + " " + "2-300ml");
            cant = leer.nextInt();

            switch (cant) {
                case 1:
                    cant = cf.getCantActual() + 200;
                    System.out.println("Cafetera con" + " " + cant + "ml");
                    break;
                case 2:
                    cant = cf.getCantActual() + 300;
                    System.out.println("Cafetera con" + " " + cant + "ml");
                    break;
                default:
                    System.out.println("Cantidad actual" + " " +cf.getCantActual());
            }
        }

        return cant;
    }

}
