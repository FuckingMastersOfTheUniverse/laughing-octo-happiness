
package pptls;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    Ordenador ord;
    Jugador jug1;
    boolean active;
    
    
    public Frame() {
                
        initComponents();
        
        iconoSet("piedra.png", this.b_piedra);
        iconoSet("papel.png", this.b_papel);
        iconoSet("tijera.png", this.b_tijera);
        iconoSet("lagarto.png", this.b_lagarto);
        iconoSet("spock.png", this.b_spock);
        
        active = true;
        label1.setOpaque(true);
        label2.setOpaque(true);
        Color amarilloClaro=new Color(255, 255, 149);
        label1.setBackground(amarilloClaro);
        label2.setBackground(amarilloClaro);
        
        iconoSet("int.gif", label2);
        iconoSet("int.gif", label1);
        iconoSet("tick.png", jButton1, "Estoy listo!");
        iconoSet("hint.png", hint, "Ayuda");
        
        jug1=new Jugador();
        ord=new Ordenador();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_piedra = new javax.swing.JButton();
        b_papel = new javax.swing.JButton();
        b_lagarto = new javax.swing.JButton();
        b_spock = new javax.swing.JButton();
        b_tijera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hint = new javax.swing.JButton();
        marc1 = new javax.swing.JLabel();
        marc2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piedra Papel Tijera Lagarto Spock");
        setResizable(false);

        b_piedra.setBackground(new java.awt.Color(255, 255, 149));
        b_piedra.setMaximumSize(new java.awt.Dimension(90, 90));
        b_piedra.setMinimumSize(new java.awt.Dimension(90, 90));
        b_piedra.setPreferredSize(new java.awt.Dimension(120, 120));
        b_piedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_piedraMouseClicked(evt);
            }
        });

        b_papel.setBackground(new java.awt.Color(255, 255, 149));
        b_papel.setMaximumSize(new java.awt.Dimension(90, 90));
        b_papel.setMinimumSize(new java.awt.Dimension(90, 90));
        b_papel.setPreferredSize(new java.awt.Dimension(120, 120));
        b_papel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_papelMouseClicked(evt);
            }
        });

        b_lagarto.setBackground(new java.awt.Color(255, 255, 149));
        b_lagarto.setPreferredSize(new java.awt.Dimension(120, 120));
        b_lagarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_lagartoMouseClicked(evt);
            }
        });

        b_spock.setBackground(new java.awt.Color(255, 255, 149));
        b_spock.setPreferredSize(new java.awt.Dimension(120, 120));
        b_spock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_spockMouseClicked(evt);
            }
        });

        b_tijera.setBackground(new java.awt.Color(255, 255, 149));
        b_tijera.setMaximumSize(new java.awt.Dimension(120, 120));
        b_tijera.setMinimumSize(new java.awt.Dimension(120, 120));
        b_tijera.setPreferredSize(new java.awt.Dimension(120, 120));
        b_tijera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_tijeraMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Qué quieres sacar?");

        label1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        label1.setPreferredSize(new java.awt.Dimension(270, 250));

        label2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        label2.setPreferredSize(new java.awt.Dimension(270, 250));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        hint.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        hint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hintMouseClicked(evt);
            }
        });

        marc1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        marc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marc1.setText("0");
        marc1.setPreferredSize(new java.awt.Dimension(73, 80));

        marc2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        marc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marc2.setText("0");
        marc2.setPreferredSize(new java.awt.Dimension(73, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(marc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_piedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(b_papel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_tijera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(b_lagarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_spock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(marc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(marc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(b_lagarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_papel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_spock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_piedra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_piedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_piedraMouseClicked
        if(active==true)
        {
            iconoSet("piedra.png", label1);
            jug1.setElegido("piedra.png");
        }
        
    }//GEN-LAST:event_b_piedraMouseClicked

    private void b_tijeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_tijeraMouseClicked
         if(active==true)
        {
            iconoSet("tijera.png", label1);
            jug1.setElegido("tijera.png");
        }
    }//GEN-LAST:event_b_tijeraMouseClicked

    private void b_papelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_papelMouseClicked
        if(active==true)
        {
            iconoSet("papel.png", label1);
            jug1.setElegido("papel.png");
        }
    }//GEN-LAST:event_b_papelMouseClicked

    private void b_lagartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_lagartoMouseClicked
        if(active==true)
        {
            iconoSet("lagarto.png", label1);
            jug1.setElegido("lagarto.png");
        }
    }//GEN-LAST:event_b_lagartoMouseClicked

    private void b_spockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_spockMouseClicked
        if(active==true)
        {
            iconoSet("spock.png", label1);
            jug1.setElegido("spock.png");
        }
    }//GEN-LAST:event_b_spockMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        //Si ha elegido algo
        if(jug1.getElegido() != null) 
        {
            active=false;
            ord.setElegido(ord.randomChoice());
            iconoSet(ord.getElegido(),label2);
            //En caso de empate
            if(checkEmpate()==true)
            {
                JOptionPane.showMessageDialog(null,"Vaya... ha habido un empate"); 
            } 
            else 
            {
                //En caso de victoria
                if(checkVictoria() == true) 
                {
                    JOptionPane.showMessageDialog(null,"¡¡VICTORIA!!"); 
                    int contVictorias = Integer.parseInt(marc1.getText()) + 1;
                    marc1.setText(Integer.toString(contVictorias));
                }
                //En caso de derrota
                else
                {
                    JOptionPane.showMessageDialog(null,"Dedícate a las chapas..."); 
                    int contVictorias = Integer.parseInt(marc2.getText()) + 1;
                    marc2.setText(Integer.toString(contVictorias));
                }
            }

            limpiar();

            active=true;

        }
        //Si no ha elegido nada
        else
        {
            JOptionPane.showMessageDialog(null,"Anda, elige algo antes."); 
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void hintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hintMouseClicked
        Hint hint=new Hint();
        hint.setVisible(true);
    }//GEN-LAST:event_hintMouseClicked

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_lagarto;
    private javax.swing.JButton b_papel;
    private javax.swing.JButton b_piedra;
    private javax.swing.JButton b_spock;
    private javax.swing.JButton b_tijera;
    private javax.swing.JButton hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel marc1;
    private javax.swing.JLabel marc2;
    // End of variables declaration//GEN-END:variables

    
    public static void iconoSet (String s, JButton b)
    {
        ImageIcon icono= new ImageIcon(s);
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance
        (b.getWidth(), b.getHeight(), Image.SCALE_DEFAULT));
        b.setIcon(icon);
    }
    
    public static void iconoSet (String s, JLabel l)
    {
        ImageIcon icono= new ImageIcon(s);
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance
        (l.getWidth(), l.getHeight(), Image.SCALE_DEFAULT));
        l.setIcon(icon);
    }
    
    public static void iconoSet(String s, JButton b, String t)
    {
        ImageIcon icono= new ImageIcon(s);        
        b.setText(t);
        b.setIcon(icono);
    }
    
    public boolean checkEmpate()
    {
        if(jug1.getElegido().equalsIgnoreCase(ord.getElegido()))
        {
            return true;
        }
        return false;
    }
    
    public boolean checkVictoria(){
        
        boolean gana;
        
        //Para cada objeto comparamos si gana o pierde
        switch(jug1.getElegido())
        {
            case "piedra.png": 
                if(ord.getElegido().equalsIgnoreCase("largato.png") || ord.getElegido().equalsIgnoreCase("tijera.png"))
                {
                    gana = true;
                }
                else
                {
                    gana = false;
                }
                break;
            case "tijera.png": 
                if(ord.getElegido().equalsIgnoreCase("papel.png") || ord.getElegido().equalsIgnoreCase("lagarto.png"))
                {
                    gana = true;
                }
                else
                {
                    gana = false;
                }
                break;
            case "papel.png": 
                if(ord.getElegido().equalsIgnoreCase("piedra.png") || ord.getElegido().equalsIgnoreCase("spock.png"))
                {
                    gana = true;
                }
                else
                {
                    gana = false;
                }
                break;
            case "lagarto.png": 
                if(ord.getElegido().equalsIgnoreCase("papel.png") || ord.getElegido().equalsIgnoreCase("spock.png"))
                {
                    gana = true;
                }
                else
                {
                    gana = false;
                }
                break;
            case "spock.png": 
                if(ord.getElegido().equalsIgnoreCase("tijeras.png") || ord.getElegido().equalsIgnoreCase("piedra.png"))
                {
                    gana = true;
                }
                else
                {
                    gana = false;
                }
                break;
            default: gana = false;
        }
        
        return gana;
    }
    
    //Resetea los label al icono de interrogaciones con un timer
    public void limpiar() {
        
        try
        {
            Thread.currentThread().sleep(400);//sleep for 1000 ms
            iconoSet("int.gif", label1);
            iconoSet("int.gif", label2);

        }
        catch(Exception e)
        {
            e.getMessage();
        }
        //Para que no guarde el último elegido en la siguiente partida, hacemos set a null
        jug1.setElegido(null);
    }
}
