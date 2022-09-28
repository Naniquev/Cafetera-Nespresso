
package Entidades;


public class Cafetera {
    
    //Atributos
    private int capMax;
    private int cantActual;
    private int llenar;
    
    //Contructor por defecto
    public Cafetera() {
       
       this.cantActual= 250;
    }
    
    //Contructor por parametro
    public Cafetera(int capMax, int cantActual, int llenar) {
        this.capMax = capMax;
        this.cantActual = 250;
    }
    
    //Getter & Setter

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getLlenar() {
        return llenar;
    }

    public void setLlenar(int llenar) {
        this.llenar = llenar;
    }
    
    
    
    
  
  

   

  
    
}
