/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Bugs
 */
public class ConGa extends DongVat {
    public String loaiga;

    public ConGa(String color, String name) {
        super(name, color);
//        this.color = color;
//        this.name = name;
    }
    @Override
    public void keu(){
        System.out.println("cook cook cook");
    }
    
    public void moThoc(){
//        super.keu();
        this.keu();
    }
}
