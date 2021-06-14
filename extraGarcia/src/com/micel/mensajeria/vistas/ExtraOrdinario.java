package com.micel.mensajeria.vistas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author edgaresaul
 */
public class ExtraOrdinario extends JFrame {
    private JButton btnSave;
    private JComboBox<String> combType;
    private JLabel lblMsg;
    private JLabel lblMyName;
    private JLabel lblName;
    private JLabel lblNumber;
    private JLabel lblOther;
    private JLabel lblType;
    private JMenuBar menuBar;
    private JMenuItem mnuAbout;
    private JMenu mnuEdit;
    private JMenuItem mnuExit;
    private JMenu mnuFile;
    private JMenuItem mnuOpenName;
    private JMenuItem mnuOpenNumber;
    private JTextField txtMsg;
    private JTextField txtName;
    private JTextField txtNumber;
    private JTextField txtOther;
    //agregar un atributo de tipo Acciones (acc) sin inicializar

    public ExtraOrdinario() {
        initComponents();
        //crear una nueva instancia (acc) de la clase Acciones
    }

    private void initComponents() {

        lblType = new JLabel();
        lblNumber = new JLabel();
        txtNumber = new JTextField();
        lblName = new JLabel();
        txtName = new JTextField();
        lblMsg = new JLabel();
        txtMsg = new JTextField();
        lblOther = new JLabel();
        txtOther = new JTextField();
        btnSave = new JButton();
        lblMyName = new JLabel();
        combType = new JComboBox<>();
        menuBar = new JMenuBar();
        mnuFile = new JMenu();
        mnuOpenNumber = new JMenuItem();
        mnuOpenName = new JMenuItem();
        mnuExit = new JMenuItem();
        mnuEdit = new JMenu();
        mnuAbout = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblType.setText("Type");
        lblNumber.setText("Number");
        txtNumber.setText("0000000000");
        lblName.setText("Name");
        txtName.setText("Full Name");
        lblMsg.setText("MSG");
        lblOther.setText("Other");
        btnSave.setText("Save");
        lblMyName.setText("My Name");
        combType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "W", "M" }));
        mnuFile.setText("File");
        mnuOpenNumber.setText("Open by Number");
        mnuFile.add(mnuOpenNumber);
        mnuOpenName.setText("Open by Name");
        mnuFile.add(mnuOpenName);
        mnuExit.setText("Exit");
        mnuFile.add(mnuExit);
        menuBar.add(mnuFile);
        mnuEdit.setText("Edit");
        mnuAbout.setText("About");
        mnuEdit.add(mnuAbout);
        menuBar.add(mnuEdit);
        setJMenuBar(menuBar);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType)
                            .addComponent(combType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumber)
                                .addGap(49, 49, 49)
                                .addComponent(lblName)
                                .addGap(74, 74, 74)
                                .addComponent(lblMsg)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave))
                            .addComponent(lblOther))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMyName)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(lblNumber)
                    .addComponent(lblName)
                    .addComponent(lblMsg)
                    .addComponent(lblOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(combType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addContainerGap())
        );
        // PARA TODAS LAS ACCIONES AGREAR UNA CLASE ANONIMA
        //
        // AGREGAR EL ESCUCHADOR PARA EL MENU mnuExit
        // EL METODO DE LA ACCION DEBERA LLAMAR AL METODO dispose()
        // ESTE METODO NO REQUIERE PROGRAMARSE, SE HEREDA
        
        // AGREGAR EL ESCUCHADOR PARA EL MENU mnuAbout
        // EL METODO DE LA ACCION DEBERA CAMIBIAR EL TEXTO DE
        // LA ETIQUETA lblMyName POR EL NOMBRE DEL PROGRAMADOR
        
        // AGREGAR EL ESCUCHADOR PARA EL BOTON btnSave
        // EL METODO DE LA ACCION DEBERA LLAMAR AL METODO agregar()
        // QUE SE ENCUENTRA DEFINIDO AL FINAL
        
        // AGREGAR EL ESCUCHADOR PARA EL MENU mnuOpenNumber
        // EL METODO DE LA ACCION DEBERA LLAMAR AL METODO mostrar()
        // UBICADO EN LA CLASE ACCIONES CUYA INSTANCIA ES acc
        // PASANDOLE UN VALOR DE 1 PARA ORDENAR POR NUMERO

        // AGREGAR EL ESCUCHADOR PARA EL MENU mnuOpenName
        // EL METODO DE LA ACCION DEBERA LLAMAR AL METODO mostrar()
        // UBICADO EN LA CLASE ACCIONES CUYA INSTANCIA ES acc
        // PASANDOLE UN VALOR DE 2 PARA ORDENAR POR NOMBRE
        
        // ***********
        pack();
    }
    private void agregar(){
        // DEBERA LLAMAR AL METODO guardar()
        // UBICADO EN LA CLASE ACCIONES CUYA INSTANCIA ES acc
        // DEBE RECIBIR:
        // EL INDICE DE combType
        // EL TEXTO DE txtNumber
        // EL TEXTO DE txtName
        // EL TEXTO DE txtMsg
        // EL TEXTO DE txtOther
    }
}
