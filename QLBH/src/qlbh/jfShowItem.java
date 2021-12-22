/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class jfShowItem extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public jfShowItem() {
        initComponents();
        load();
    } 
    public  void a(){
        //String valueAt = j.tbBill.getValueAt(2, 2);
        
    }
    
    private void load(){
        loadItem();
        txtGia.setEditable(false);
        txtMaSP.setEditable(false);
        txtTenSP.setEditable(false);
        vctHeader.add("Tên SP");
        vctHeader.add("SL");
        vctHeader.add("Đơn giá");
        vctHeader.add("Thành tiền");        
    }
    
    
    
    private void loadItem(){
        try {
            ResultSet rs;
            DefaultTableModel model;
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'ram'");
            model = (DefaultTableModel)tbRam.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'ssd'");
            model = (DefaultTableModel)tbSSD.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'hdd'");
            model = (DefaultTableModel)tbHDD.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'cpu'");
            model = (DefaultTableModel)tbCPU.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'vga'");
            model = (DefaultTableModel)tbVGA.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'ban phim'");
            model = (DefaultTableModel)tbBanPhim.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'chuot'");
            model = (DefaultTableModel)tbChuot.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            rs = MysqlConn.query("select masp, tensp, sl, giagoc from sanpham where loai = 'tai nghe'");
            model = (DefaultTableModel)tbTaiNghe.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("masp"),
                    rs.getString("tensp"),
                    rs.getInt("sl"),
                    rs.getInt("giagoc")});
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        tbRam.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbRam.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbRam.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbRam.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbRam.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbCPU.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbCPU.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbCPU.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbCPU.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbCPU.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbVGA.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbVGA.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbVGA.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbVGA.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbVGA.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbSSD.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbSSD.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbSSD.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbSSD.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbSSD.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbHDD.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbHDD.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbHDD.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbHDD.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbHDD.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbTaiNghe.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbTaiNghe.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbTaiNghe.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbTaiNghe.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbTaiNghe.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbBanPhim.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbBanPhim.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbBanPhim.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbBanPhim.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbBanPhim.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tbChuot.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbChuot.getColumnModel().getColumn(1).setPreferredWidth(420);
        tbChuot.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbChuot.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbChuot.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbSSD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbHDD = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbVGA = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbCPU = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbBanPhim = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbChuot = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbTaiNghe = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbRam = new javax.swing.JTable();
        btnGioHang = new javax.swing.JButton();
        btnThemVaoGH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        spSL = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        btnDoiMK = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbSSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSSDMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbSSD);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SSD", jPanel2);

        tbHDD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHDDMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbHDD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HDD", jPanel3);

        tbVGA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVGA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVGAMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbVGA);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VGA", jPanel5);

        tbCPU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCPUMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbCPU);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CPU", jPanel6);

        tbBanPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBanPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanPhimMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tbBanPhim);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bàn phím", jPanel7);

        tbChuot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChuot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChuotMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tbChuot);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chuột", jPanel8);

        tbTaiNghe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTaiNghe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiNgheMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tbTaiNghe);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tai nghe", jPanel9);

        tbRam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbRam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ram", jPanel1);

        btnGioHang.setText("Giỏ Hàng");
        btnGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioHangActionPerformed(evt);
            }
        });

        btnThemVaoGH.setText("Thêm vào giỏ");
        btnThemVaoGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGHActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã SP:");

        jLabel2.setText("Tên SP:");

        jLabel3.setText("SL:");

        jLabel4.setText("Giá:");

        spSL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spSL.setValue(1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("CỬA HÀNG LINH KIỆN MÁY TÍNH ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("HKL TEAM - SHOP");

        lbTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDoiMK.setText("Đổi MK");
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spSL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGioHang)
                        .addGap(35, 35, 35)
                        .addComponent(btnThemVaoGH)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoiMK)
                            .addComponent(btnDangXuat))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(spSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoGH)
                    .addComponent(btnGioHang)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRamMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbRam.getSelectedRow();
        txtMaSP.setText(tbRam.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbRam.getModel().getValueAt(i, 1).toString());     
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbRam.getModel().getValueAt(i, 3)));
        if ((Integer)tbRam.getValueAt(tbRam.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbRamMouseClicked

    private void tbSSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSSDMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbSSD.getSelectedRow();
        txtMaSP.setText(tbSSD.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbSSD.getModel().getValueAt(i, 1).toString());     
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbSSD.getModel().getValueAt(i, 3)));
        if ((Integer)tbSSD.getValueAt(tbSSD.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbSSDMouseClicked

    private void tbHDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHDDMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbHDD.getSelectedRow();
        txtMaSP.setText(tbHDD.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbHDD.getModel().getValueAt(i, 1).toString());     
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbHDD.getModel().getValueAt(i, 3)));
        if ((Integer)tbHDD.getValueAt(tbHDD.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbHDDMouseClicked

    private void tbVGAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVGAMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbVGA.getSelectedRow();
        txtMaSP.setText(tbVGA.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbVGA.getModel().getValueAt(i, 1).toString());     
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbVGA.getModel().getValueAt(i, 3)));
        if ((Integer)tbVGA.getValueAt(tbVGA.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbVGAMouseClicked

    private void tbCPUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCPUMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbCPU.getSelectedRow();
        txtMaSP.setText(tbCPU.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbCPU.getModel().getValueAt(i, 1).toString());    
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbCPU.getModel().getValueAt(i, 3)));
        if ((Integer)tbCPU.getValueAt(tbCPU.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbCPUMouseClicked

    private void tbBanPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanPhimMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbBanPhim.getSelectedRow();
        txtMaSP.setText(tbBanPhim.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbBanPhim.getModel().getValueAt(i, 1).toString());
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbBanPhim.getModel().getValueAt(i, 3)));
        if ((Integer)tbBanPhim.getValueAt(tbBanPhim.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbBanPhimMouseClicked

    private void tbChuotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChuotMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbChuot.getSelectedRow();
        txtMaSP.setText(tbChuot.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbChuot.getModel().getValueAt(i, 1).toString());     
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbChuot.getModel().getValueAt(i, 3)));
        if ((Integer)tbChuot.getValueAt(tbChuot.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbChuotMouseClicked

    private void tbTaiNgheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiNgheMouseClicked
        //btnThemVaoGH.setEnabled(true);
        spSL.setEnabled(true);
        btnThemVaoGH.setEnabled(true);
        Integer i = tbTaiNghe.getSelectedRow();
        txtMaSP.setText(tbTaiNghe.getModel().getValueAt(i, 0).toString());
        txtTenSP.setText(tbTaiNghe.getModel().getValueAt(i, 1).toString());   
        spSL.setValue(1);
        txtGia.setText(String.format("%,8d%n", tbTaiNghe.getModel().getValueAt(i, 3)));
        if ((Integer)tbTaiNghe.getValueAt(tbTaiNghe.getSelectedRow(), 2) <= 0) {
            spSL.setValue(0);
            spSL.setEnabled(false);
            btnThemVaoGH.setEnabled(false);
        }
    }//GEN-LAST:event_tbTaiNgheMouseClicked
    public jfGioHang j = new jfGioHang();
    Vector vctData = new Vector();
    Vector vctHeader = new Vector();
    private void btnGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioHangActionPerformed
        j.setVisible(true);
        loadBill();
        //this.setVisible(false);
    }//GEN-LAST:event_btnGioHangActionPerformed

    private void btnThemVaoGHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGHActionPerformed

        
        try{if ((Integer)tbRam.getValueAt(tbRam.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbBanPhim.getValueAt(tbBanPhim.getSelectedRow(), 2) <= 1)
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbCPU.getValueAt(tbCPU.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbChuot.getValueAt(tbChuot.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbSSD.getValueAt(tbSSD.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbHDD.getValueAt(tbHDD.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbTaiNghe.getValueAt(tbTaiNghe.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        try{if ((Integer)tbVGA.getValueAt(tbVGA.getSelectedRow(), 2) <= 1) 
        {
            
            btnThemVaoGH.setEnabled(false);
        }}
        catch(Exception ex){}
        
        String str = txtGia.getText();
        String a = str.replace(",", "");
        DecimalFormat formatter = new DecimalFormat("###,###,###,###");
        Integer sl = (Integer)spSL.getValue();
        boolean isChange = false;
        Vector vctData1 = new Vector();
        vctData1.add(txtTenSP.getText());
        vctData1.add((Integer)spSL.getValue());
        vctData1.add(formatter.format(Integer.parseInt(a.trim())));
        vctData1.add(formatter.format((Integer.parseInt(a.trim()) * (Integer)spSL.getValue())));
        for(int i = 0; i < j.tbBill.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(j.tbBill.getValueAt(i, 0))) {
                sl += (Integer)j.tbBill.getValueAt(i, 1);
                j.tbBill.setValueAt(sl, i, 1);
                j.tbBill.setValueAt(formatter.format(sl * Integer.parseInt(a.trim())), i, 3);
                isChange = true;
            }
        }
        if (!isChange) {
            vctData.add(vctData1);
        }
        DefaultTableModel tableModel = new DefaultTableModel(vctData,vctHeader){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        j.tbBill.setModel(tableModel);
        j.tbBill.getColumnModel().getColumn(0).setPreferredWidth(420);
        j.tbBill.getColumnModel().getColumn(1).setPreferredWidth(30);
        j.tbBill.getColumnModel().getColumn(2).setPreferredWidth(30);
        j.tbBill.getColumnModel().getColumn(3).setPreferredWidth(30);
        j.tbBill.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        findItem();
        j.lbTenNV.setText(lbTen.getText());
        
    }//GEN-LAST:event_btnThemVaoGHActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        DoiMK f = new DoiMK();
        //String manv = f.lbuser.getText();
        f.setVisible(true);
    }//GEN-LAST:event_btnDoiMKActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.dispose();
        Login f = new Login();
        f.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (j.isReset) {
            j.isReset = false;
            loadItem();
            DefaultTableModel model = (DefaultTableModel) j.tbBill.getModel();
            model.setRowCount(0);
            j.txtBillTenSP.removeAll();
            j.txtDonGia.removeAll();
            j.txtThanhTien.removeAll();
            j.txtTongCong.removeAll();
            j.spBillSL.setValue(0);
            
        }
        
        if (j.isSua) {
            j.isSua = false;            
            Set<String> keySet = j.hashtable.keySet();
            for (String key : keySet) {
                for(int i = 0; i < tbBanPhim.getRowCount(); i++)
                {
                    if (key.equals(tbBanPhim.getValueAt(i, 1))) {

                        tbBanPhim.setValueAt( (Integer)tbBanPhim.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbCPU.getRowCount(); i++)
                {
                    if (key.equals(tbCPU.getValueAt(i, 1))) {

                        tbCPU.setValueAt( (Integer)tbCPU.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbChuot.getRowCount(); i++)
                {
                    if (key.equals(tbChuot.getValueAt(i, 1))) {

                        tbChuot.setValueAt( (Integer)tbChuot.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbHDD.getRowCount(); i++)
                {
                    if (key.equals(tbHDD.getValueAt(i, 1))) {

                        tbHDD.setValueAt( (Integer)tbHDD.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbRam.getRowCount(); i++)
                {
                    if (key.equals(tbRam.getValueAt(i, 1))) {

                        tbRam.setValueAt( (Integer)tbRam.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }for(int i = 0; i < tbSSD.getRowCount(); i++)
                {
                    if (key.equals(tbSSD.getValueAt(i, 1))) {

                        tbSSD.setValueAt( (Integer)tbSSD.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbTaiNghe.getRowCount(); i++)
                {
                    if (key.equals(tbTaiNghe.getValueAt(i, 1))) {

                        tbTaiNghe.setValueAt( (Integer)tbTaiNghe.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                for(int i = 0; i < tbVGA.getRowCount(); i++)
                {
                    if (key.equals(tbVGA.getValueAt(i, 1))) {

                        tbVGA.setValueAt( (Integer)tbVGA.getValueAt(i, 2) - j.hashtable.get(key), i, 2);
                        
                    }
                }
                
            }
            j.hashtable.clear();
            //tbCPU.setValueAt((Integer)tbCPU.getValueAt(2, 2) - (Integer)j.tbBill.getValueAt(1, 1), 2, 2);
            
            
        }
    }//GEN-LAST:event_formWindowActivated

    private void findItem(){
        Integer sl = (Integer)spSL.getValue();
        for(int i = 0; i < tbBanPhim.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbBanPhim.getValueAt(i, 1))) {
                
                tbBanPhim.setValueAt( (Integer)tbBanPhim.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbCPU.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbCPU.getValueAt(i, 1))) {
                
                tbCPU.setValueAt( (Integer)tbCPU.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbChuot.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbChuot.getValueAt(i, 1))) {
                
                tbChuot.setValueAt( (Integer)tbChuot.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbHDD.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbHDD.getValueAt(i, 1))) {
                
                tbHDD.setValueAt( (Integer)tbHDD.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbRam.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbRam.getValueAt(i, 1))) {
                
                tbRam.setValueAt( (Integer)tbRam.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbSSD.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbSSD.getValueAt(i, 1))) {
                
                tbSSD.setValueAt( (Integer)tbSSD.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbTaiNghe.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbTaiNghe.getValueAt(i, 1))) {
                
                tbTaiNghe.setValueAt( (Integer)tbTaiNghe.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
        for(int i = 0; i < tbVGA.getRowCount(); i++)
        {
            if (txtTenSP.getText().equals(tbVGA.getValueAt(i, 1))) {
                
                tbVGA.setValueAt( (Integer)tbVGA.getValueAt(i, 2) - sl, i, 2);
                return;
            }
        }
    }
    public Integer findSLItem(String text){
        for(int i = 0; i < tbBanPhim.getRowCount(); i++)
        {
            if (text.equals(tbBanPhim.getValueAt(i, 1))) {
               
                return (Integer)tbBanPhim.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbCPU.getRowCount(); i++)
        {
            if (text.equals(tbCPU.getValueAt(i, 1))) {
                
                return (Integer)tbCPU.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbChuot.getRowCount(); i++)
        {
            if (text.equals(tbChuot.getValueAt(i, 1))) {
                
                return (Integer)tbChuot.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbHDD.getRowCount(); i++)
        {
            if (text.equals(tbHDD.getValueAt(i, 1))) {
                return (Integer)tbHDD.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbRam.getRowCount(); i++)
        {
            if (text.equals(tbRam.getValueAt(i, 1))) {
                
                return (Integer)tbRam.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbSSD.getRowCount(); i++)
        {
            if (text.equals(tbSSD.getValueAt(i, 1))) {
                
                return (Integer)tbSSD.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbTaiNghe.getRowCount(); i++)
        {
            if (text.equals(tbTaiNghe.getValueAt(i, 1))) {
                
                return (Integer)tbTaiNghe.getValueAt(i, 2);
            }
        }
        for(int i = 0; i < tbVGA.getRowCount(); i++)
        {
            if (text.equals(tbVGA.getValueAt(i, 1))) {
                
                return (Integer)tbVGA.getValueAt(i, 2);
            }
        }
        return 1;
    }
    private void loadBill(){
        DecimalFormat formatter = new DecimalFormat("###,###,###,###");
        String str,str1;
        String a;
        int sum = 0, sumSL =0;
        for(int i = 0; i < j.tbBill.getRowCount(); i++)
        {
            str = j.tbBill.getValueAt(i, 3).toString();
            str1 = j.tbBill.getValueAt(i, 1).toString();
            a = str.replace(",", "");
            sum = sum + Integer.parseInt(a);
            sumSL = sumSL + Integer.parseInt(str1);
        }
        
        j.txtTongCong.setText(formatter.format(sum));
        j.lbSLtong.setText(Integer.toString(sumSL));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfShowItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfShowItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfShowItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfShowItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new jfShowItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnGioHang;
    private javax.swing.JButton btnThemVaoGH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lbTen;
    private javax.swing.JSpinner spSL;
    public javax.swing.JTable tbBanPhim;
    public javax.swing.JTable tbCPU;
    public javax.swing.JTable tbChuot;
    public javax.swing.JTable tbHDD;
    public javax.swing.JTable tbRam;
    public javax.swing.JTable tbSSD;
    public javax.swing.JTable tbTaiNghe;
    public javax.swing.JTable tbVGA;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
