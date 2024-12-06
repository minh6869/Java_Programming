/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Bugs
 */
public class SoNguyen {
    int n;

    public SoNguyen(int n) {
        this.n = n;
    }
    
    
    public boolean equals(Object obj) {
//        SoNguyen moi = (SoNguyen)obj;
        return  this.n == ((SoNguyen)obj).n;
    }
    public void swap(int x){
        int temp = x;
        x = this.n;
        this.n = temp;
    }
    
    public void swap(SoNguyen x){
        int temp = this.n;
        this.n = x.n;
        x.n = temp;
    }
    
}
