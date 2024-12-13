/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Bugs
 */
public class test extends JFrame implements ActionListener {
    
    private Label lbUserName;

    public Label getLbUserName() {
        return lbUserName;
    }

    public void setLbUserName(Label lbUserName) {
        this.lbUserName = lbUserName;
    }

    
    
    
    
    

    public test() {
        showapp();
    }
    
    public void something(){
        lbUserName.setText("xyz");
    }
    
    public void showapp(){
//        Frame app = new Frame("Xin chao");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(800, 800);
        this.setLocation(300, 200);

        Point start = new Point(300, 200);
        this.setLocation(start);
        this.setBounds(300, 200, 800, 800);
        
        lbUserName = new Label();
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
        
        
        //tao button
        
        Button btLogin = new Button("Login");
        btLogin.setBounds(100,200, 100, 50);
//        Event clickLogin = new Event();
        btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("xin chao"); 
                 lbUserName.setText("abc");
                 something();
            }    
        }
        );
        
        btLogin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("");
            }
        });
        
        
        Button btRegister = new Button("Register");
        btRegister.setBounds(250, 200, 100, 50);
        Event clickRegister = new Event(this);
        btRegister.addActionListener(clickRegister);
        btRegister.addMouseListener(clickRegister);
        
        Button newButton = new Button("newbutton");
        newButton.setBounds(400, 200, 100, 50);
//        Event clickRegister = new Event(this);
        newButton.addActionListener( this);
        
        
        //add components
        this.add(lbUserName);
        this.add(lbPassWord);
        
        this.add(tfUserName);
        this.add(tfPassWord);
        
        this.add(btLogin);
        this.add(btRegister);
        this.add(newButton);
        
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lbUserName.setLocation(lbUserName.getLocation().x + 20, lbUserName.getLocation().y);
        lbUserName.setBackground(Color.yellow);
        lbUserName.setText("chacogi");
    }
}
