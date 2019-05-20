package collas;

import java.util.Scanner;


public class Collas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int sw,dato;
      Inicio cola = new Inicio();

      do{
            System.out.println("\n\t 0. SALIR \n\t 1. INGRESAR \n\t 2.ELIMINAR \n\t 3. MOSTRAR \n\t");
            System.out.println("\n\t OPCION:    ");
            sw = sc.nextInt();
            switch(sw){
                case 1:{
                    System.out.print("\n\t INGRESE NUMERO :\t\t");
                     dato = sc.nextInt();
                     cola.InsertarEnPrimero(dato);
                break;
                }
                case 2:{
                    System.out.println("\n\t EL DATO HA SIDO ELIMINADO");
                    cola.borrarUltimo();
                     break;
                }
                case 3:{
                    System.out.println("\n\t DATOS:  "+cola.Listar());
                     break;
                }
              }
        }while(sw!=0);
    }   
}
    
    

