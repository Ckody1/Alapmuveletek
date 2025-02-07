package alapmuvgyak;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {
    
    Random rnd = new Random();
    int eredmeny = 0;
    int szam1 = 0;
    int szam2 = 0;
    int osszKerdesekSzama = 0;
    int OsztasKerdesSzama = 0;
    int SzorzasKerdesSzama = 0;
    int OsszProbakSzama = 0;
    
    int szorzasProbakSzama, osztasProbakSzama;
    JLabel[] lblTomb;
    String[] lblTextTomb;
    
    /**
     * Creates new form Muveletek
     */
    public Muveletek() {
        initComponents();
        lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};
        lblTextTomb = new String[]{"Össz Probálkozások száma: ", "Össz Probálkozások száma: ", "Összeadás: ", "Összeadás: ", "Kivonás: ", "Kivonás: ", "Osztás: ", "Osztás: ", "Szorzás: ", "Szorzás: "};
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentesmaskent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        menuMuveletekOsszeadas = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekKivonas = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekOsztas = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 1");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszProba.setText("Össz Probálkozások száma: 1");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 1");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 1");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentesmaskent.setText("Mentés másként...");
        mnuFajlMentesmaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentesmaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentesmaskent);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        menuMuveletekOsszeadas.setText("Műveletek");

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Összeadás");
        menuMuveletekOsszeadas.add(jRadioButtonMenuItem1);

        buttonGroup1.add(menuMuveletekKivonas);
        menuMuveletekKivonas.setText("Kivonás");
        menuMuveletekOsszeadas.add(menuMuveletekKivonas);

        buttonGroup1.add(menuMuveletekOsztas);
        menuMuveletekOsztas.setText("Osztás");
        menuMuveletekOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMuveletekOsztasActionPerformed(evt);
            }
        });
        menuMuveletekOsszeadas.add(menuMuveletekOsztas);

        buttonGroup1.add(menuMuveletekSzorzas);
        menuMuveletekSzorzas.setText("Szorzás");
        menuMuveletekSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMuveletekSzorzasActionPerformed(evt);
            }
        });
        menuMuveletekOsszeadas.add(menuMuveletekSzorzas);

        jMenuBar1.add(menuMuveletekOsszeadas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        OsszProbakSzama ++;
        lblOsszProba.setText("Össz próbálkozások száma: "+ OsszProbakSzama);
        
        if(menuMuveletekOsztas.isSelected()){
            osztasProbakSzama ++;
            lblOsztasProba.setText("Osztás: "+ osztasProbakSzama);
        }else if(menuMuveletekSzorzas.isSelected()){
            szorzasProbakSzama ++;
            lblOsztasProba.setText("Osztás: "+ szorzasProbakSzama);
        }
                
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        
    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void menuMuveletekSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMuveletekSzorzasActionPerformed
        
        
        
        lblFeladat.setText(szam1 + " * " + szam2 + " = ");
        osszKerdesekSzama ++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);
        SzorzasKerdesSzama ++;
        lblSzorzasKerdes.setText("Szorzás: " + SzorzasKerdesSzama);
    }//GEN-LAST:event_menuMuveletekSzorzasActionPerformed

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Fájl mentése");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int valasztottGombErteke = fc.showSaveDialog(this);
        if(valasztottGombErteke == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            if (f.isDirectory()) {
                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
                try {
                    Files.write(Paths.get(f.getPath(), "stat.txt"),  tartalomOsszeallitasa().getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentesmaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentesmaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként");
        
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF fájlok", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter szbFilter = new FileNameExtensionFilter("saját (*.szb)", "szb");
        fc.addChoosableFileFilter(szbFilter);
        
        fc.setFileFilter(txtFilter);
        
        
        int valasztottGombErteke = fc.showSaveDialog(this);
        if(valasztottGombErteke == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter)fc.getFileFilter()).getExtensions();
            String fn = f.getPath() + "." + kit[0];
            
            if(!fn.endsWith("." + kit[0])){
                fn += "." + kit[0];
            }
            boolean mentes = true;
            Path path = Paths.get(fn);
            if(Files.exists(path)){
                valasztottGombErteke = JOptionPane.showConfirmDialog(this, "Felülírjam?", "A fájl már létezik!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(valasztottGombErteke == JOptionPane.NO_OPTION){
                    mentes = false;
                }
            }
            
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "." + kit[0] + "</html>");
            try {
                if (mentes) {
                    Files.write(path, tartalomOsszeallitasa().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else{
            JOptionPane.showMessageDialog(this, "A mentés megszakítva!", "MENTÉS SIKERTELEN!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMentesmaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Megnyitás");
        
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF fájlok", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter szbFilter = new FileNameExtensionFilter("saját (*.szb)", "szb");
        fc.addChoosableFileFilter(szbFilter);
        
        fc.setFileFilter(txtFilter);
        
        
        int valasztottGombErteke = fc.showOpenDialog(this);
        if(valasztottGombErteke == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            String fn = f.getPath();
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
            Path path = Paths.get(fn);
            try{
                byte[] bajtTomb = Files.readAllBytes(path);
                byte egyByte = bajtTomb[1];
                
                List<String> stringlista = Files.readAllLines(path);
                
                int lblIndex = 0;
                for (int i = 0; i < stringlista.size(); i++) {
                    String egySor = stringlista.get(i);
                    String[] adatok = egySor.split("\\D+");
                    JLabel lbl = lblTomb[lblIndex];
                    lbl.setText(lblTextTomb[lblIndex] + adatok[1]);
                    lbl = lblTomb[lblIndex + 1];
                    lbl.setText(lblTextTomb[lblIndex + 1] + adatok[2]);
                    lblIndex += 2;
                }
                
                
                
                
                
                
                
                
                
                
                
                /* 2.:*/
//                for (int i = 0; i < stringlista.size(); i++) {
//                    String egySor = stringlista.get(i);
//                    String[] adatok = egySor.split(": ");
//                    JLabel lbl = lblTomb[lblIndex + 1];
//                    lbl.setText("" + adatok[2]);
//                    adatok = adatok[1].split(" ");
//                    lbl = lblTomb[lblIndex];
//                    lbl.setText(lblTextTomb[lblIndex] + adatok[0]);
//                    lblIndex += 2;
//                }
                
//                //fejléc: össz
//                String egySor = stringlista.get(1);
//                String[] adatok = egySor.split(": ");
//                
//                String proSzama = adatok[2];
//                lblOsszProba.setText("Össz próbálkozások száma: " + proSzama);
//                
//                adatok = adatok[1].split(" ");
//                String kerSzama = adatok[0];
//                lblOsszKerdes.setText("Össz kérdések száma " + kerSzama);
//                //"".trim();
                
//                //összeadás
//                egySor = stringlista.get(2);
//                adatok = egySor.split(": ");
//                proSzama = adatok[2];
//                lblOsszeadProba.setText("Összeadás: " +proSzama);
//                adatok = adatok[1].split(" ");
//                kerSzama = adatok[0];
//                lblOsszeadKerdes.setText("Összead: " + kerSzama);
//                
//                //kivonás
//                
//                
//                //osztás
//                egySor = stringlista.get(4);
//                adatok = egySor.split(": ");
//                proSzama = adatok[2];
//                lblOsszeadProba.setText("Összeadás: " +proSzama);
//                adatok = adatok[1].split(" ");
//                kerSzama = adatok[0];
//                lblOsszeadKerdes.setText("Összead: " + kerSzama);
//                
//                //szorzás
//                
//                 
                int temp = 67;
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }else{
            JOptionPane.showMessageDialog(this, "A megnyitás megszakítva!", "MEGNYITÁS SIKERTELEN!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void menuMuveletekOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMuveletekOsztasActionPerformed
        int oszto, osztando;
        boolean jo;
        do{
            oszto = (int)(Math.random()*101);
            osztando = (int)(Math.random()*101);
            jo = oszto != 0 && osztando % oszto == 0;
        }while(!jo);
        lblFeladat.setText(osztando + " / " + oszto + " = ");
        osszKerdesekSzama ++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);
        OsztasKerdesSzama ++;
        lblOsztasKerdes.setText("Osztás: " + OsztasKerdesSzama);
    }//GEN-LAST:event_menuMuveletekOsztasActionPerformed

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JRadioButtonMenuItem menuMuveletekKivonas;
    private javax.swing.JMenu menuMuveletekOsszeadas;
    private javax.swing.JRadioButtonMenuItem menuMuveletekOsztas;
    private javax.swing.JRadioButtonMenuItem menuMuveletekSzorzas;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentesmaskent;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitasa() {
        String statisztika = "Alapműveletek gyakorlása, statisztika";
        
        
        final int HE = 3;
        final int OSZZ_KERDES_HOSSZ = lblTomb[0].getText().length();
        final int OSSZ_PROBA_HOSSZ = lblTomb[1].getText().length();
        for (int i = 0; i < lblTomb.length - 1; i++) {
            String format = "%" + (OSZZ_KERDES_HOSSZ + HE) +"s% " + (OSSZ_PROBA_HOSSZ + HE) + "s\n";
            statisztika += String.format(format, lblTomb[i].getText(), lblTomb[i + 1].getText());
            
        }
        return statisztika;
    }
}