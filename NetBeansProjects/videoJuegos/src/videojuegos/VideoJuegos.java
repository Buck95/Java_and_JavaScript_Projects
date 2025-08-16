package videojuegos;

import java.util.Scanner;


public class VideoJuegos {
 
    
    static String videoJuegos [][] = new String [5][2];


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int opcion;
        
        do { 
            System.out.println("Menu de Videojuegos");
            System.out.println("1. Agregar video juego");
            System.out.println("2. Mostrar lista de videojuegos");
            System.out.println("3. Modificar precio de un videojuego");
            System.out.println("4. Salir");
            
            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    agregarVideojuego(entrada);                    
                    break;
                case 2:
                    mostrarVideojuegos();
                    break;
                case 3:
                    modificarPrecio(entrada);
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!.....");
                    break;
                default:
                    System.out.println("Eleccion invalida");
            }
            
        } while (opcion != 4);
        entrada.close();
      }
    
    public static void agregarVideojuego(Scanner entrada){
        
        for(int i=0; i<videoJuegos.length; i++){
           
            if(videoJuegos[i][0]== null){
                System.out.println("Ingrese el nombre del juego");
                entrada.nextLine();
                
                videoJuegos [i][0]= entrada.nextLine();
                System.out.println("Ingrese el precio del juego");
                
                videoJuegos[i][1] = String.valueOf(entrada.nextDouble());
                System.out.println("Video juego agregado con exito");
                return;
            }
                  
        }
        
        System.out.println("No hay espacio para agregar juegos");
        }
    
    public static void mostrarVideojuegos(){
        System.out.println("Lista de Video juegos");
        for (int i=0; i<videoJuegos.length; i++){
        if (videoJuegos[i][0] != null){
            System.out.println((i+1) + ". " + videoJuegos[i][0] + " - $" + videoJuegos[i][1]);
        }
        }
    }
    
    public static void modificarPrecio(Scanner entrada){
        
        mostrarVideojuegos();
        
        System.out.println("Ingrese el numero del video juego que desea modificar: "); 
        int indice = entrada.nextInt() -1;
        
        if(indice >=0 && indice <videoJuegos.length && videoJuegos[indice][0] != null){
            System.out.println("Ingrese el nuevo precio" + videoJuegos[indice][0] + ": ") ;
            videoJuegos[indice][1] = String.valueOf(entrada.nextDouble());
            System.out.println("Precio actualizado con exito");
        }
        
        else {
            System.out.println("Video Juego no valido");
        }       
    }
}
