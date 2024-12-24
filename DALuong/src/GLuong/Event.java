/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;
import javax.swing.*;

/**
 *
 * @author Bugs
 */
public class Event {
    private GUI_updateNV app;
    
    public Event(GUI_updateNV app){
        this.app = app;
    }
    
    public void getNVbyMa(String MaNV){
        XLLuong xuli = new XLLuong();
        xuli.getCon();
        Nhanvien nv = xuli.getNVbyMa(MaNV);
        if(nv != null){
            app.getTfHoten().setText(nv.getHoten());
            app.getTfLuong().setText(nv.getLuong());
        }
        else{
            JOptionPane.showMessageDialog(app, String.format("khong tim thay nhan vien co ma nhan vien la: '%s'", MaNV));
        }
    }
    
    public void updateNV(){
        XLLuong xuli = new XLLuong();
        xuli.getCon();
        String maNV = app.getTfMaNV().getText();
        String hoTen = app.getTfHoten().getText();
        String Luong = app.getTfLuong().getText();
        
        int check = xuli.updateNV(new Nhanvien(maNV, hoTen, "", Luong));
        if(check == 1)
            JOptionPane.showMessageDialog(app, "Cap nhat thanh cong");
        else
            JOptionPane.showMessageDialog(app, "Cap nhat khong thanh cong");
        
    }
}
