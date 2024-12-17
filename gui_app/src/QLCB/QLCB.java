/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bugs
 */
public class QLCB implements ICanbo {
    Connection cn;
    @Override
    public void getCon() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCB;encrypt=false";
            var user = "sa";
            var passwd = "12345678";
            cn = DriverManager.getConnection(url,user,passwd);
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertCB(Canbo x) {
        
    }
    
    public void getdata(){
        getCon();
        try {
            Statement state = cn.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM tbCanBo");
            
            while (result.next()) {                
                System.out.print(result.getString(1));
                System.out.println(", "+result.getString("Hoten"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
