/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import monitor.Monitor;

/**
 *
 * @author edwin
 */
public class Home extends javax.swing.JFrame {
    private Monitor monitor;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(Monitor monitor) {
        this();
        this.monitor = monitor;
        
	lblCpuArquitectura.setText(monitor.getCpuMonitor().getArquitecturaCPU());
        lblCpuMarca.setText(monitor.getCpuMonitor().getFabricanteCPU());
        lblCpuModelo.setText(monitor.getCpuMonitor().getModeloCPU());
        lblCpuNucleosFisicos.setText(monitor.getCpuMonitor().getNucleosFisicosCPU().toString());
        lblCpuNucleosLogicos.setText(monitor.getCpuMonitor().getNucleosLogicosCPU().toString());
        lblMotherMarca.setText(monitor.getMotherMonitor().getMarcaMother());
        lblMotherModelo.setText(monitor.getMotherMonitor().getModeloMother());
        lblOsFamilia.setText(monitor.getOsMonitor().getFamiliaOS());
        lblOsVersion.setText(monitor.getOsMonitor().getVersionOS());
        lblRamTotal.setText(monitor.getMemMonitor().getMemFisicaTotal().toString());
        
	ipv4.setText(monitor.getNetworkingMonitor().getNics()[0].getIPv4());
	redname.setText(monitor.getNetworkingMonitor().getNics()[0].getNombre());
	macaddress.setText(monitor.getNetworkingMonitor().getNics()[0].getMACAddress());
	
    }
    
    public void actualizarDatosSensorYCarga(){
        
        lblTempCpu.setText(monitor.getSensMonitor().getTempCPU().toString() + "°C");
        DecimalFormat df = new DecimalFormat("0.00");
        lblUsoCpu.setText(df.format(monitor.getCpuMonitor().getUsoActualCPU()) + "%");
        lblUsoRam.setText(String.valueOf(monitor.getMemMonitor().getMemFisicaUso())+"mb");
        
    }
    
    public Integer getFrecuenciaActualizacion(){
        return sliderFrecuencia.getValue();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblOsFamilia = new javax.swing.JLabel();
        lblOsVersion = new javax.swing.JLabel();
        lblRamTotal = new javax.swing.JLabel();
        lblCpuMarca = new javax.swing.JLabel();
        lblCpuModelo = new javax.swing.JLabel();
        lblCpuNucleosLogicos = new javax.swing.JLabel();
        lblCpuNucleosFisicos = new javax.swing.JLabel();
        lblCpuArquitectura = new javax.swing.JLabel();
        lblMotherMarca = new javax.swing.JLabel();
        lblMotherModelo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTempCpu = new javax.swing.JLabel();
        lblUsoCpu = new javax.swing.JLabel();
        lblUsoRam = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sliderFrecuencia = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ipv4 = new javax.swing.JLabel();
        redname = new javax.swing.JLabel();
        macaddress = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getSize()+5f));
        jLabel6.setText("Info del sistema");

        jLabel5.setText("Familia SO:");

        jLabel7.setText("Versión SO:");

        jLabel10.setText("RAM total:");

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel11.setText("CPU:");

        jLabel12.setText("Marca:");

        jLabel13.setText("Arquitectura:");

        jLabel14.setText("Modelo:");

        jLabel15.setText("Núcleos físico:");

        jLabel16.setText("Núcleos lógicos:");

        jLabel17.setFont(jLabel17.getFont().deriveFont(jLabel17.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel17.setText("Motherboard:");

        jLabel18.setText("Marca:");

        jLabel19.setText("Modelo:");

        lblOsFamilia.setText("Ubuntu");

        lblOsVersion.setText("17.04 (Zesty Zapus)");

        lblRamTotal.setText("8 gb");

        lblCpuMarca.setText("Intel");

        lblCpuModelo.setText("i5");

        lblCpuNucleosLogicos.setText("4");

        lblCpuNucleosFisicos.setText("2");

        lblCpuArquitectura.setText("x64");

        lblMotherMarca.setText("Foxcon");

        lblMotherModelo.setText("M5GR443");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOsVersion)
                    .addComponent(lblOsFamilia)
                    .addComponent(lblRamTotal)
                    .addComponent(lblCpuMarca)
                    .addComponent(lblCpuModelo)
                    .addComponent(lblCpuArquitectura)
                    .addComponent(lblCpuNucleosFisicos)
                    .addComponent(lblCpuNucleosLogicos)
                    .addComponent(lblMotherMarca)
                    .addComponent(lblMotherModelo))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblOsFamilia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblOsVersion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblRamTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblCpuMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblCpuModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblCpuArquitectura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblCpuNucleosFisicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblCpuNucleosLogicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblMotherMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblMotherModelo))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getSize()+5f));
        jLabel1.setText("Información de red");

        jLabel2.setFont(jLabel2.getFont());
        jLabel2.setText("Temperatura CPU:");

        jLabel3.setFont(jLabel3.getFont());
        jLabel3.setText("Uso de CPU:");

        jLabel4.setFont(jLabel4.getFont());
        jLabel4.setText("Uso de RAM:");

        lblTempCpu.setFont(lblTempCpu.getFont().deriveFont((lblTempCpu.getFont().getStyle() | java.awt.Font.ITALIC)));
        lblTempCpu.setText("49ºC");
        lblTempCpu.setName(""); // NOI18N

        lblUsoCpu.setFont(lblUsoCpu.getFont().deriveFont((lblUsoCpu.getFont().getStyle() | java.awt.Font.ITALIC)));
        lblUsoCpu.setText("45%");

        lblUsoRam.setFont(lblUsoRam.getFont().deriveFont((lblUsoRam.getFont().getStyle() | java.awt.Font.ITALIC)));
        lblUsoRam.setText("84%");

        jLabel8.setText("Frecuencia de actualización:");

        sliderFrecuencia.setMaximum(1000);
        sliderFrecuencia.setMinimum(10);
        sliderFrecuencia.setPaintLabels(true);
        sliderFrecuencia.setSnapToTicks(true);
        sliderFrecuencia.setToolTipText("");

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getSize()+5f));
        jLabel9.setText("Datos en tiempo real");

        jLabel20.setText("IPv4:");

        jLabel21.setText("Name:");

        jLabel22.setText("MAC Address:");

        ipv4.setText("n/a");

        redname.setText("n/a");

        macaddress.setText("n/a");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTempCpu)
                                    .addComponent(lblUsoCpu)
                                    .addComponent(lblUsoRam)))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sliderFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redname)
                            .addComponent(ipv4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(macaddress)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTempCpu)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblUsoCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUsoRam))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ipv4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(redname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(macaddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ipv4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    protected javax.swing.JLabel lblCpuArquitectura;
    protected javax.swing.JLabel lblCpuMarca;
    protected javax.swing.JLabel lblCpuModelo;
    protected javax.swing.JLabel lblCpuNucleosFisicos;
    protected javax.swing.JLabel lblCpuNucleosLogicos;
    protected javax.swing.JLabel lblMotherMarca;
    protected javax.swing.JLabel lblMotherModelo;
    protected javax.swing.JLabel lblOsFamilia;
    protected javax.swing.JLabel lblOsVersion;
    protected javax.swing.JLabel lblRamTotal;
    protected javax.swing.JLabel lblTempCpu;
    protected javax.swing.JLabel lblUsoCpu;
    protected javax.swing.JLabel lblUsoRam;
    private javax.swing.JLabel macaddress;
    private javax.swing.JLabel redname;
    protected javax.swing.JSlider sliderFrecuencia;
    // End of variables declaration//GEN-END:variables
}
