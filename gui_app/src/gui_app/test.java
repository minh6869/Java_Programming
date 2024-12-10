/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_app;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Bugs
 */
public class test extends JFrame {
    
    private Label lbUserName;

    public test() {
        showapp();
    }
    
    public void showapp(){
//        Frame app = new Frame("Xin chao");
        this.setVisible(true);
        this.setSize(800, 800);
        this.setLocation(300, 200);

        Point start = new Point(300, 200);
        this.setLocation(start);
        this.setBounds(300, 200, 800, 800);
        
        Label lbUserName = new Label();
        lbUserName.setText("Nhap username");
        lbUserName.setBackground(Color.red);
        lbUserName.setForeground(Color.black);
        lbUserName.setBounds(100, 50,100, 30);
        
        Label lbPassWord = new Label();
        lbPassWord.setText("Nhap password");
        lbPassWord.setBackground(Color.red);
        lbPassWord.setForeground(Color.black);
        lbPassWord.setBounds(100, 100,100, 30);
        
        //tao textfield
        
        TextField tfUserName = new TextField();
        tfUserName.setBounds(250, 50, 100, 30);
       
        TextField tfPassWord = new TextField();
        tfPassWord.setBounds(250, 100, 100, 30);
        tfPassWord.setEchoChar('*');
        
        
        
        //add components
        this.add(lbUserName);
        this.add(lbPassWord);
        
        this.add(tfUserName);
        this.add(tfPassWord);
        
        this.setLayout(null);
    }
}
