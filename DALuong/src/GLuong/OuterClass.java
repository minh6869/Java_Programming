/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Bugs
 */
public class OuterClass extends JFrame  {
    private String outerField = "Outer Field";
    
    public OuterClass() {
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 100);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(this.getClass());             // Tham chiếu đến lớp ẩn danh (ActionListener)
                System.out.println(OuterClass.this.getClass());  // Tham chiếu đến lớp bao ngoài (OuterClass)
            }
        });
        
        this.add(button);
        this.setLayout(null);
        this.setBounds(100, 100, 500, 500);
        this.setVisible(true);
        
    }
}

