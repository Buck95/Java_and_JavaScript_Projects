
package ejerciciolecturanumerosdeproductos;

import java.util.Scanner;


public class EjercicioLecturaNumerosDeProductos {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de productos que desea gestionar: ");
        int numProducto = entrada.nextInt(); // Se ingresa el numero de productos     
        
        String [] productos = new String[numProducto];
        double[] precios = new double[numProducto];
        int[] stock = new int[numProducto];
        
        //Ingreso de nombre, precio y cantidad en Stock
        for(int i=0; i<numProducto;i++){
            System.out.println("Ingrese el nombre del producto "+(i+1)+":");
            productos[i]=entrada.next();
            System.out.println("ingrese el precio: ");
            precios[i]=entrada.nextDouble();
            System.out.println("ingrese la cantidad de Stock");
            stock[i]=entrada.nextInt();
            } 
        // valor total del inventario 
        
        double total = 0; 
        for( int i =0; i<numProducto;i++){
            total += precios[i] * stock[i];
        }
//        System.out.println("El valor total del inventario es: "+total);
        
        //determinacion del producto mas caro y mas barato 
        
        double precioMasAlto = precios[0];
        double precioMasBajo = precios[0];
        String producMaximo = productos[0];
        String producMinimo = productos[0];
        
            for( int i=1; i<numProducto;i++){
                if (precios[i]>precioMasAlto){
                precioMasAlto = precios[i];
                producMaximo = productos[i];}
                
                if (precios[i]<precioMasBajo){
                precioMasBajo=precios[i];
                producMinimo = productos[i];
                }
                }
            System.out.println("El valor total del inventario es: "+total);
            System.out.println("Producto mas caro: "+producMaximo);
            System.out.println("Producto mas barato: "+ producMinimo);
            System.out.println("El precio mas alto es: "+precioMasAlto);
            System.out.println("El precio mas bajo es: "+precioMasBajo);
            
           }    
    }
   
    

