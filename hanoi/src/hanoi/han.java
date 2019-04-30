
package hanoi;


public class han {
    
    public void han(int num, int inicio, int temp, int fin){
    
    if(num ==1){
    
    System.out.print("Moviendo de la torre de inicio " +inicio+ " a la torre de destino " +fin);
    }
    else  
    {
        han(num-1,inicio,fin,temp);
        System.out.println("Movimiento de la torre de inicio " +inicio+ " a la aotrrre de destino " +fin);
        han(num-1,temp,inicio,fin);
    }
    }

    
    
    
    
    
}
