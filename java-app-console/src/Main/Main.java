/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import test.X;

/**
 *
 * @author Bugs
 */

public class Main {
    int i;
    public void print(){
        System.out.println(i);
    }
    
    public static void main(String[] args){
        SinhVien.school_name = "hust";
        System.out.println(SinhVien.school_name);
        
        SinhVien x = new SinhVien(3);
        SinhVien.bang_diem[1] = 3;
        x.bang_diem[0] = 7;
        x.bang_diem = {4,6,7};
        x.kt.tenKhoa = "httt";
        x.kt.set_khoa("");
        x.kt = new Khoa();
        
        System.out.println(x.bang_diem[0]);
        
        x.school_name = "tlu";
//        SinhVien.MonHoc b = x.new MonHoc();
        x.set_id(1);
        SinhVien y = new SinhVien(4);
        y.set_id(3);
        System.out.println(y.school_name);
        System.out.println(y.gpa);
        
        
        X a = new X();
        a.abc = 2;
        
//        System.out.println(a[0]);
//        System.out.println("hi");
    }
    
}