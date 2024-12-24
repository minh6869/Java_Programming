/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bugs
 */
public class XLLuong {
    Connection cn;
    public void getCon(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DLLuong;encrypt=false";
            String user = "sa";
            String passwd = "0000";
            cn = DriverManager.getConnection(url, user, passwd);
            System.out.println("ket noi thanh cong");
        }
        
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Nhanvien getNVbyMa(String MaNV){
        getCon();
        Nhanvien nv = null;
        try{
            Statement state = cn.createStatement();
            String query = String.format("SELECT * FROM tbNhanvien WHERE MaNV = '%s'",MaNV);
            ResultSet result = state.executeQuery(query);
            
            while(result.next()){
                nv = new Nhanvien(result.getString(1), result.getString(2), result.getString(3),result.getString(4));
                return nv;
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return nv;
    }
    
    public int updateNV(Nhanvien x){
        getCon();
        
        try{
            Statement state = cn.createStatement();
            String query = String.format("UPDATE tbNhanvien SET Hoten = '%s', Diachi = '%s', Luong = '%s'"
                    + " WHERE MaNV = '%s'", x.getHoten(), x.getDiachi(), x.getLuong(), x.getMaNV());
            int row = state.executeUpdate(query);
            return row;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
