
package pptls;


public class Jugador {
    
    private String elegido;
    
    private int puntos;
    
   Jugador(String s){
       this.puntos=0;
   }
   
   Jugador(){
       this.puntos=0;
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
