package GDP;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    
    // Captura as fontes da pasta local do windows
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] nomeFontes = ge.getAvailableFontFamilyNames();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        Fechar = new javax.swing.JLabel();
        MenuEdicaoPlaca = new GDP.PanelRound();
        BaixarPlaca = new javax.swing.JButton();
        NomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DescricaoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ValorReais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ValorCentavos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UnidadeMedida = new javax.swing.JTextField();
        GerarPlaca = new javax.swing.JButton();
        FonteNomeProduto = new javax.swing.JComboBox<>(nomeFontes);
        jLabel1 = new javax.swing.JLabel();
        FonteDescricaoProduto = new javax.swing.JComboBox<>(nomeFontes);
        FonteValorReais = new javax.swing.JComboBox<>(nomeFontes);
        FonteValorCentavos = new javax.swing.JComboBox<>(nomeFontes);
        FonteUnidadeMedida = new javax.swing.JComboBox<>(nomeFontes);
        jLabel2 = new javax.swing.JLabel();
        CifraoPreco = new javax.swing.JTextField();
        FonteCifraoPreco = new javax.swing.JComboBox<>(nomeFontes);
        jLabel8 = new javax.swing.JLabel();
        VirgulaPreco = new javax.swing.JTextField();
        FonteVirgulaPreco = new javax.swing.JComboBox<>(nomeFontes);
        PlacaKg = new javax.swing.JPanel();
        FundoOferta = new javax.swing.JPanel();
        Oferta = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        DescricaoDoProduto = new javax.swing.JLabel();
        Cifrao = new javax.swing.JLabel();
        KG = new javax.swing.JLabel();
        Virgula = new javax.swing.JLabel();
        DivisorCentavos = new javax.swing.JSeparator();
        Centavos = new javax.swing.JLabel();
        Reais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Placa");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fechar.setBackground(new java.awt.Color(255, 255, 255));
        Fechar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fechar.setForeground(new java.awt.Color(255, 255, 255));
        Fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-48.png"))); // NOI18N
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FecharMousePressed(evt);
            }
        });
        kGradientPanel1.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 60, 60));

        MenuEdicaoPlaca.setBackground(new java.awt.Color(255, 255, 255));
        MenuEdicaoPlaca.setRoundBottomLeft(50);
        MenuEdicaoPlaca.setRoundBottomRight(50);
        MenuEdicaoPlaca.setRoundTopLeft(50);
        MenuEdicaoPlaca.setRoundTopRight(50);
        MenuEdicaoPlaca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BaixarPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BaixarPlaca.setText("Baixar Placa");
        BaixarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarPlacaActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(BaixarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        NomeProduto.setText("CEBOLA");
        MenuEdicaoPlaca.add(NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nome do produto:");
        MenuEdicaoPlaca.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Descrição do produto:");
        MenuEdicaoPlaca.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 30));

        DescricaoProduto.setText("BRANCA");
        MenuEdicaoPlaca.add(DescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor em reais:");
        MenuEdicaoPlaca.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 30));

        ValorReais.setText("3");
        MenuEdicaoPlaca.add(ValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Valor em centavos:");
        MenuEdicaoPlaca.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 30));

        ValorCentavos.setText("89");
        MenuEdicaoPlaca.add(ValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cifrão:");
        MenuEdicaoPlaca.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, 30));

        UnidadeMedida.setText("KG");
        MenuEdicaoPlaca.add(UnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 20));

        GerarPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GerarPlaca.setText("Gerar Placa");
        GerarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarPlacaActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(GerarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 30));

        FonteNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteNomeProdutoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Fonte:");
        MenuEdicaoPlaca.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 50, 30));

        FonteDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteDescricaoProdutoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, -1));

        FonteValorReais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteValorReaisActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));

        FonteValorCentavos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteValorCentavosActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, -1));

        FonteUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteUnidadeMedidaActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteUnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Virgula:");
        MenuEdicaoPlaca.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, 30));

        CifraoPreco.setText("R$");
        MenuEdicaoPlaca.add(CifraoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, -1));

        FonteCifraoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteCifraoPrecoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteCifraoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Unidade de medida:");
        MenuEdicaoPlaca.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 30));

        VirgulaPreco.setText(",");
        MenuEdicaoPlaca.add(VirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, -1));

        FonteVirgulaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteVirgulaPrecoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteVirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, -1));

        kGradientPanel1.add(MenuEdicaoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 370, 510));

        PlacaKg.setBackground(new java.awt.Color(255, 255, 255));
        PlacaKg.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5)));
        PlacaKg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FundoOferta.setBackground(new java.awt.Color(255, 0, 0));
        FundoOferta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3)));
        FundoOferta.setForeground(new java.awt.Color(255, 0, 0));
        FundoOferta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Oferta.setBackground(new java.awt.Color(255, 255, 0));
        Oferta.setFont(new java.awt.Font("Impact", 0, 120)); // NOI18N
        Oferta.setForeground(new java.awt.Color(255, 255, 0));
        Oferta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Oferta.setText("OFERTA");
        FundoOferta.add(Oferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 370, 110));

        PlacaKg.add(FundoOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 110));

        Produto.setFont(new java.awt.Font("Impact", 0, 105)); // NOI18N
        Produto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Produto.setText("CEBOLA");
        PlacaKg.add(Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 360, 110));

        DescricaoDoProduto.setFont(new java.awt.Font("Impact", 0, 70)); // NOI18N
        DescricaoDoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescricaoDoProduto.setText("BRANCA");
        PlacaKg.add(DescricaoDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 224, 350, 60));

        Cifrao.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        Cifrao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cifrao.setText("R$");
        PlacaKg.add(Cifrao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, 60));

        KG.setFont(new java.awt.Font("Impact", 0, 52)); // NOI18N
        KG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KG.setText("KG");
        PlacaKg.add(KG, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 110, 100));

        Virgula.setFont(new java.awt.Font("Tahoma", 1, 170)); // NOI18N
        Virgula.setForeground(new java.awt.Color(204, 0, 0));
        Virgula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Virgula.setText(",");
        PlacaKg.add(Virgula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, 180));

        DivisorCentavos.setBackground(new java.awt.Color(255, 0, 51));
        DivisorCentavos.setForeground(new java.awt.Color(204, 0, 0));
        DivisorCentavos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2)));
        DivisorCentavos.setPreferredSize(new java.awt.Dimension(50, 5));
        PlacaKg.add(DivisorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 385, 80, -1));

        Centavos.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        Centavos.setForeground(new java.awt.Color(204, 0, 0));
        Centavos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Centavos.setText("89");
        PlacaKg.add(Centavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, 110));

        Reais.setFont(new java.awt.Font("Impact", 2, 220)); // NOI18N
        Reais.setForeground(new java.awt.Color(204, 0, 0));
        Reais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reais.setText("3");
        Reais.setToolTipText("");
        PlacaKg.add(Reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 150, 230));

        kGradientPanel1.add(PlacaKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 380, 510));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Convert o painel em png e salva
    public static class PainelParaPNG {
        
    public static void salvarComoPNG(JPanel PlacaKg) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Salvar como...");
    fileChooser.setFileFilter(new FileNameExtensionFilter("PNG images (*.png)", "png"));

    int userSelection = fileChooser.showSaveDialog(PlacaKg);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        String extension = FilenameUtils.getExtension(filePath);
        if (!"png".equals(extension)) {
            filePath += ".png";
        }
        try {
            // Onde acontece a conversao em si
            BufferedImage imagem = new BufferedImage(PlacaKg.getWidth(), PlacaKg.getHeight(), BufferedImage.TYPE_INT_RGB);
            PlacaKg.paint(imagem.getGraphics());
            ImageIO.write(imagem, "png", new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
      
    // Configura o JLabel X para fechar a janela
    private void FecharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMousePressed
    System.exit(0);
    }//GEN-LAST:event_FecharMousePressed

    // Configura o JButton BaixarPlaca para salvar png
    private void BaixarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixarPlacaActionPerformed
        PainelParaPNG.salvarComoPNG(PlacaKg);
    }//GEN-LAST:event_BaixarPlacaActionPerformed
    
    // Configura o botao para edita o texto da placa
    private void GerarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarPlacaActionPerformed
    //1   
    String NomeProdutoText = NomeProduto.getText();
    Produto.setText( NomeProdutoText);
    //2
    String DescricaoProdutoText = DescricaoProduto.getText();
    DescricaoDoProduto.setText( DescricaoProdutoText);
    //3
    String ValorReaisText = ValorReais.getText();
    Reais.setText( ValorReaisText);
    //4
    String ValorCentavosText = ValorCentavos.getText();
    Centavos.setText( ValorCentavosText);
    //5
    String UnidadeMedidaText = UnidadeMedida.getText();
    KG.setText( UnidadeMedidaText);
    }//GEN-LAST:event_GerarPlacaActionPerformed

    // Captura a fonte selecionada e seta na placa
    private void FonteNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteNomeProdutoActionPerformed
        try {
            
            String nomeFonte = (String) FonteNomeProduto.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,105);

            
            Produto.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteNomeProdutoActionPerformed

    private void FonteDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteDescricaoProdutoActionPerformed
        try {
            
            String nomeFonte = (String) FonteDescricaoProduto.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,70);

            
            DescricaoDoProduto.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteDescricaoProdutoActionPerformed

    private void FonteValorReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteValorReaisActionPerformed
        try {
            
            String nomeFonte = (String) FonteValorReais.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,220);

            
            Reais.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteValorReaisActionPerformed

    private void FonteValorCentavosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteValorCentavosActionPerformed
        try {
            
            String nomeFonte = (String) FonteValorCentavos.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,70);

            
            Centavos.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteValorCentavosActionPerformed

    private void FonteUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteUnidadeMedidaActionPerformed
        try {
            
            String nomeFonte = (String) FonteUnidadeMedida.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,52);

            
            KG.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteUnidadeMedidaActionPerformed

    private void FonteCifraoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteCifraoPrecoActionPerformed
        try {
            
            String nomeFonte = (String) FonteCifraoPreco.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,48);

            
            Cifrao.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteCifraoPrecoActionPerformed

    private void FonteVirgulaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteVirgulaPrecoActionPerformed
        try {
            
            String nomeFonte = (String) FonteVirgulaPreco.getSelectedItem();
            Font font = new Font(nomeFonte, Font.PLAIN,170);

            
            Virgula.setFont(font);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fonte: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FonteVirgulaPrecoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaixarPlaca;
    private javax.swing.JLabel Centavos;
    private javax.swing.JLabel Cifrao;
    private javax.swing.JTextField CifraoPreco;
    private javax.swing.JLabel DescricaoDoProduto;
    private javax.swing.JTextField DescricaoProduto;
    private javax.swing.JSeparator DivisorCentavos;
    private javax.swing.JLabel Fechar;
    private javax.swing.JComboBox<String> FonteCifraoPreco;
    private javax.swing.JComboBox<String> FonteDescricaoProduto;
    private javax.swing.JComboBox<String> FonteNomeProduto;
    private javax.swing.JComboBox<String> FonteUnidadeMedida;
    private javax.swing.JComboBox<String> FonteValorCentavos;
    private javax.swing.JComboBox<String> FonteValorReais;
    private javax.swing.JComboBox<String> FonteVirgulaPreco;
    private javax.swing.JPanel FundoOferta;
    private javax.swing.JButton GerarPlaca;
    private javax.swing.JLabel KG;
    private GDP.PanelRound MenuEdicaoPlaca;
    private javax.swing.JTextField NomeProduto;
    private javax.swing.JLabel Oferta;
    private javax.swing.JPanel PlacaKg;
    private javax.swing.JLabel Produto;
    private javax.swing.JLabel Reais;
    private javax.swing.JTextField UnidadeMedida;
    private javax.swing.JTextField ValorCentavos;
    private javax.swing.JTextField ValorReais;
    private javax.swing.JLabel Virgula;
    private javax.swing.JTextField VirgulaPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}