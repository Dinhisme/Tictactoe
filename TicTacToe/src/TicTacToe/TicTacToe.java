package TicTacToe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
public class TicTacToe extends javax.swing.JFrame {

    private int count = 0;
    private int number = 0;
    private int scoreX = 0;
    private int scoreO = 0;
    private List<Integer> listXO = new ArrayList<>();
    private List<Integer> listX = new ArrayList<>();
    private List<Integer> listO = new ArrayList<>();

    /**
     * Creates new form TicTacToeV2
     */
    public TicTacToe() {
        initComponents();
    }

    public void Reset() {
        count = 0;
        number = 0;
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        btn1.setBackground(Color.BLACK);
        btn2.setBackground(Color.BLACK);
        btn3.setBackground(Color.BLACK);
        btn4.setBackground(Color.BLACK);
        btn5.setBackground(Color.BLACK);
        btn6.setBackground(Color.BLACK);
        btn7.setBackground(Color.BLACK);
        btn8.setBackground(Color.BLACK);
        btn9.setBackground(Color.BLACK);
        listX.removeAll(listX);
        listO.removeAll(listO);
    }

    public void X() {
        Draw();
        listX.add(number);
        for (Integer oj0 : listX) {
            //dãy số có số 1
            if (oj0 == 1) {
                for (Integer oj1 : listX) {
                    //dãy số có số 1 và 2
                    if (oj1 == 2) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 1 và 2 và số 3
                            if (oj2 == 3) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 1 2 3");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 1 và 4
                    if (oj1 == 4) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 1 và 4 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 1 4 7");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
            //dãy số có số 5
            if (oj0 == 5) {
                for (Integer oj1 : listX) {
                    //dãy số có số 5 và 1
                    if (oj1 == 1) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 5 và 1 và số 9
                            if (oj2 == 9) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 1 5 9");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 2
                    if (oj1 == 2) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 5 và 2 và số 8
                            if (oj2 == 8) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 2 5 8");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 3
                    if (oj1 == 3) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 5 và 2 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 3 5 7");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 4
                    if (oj1 == 4) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 5 và 4 và số 6
                            if (oj2 == 6) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 4 5 6");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
            //dãy số có số 9
            if (oj0 == 9) {
                for (Integer oj1 : listX) {
                    //dãy số có số 9 và 3
                    if (oj1 == 3) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 9 và 3 và số 6
                            if (oj2 == 6) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 3 6 9");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 9 và 8
                    if (oj1 == 8) {
                        for (Integer oj2 : listX) {
                            //dãy số có số 9 và 3 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "X chiến thắng với dãy số 7 8 9");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
        }
        lblLuot.setText("Lượt của O");
    }

    public void O() {
        Draw();
        listO.add(number);
        for (Integer oj0 : listO) {
            //dãy số có số 1
            if (oj0 == 1) {
                for (Integer oj1 : listO) {
                    //dãy số có số 1 và 2
                    if (oj1 == 2) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 1 và 2 và số 3
                            if (oj2 == 3) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 1 2 3");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 1 và 4
                    if (oj1 == 4) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 1 và 4 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 1 4 7");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
            //dãy số có số 5
            if (oj0 == 5) {
                for (Integer oj1 : listO) {
                    //dãy số có số 5 và 1
                    if (oj1 == 1) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 5 và 1 và số 9
                            if (oj2 == 9) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 1 5 9");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 2
                    if (oj1 == 2) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 5 và 2 và số 8
                            if (oj2 == 8) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 2 5 8");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 3
                    if (oj1 == 3) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 5 và 2 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 3 5 7");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 5 và 4
                    if (oj1 == 4) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 5 và 4 và số 6
                            if (oj2 == 6) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 4 5 6");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
            //dãy số có số 9
            if (oj0 == 9) {
                for (Integer oj1 : listO) {
                    //dãy số có số 9 và 3
                    if (oj1 == 3) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 9 và 3 và số 6
                            if (oj2 == 6) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 3 6 9");
                                Reset();
                                return;
                            }
                        }
                    }
                    //dãy số có số 9 và 8
                    if (oj1 == 8) {
                        for (Integer oj2 : listO) {
                            //dãy số có số 9 và 3 và số 7
                            if (oj2 == 7) {
                                JOptionPane.showMessageDialog(this, "O chiến thắng với dãy số 7 8 9");
                                Reset();
                                return;
                            }
                        }
                    }
                }
            }
        }
        lblLuot.setText("Lượt của X");
    }

    public void Draw() {
        if (count == 9) {
            JOptionPane.showMessageDialog(this, "Hòa");
            Reset();
        }
    }

    public void exit() {
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát game?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblLuot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(java.awt.Color.green);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 41, 41));

        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 41, 41));

        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 41, 41));

        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 41, 41));

        btn5.setFocusable(false);
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 41, 41));

        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 41, 41));

        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 41, 41));

        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 41, 41));

        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 41, 41));

        lblLuot.setText("Lượt của X");
        getContentPane().add(lblLuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TicTacToe");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 29));

        btnExit.setText("Exit");
        btnExit.setFocusable(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 61, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        count++;
        number = 1;
        if (count % 2 == 0) {
            btn1.setText("O");
            btn1.setBackground(Color.GREEN);
            btn1.setEnabled(false);
            O();
        } else {
            btn1.setText("X");
            btn1.setBackground(Color.RED);
            btn1.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        count++;
        number = 2;
        if (count % 2 == 0) {
            btn2.setText("O");
            btn2.setBackground(Color.GREEN);
            btn2.setEnabled(false);
            O();
        } else {
            btn2.setText("X");
            btn2.setBackground(Color.RED);
            btn2.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        count++;
        number = 3;
        if (count % 2 == 0) {
            btn3.setText("O");
            btn3.setBackground(Color.GREEN);
            btn3.setEnabled(false);
            O();
        } else {
            btn3.setText("X");
            btn3.setBackground(Color.RED);
            btn3.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        count++;
        number = 4;
        if (count % 2 == 0) {
            btn4.setText("O");
            btn4.setBackground(Color.GREEN);
            btn4.setEnabled(false);
            O();
        } else {
            btn4.setText("X");
            btn4.setBackground(Color.RED);
            btn4.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        count++;
        number = 5;
        if (count % 2 == 0) {
            btn5.setText("O");
            btn5.setBackground(Color.GREEN);
            btn5.setEnabled(false);
            O();
        } else {
            btn5.setText("X");
            btn5.setBackground(Color.RED);
            btn5.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        count++;
        number = 6;
        if (count % 2 == 0) {
            btn6.setText("O");
            btn6.setBackground(Color.GREEN);
            btn6.setEnabled(false);
            O();
        } else {
            btn6.setText("X");
            btn6.setBackground(Color.RED);
            btn6.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        count++;
        number = 7;
        if (count % 2 == 0) {
            btn7.setText("O");
            btn7.setBackground(Color.GREEN);
            btn7.setEnabled(false);
            O();
        } else {
            btn7.setText("X");
            btn7.setBackground(Color.RED);
            btn7.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        count++;
        number = 8;
        if (count % 2 == 0) {
            btn8.setText("O");
            btn8.setBackground(Color.GREEN);
            btn8.setEnabled(false);
            O();
        } else {
            btn8.setText("X");
            btn8.setBackground(Color.RED);
            btn8.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        count++;
        number = 9;
        if (count % 2 == 0) {
            btn9.setText("O");
            btn9.setBackground(Color.GREEN);
            btn9.setEnabled(false);
            O();
        } else {
            btn9.setText("X");
            btn9.setBackground(Color.RED);
            btn9.setEnabled(false);
            X();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btn1.setBackground(Color.BLACK);
        btn2.setBackground(Color.BLACK);
        btn3.setBackground(Color.BLACK);
        btn4.setBackground(Color.BLACK);
        btn5.setBackground(Color.BLACK);
        btn6.setBackground(Color.BLACK);
        btn7.setBackground(Color.BLACK);
        btn8.setBackground(Color.BLACK);
        btn9.setBackground(Color.BLACK);
    }//GEN-LAST:event_formWindowOpened

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLuot;
    // End of variables declaration//GEN-END:variables
}
