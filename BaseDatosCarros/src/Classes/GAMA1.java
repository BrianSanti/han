
package Classes;



public class GAMA1 {
    
    private int codigo;
    private String gama;

    public GAMA1() {
        
        
        
    }

    public GAMA1(int codigo, String gama) {
        this.codigo = codigo;
        this.gama = gama;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    @Override
    public String toString() {
        return "GAMA1{" + "codigo=" + codigo + ", gama=" + gama + '}';
    }
    
    
    
    
    
    
}
