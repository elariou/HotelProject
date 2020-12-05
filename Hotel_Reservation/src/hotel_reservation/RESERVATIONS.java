
package hotel_reservation;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elariou
 */
public class RESERVATIONS {
    MY_CONNECTION myconnection = new MY_CONNECTION();
    
    public boolean addRes(int clientID, int roomNumber, String dateIN, String dateOUT){
        PreparedStatement ps;

        String addQuery = "INSERT INTO `reservations`(`client_id`, `room_number`, `date_in`, `date_out`) VALUES (?,?,?,?)";
        
        try {
            ps = myconnection.createConnection().prepareStatement(addQuery);
            
            ps.setInt(1, clientID);
            ps.setInt(2, roomNumber);
            ps.setString(3, dateIN);
            ps.setString(4, dateOUT); 

            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editRes(int clientID, int roomNumber, String dateIN, String dateOUT, int resID){
        PreparedStatement ps;
      
        String editQuery = "UPDATE `reservations` SET `client_id`=?,`room_number`=?,`date_in`=?,`date_out`=? WHERE `id`=?";
        
        try {
            ps = myconnection.createConnection().prepareStatement(editQuery);
            
            
            ps.setInt(1, clientID);
            ps.setInt(2, roomNumber);
            ps.setString(3, dateIN);
            ps.setString(4, dateOUT); 
            ps.setInt(5, resID);
            
            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean removeRes(int resID){
        PreparedStatement ps;
      
        String deleteQuery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
            ps = myconnection.createConnection().prepareStatement(deleteQuery);
            
            
            ps.setInt(1, resID);

            return (ps.executeLargeUpdate()>0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void fillResJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservations`";
        
        try {
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel =(DefaultTableModel) table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[5];
                
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getDate(4);
                row[4] = rs.getDate(5);
                
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
