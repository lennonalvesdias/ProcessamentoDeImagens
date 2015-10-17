package principal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ionildo
 */
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import static java.awt.image.ImageObserver.ALLBITS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.*;

public class Programa extends javax.swing.JFrame {
     BufferedImage imagemOriginal, imagemAuxiliar, imagemCinza;
     int flag=0, op=0,
             r, g, b;
   
    public Programa() {
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

        img = new javax.swing.JLabel();
        menuOpcoes = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuSalvar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuEfeitos = new javax.swing.JMenu();
        menuNegativo = new javax.swing.JMenuItem();
        menuSepia = new javax.swing.JMenuItem();
        menuCinzas = new javax.swing.JMenu();
        menu256cinzas = new javax.swing.JMenuItem();
        menu16cinzas = new javax.swing.JMenuItem();
        menu8Cinzas = new javax.swing.JMenuItem();
        menu4Cinzas = new javax.swing.JMenuItem();
        menu2Cinzas = new javax.swing.JMenuItem();
        menuCanal = new javax.swing.JMenu();
        menuRed = new javax.swing.JMenuItem();
        menuGreen = new javax.swing.JMenuItem();
        menuBlue = new javax.swing.JMenuItem();
        menuAll = new javax.swing.JMenuItem();
        menuOutros = new javax.swing.JMenu();
        menuRedBlue = new javax.swing.JMenuItem();
        menuOperacoes = new javax.swing.JMenu();
        menuEspelhamento = new javax.swing.JMenu();
        menuHorizontal = new javax.swing.JMenuItem();
        menuVertical = new javax.swing.JMenuItem();
        menuEscalonamento = new javax.swing.JMenu();
        menuAmpliacao = new javax.swing.JMenuItem();
        menuReducao = new javax.swing.JMenuItem();
        menuGamma = new javax.swing.JMenu();
        gamaMenos = new javax.swing.JMenuItem();
        gamaMais = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDI | Processamento de Imagens");
        setName("framePrincipal"); // NOI18N

        menuArquivo.setText("Arquivo");

        menuAbrir.setLabel("Abrir...");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuAbrir);

