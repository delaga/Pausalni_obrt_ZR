/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.view;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import zavrsnirad.controller.Obrada;
import zavrsnirad.controller.ObradaKlijent_kupac;
import zavrsnirad.model.Klijent_kupac;

/**
 *
 * @author mirza
 */
public class ViewKlijentiLista extends javax.swing.JFrame {
    
    private ObradaKlijent_kupac obrada;

    /**
     * Creates new form ViewKlijentiLista
     */
    public ViewKlijentiLista() {
        initComponents();
        obrada=new ObradaKlijent_kupac();
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKupci = new javax.swing.JTable();
        btnNovi = new javax.swing.JButton();
        btnUredi = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista kupaca");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Klijenti / Kupci ..."));

        tblKupci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(tblKupci);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        btnNovi.setText("Novi");
        btnNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviActionPerformed(evt);
            }
        });

        btnUredi.setText("Uredi");

        btnObrisi.setText("Obriši");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUredi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovi)
                    .addComponent(btnUredi)
                    .addComponent(btnObrisi))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviActionPerformed
        new ViewKlijentKupac().setVisible(true);
    }//GEN-LAST:event_btnNoviActionPerformed
private void ucitaj() {
        SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy.");
        DefaultTableModel dtm = (DefaultTableModel) tblKupci.getModel();
        List<Klijent_kupac> kupci=obrada.getEntiteti();
        String[] colNames = {"Naziv", "Adresa", "Poštanski broj", "Grad", "Država", "OIB ili JMBG","Vrijeme kreiranja","Vrijeme promjene"};
        for (int i = 0; i < colNames.length; i++) {

            TableColumn tc = tblKupci.getColumnModel().getColumn(i);
            tc.setHeaderValue(colNames[i]);
        }
        kupci.forEach((k) -> {
            try {
                String red[] = {
                    k.getNaziv(),
                    k.getAdresa(),
                    k.getPost_broj(),
                    k.getGrad(),
                    k.getDrzava(),
                    k.getOib_jmbg(),
                    df.format(k.getVrijemeKreiranja()),
                    df.format(k.getVrijemePromjene())
                    
                };

                dtm.addRow(red);

            } catch (Exception e) {
              
            }

        });
    }
@Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovi;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnUredi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKupci;
    // End of variables declaration//GEN-END:variables
}