/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
            var passwd = "0000";
            cn = DriverManager.getConnection(url,user,passwd);
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertCB(Canbo x) {
//        getCon();
        try {
            Statement state = cn.createStatement();
            var query = String.format("INSERT INTO tbCanBo "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s')", x.getSotk(), x.getHoten(), x.getGt(), x.getDiachi(), x.getLuong());
            state.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateCB(Canbo x) {
//        getCon();
        try {
            Statement state = cn.createStatement();
            var query = String.format("UPDATE tbCanbo SET HoTen = '%s', GT = '%s', Diachi = '%s', Luong = '%s'"
                    + "WHERE SoTK = '%s'", x.getHoten(), x.getGt(), x.getDiachi(), x.getLuong(), x.getSotk());
            state.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public int deleteCB(Canbo x) {
//        getCon();
        int row = 0;
        try {
            Statement state = cn.createStatement();
            var query = String.format("DELETE From tbCanbo where SoTK = '%s'", x.getSotk());
            row = state.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return row;
    }
    
    public List<Canbo> getdata(){
        getCon();
        List<Canbo> listCB = new ArrayList<>();
        try {
            Statement state = cn.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM tbCanBo");
            
            while (result.next()) {     
                Canbo cb = new Canbo();
                cb.setSotk(result.getString(1));
                cb.setHoten(result.getString(2));
                cb.setGt(result.getString(3));
                cb.setDiachi(result.getString(4));
                cb.setLuong(result.getString(5));
                listCB.add(cb);
//                System.out.print(result.getString(1));
//                System.out.println(", "+result.getString("Hoten"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listCB;
    }
    
}
