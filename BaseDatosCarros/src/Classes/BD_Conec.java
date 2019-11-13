package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Conec {
    
    
    public static  String url = "jdbc:oracle:thin:@localhost:1521:xe";
    public static  String user = "SYSTEM";
    public static  String password = "santigtr25";
    public static Connection con = null;
    
    public static Connection getBD_Conec(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = (Connection) DriverManager.getConnection(url,user,password);
            
           if(con!=null)
           {JOptionPane.showMessageDialog(null, "Conexion exitosa");
           }else{
               JOptionPane.showMessageDialog(null, "Conexion fallida");
           }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BD_Conec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BD_Conec.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}

