
package pptls;

public class Ordenador {
    
    
    private String elegido;
    private int puntos;
    
    Ordenador(){
        this.puntos=0;
    }
   
   public String randomChoice(){
       int n;
       String c;
       n=(int)(Math.random()*5+1);
       switch(n)
       {
           case 1: c="piedra.png";
               break;
           case 2: c="papel.png";
               break;
           case 3: c="tijera.png";
               break;
           case 4: c="lagarto.png";
               break;
           default: c="spock.png";
       }
       
        return c;
   }
    
    public void sumaPunto(){
       this.puntos++;
   }

    public String getElegido() {
        return elegido;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setElegido(String elegido) {
        this.elegido = elegido;
    }
    
    
}

    
   
