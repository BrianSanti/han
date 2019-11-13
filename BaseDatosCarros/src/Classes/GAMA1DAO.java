

package Classes;

import static Classes.BD_Conec.getBD_Conec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





public class GAMA1DAO {
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    
    
    
    
    private String mensaje = "";
    public String agregarGama(Connection con , GAMA1 ban)
    {
        PreparedStatement pst = null;
        String sql = "INSERT INTO BDS_GAMA (ID_GAMA,DESCRIPCION) "
                + "VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
             pst.setInt(1, ban.getCodigo());
             pst.setString(2, ban.getGama());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
           mensaje = "NO SE LOGRO GUARDAR LOS DATOS \n" +e.getMessage();
        }
        return mensaje;
    }
    
    public void listarCorreo(Connection con,JTable jTable1) 
    {
     try
    {    
    DefaultTableModel model ;
    String[] columnas = {"ID_GAMA","GAMA"};
    model = new DefaultTableModel(null , columnas);
    String sql = "Select * From BDS_GAMA";
    String[] filas = new String[2];
    Statement st = null;
    ResultSet rs = null;
  
   
        st = con.createStatement(); 
        rs = st.executeQuery(sql);
        while(rs.next())
        {
            for (int i = 0; i < 2; i++) {
                filas[i] = rs.getString(i+1);
            }
            model.addRow(filas);
        }
       jTable1.setModel(model);
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"NO SE PUEDE LISTAR LA TABLA "+e);
    }
        
    
        
        
        
        
        
  }
    
    
    
}



