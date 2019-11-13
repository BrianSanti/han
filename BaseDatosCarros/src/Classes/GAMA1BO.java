package Classes;


import Classes.BD_Conec;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;




public class GAMA1BO {
    
    private String mensaje = "";
    private GAMA1DAO dao = new GAMA1DAO();
     public String agregarGAMA(GAMA1 ban)
    {
        Connection con =  BD_Conec.getBD_Conec();
        try {
        mensaje = dao.agregarGama(con, ban);
        con.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(con != null)
                {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
        return mensaje;
    }
    
     public void listargamar(JTable jTable1) 
    {
        Connection con = BD_Conec.getBD_Conec();
        try {
            dao.listarCorreo(con, jTable1);
        
              con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }


    
    
    
}
