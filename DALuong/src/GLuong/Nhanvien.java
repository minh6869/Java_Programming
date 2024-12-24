/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author Bugs
 */
public class Nhanvien extends Person {
    private String Diachi;
    private String Luong;
    
    public Nhanvien(){
    }
    
    public Nhanvien(String Diachi, String Luong){
        this.Diachi = Diachi;
        this.Luong = Luong;
    }
    
    public Nhanvien(String MaNV, String Hoten, String Diachi, String Luong){
        super(MaNV, Hoten);
        this.Diachi = Diachi;
        this.Luong = Luong;
    }
    
    public String getDiachi(){
        return this.Diachi;
    }
    
    public void setDiachi(String Diachi){
        this.Diachi = Diachi;
    }
    
    public String getLuong(){
        return this.Luong;
    }
    
    public void setLuong(String Luong){
        this.Luong = Luong;
    }
    
}
