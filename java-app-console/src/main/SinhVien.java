/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Bugs
 */
class SinhVien {
//    private class MonHoc{
//    
//    }
//    public static String school_name;
    private Khoa kt;
    private float gpa;
    private int id;
//    public final static float bang_diem[] = {3,4,2};
    public SinhVien(float gpa){
        this.gpa = gpa;
    }
    public void set_id(int id){
        this.id = id;
    }
    
    
    public SinhVien(Khoa k, float gpa, int id) {
        this.kt = k;
        this.gpa = gpa;
        this.id = id;
    }

    public Khoa getKt() {
        return kt;
    }

    public void setKt(Khoa kt) {
        this.kt = kt;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
   
}
