
package programa;


public class Main {
    
    public static void main(String[] args) {
        
       Persona personasV [] = new Persona[4];
       personasV[0] = new Cajero(101,"Andres","Onofre",400f, "Pasto");
       personasV[1] = new Gerente( 102,"Camilo","Bucheli",900f, "Ingeniero");
       personasV[2] = new ClientePremium(103, "Piedad","Delgado", 830);
       personasV[3] = new ClienteNormal(104,"Julia","Ceron",700f,900);
       
       for(Persona i:personasV){
           
           System.out.println(i.mostrarDatos());
           System.out.println(" "); 
       }  
    }
}
