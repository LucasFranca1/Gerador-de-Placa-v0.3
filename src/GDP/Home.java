package GDP;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        Fechar = new javax.swing.JLabel();
        MenuEdicaoPlaca = new GDP.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o modelo da Placa");
        MenuEdicaoPlaca.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 57));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa KG" }));
        MenuEdicaoPlaca.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 30));

        BaixarPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BaixarPlaca.setText("Baixar Placa");
        BaixarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixarPlacaActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(BaixarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        NomeProduto.setText("CEBOLA");
        MenuEdicaoPlaca.add(NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome do produto:");
        MenuEdicaoPlaca.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descrição do produto:");
        MenuEdicaoPlaca.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, 30));

        DescricaoProduto.setText("BRANCA");
        MenuEdicaoPlaca.add(DescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 220, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor em reais:");
        MenuEdicaoPlaca.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 30));

        ValorReais.setText("3");
        MenuEdicaoPlaca.add(ValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 220, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valor em centavos:");
        MenuEdicaoPlaca.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 220, 30));

        ValorCentavos.setText("89");
        MenuEdicaoPlaca.add(ValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Unidade de medida:");
        MenuEdicaoPlaca.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 220, 20));

        UnidadeMedida.setText("KG");
        MenuEdicaoPlaca.add(UnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 220, 30));

        GerarPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GerarPlaca.setText("Gerar Placa");
        GerarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarPlacaActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(GerarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 30));

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
        PlacaKg.add(KG, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 100));

        Virgula.setFont(new java.awt.Font("Tahoma", 1, 170)); // NOI18N
        Virgula.setForeground(new java.awt.Color(204, 0, 0));
        Virgula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Virgula.setText(",");
        PlacaKg.add(Virgula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 90, 180));

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
    private javax.swing.JLabel DescricaoDoProduto;
    private javax.swing.JTextField DescricaoProduto;
    private javax.swing.JSeparator DivisorCentavos;
    private javax.swing.JLabel Fechar;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}