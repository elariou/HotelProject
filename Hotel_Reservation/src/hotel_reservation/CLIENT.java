
package hotel_reservation;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elariou
 */
public class CLIENT {
    
    MY_CONNECTION myconnection = new MY_CONNECTION();
    
    public boolean addClient (String fname, String lname, String phone, String email){
        PreparedStatement ps;

        String addQuery = "INSERT INTO `clients`(`first_name`, `last_name`, `phone`, `email`) VALUES (?,?,?,?)";
        
        try {
            ps = myconnection.createConnection().prepareStatement(addQuery);
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);

            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editClient(int ID, String fname, String lname, String phone, String email){
        PreparedStatement ps;
      
        String editQuery = "UPDATE `clients` SET `first_name`=?,`last_name`=?,`phone`=?,`email`=? WHERE `id`=?";
        
        try {
            ps = myconnection.createConnection().prepareStatement(editQuery);
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setInt(5, ID);

            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean removeClient(int ID){
        PreparedStatement ps;
      
        String deleteQuery = "DELETE FROM `clients` WHERE `id`=?";
        
        try {
            ps = myconnection.createConnection().prepareStatement(deleteQuery);
            
            
            ps.setInt(1, ID);

            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void fillClientJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `clients`";
        
        try {
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel =(DefaultTableModel) table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[5];
                
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
