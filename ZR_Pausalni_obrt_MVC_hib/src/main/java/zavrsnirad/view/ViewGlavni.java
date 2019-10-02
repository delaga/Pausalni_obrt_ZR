/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;
import zavrsnirad.controller.ObradaRacun;
import zavrsnirad.model.Klijent_kupac;
import zavrsnirad.model.Racun;
import zavrsnirad.utility.Utils;

/**
 *
 * @author mirza
 */
public class ViewGlavni extends javax.swing.JFrame {

    private ObradaRacun obrada;

    /**
     * Creates new form Glavni
     */
    public ViewGlavni() {
        initComponents();
        new Vrijeme().start();
        tblRacuni.setDefaultEditor(Object.class, null);
        obrada = new ObradaRacun();
        ucitaj();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKlijentiKupci = new javax.swing.JButton();
        btnProizvodiUsluge = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIspis = new javax.swing.JButton();
        btnUredi = new javax.swing.JButton();
        btnObriši = new javax.swing.JButton();
        btnNoviRačun = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRacuni = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnKalkulator = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnKnjigaPrometa = new javax.swing.JButton();
        btnPOSD = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPostavke = new javax.swing.JMenu();
        jMenuItemDBserver = new javax.swing.JMenuItem();
        jMenuObrt = new javax.swing.JMenuItem();
        jMenuKorisnici = new javax.swing.JMenuItem();
        jMenuPomoc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PO Glavni prozor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Uređivanje ..."));

        btnKlijentiKupci.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKlijentiKupci.setText("Klijenti/Kupci");
        btnKlijentiKupci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlijentiKupciActionPerformed(evt);
            }
        });

        btnProizvodiUsluge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProizvodiUsluge.setText("Proizvodi / Usluge");
        btnProizvodiUsluge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProizvodiUslugeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKlijentiKupci, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProizvodiUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKlijentiKupci, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProizvodiUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        lblTime.setText("Time");
        jToolBar1.add(lblTime);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RAČUNI ...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnIspis.setText("Ispis");

        btnUredi.setText("Uredi");
        btnUredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrediActionPerformed(evt);
            }
        });

        btnObriši.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnObriši.setForeground(new java.awt.Color(204, 0, 0));
        btnObriši.setText("Obriši");
        btnObriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiActionPerformed(evt);
            }
        });

        btnNoviRačun.setText("NOVI račun");
        btnNoviRačun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviRačunActionPerformed(evt);
            }
        });

        tblRacuni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tblRacuni.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblRacuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRacuniMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRacuni);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 339, Short.MAX_VALUE)
                        .addComponent(btnNoviRačun, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIspis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUredi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnObriši, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIspis)
                    .addComponent(btnUredi)
                    .addComponent(btnObriši)
                    .addComponent(btnNoviRačun))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alati ..."));

        btnKalkulator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKalkulator.setText("Kalkulator");
        btnKalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalkulatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKalkulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnKalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Generiraj ..."));

        btnKnjigaPrometa.setText("Knjiga prometa (XLS)");

        btnPOSD.setText("Obrazac PO-SD (XLS)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKnjigaPrometa)
                .addGap(18, 18, 18)
                .addComponent(btnPOSD)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKnjigaPrometa)
                    .addComponent(btnPOSD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuPostavke.setText("Postavke");

        jMenuItemDBserver.setText("DB server");
        jMenuItemDBserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDBserverActionPerformed(evt);
            }
        });
        jMenuPostavke.add(jMenuItemDBserver);

        jMenuObrt.setText("Podaci o obrtu");
        jMenuObrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuObrtActionPerformed(evt);
            }
        });
        jMenuPostavke.add(jMenuObrt);

        jMenuKorisnici.setText("Korisnici");
        jMenuKorisnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKorisniciActionPerformed(evt);
            }
        });
        jMenuPostavke.add(jMenuKorisnici);

        jMenuBar1.add(jMenuPostavke);

        jMenuPomoc.setText("Pomoč");
        jMenuBar1.add(jMenuPomoc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void ucitaj() {
        SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy.");
        DefaultTableModel dtm = (DefaultTableModel) tblRacuni.getModel();
        List<Racun> racuni = obrada.getEntiteti();
        String[] colNames = {"objekt", "Broj računa", "Klijent/Kupac", "Datum izdavanja", "Datum dospiječa", "Datum isporuke", "Iznos", "Način plačanja", "Izdao", "Napomena"};

        for (int i = 0; i < colNames.length; i++) {

            TableColumn tc = tblRacuni.getColumnModel().getColumn(i);
            tc.setHeaderValue(colNames[i]);
            if (i == 0) {
                tc.setWidth(0);
                tc.setMinWidth(0);
                tc.setMaxWidth(0);
            }
        }

        racuni.forEach((r) -> {
            try {
                Object red[] = {
                    r,
                    r.getBroj_racuna(),
                    r.getKlijent_kupac().getNaziv(),
                    df.format(r.getDatum_izdavanja()),
                    df.format(r.getDatum_dospijeca()),
                    df.format(r.getDatum_isporuke()),
                    r.getIznos_racuna().toString(),
                    r.getNacin_placanja(),
                    r.getKorisnik().getPrezime(),
                    r.getNapomena(),};

                dtm.addRow(red);

            } catch (Exception e) {
                String red[] = {
                    "aaaa",
                    "bbb",
                    "cccc",
                    "ddd"
                };
                dtm.addRow(red);
            }

        });

//        String[] colNames = {"Broj računa", "Klijent/Kupac", "Datum izdavanja","Datum dospiječa","Datum isporuke","Iznos","Način plačanja","Izdao","Napomena"};
//        DefaultTableModel tableModel=new DefaultTableModel();
//        List<Racun> racuni=obrada.getEntiteti();
//        while (tblRacuni.getRowCount() > 0) {
//                for (int i = 0; i < colNames.length; i++) {
//
//                    TableColumn tc = tblRacuni.getColumnModel().getColumn(i);
//                    tc.setHeaderValue(colNames[i]);
//                }
//                ((DefaultTableModel) tblRacuni.getModel()).removeRow(0);
//            }
//        int stupci=colNames.length;
//        for(Racun r: racuni){
//           String[] red={
//               r.getBroj_racuna(),r.getKlijent_kupac_id(),
//           };
//           
//        }
//        tblRacuni.setModel(tableModel);
//    
//        DefaultListModel<Racun> model = new DefaultListModel<>();
//        obrada.getEntiteti().forEach(
//                (racun) -> {
//                    model.addElement(racun);
//                });
//
//        lista.setModel(model);
//        lista.repaint();
    }

    @Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }
    private void btnObrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObrišiActionPerformed

    private void jMenuObrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuObrtActionPerformed
        new ViewPodaciOObrtu().setVisible(true);
    }//GEN-LAST:event_jMenuObrtActionPerformed

    private void btnKlijentiKupciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlijentiKupciActionPerformed
        new ViewKlijentiLista().setVisible(true);
    }//GEN-LAST:event_btnKlijentiKupciActionPerformed

    private void btnProizvodiUslugeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProizvodiUslugeActionPerformed
        new ViewProizvodLista().setVisible(true);
    }//GEN-LAST:event_btnProizvodiUslugeActionPerformed

    private void jMenuItemDBserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDBserverActionPerformed
        new ViewDBserverPodaci().setVisible(true);
    }//GEN-LAST:event_jMenuItemDBserverActionPerformed

    private void jMenuKorisniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKorisniciActionPerformed
        new ViewKorisnici().setVisible(true);
    }//GEN-LAST:event_jMenuKorisniciActionPerformed

    private void btnNoviRačunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviRačunActionPerformed
        Racun r = new Racun();
        new ViewRacun(r).setVisible(true);
    }//GEN-LAST:event_btnNoviRačunActionPerformed

    private void btnUrediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrediActionPerformed

        Racun r = (Racun) tblRacuni.getValueAt(tblRacuni.getSelectedRow(), 0);
        new ViewRacun(r).setVisible(true);


    }//GEN-LAST:event_btnUrediActionPerformed

    private void btnKalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalkulatorActionPerformed
        new Kalkulator().setVisible(true);
    }//GEN-LAST:event_btnKalkulatorActionPerformed

    private void tblRacuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRacuniMouseClicked
        if (evt.getClickCount() == 2) {
            //System.out.println(tblRacuni.getSelectedRow());
            Racun r = (Racun) tblRacuni.getValueAt(tblRacuni.getSelectedRow(), 0);
            // System.out.println(oznaceni.getId());
            new ViewRacun(r).setVisible(true);
        }
    }//GEN-LAST:event_tblRacuniMouseClicked
    private class Vrijeme extends Thread {

        SimpleDateFormat vrijemeFormat = new SimpleDateFormat(Utils.getFormatDatumaIVremena());

        @Override
        public void run() {
            lblTime.setText(vrijemeFormat.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            run();
        }

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIspis;
    private javax.swing.JButton btnKalkulator;
    private javax.swing.JButton btnKlijentiKupci;
    private javax.swing.JButton btnKnjigaPrometa;
    private javax.swing.JButton btnNoviRačun;
    private javax.swing.JButton btnObriši;
    private javax.swing.JButton btnPOSD;
    private javax.swing.JButton btnProizvodiUsluge;
    private javax.swing.JButton btnUredi;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDBserver;
    private javax.swing.JMenuItem jMenuKorisnici;
    private javax.swing.JMenuItem jMenuObrt;
    private javax.swing.JMenu jMenuPomoc;
    private javax.swing.JMenu jMenuPostavke;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblRacuni;
    // End of variables declaration//GEN-END:variables
}
