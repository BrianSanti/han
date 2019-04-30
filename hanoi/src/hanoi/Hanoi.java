
package hanoi;

import java.util.Scanner;


public class Hanoi {

    
    
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        han h = new han();
        
        System.out.print("Ingrese el numero de aros: ");
        n =  sc.nextInt();
        h.han(n, 1,2,3);
        
        
        
        
        
    }

    
    
}
