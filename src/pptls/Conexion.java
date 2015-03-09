/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// package shooter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author entornos
 */
public class Conexion {
    
    
    
    public static void Envia (Object objeto, String hostdestino, int puerto)
    {
      try {
          DatagramSocket socket;
          DatagramPacket paquete; 
          //El protocolo IP subyacente permite longitudes de paquetes de más de  2^16 bytes, 
          //que incluye tanto las cabeceras como los mensajes
          byte bytesEnviar[];    
            
          bytesEnviar= serializar(objeto);
          
          socket= new DatagramSocket();
          paquete=new DatagramPacket(bytesEnviar, bytesEnviar.length, InetAddress.getByName(hostdestino), puerto);
          socket.send(paquete);
          socket.close();
          
     } catch (SocketException ex) {
          System.out.println("Error al asignar el socket");
      } catch (UnknownHostException ex) {
          System.out.println("Error al crear el paquete");
      } catch (IOException ex) {
          System.out.println("Error en el envío del paquete");
      }
   
   }
  
  //Serialización
  
   static byte [] serializar (Object objeto)
   {      //Flujo de salida en el que escribirá os
          ByteArrayOutputStream bytes = new ByteArrayOutputStream(); 
          try {
              //La clase ObjectOutputStream permite convertir un objeto en una secuencia de bytes
              //Construimos indicando el buffer de salida
              ObjectOutputStream os = new ObjectOutputStream (bytes);
              os.writeObject(objeto);  
              os.close();
              byte [] bytesEnviar= bytes.toByteArray();
              return bytesEnviar;
          } catch (IOException ex) {
              System.out.println("Error: " + ex.getLocalizedMessage());
              System.out.println("Error al crear el array de bytes");
          }
      return null;
          
   }
   
   public static Object recibe ( int puerto)
  {
    DatagramSocket socket;
    DatagramPacket paquete=null;
    byte recibidos[]= new byte[50000];
    String IPRemota="";      
    int puertoRemoto;
      
    try{
      socket= new DatagramSocket(puerto);

      paquete= new DatagramPacket(recibidos, recibidos.length);

      socket.receive(paquete);
      
      //Información que podemos obtener de la cabecera del paquete
      IPRemota=paquete.getAddress().getHostName();
      puertoRemoto=paquete.getPort();
      
      socket.close();
    } catch (SocketException ex) {
          System.out.println("Error al asignar el socket");
      } catch (IOException ex) {
          System.out.println("Error en la recepción del paquete");
      }
    
    return deserializar(paquete);
  }
    
    
   static Object deserializar(DatagramPacket paquete)
    {
         ByteArrayInputStream bytesDelPaquete = new ByteArrayInputStream(paquete.getData()); // bytes es el byte[]
      try {
          //La clase ObjectInputStream recupera objetos en su forma original
          ObjectInputStream is = new ObjectInputStream(bytesDelPaquete);
          Object objetoAuxiliar=null;
             
                 objetoAuxiliar = is.readObject();
            
          is.close();
          return objetoAuxiliar;
      } catch (ClassNotFoundException ex) {
          System.out.println("Error al convertir el objeto");
      } catch (IOException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println("Error al extraer datos del paquete");
      } 
      return null;
  }
}
