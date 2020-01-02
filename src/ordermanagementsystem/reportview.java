package ordermanagementsystem;

import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import ordermanagementsystem.DBOperations;
/**
 *
 * @author toshiba
 */
public class reportview extends javax.swing.JFrame{
    
    public reportview(String filename, HashMap para)
    {
        super("Product Report View");
            
        
        try 
        {
            DBOperations d = new DBOperations();
            Connection conn = d.connect();
            
            JasperPrint abc = JasperFillManager.fillReport(filename, para, conn);
            JRViewer view = new JRViewer(abc);
            
            Container co = getContentPane();
            co.add(view);
                   
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        setBounds(10,10,1000,1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public static void main (String args[]){
        

    }
    
    
}
