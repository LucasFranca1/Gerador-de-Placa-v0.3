package GDP;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import javax.swing.JColorChooser;
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
        jLabel9 = new javax.swing.JLabel();
        TamanhoCifraoPreco = new javax.swing.JTextField();
        TamanhoNomeProduto = new javax.swing.JTextField();
        TamanhoDescricaoProduto = new javax.swing.JTextField();
        TamanhoValorReais = new javax.swing.JTextField();
        TamanhoValorCentavos = new javax.swing.JTextField();
        TamanhoUnidadeMedida = new javax.swing.JTextField();
        TamanhoVirgulaPreco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CorCifraoPreco = new javax.swing.JPanel();
        CorNomeProduto = new javax.swing.JPanel();
        CorDescricaoProduto = new javax.swing.JPanel();
        CorValorReais = new javax.swing.JPanel();
        CorValorCentavos = new javax.swing.JPanel();
        CorUnidadeMedida = new javax.swing.JPanel();
        CorVirgulaPreco = new javax.swing.JPanel();
        widthUser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        heightUser = new javax.swing.JTextField();
        Resolucoes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
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
        MenuEdicaoPlaca.add(BaixarPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 30));

        NomeProduto.setText("CEBOLA");
        NomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeProdutoKeyReleased(evt);
            }
        });
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
        DescricaoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DescricaoProdutoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(DescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor em reais:");
        MenuEdicaoPlaca.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 30));

        ValorReais.setText("3");
        ValorReais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorReaisKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(ValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Valor em centavos:");
        MenuEdicaoPlaca.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 30));

        ValorCentavos.setText("89");
        ValorCentavos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorCentavosKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(ValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cifrão:");
        MenuEdicaoPlaca.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, 30));

        UnidadeMedida.setText("KG");
        UnidadeMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UnidadeMedidaKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(UnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 20));

        FonteNomeProduto.setPreferredSize(new java.awt.Dimension(45, 20));
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

        FonteDescricaoProduto.setPreferredSize(new java.awt.Dimension(47, 20));
        FonteDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteDescricaoProdutoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, -1));

        FonteValorReais.setPreferredSize(new java.awt.Dimension(12, 20));
        FonteValorReais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteValorReaisActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));

        FonteValorCentavos.setPreferredSize(new java.awt.Dimension(18, 20));
        FonteValorCentavos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteValorCentavosActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, -1));

        FonteUnidadeMedida.setPreferredSize(new java.awt.Dimension(19, 20));
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
        CifraoPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CifraoPrecoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(CifraoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, -1));

        FonteCifraoPreco.setPreferredSize(new java.awt.Dimension(19, 20));
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
        VirgulaPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VirgulaPrecoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(VirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, -1));

        FonteVirgulaPreco.setPreferredSize(new java.awt.Dimension(10, 20));
        FonteVirgulaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteVirgulaPrecoActionPerformed(evt);
            }
        });
        MenuEdicaoPlaca.add(FonteVirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tamanho:");
        jLabel9.setToolTipText("");
        MenuEdicaoPlaca.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 70, 20));

        TamanhoCifraoPreco.setText("48");
        TamanhoCifraoPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoCifraoPrecoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoCifraoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 60, -1));

        TamanhoNomeProduto.setText("105");
        TamanhoNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoNomeProdutoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 60, -1));

        TamanhoDescricaoProduto.setText("70");
        TamanhoDescricaoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoDescricaoProdutoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 60, -1));

        TamanhoValorReais.setText("220");
        TamanhoValorReais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoValorReaisKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 60, -1));

        TamanhoValorCentavos.setText("70");
        TamanhoValorCentavos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoValorCentavosKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 60, -1));

        TamanhoUnidadeMedida.setText("52");
        TamanhoUnidadeMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoUnidadeMedidaKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoUnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 60, -1));

        TamanhoVirgulaPreco.setText("170");
        TamanhoVirgulaPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanhoVirgulaPrecoKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(TamanhoVirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cor:");
        MenuEdicaoPlaca.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 70, 20));

        CorCifraoPreco.setBackground(new java.awt.Color(0, 0, 0));
        CorCifraoPreco.setMinimumSize(new java.awt.Dimension(28, 20));
        CorCifraoPreco.setPreferredSize(new java.awt.Dimension(28, 20));
        CorCifraoPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorCifraoPrecoMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorCifraoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 20, -1));

        CorNomeProduto.setBackground(new java.awt.Color(0, 0, 0));
        CorNomeProduto.setMinimumSize(new java.awt.Dimension(28, 20));
        CorNomeProduto.setPreferredSize(new java.awt.Dimension(28, 20));
        CorNomeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorNomeProdutoMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 20, -1));

        CorDescricaoProduto.setBackground(new java.awt.Color(0, 0, 0));
        CorDescricaoProduto.setMinimumSize(new java.awt.Dimension(28, 20));
        CorDescricaoProduto.setPreferredSize(new java.awt.Dimension(28, 20));
        CorDescricaoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorDescricaoProdutoMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 20, -1));

        CorValorReais.setBackground(new java.awt.Color(204, 0, 0));
        CorValorReais.setMinimumSize(new java.awt.Dimension(28, 20));
        CorValorReais.setPreferredSize(new java.awt.Dimension(28, 20));
        CorValorReais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorValorReaisMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorValorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 20, -1));

        CorValorCentavos.setBackground(new java.awt.Color(204, 0, 0));
        CorValorCentavos.setMinimumSize(new java.awt.Dimension(28, 20));
        CorValorCentavos.setPreferredSize(new java.awt.Dimension(28, 20));
        CorValorCentavos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorValorCentavosMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorValorCentavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 20, -1));

        CorUnidadeMedida.setBackground(new java.awt.Color(0, 0, 0));
        CorUnidadeMedida.setMinimumSize(new java.awt.Dimension(28, 20));
        CorUnidadeMedida.setPreferredSize(new java.awt.Dimension(28, 20));
        CorUnidadeMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorUnidadeMedidaMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorUnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 20, -1));

        CorVirgulaPreco.setBackground(new java.awt.Color(204, 0, 0));
        CorVirgulaPreco.setMinimumSize(new java.awt.Dimension(28, 20));
        CorVirgulaPreco.setPreferredSize(new java.awt.Dimension(28, 20));
        CorVirgulaPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorVirgulaPrecoMouseClicked(evt);
            }
        });
        MenuEdicaoPlaca.add(CorVirgulaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 20, -1));

        widthUser.setText("3508 ");
        widthUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                widthUserKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(widthUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        MenuEdicaoPlaca.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 20, 30));

        heightUser.setText("4961");
        heightUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heightUserKeyReleased(evt);
            }
        });
        MenuEdicaoPlaca.add(heightUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 90, 30));

        Resolucoes.addItem("A0 841 × 1189 = 9933 x 14043 pixels");
        Resolucoes.addItem("A1 594 × 841  = 7016 x 9933 pixels");
        Resolucoes.addItem("A2 420 × 594  = 4961 x 7016 pixels");
        Resolucoes.addItem("A3 297 × 420  = 3508 x 4961 pixels");
        Resolucoes.addItem("A4 210 × 297  = 2480 x 3508 pixels");
        Resolucoes.addItem("A5 148 × 210  = 1748 x 2480 pixels");
        Resolucoes.addItem("A6 105 × 148  = 1240 x 1748 pixels");
        Resolucoes.addItem("A7 74 × 105  = 874 x 1240 pixels");
        Resolucoes.addItem("A8 52 × 74  = 614 x 874 pixels");
        Resolucoes.addItem("A9 37 × 52  = 437 x 614 pixels");
        Resolucoes.addItem("A10 26 × 37 = 307 x 437 pixels");
        Resolucoes.setSelectedIndex(3);
        MenuEdicaoPlaca.add(Resolucoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Escolha uma resolução ou personalize uma !!!");
        MenuEdicaoPlaca.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 490, 40));

        kGradientPanel1.add(MenuEdicaoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 500, 510));

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

        kGradientPanel1.add(PlacaKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 380, 510));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Convert o painel em png e salva
    public static class PainelParaPNG {
        
    private static int width = 3508;
    private static int height = 4961;
    
    public static void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public static void setHeight(int newHeight) {
        height = newHeight;
    }
    
    public static void salvarComoPNG(JPanel PlacaKg) {
      
     
    // Janela para salvar arquivo
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
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            g2d.scale((double) width / PlacaKg.getWidth(), (double) height / PlacaKg.getHeight());
            PlacaKg.printAll(g2d);
            g2d.dispose();
            ImageIO.write(image, "png", new File(filePath));
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

    // Captura o texto digitado e seta na placa
    private void NomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeProdutoKeyReleased
        String NomeProdutoText = NomeProduto.getText();
        Produto.setText( NomeProdutoText);
    }//GEN-LAST:event_NomeProdutoKeyReleased

    private void DescricaoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescricaoProdutoKeyReleased
        String DescricaoProdutoText = DescricaoProduto.getText();
        DescricaoDoProduto.setText( DescricaoProdutoText);
    }//GEN-LAST:event_DescricaoProdutoKeyReleased

    private void ValorReaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorReaisKeyReleased
        String ValorReaisText = ValorReais.getText();
        Reais.setText( ValorReaisText);
    }//GEN-LAST:event_ValorReaisKeyReleased

    private void ValorCentavosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorCentavosKeyReleased
        String ValorCentavosText = ValorCentavos.getText();
        Centavos.setText( ValorCentavosText);
    }//GEN-LAST:event_ValorCentavosKeyReleased

    private void UnidadeMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnidadeMedidaKeyReleased
        String UnidadeMedidaText = UnidadeMedida.getText();
        KG.setText( UnidadeMedidaText);
    }//GEN-LAST:event_UnidadeMedidaKeyReleased

    private void VirgulaPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VirgulaPrecoKeyReleased
        String VirgulaPrecoText = VirgulaPreco.getText();
        Virgula.setText( VirgulaPrecoText);
    }//GEN-LAST:event_VirgulaPrecoKeyReleased

    private void CifraoPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CifraoPrecoKeyReleased
        String CifraoPrecoText = CifraoPreco.getText();
        Cifrao.setText( CifraoPrecoText);
    }//GEN-LAST:event_CifraoPrecoKeyReleased

    // Configura o tamanho da fonte
    private void TamanhoNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoNomeProdutoKeyReleased
        String text = TamanhoNomeProduto.getText();
        int size = Integer.parseInt(text);
        Font font = Produto.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        Produto.setFont(newFont);
    }//GEN-LAST:event_TamanhoNomeProdutoKeyReleased

    private void TamanhoDescricaoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoDescricaoProdutoKeyReleased
        String text = TamanhoDescricaoProduto.getText();
        int size = Integer.parseInt(text);
        Font font = DescricaoDoProduto.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        DescricaoDoProduto.setFont(newFont);
    }//GEN-LAST:event_TamanhoDescricaoProdutoKeyReleased

    private void TamanhoValorReaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoValorReaisKeyReleased
        String text = TamanhoValorReais.getText();
        int size = Integer.parseInt(text);
        Font font = Reais.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        Reais.setFont(newFont);
    }//GEN-LAST:event_TamanhoValorReaisKeyReleased

    private void TamanhoValorCentavosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoValorCentavosKeyReleased
        String text = TamanhoValorCentavos.getText();
        int size = Integer.parseInt(text);
        Font font = Centavos.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        Centavos.setFont(newFont);
    }//GEN-LAST:event_TamanhoValorCentavosKeyReleased

    private void TamanhoUnidadeMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoUnidadeMedidaKeyReleased
        String text = TamanhoUnidadeMedida.getText();
        int size = Integer.parseInt(text);
        Font font = KG.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        KG.setFont(newFont);
    }//GEN-LAST:event_TamanhoUnidadeMedidaKeyReleased

    private void TamanhoVirgulaPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoVirgulaPrecoKeyReleased
        String text = TamanhoVirgulaPreco.getText();
        int size = Integer.parseInt(text);
        Font font = Virgula.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        Virgula.setFont(newFont);
    }//GEN-LAST:event_TamanhoVirgulaPrecoKeyReleased

    private void TamanhoCifraoPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanhoCifraoPrecoKeyReleased
        String text = TamanhoCifraoPreco.getText();
        int size = Integer.parseInt(text);
        Font font = Cifrao.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        Cifrao.setFont(newFont);
    }//GEN-LAST:event_TamanhoCifraoPrecoKeyReleased

    // Configura a cor da fonte
    private void CorNomeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorNomeProdutoMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorNomeProduto.getBackground());
        if (selectedColor != null) {
                    CorNomeProduto.setBackground(selectedColor);
                    Produto.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorNomeProdutoMouseClicked

    private void CorDescricaoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorDescricaoProdutoMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorDescricaoProduto.getBackground());
        if (selectedColor != null) {
                    CorDescricaoProduto.setBackground(selectedColor);
                    DescricaoDoProduto.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorDescricaoProdutoMouseClicked

    private void CorValorReaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorValorReaisMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorValorReais.getBackground());
        if (selectedColor != null) {
                    CorValorReais.setBackground(selectedColor);
                    Reais.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorValorReaisMouseClicked

    private void CorValorCentavosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorValorCentavosMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorValorCentavos.getBackground());
        if (selectedColor != null) {
                    CorValorCentavos.setBackground(selectedColor);
                    Centavos.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorValorCentavosMouseClicked

    private void CorUnidadeMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorUnidadeMedidaMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorUnidadeMedida.getBackground());
        if (selectedColor != null) {
                    CorUnidadeMedida.setBackground(selectedColor);
                    KG.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorUnidadeMedidaMouseClicked

    private void CorVirgulaPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorVirgulaPrecoMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorVirgulaPreco.getBackground());
        if (selectedColor != null) {
                    CorVirgulaPreco.setBackground(selectedColor);
                    Virgula.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorVirgulaPrecoMouseClicked

    private void CorCifraoPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorCifraoPrecoMouseClicked
        Color selectedColor = JColorChooser.showDialog(Home.this, "Escolha uma cor", CorCifraoPreco.getBackground());
        if (selectedColor != null) {
                    CorCifraoPreco.setBackground(selectedColor);
                    Cifrao.setForeground(selectedColor);
                }
    }//GEN-LAST:event_CorCifraoPrecoMouseClicked

    // configura o campo de resoluçao personalizado
    private void widthUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthUserKeyReleased
        String valor = widthUser.getText();
        int newWidth = Integer.parseInt(valor);
        PainelParaPNG.setWidth(newWidth);
    }//GEN-LAST:event_widthUserKeyReleased

    private void heightUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightUserKeyReleased
        String valor = heightUser.getText();
        int newHeight = Integer.parseInt(valor);
        PainelParaPNG.setHeight(newHeight);
    }//GEN-LAST:event_heightUserKeyReleased

   
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
    private javax.swing.JPanel CorCifraoPreco;
    private javax.swing.JPanel CorDescricaoProduto;
    private javax.swing.JPanel CorNomeProduto;
    private javax.swing.JPanel CorUnidadeMedida;
    private javax.swing.JPanel CorValorCentavos;
    private javax.swing.JPanel CorValorReais;
    private javax.swing.JPanel CorVirgulaPreco;
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
    private javax.swing.JLabel KG;
    private GDP.PanelRound MenuEdicaoPlaca;
    private javax.swing.JTextField NomeProduto;
    private javax.swing.JLabel Oferta;
    private javax.swing.JPanel PlacaKg;
    private javax.swing.JLabel Produto;
    private javax.swing.JLabel Reais;
    private javax.swing.JComboBox<String> Resolucoes;
    private javax.swing.JTextField TamanhoCifraoPreco;
    private javax.swing.JTextField TamanhoDescricaoProduto;
    private javax.swing.JTextField TamanhoNomeProduto;
    private javax.swing.JTextField TamanhoUnidadeMedida;
    private javax.swing.JTextField TamanhoValorCentavos;
    private javax.swing.JTextField TamanhoValorReais;
    private javax.swing.JTextField TamanhoVirgulaPreco;
    private javax.swing.JTextField UnidadeMedida;
    private javax.swing.JTextField ValorCentavos;
    private javax.swing.JTextField ValorReais;
    private javax.swing.JLabel Virgula;
    private javax.swing.JTextField VirgulaPreco;
    private javax.swing.JTextField heightUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField widthUser;
    // End of variables declaration//GEN-END:variables
}