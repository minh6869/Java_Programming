/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import main.ConGa;
import test.X;

/**
 *
 * @author Bugs
 */

public class Main {
    public static void main(String[] args){
        
        ConGa a = new ConGa("red","a");
        DongVat x;
        x = new ConGa("x","x");
        x.keu();
        if (x instanceof ConGa) {
            ConGa y = (ConGa)x;
            y.moThoc();
            y.setName("y");
        }
        ((ConGa)x).moThoc();
        ConGa y = (ConGa)x;
        y.moThoc();
        y.setName("y");
        System.out.println(x.getName());
        x = new ConMeo("x","x");
        x.keu();
        
        
    }
    
    
    
}
