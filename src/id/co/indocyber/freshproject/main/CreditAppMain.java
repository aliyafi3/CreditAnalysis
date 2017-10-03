/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.freshproject.main;

import id.co.indocyber.freshproject.model.CustomersGenerator;
import id.co.indocyber.freshproject.model.Customers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class CreditAppMain extends javax.swing.JFrame {

    DefaultTableModel model;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("in_ID", "ID"));

    /**
     * Creates new form KreditApp
     */
    public CreditAppMain() throws IOException {
        initComponents();
//        showPeople();
    }

    private void showPeople() throws IOException {
//        try {
//            List<Customers> data = CustomersGenerator.inputDataCustomer("C:/JAVA_LATIHAN/CustomerData.txt");
//            model = (DefaultTableModel) personTable.getModel();
//
//            Object[] row = new Object[5];
//            for (Customers person : data) {
//                row[0] = person.getIdCustomers();
//                row[1] = person.getName();
//                row[2] = person.getGender();
//                row[3] = person.getMarried();
//                row[4] = person.getAge();
//                
//                model.addRow(row);
//            }
//            ListSelectionModel rowSelMod = personTable.getSelectionModel();
//            rowSelMod.addListSelectionListener(new ListSelectionListener() {
//                @Override
//                public void valueChanged(ListSelectionEvent e) {
//                    if (!e.getValueIsAdjusting()) {
//                        int i = personTable.getSelectedRow();
//                        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("in_ID", "ID"));
//                        String nama = (String) model.getValueAt(i, 1);
//                        name1TextField.setText(nama);
//                        name1TextField.setEditable(false);
//                        String gender = (String) model.getValueAt(i, 2);
//                        gender1TextField.setText(gender);
//                        gender1TextField.setEditable(false);
//                        String married = (String) model.getValueAt(i, 3).toString();
//                        if (married.equalsIgnoreCase("true")) {
//                            statusTextField.setText("Married");
//                            statusTextField.setEditable(false);
//                        } else {
//                            statusTextField.setText("Single");
//                            statusTextField.setEditable(false);
//                        }
//                        int umur = (int) model.getValueAt(i, 4);
//                        String age = String.valueOf(umur);
//                        age1TextField.setText(age + " Years");
//                        age1TextField.setEditable(false);
//                        depentTextField.setText(String.valueOf(data.get(i).getDepent() + " Persons"));
//                        depentTextField.setEditable(false);
//                        salaryTextField.setText(currencyFormatter.format( data.get(i).getSalary()));
//                        salaryTextField.setEditable(false);
//                        bonusTextField.setText(currencyFormatter.format( data.get(i).getBonus()));
//                        bonusTextField.setEditable(false);
//                        priceGoodsTextField.setText(currencyFormatter.format( data.get(i).getHargaBarang()));
//                        priceGoodsTextField.setEditable(false);
//                        dPTextField.setText(currencyFormatter.format( data.get(i).getdP()));
//                        dPTextField.setEditable(false);
//                        timeTextField.setText(String.valueOf(data.get(i).getTime() + " Months"));
//                        timeTextField.setEditable(false);
//                        rateTextField.setText(String.valueOf(data.get(i).getRate()* 100.0 + " Percent"));
//                        rateTextField.setEditable(false);
//                        totalSalaryTextField.setText(currencyFormatter.format( data.get(i).TotalPenghasilan()));
//                        totalSalaryTextField.setEditable(false);
//                        cicilanTextField.setText(currencyFormatter.format(  data.get(i).CicilanPerBulan()));
//                        cicilanTextField.setEditable(false);
//                        ketTextField.setText(String.valueOf(data.get(i).AnalisaKredit()));
//                        ketTextField.setEditable(false);
//                        telpTextField.setText(String.valueOf(data.get(i).getTelp()));
//                        telpTextField.setEditable(false);
//                        adressTextArea.setText(String.valueOf(data.get(i).getAdress()));
//                        adressTextArea.setEditable(false);
//                        idCustomerTextField.setText(String.valueOf(data.get(i).getIdCustomers()));
//                        idCustomerTextField.setEditable(false);
//                    }
//                }
//            });
//        } catch (IOException ex) {
//            Logger.getLogger(CreditAppMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        name1TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gender1TextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age1TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        depentTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bonusTextField = new javax.swing.JTextField();
        telpTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adressTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        priceGoodsTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dPTextField = new javax.swing.JTextField();
        timeTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        totalSalaryTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cicilanTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ketTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        idCustomerTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Customer", "Name", "Gender", "Married", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personTable);

        loadButton.setText("Load Data");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Filter :");

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Name :");

        name1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1TextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender :");

        jLabel8.setText("Status :");

        jLabel7.setText("Age :");

        jLabel9.setText("Dependent :");

        jLabel10.setText("Salary :");

        jLabel11.setText("Bonus :");

        jLabel2.setText("Telephone :");

        jLabel3.setText("Adress :");

        adressTextArea.setColumns(20);
        adressTextArea.setRows(5);
        jScrollPane2.setViewportView(adressTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(bonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33)
                        .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(age1TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(statusTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depentTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telpTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(gender1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(age1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(depentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer Details", jPanel2);

        jLabel12.setText("Price of Goods :");

        jLabel13.setText("Down Payment :");

        jLabel14.setText("Time Period :");

        jLabel15.setText("Interest Rate :");

        jLabel16.setText("Total Monthly Income :");

        jLabel17.setText("Monthly Installments :");

        jLabel18.setText("Credit Status :");

        jLabel19.setText("ID Customer :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cicilanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(ketTextField)
                            .addComponent(totalSalaryTextField)
                            .addComponent(rateTextField)
                            .addComponent(timeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dPTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceGoodsTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(64, 64, 64)
                        .addComponent(idCustomerTextField)))
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cicilanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ketTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Customer Credit Details", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PT. MAJU SELALU ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Detail Customers Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchTextField))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                                .addComponent(loadButton))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
try {
            List<Customers> data = CustomersGenerator.inputDataCustomer("C:/JAVA_LATIHAN/CustomerData.txt");
            model = (DefaultTableModel) personTable.getModel();

            Object[] row = new Object[5];
            for (Customers person : data) {
                row[0] = person.getIdCustomers();
                row[1] = person.getName();
                row[2] = person.getGender();
                row[3] = person.getMarried();
                row[4] = person.getAge();
                
                model.addRow(row);
            }
            ListSelectionModel rowSelMod = personTable.getSelectionModel();
            rowSelMod.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        int i = personTable.getSelectedRow();
                        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("in_ID", "ID"));
                        String nama = (String) model.getValueAt(i, 1);
                        name1TextField.setText(nama);
                        name1TextField.setEditable(false);
                        String gender = (String) model.getValueAt(i, 2);
                        gender1TextField.setText(gender);
                        gender1TextField.setEditable(false);
                        String married = (String) model.getValueAt(i, 3).toString();
                        if (married.equalsIgnoreCase("true")) {
                            statusTextField.setText("Married");
                            statusTextField.setEditable(false);
                        } else {
                            statusTextField.setText("Single");
                            statusTextField.setEditable(false);
                        }
                        int umur = (int) model.getValueAt(i, 4);
                        String age = String.valueOf(umur);
                        age1TextField.setText(age + " Years");
                        age1TextField.setEditable(false);
                        depentTextField.setText(String.valueOf(data.get(i).getDepent() + " Persons"));
                        depentTextField.setEditable(false);
                        salaryTextField.setText(currencyFormatter.format( data.get(i).getSalary()));
                        salaryTextField.setEditable(false);
                        bonusTextField.setText(currencyFormatter.format( data.get(i).getBonus()));
                        bonusTextField.setEditable(false);
                        priceGoodsTextField.setText(currencyFormatter.format( data.get(i).getHargaBarang()));
                        priceGoodsTextField.setEditable(false);
                        dPTextField.setText(currencyFormatter.format( data.get(i).getdP()));
                        dPTextField.setEditable(false);
                        timeTextField.setText(String.valueOf(data.get(i).getTime() + " Months"));
                        timeTextField.setEditable(false);
                        rateTextField.setText(String.valueOf(data.get(i).getRate()* 100.0 + " Percent"));
                        rateTextField.setEditable(false);
                        totalSalaryTextField.setText(currencyFormatter.format( data.get(i).TotalPenghasilan()));
                        totalSalaryTextField.setEditable(false);
                        cicilanTextField.setText(currencyFormatter.format(  data.get(i).CicilanPerBulan()));
                        cicilanTextField.setEditable(false);
                        ketTextField.setText(String.valueOf(data.get(i).AnalisaKredit()));
                        ketTextField.setEditable(false);
                        telpTextField.setText(String.valueOf(data.get(i).getTelp()));
                        telpTextField.setEditable(false);
                        adressTextArea.setText(String.valueOf(data.get(i).getAdress()));
                        adressTextArea.setEditable(false);
                        idCustomerTextField.setText(String.valueOf(data.get(i).getIdCustomers()));
                        idCustomerTextField.setEditable(false);
                    }
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(CreditAppMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_loadButtonActionPerformed

    private void name1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1TextFieldActionPerformed

    }//GEN-LAST:event_name1TextFieldActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        String query = searchTextField.getText().toLowerCase();
        personTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + searchTextField.getText(), 0, 1, 2, 3));

    }//GEN-LAST:event_searchTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(CreditAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CreditAppMain().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CreditAppMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adressTextArea;
    private javax.swing.JTextField age1TextField;
    private javax.swing.JTextField bonusTextField;
    private javax.swing.JTextField cicilanTextField;
    private javax.swing.JTextField dPTextField;
    private javax.swing.JTextField depentTextField;
    private javax.swing.JTextField gender1TextField;
    private javax.swing.JTextField idCustomerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField ketTextField;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField name1TextField;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField priceGoodsTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JTextField telpTextField;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JTextField totalSalaryTextField;
    // End of variables declaration//GEN-END:variables
}
