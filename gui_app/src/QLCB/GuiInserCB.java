/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bugs
 */
public class GuiInserCB extends JFrame {

    private JButton btInsertCB;
    private JButton btGetData;
    private JTextField tfStk;
    private JTextField tfHoten;
    private JTextField tfGt;
    private JTextField tfDiachi;
    private JTextField tfLuong;
    private JTable tbDulieu;
    private DefaultTableModel dtb;
    private JScrollPane scroll;

    public GuiInserCB() {

        JLabel lbStk = new JLabel("stk");
        lbStk.setBounds(100, 100, 150, 50);

        JLabel lbHoten = new JLabel("Ho ten");
        lbHoten.setBounds(100, 180, 150, 50);

        JLabel lbGt = new JLabel("Gioi tinh");
        lbGt.setBounds(100, 260, 150, 50);

        JLabel lbDiachi = new JLabel("Dia chi");
        lbDiachi.setBounds(100, 340, 150, 50);

        JLabel lbLuong = new JLabel("Luong");
        lbLuong.setBounds(100, 420, 150, 50);

        tfStk = new JTextField();
        tfStk.setBounds(300, 100, 150, 50);

        tfHoten = new JTextField();
        tfHoten.setBounds(300, 180, 150, 50);

        tfGt = new JTextField();
        tfGt.setBounds(300, 260, 150, 50);

        tfDiachi = new JTextField();
        tfDiachi.setBounds(300, 340, 150, 50);

        tfLuong = new JTextField();
        tfLuong.setBounds(300, 420, 150, 50);

        btGetData = new JButton("Xem");
        btGetData.setBounds(100, 500, 150, 50);
        btGetData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ctrl + x
                QLCB quanli = new QLCB();
                List<Canbo> listCb = quanli.getdata();

                dtb.setRowCount(0);
                for (Canbo canbo : listCb) {
                    dtb.addRow(new Object[]{
                        canbo.getSotk(),
                        canbo.getHoten(),
                        canbo.getGt(),
                        canbo.getDiachi(),
                        canbo.getLuong()
                    });
                }

            }

        });

        btInsertCB = new JButton("Them");
        btInsertCB.setBounds(300, 500, 150, 50);
        btInsertCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QLCB quanli = new QLCB();
                Canbo cb = new Canbo();
                cb.setSotk(tfStk.getText());
                cb.setHoten(tfHoten.getText());
                cb.setGt(tfGt.getText());
                cb.setDiachi(tfDiachi.getText());
                cb.setLuong(tfLuong.getText());

//                dtb.addRow(new Object[]{
//                        cb.getSotk(),
//                        cb.getHoten(),
//                        cb.getGt(),
//                        cb.getDiachi(),
//                        cb.getLuong()
//                    });
//                dtb.setValueAt(cb.getSotk(), 2, 0);
//                dtb.setValueAt(cb.getHoten(), 2, 1);
//                dtb.setValueAt(cb.getGt(), 2, 2);
//                dtb.setValueAt(cb.getDiachi(), 2, 3);
//                dtb.setValueAt(cb.getLuong(), 2, 4);

                quanli.getCon();
                quanli.insertCB(cb);
                dtb.setRowCount(0);
                List<Canbo> listCb = quanli.getdata();

                dtb.setRowCount(0);
                for (Canbo canbo : listCb) {
                    dtb.addRow(new Object[]{
                        canbo.getSotk(),
                        canbo.getHoten(),
                        canbo.getGt(),
                        canbo.getDiachi(),
                        canbo.getLuong()
                    });
                }
                
            }
        });

        dtb = new DefaultTableModel();
        dtb.setColumnIdentifiers(new String[]{"Số tài khoản", "Họ và tên", "Giới tính", "Địa chỉ", "Lương"});
        tbDulieu = new JTable(dtb);
        scroll = new JScrollPane(tbDulieu);
        scroll.setBounds(500, 100, 500, 400);

        tbDulieu.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int index = tbDulieu.getSelectedRow();
                tfStk.setText(tbDulieu.getValueAt(index, 0).toString());
                tfHoten.setText(tbDulieu.getValueAt(index, 1).toString());
                tfGt.setText(tbDulieu.getValueAt(index, 2).toString());
                tfDiachi.setText(tbDulieu.getValueAt(index, 3).toString());
                tfLuong.setText(tbDulieu.getValueAt(index, 4).toString());
                
                
            }
        });

        // add components
        this.add(lbStk);
        this.add(lbHoten);
        this.add(lbGt);
        this.add(lbDiachi);
        this.add(lbLuong);

        this.add(tfStk);
        this.add(tfHoten);
        this.add(tfGt);
        this.add(tfDiachi);
        this.add(tfLuong);

        this.add(btGetData);
        this.add(btInsertCB);

        this.add(scroll);

        this.setLayout(null);
        this.setSize(1200, 800);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
