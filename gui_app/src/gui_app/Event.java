/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Bugs
 */
public class Event extends MouseAdapter implements ActionListener {

    private test field;
    @Override
    public void actionPerformed(ActionEvent e) {
        field.getLbUserName().setText("nothing");
         System.out.println("hello");  
         
    }
    
//    public Event() {
//        
//    }
    public Event(test x) {
        
        this.field = x;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.field.getLbUserName().setBackground(Color.green);
        
    }

//    @Override
//    public void mousePressed(MouseEvent e) {
//        
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        
//    }
    
    
}