        menuSalvar.setLabel("Salvar...");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSalvar);

        menuSair.setLabel("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        menuOpcoes.add(menuArquivo);

        menuEfeitos.setText("Efeitos");

        menuNegativo.setLabel("Negativo");
        menuNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNegativoActionPerformed(evt);
            }
        });
        menuEfeitos.add(menuNegativo);

        menuSepia.setText("Sépia");
        menuSepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSepiaActionPerformed(evt);
            }
        });
        menuEfeitos.add(menuSepia);

        menuCinzas.setText("Tons de Cinzas");

        menu256cinzas.setText("256 tons");
        menu256cinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu256cinzasActionPerformed(evt);
            }
        });
        menuCinzas.add(menu256cinzas);

        menu16cinzas.setText("16 tons");
        menu16cinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu16cinzasActionPerformed(evt);
            }
        });
        menuCinzas.add(menu16cinzas);

        menu8Cinzas.setText("8 tons");
        menu8Cinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu8CinzasActionPerformed(evt);
            }
        });
        menuCinzas.add(menu8Cinzas);

        menu4Cinzas.setText("4 tons");
        menu4Cinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4CinzasActionPerformed(evt);
            }
        });
        menuCinzas.add(menu4Cinzas);

        menu2Cinzas.setText("2 tons");
        menu2Cinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2CinzasActionPerformed(evt);
            }
        });
        menuCinzas.add(menu2Cinzas);

        menuEfeitos.add(menuCinzas);

        menuOpcoes.add(menuEfeitos);

        menuCanal.setText("Canal");

        menuRed.setText("Red");
        menuRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRedActionPerformed(evt);
            }
        });
        menuCanal.add(menuRed);

        menuGreen.setText("Green");
        menuGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGreenActionPerformed(evt);
            }
        });
        menuCanal.add(menuGreen);

        menuBlue.setText("Blue");
        menuBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlueActionPerformed(evt);
            }
        });
        menuCanal.add(menuBlue);

        menuAll.setText("All");
        menuAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAllActionPerformed(evt);
            }
        });
        menuCanal.add(menuAll);

        menuOutros.setText("Outros");

        menuRedBlue.setText("Azul -> Vermelho");
        menuRedBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRedBlueActionPerformed(evt);
            }
        });
        menuOutros.add(menuRedBlue);

        menuCanal.add(menuOutros);

        menuOpcoes.add(menuCanal);

        menuOperacoes.setText("Operacoes");

        menuEspelhamento.setText("Espelhamento");

        menuHorizontal.setText("Horizontal");
        menuHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHorizontalActionPerformed(evt);
            }
        });
        menuEspelhamento.add(menuHorizontal);

        menuVertical.setText("Vertical");
        menuVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerticalActionPerformed(evt);
            }
        });
        menuEspelhamento.add(menuVertical);

        menuOperacoes.add(menuEspelhamento);

        menuEscalonamento.setText("Escalonamento");

        menuAmpliacao.setText("Ampliação");
        menuAmpliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAmpliacaoActionPerformed(evt);
            }
        });
        menuEscalonamento.add(menuAmpliacao);

        menuReducao.setText("Redução");
        menuReducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReducaoActionPerformed(evt);
            }
        });
        menuEscalonamento.add(menuReducao);

        menuOperacoes.add(menuEscalonamento);

        menuGamma.setText("Gamma");

        gamaMenos.setText("Clarear");
        gamaMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamaMenosActionPerformed(evt);
            }
        });
        menuGamma.add(gamaMenos);

        gamaMais.setText("Escurecer");
        gamaMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamaMaisActionPerformed(evt);
            }
        });
        menuGamma.add(gamaMais);

        menuOperacoes.add(menuGamma);

        menuOpcoes.add(menuOperacoes);

        setJMenuBar(menuOpcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img)
                .addGap(0, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img)
                .addGap(0, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF Images", "jpg", "png", "gif");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Abrir Imagem");
        op = chooser.showOpenDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){  
            File arq = chooser.getSelectedFile();  
            String path = arq.toString();  
            try { 
                  //carrega nova imagem
                  imagemOriginal = ImageIO.read(new File(path));
                  System.out.println("Arquivo aberto com sucesso!");
                  ImageIcon icon = new ImageIcon(imagemOriginal);
                  if (flag==0) {
                      img.setIcon(icon);
                      Container contentPane = getContentPane();
                      contentPane.setLayout(new GridLayout());
                      contentPane.add(new JScrollPane(img));
                      flag=1;
                  }
                  else img.setIcon(icon);
                  setSize(imagemOriginal.getWidth()+25, imagemOriginal.getHeight()+70);
	    }
	    catch(IOException e){
		System.out.println("Erro IO Exception! Verifique se o arquivo especificado existe e tente novamente.");
	    }
	    catch(Exception e){
		System.out.println("Erro Exception! " + e.getMessage());
	    }                   
        }  
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(1);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Salvar Imagem");
        op = chooser.showSaveDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){  
            File arq = chooser.getSelectedFile();  
            String path = arq.toString();  
            try {
		ImageIO.write(imagemOriginal,"jpg",new File(path));
		System.out.println("Arquivo salvo com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro IO Exception! Verifique se o arquivo especificado existe e tente novamente.");
		}
		catch(Exception e){
			System.out.println("Erro Exception! " + e.getMessage());
		}
        }
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void menuNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNegativoActionPerformed
        if (imagemOriginal != null) {
            
            imagemAuxiliar = imagemOriginal;
            
            if (op == 0) {
                op = 1; menuNegativo.setText("Normal");
                System.out.println("Efeito negativo aplicado.");
            } 
            else {
                op = 0; menuNegativo.setText("Negativo");
                System.out.println("Efeito negativo desfeito.");
            }

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j); //a cor inversa é dado por 255 menos o valor de cada canal 				
                    r = 255 - (int)((rgb&0x00FF0000)>>>16);
                    g = 255 - (int)((rgb&0x0000FF00)>>>8);
                    b = 255 - (int) (rgb&0x000000FF);
                    Color color = new Color(r, g, b);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuNegativoActionPerformed

    private void menu256cinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu256cinzasActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            
            imagemAuxiliar = imagemOriginal;
            
            if (op == 0) { 
                System.out.println("Tons de cinza aplicados com paleta 256.");
                op = 1; menu256cinzas.setText("Normal");
                
                int width = imagemAuxiliar.getWidth();
                int height = imagemAuxiliar.getHeight();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) { 				
                        int rgb = imagemAuxiliar.getRGB(i, j);				
                        r = (int)((rgb&0x00FF0000)>>>16);
                        g = (int)((rgb&0x0000FF00)>>>8);
                        b = (int) (rgb&0x000000FF);
                        int y = (int) ((0.299 * r) + (0.587 * g) + (0.114 * b));
                        Color color = new Color(y, y, y);
                        imagemAuxiliar.setRGB(i, j, color.getRGB());
                    }
                }
                this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
            } 
            else { 
                System.out.println("Efeito tons de cinzas desfeito.");
                op = 0; menu256cinzas.setText("Tons de Cinza");
                
                int width = imagemOriginal.getWidth();
                int height = imagemOriginal.getHeight();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) { 				
                        int rgb = imagemOriginal.getRGB(i, j);				
                        r = (int)((rgb&0x00FF0000)>>>16);
                        g = (int)((rgb&0x0000FF00)>>>8);
                        b = (int) (rgb&0x000000FF);
                        Color color = new Color(r, g, b);
                        imagemOriginal.setRGB(i, j, color.getRGB());
                    }
                }
                this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
            }
        }
    }//GEN-LAST:event_menu256cinzasActionPerformed

    private void menuSepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSepiaActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            
            imagemAuxiliar = imagemOriginal;
            
            if (op == 0) { 
                System.out.println("Efeito sépia aplicado.");
                op = 1; menuSepia.setText("Normal");
                
                int width = imagemAuxiliar.getWidth();
                int height = imagemAuxiliar.getHeight();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) { 				
                        int rgb = imagemAuxiliar.getRGB(i, j);				
                        r = (int)((rgb&0x00FF0000)>>>16);
                        g = (int)((rgb&0x0000FF00)>>>8);
                        b = (int) (rgb&0x000000FF);
                        int y1 = (int) ((0.393 * r) + (0.769 * g) + (0.189 * b)); if (y1 > 255) y1 = 255;
                        int y2 = (int) ((0.349 * r) + (0.686 * g) + (0.168 * b)); if (y2 > 255) y2 = 255;
                        int y3 = (int) ((0.272 * r) + (0.539 * g) + (0.131 * b)); if (y3 > 255) y3 = 255;
                        Color color = new Color(y1, y2, y3);
                        imagemAuxiliar.setRGB(i, j, color.getRGB());
                    }
                }
                this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
            } 
            else { 
                System.out.println("Efeito sépia desfeito.");
                op = 0; menuSepia.setText("Sépia");
                
                int width = imagemOriginal.getWidth();
                int height = imagemOriginal.getHeight();
                this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
            }
        }
    }//GEN-LAST:event_menuSepiaActionPerformed

    private void menuRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRedActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) { 
            System.out.println("Canal vermelho aplicado.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);			
                    Color cor = new Color(imagemAuxiliar.getRGB(i, j));
                    r = cor.getRed();
                    Color color = new Color(r, r, r);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuRedActionPerformed

    private void menuGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGreenActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) { 
            System.out.println("Canal verde aplicado.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);			
                    Color cor = new Color(imagemAuxiliar.getRGB(i, j));
                    g = cor.getGreen();
                    Color color = new Color(g, g, g);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuGreenActionPerformed

    private void menuBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBlueActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) { 
            System.out.println("Canal azul aplicado.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    Color cor = new Color(imagemAuxiliar.getRGB(i, j));
                    b = cor.getBlue();
                    Color color = new Color(b, b, b);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuBlueActionPerformed

    private void menuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAllActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) { 
            System.out.println("Canal completo de cores aplicado.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    r = (int)((rgb&0x00FF0000)>>>16);
                    g = (int)((rgb&0x0000FF00)>>>8);
                    b = (int) (rgb&0x000000FF);
                    Color color = new Color(r, g, b);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuAllActionPerformed

    private void menuRedBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRedBlueActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) { 
            System.out.println("Pixels vermelhos substituidos por azuis.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            float[] hsv = new float[3];
            float red = hsv[0];
            Color.RGBtoHSB(255, 0, 0, hsv);
            float blue = hsv[0];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {				
                    Color cor = new Color(imagemAuxiliar.getRGB(i, j));
                    r = cor.getRed();
                    g = cor.getGreen();
                    b = cor.getBlue();
                    Color.RGBtoHSB(r, g, b, hsv);
                    if (hsv[0] <= red + 0.04 || hsv[0] >= 0.96) {
                        int rgb = Color.HSBtoRGB(blue, hsv[1], hsv[2]);
                        Color color = new Color(rgb);
                        imagemAuxiliar.setRGB(i, j, color.getRGB());
                    }
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuRedBlueActionPerformed

    private void menuVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerticalActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem espelhada verticalmente.");

            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height/2; j++) {
                    pixel = imagemAuxiliar.getRGB(i, j);
                    imagemAuxiliar.setRGB(i, j, imagemAuxiliar.getRGB(i, height-j-1));
                    imagemAuxiliar.setRGB(i, height-j-1, pixel);
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuVerticalActionPerformed

    private void menuHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHorizontalActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem espelhada horizontalmente.");

            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            int pixel;
            for (int i = 0; i < width/2; i++) {
                for (int j = 0; j < height; j++) {
                    pixel = imagemAuxiliar.getRGB(i, j);
                    imagemAuxiliar.setRGB(i, j, imagemAuxiliar.getRGB(width-i-1, j));
                    imagemAuxiliar.setRGB(width-i-1, j, pixel);
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menuHorizontalActionPerformed

    private void menuAmpliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAmpliacaoActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem ampliada em 50% do tamanho original.");
            
            imagemAuxiliar = imagemOriginal;

            BufferedImage buffer = new BufferedImage(imagemAuxiliar.getWidth() * 2,
            imagemAuxiliar.getHeight() * 2, imagemAuxiliar.getType());

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    pixel = imagemAuxiliar.getRGB(i, j);
                    buffer.setRGB(i * 2, j * 2, pixel);
                    buffer.setRGB(i * 2 + 1, j * 2, pixel);
                    buffer.setRGB(i * 2, j * 2 + 1, pixel);
                    buffer.setRGB(i * 2 + 1, j * 2 + 1, pixel);
                }
            }
            imagemAuxiliar = buffer;
            ImageIcon icon = new ImageIcon(imagemAuxiliar);
            img.setIcon(icon);
            setSize(imagemAuxiliar.getWidth() + 25, imagemAuxiliar.getHeight() + 70);
        }
    }//GEN-LAST:event_menuAmpliacaoActionPerformed

    private void menuReducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReducaoActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem reduzida em 50% do tamanho original.");
            
            imagemAuxiliar = imagemOriginal;

            BufferedImage buffer = new BufferedImage((imagemAuxiliar.getWidth() + 1) / 2,
            (imagemAuxiliar.getHeight() + 1) / 2, imagemAuxiliar.getType());

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i += 2) {
                for (int j = 0; j < height; j += 2) {
                    buffer.setRGB(i/2, j/2, imagemAuxiliar.getRGB(i, j));
                }
            }
            imagemAuxiliar = buffer;
            ImageIcon icon = new ImageIcon(imagemAuxiliar);
            img.setIcon(icon);
            setSize(imagemAuxiliar.getWidth() + 25, imagemAuxiliar.getHeight() + 70);
        }
    }//GEN-LAST:event_menuReducaoActionPerformed

    private void gamaMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamaMenosActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem clareada com efeito gamma.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    Color cor = new Color(imagemOriginal.getRGB(i, j));
                    r = (int) (Math.pow(cor.getRed() / 255.0, 0.4) * 255);
                    g = (int) (Math.pow(cor.getGreen()/ 255.0, 0.4) * 255);
                    b = (int) (Math.pow(cor.getBlue()/ 255.0, 0.4) * 255);   
                    Color color = new Color(r, g, b);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_gamaMenosActionPerformed

    private void gamaMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamaMaisActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Imagem escurecida com efeito gamma.");
            
            imagemAuxiliar = imagemOriginal;
            
            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            int pixel;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    Color cor = new Color(imagemOriginal.getRGB(i, j));
                    r = (int) (Math.pow(cor.getRed() / 255.0, 1.4) * 255);
                    g = (int) (Math.pow(cor.getGreen()/ 255.0, 1.4) * 255);
                    b = (int) (Math.pow(cor.getBlue()/ 255.0, 1.4) * 255);   
                    Color color = new Color(r, g, b);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemAuxiliar, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_gamaMaisActionPerformed

    private void menu16cinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu16cinzasActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Tons de cinza aplicados com paleta 16.");
            
            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    r = (int)((rgb&0x00FF0000)>>>16);
                    g = (int)((rgb&0x0000FF00)>>>8);
                    b = (int) (rgb&0x000000FF);
                    int y = (int) ((0.299 * r) + (0.587 * g) + (0.114 * b));
                    y = (y / 16) * 16;
                    Color color = new Color(y, y, y);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menu16cinzasActionPerformed

    private void menu8CinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu8CinzasActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Tons de cinza aplicados com paleta 16.");
            
            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    r = (int)((rgb&0x00FF0000)>>>16);
                    g = (int)((rgb&0x0000FF00)>>>8);
                    b = (int) (rgb&0x000000FF);
                    int y = (int) ((0.299 * r) + (0.587 * g) + (0.114 * b));
                    y = (y / 32) * 32;
                    Color color = new Color(y, y, y);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menu8CinzasActionPerformed

    private void menu4CinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4CinzasActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Tons de cinza aplicados com paleta 16.");
            
            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    r = (int)((rgb&0x00FF0000)>>>16);
                    g = (int)((rgb&0x0000FF00)>>>8);
                    b = (int) (rgb&0x000000FF);
                    int y = (int) ((0.299 * r) + (0.587 * g) + (0.114 * b));
                    y = (y / 64) * 64;
                    Color color = new Color(y, y, y);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menu4CinzasActionPerformed

    private void menu2CinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2CinzasActionPerformed
        // TODO add your handling code here:
        if (imagemOriginal != null) {
            System.out.println("Tons de cinza aplicados com paleta 16.");
            
            imagemAuxiliar = imagemOriginal;

            int width = imagemAuxiliar.getWidth();
            int height = imagemAuxiliar.getHeight();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) { 				
                    int rgb = imagemAuxiliar.getRGB(i, j);				
                    r = (int)((rgb&0x00FF0000)>>>16);
                    g = (int)((rgb&0x0000FF00)>>>8);
                    b = (int) (rgb&0x000000FF);
                    int y = (int) ((0.299 * r) + (0.587 * g) + (0.114 * b));
                    y = (y / 128) * 128;
                    if (y >= 128) y = 255; /* cinza claro em branco */
                    Color color = new Color(y, y, y);
                    imagemAuxiliar.setRGB(i, j, color.getRGB());
                }
            }
            this.imageUpdate(imagemOriginal, ALLBITS, 0, 0, width, height);
        }
    }//GEN-LAST:event_menu2CinzasActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { 
                    // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); /* Windows */
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); /* Linux */
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Programa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem gamaMais;
    private javax.swing.JMenuItem gamaMenos;
    private javax.swing.JLabel img;
    private javax.swing.JMenuItem menu16cinzas;
    private javax.swing.JMenuItem menu256cinzas;
    private javax.swing.JMenuItem menu2Cinzas;
    private javax.swing.JMenuItem menu4Cinzas;
    private javax.swing.JMenuItem menu8Cinzas;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAll;
    private javax.swing.JMenuItem menuAmpliacao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuBlue;
    private javax.swing.JMenu menuCanal;
    private javax.swing.JMenu menuCinzas;
    private javax.swing.JMenu menuEfeitos;
    private javax.swing.JMenu menuEscalonamento;
    private javax.swing.JMenu menuEspelhamento;
    private javax.swing.JMenu menuGamma;
    private javax.swing.JMenuItem menuGreen;
    private javax.swing.JMenuItem menuHorizontal;
    private javax.swing.JMenuItem menuNegativo;
    private javax.swing.JMenuBar menuOpcoes;
    private javax.swing.JMenu menuOperacoes;
    private javax.swing.JMenu menuOutros;
    private javax.swing.JMenuItem menuRed;
    private javax.swing.JMenuItem menuRedBlue;
    private javax.swing.JMenuItem menuReducao;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JMenuItem menuSepia;
    private javax.swing.JMenuItem menuVertical;
    // End of variables declaration//GEN-END:variables
}
