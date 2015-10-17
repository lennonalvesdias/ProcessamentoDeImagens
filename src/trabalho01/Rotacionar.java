/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.ALLBITS;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Random;

/**
 *
 * @author lennon
 */
public class Rotacionar extends javax.swing.JFrame {

    /**
     * Creates new form ImagemPBM
     */
    public Rotacionar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescricao = new javax.swing.JLabel();
        painelImagem = new javax.swing.JScrollPane();
        lblImagem = new javax.swing.JLabel();
        btnComum = new javax.swing.JButton();
        btRotDireita = new javax.swing.JButton();
        btRotEsquerda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Processamento de Imagens | Trabalho 01");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setName("framePrincipal"); // NOI18N
        getContentPane().setLayout(null);

        lblDescricao.setFont(new java.awt.Font("Canaro Light DEMO", 0, 14)); // NOI18N
        lblDescricao.setText("Dados da imagem:");
        getContentPane().add(lblDescricao);
        lblDescricao.setBounds(10, 470, 760, 30);

        painelImagem.setViewportView(lblImagem);

        getContentPane().add(painelImagem);
        painelImagem.setBounds(10, 60, 760, 410);

        btnComum.setFont(new java.awt.Font("Canaro Light DEMO", 0, 18)); // NOI18N
        btnComum.setText("ABRIR IMAGEM (JPEG / PNG)");
        btnComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComumActionPerformed(evt);
            }
        });
        getContentPane().add(btnComum);
        btnComum.setBounds(10, 10, 370, 40);

        btRotDireita.setText("Direita");
        btRotDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRotDireitaActionPerformed(evt);
            }
        });
        getContentPane().add(btRotDireita);
        btRotDireita.setBounds(590, 10, 180, 40);

        btRotEsquerda.setText("Esquerda");
        btRotEsquerda.setToolTipText("");
        btRotEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRotEsquerdaActionPerformed(evt);
            }
        });
        getContentPane().add(btRotEsquerda);
        btRotEsquerda.setBounds(410, 10, 180, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* variaveis globais */
    BufferedImage imagemOriginal, imagemAuxiliar;
    private static final Random rand = new Random();
    String destino = "D:/backup_temp/NetBeansProjects/ProcessamentoDeImagens/images";
    /* vetor de letras */
    private static final char[] letras = "abcdefghijlmnopqrstuvxz".toCharArray();
    
    private void btnComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComumActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(destino);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG ou PNG", "jpg", "png");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Abrir Imagem");
        int op = chooser.showOpenDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){  
            File arq = chooser.getSelectedFile();  
            String path = arq.toString();  
            try {
                imagemOriginal = ImageIO.read(new File(path));
                imagemAuxiliar = imagemOriginal;
                //ImageIcon icon = new ImageIcon(imagemOriginal.getScaledInstance(painelImagem.getWidth(), painelImagem.getHeight(), java.awt.Image.SCALE_SMOOTH));
                ImageIcon icon = new ImageIcon(imagemOriginal);
                lblImagem.setIcon(icon);
                
                lblDescricao.setText("Dados da imagem:      Altura: " + imagemOriginal.getHeight() + 
                        " pixels      Largura: " + imagemOriginal.getWidth() + " pixels.");
                
                System.out.println("Arquivo " + arq.getName() + " aberto com sucesso.");
	    }
	    catch(IOException e){
		System.out.println("Erro IO Exception! Verifique se o arquivo especificado existe e tente novamente.");
	    }
	    catch(Exception e){
		System.out.println("Erro Exception! " + e.getMessage());
	    }                   
        }
    }//GEN-LAST:event_btnComumActionPerformed

    private void btRotDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRotDireitaActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem rotacionada 90º à direita.");
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();

            BufferedImage buffer = new BufferedImage(height, width, imagemAuxiliar.getType());
            
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    pixel = imagemAuxiliar.getRGB(i, j);
                    buffer.setRGB(height - j - 1, i, pixel);
                }
            }
            
            imagemAuxiliar = buffer;
            ImageIcon icon = new ImageIcon(imagemAuxiliar);
            lblImagem.setIcon(icon);
            setSize(imagemAuxiliar.getWidth(), imagemAuxiliar.getHeight());
            
            //painelImagem.setSize(imagemAuxiliar.getWidth(), imagemAuxiliar.getHeight());
            
            lblDescricao.setText("Dados da imagem:      Altura: " + imagemAuxiliar.getHeight() + 
                        " pixels      Largura: " + imagemAuxiliar.getWidth() + " pixels.");
        }
    }//GEN-LAST:event_btRotDireitaActionPerformed

    private void btRotEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRotEsquerdaActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem rotacionada 90º à esquerda.");
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();

            BufferedImage buffer = new BufferedImage(height, width, imagemAuxiliar.getType());
            
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    pixel = imagemAuxiliar.getRGB(i, j);
                    buffer.setRGB(j, width - i - 1, pixel);
                }
            }
            
            imagemAuxiliar = buffer;
            ImageIcon icon = new ImageIcon(imagemAuxiliar);
            setSize(buffer.getWidth(), buffer.getHeight());
            
            //painelImagem.setSize(imagemAuxiliar.getWidth(), imagemAuxiliar.getHeight());
            
            lblDescricao.setText("Dados da imagem:      Altura: " + imagemAuxiliar.getHeight() + 
                        " pixels      Largura: " + imagemAuxiliar.getWidth() + " pixels.");
        }
    }//GEN-LAST:event_btRotEsquerdaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rotacionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); /* Windows */
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); /* Linux */
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Rotacionar.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Rotacionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRotDireita;
    private javax.swing.JButton btRotEsquerda;
    private javax.swing.JButton btnComum;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JScrollPane painelImagem;
    // End of variables declaration//GEN-END:variables
}