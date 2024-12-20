/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

//import java.beans.Statement;


import java.sql.*;

/**
 *
 * @author Bugs
 */
public class Test_insertCB {
    public static void doInsertCB(Canbo x){
       QLCB quanli = new QLCB();
       quanli.getCon();
        try {
            Statement state = quanli.cn.createStatement();
            var query = String.format("INSERT INTO tbCanBo "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s')", x.getSotk(), x.getHoten(), x.getGt(), x.getDiachi(), x.getLuong());
            state.executeUpdate(query);
          
            System.out.println("them thanh cong can bo moi");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
