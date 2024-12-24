/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;

/**
 *
 * @author Bugs
 */
public class GUI_updateNV extends JFrame {
    private JTextField tfMaNV;
    private JTextField tfHoten;
    private JTextField tfLuong;
    private JComboBox cbDiachi;
    private JButton btTimkiem;
    private JButton btCapnhat;
    
    public GUI_updateNV(){
        
        JLabel lbMaNV  = new JLabel("Ma nhan vien");
        lbMaNV.setBounds(100, 100, 150, 50);
        
        JLabel lbHoten  = new JLabel("Ho ten");
        lbHoten.setBounds(100, 250, 150, 50);
        
        JLabel lbLuong  = new JLabel("Luong");
        lbLuong.setBounds(100, 400, 150, 50);
        
        
        
        tfMaNV = new JTextField();
        tfMaNV.setBounds(250, 100, 100, 50);
        
        tfHoten = new JTextField();
        tfHoten.setBounds(250, 250, 100, 50);
        
        tfLuong = new JTextField();
        tfLuong.setBounds(250, 400, 100, 50);
        
        
        btTimkiem = new JButton("Tìm kiếm nhân viên");
        btTimkiem.setBounds(100, 550, 150, 50);
        btTimkiem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Event timkiem = new Event(GUI_updateNV.this);
                timkiem.getNVbyMa(tfMaNV.getText());
                
            }
        });
        
        btCapnhat = new JButton("Cập nhật nhân viên");
        btCapnhat.setBounds(300, 550, 150, 50);
        btCapnhat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Event event = new Event(GUI_updateNV.this);
                event.updateNV();
            }
        
        
        });
        
        
        
        //add components
        
        
        //add JLabel
        this.add(lbMaNV);
        this.add(lbHoten);
        this.add(lbLuong);
        
        
        //add JTextField
        this.add(tfMaNV);
        this.add(tfHoten);
        this.add(tfLuong);  
        
        //add JButton
        this.add(btTimkiem);
        this.add(btCapnhat);
        
        
        
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 1000);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public JTextField getTfMaNV(){
        return this.tfMaNV;
    }

    public JTextField getTfHoten() {
        return tfHoten;
    }

    public JTextField getTfLuong() {
        return tfLuong;
    }
    
}
