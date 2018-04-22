
package segundocuatriexamen.view;

import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Vista extends JFrame{

    public Vista() {
        
        initComponents();
    
    }
    
    //Codigo de la vista. La vista recibe los eventos desde el controlador para que vista y model no se conozcan. 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        botonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        dniLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        salarioTextField = new javax.swing.JTextField();
        radioPanel = new javax.swing.JPanel();
        fijoRadioButton = new javax.swing.JRadioButton();
        temporalRadioButton = new javax.swing.JRadioButton();
        radioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Pablo Hernández Martín - MVC segundo cuatrimestre - Programación");
        this.setResizable(false);

        addButton.setText("Añadir");

        limpiarButton.setText("Limpiar");

        buscarButton.setText("Buscar");

        salirButton.setText("Salir");

        javax.swing.GroupLayout botonPanelLayout = new javax.swing.GroupLayout(botonPanel);
        botonPanel.setLayout(botonPanelLayout);
        botonPanelLayout.setHorizontalGroup(
            botonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(botonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(salirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        botonPanelLayout.setVerticalGroup(
            botonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addButton)
                .addGap(50, 50, 50)
                .addComponent(limpiarButton)
                .addGap(48, 48, 48)
                .addComponent(buscarButton)
                .addGap(48, 48, 48)
                .addComponent(salirButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        dniLabel.setText("DNI");

        nombreLabel.setText("Nombre");

        salarioLabel.setText("Salario");



        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salarioLabel)
                    .addComponent(nombreLabel)
                    .addComponent(dniLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(38, 38, 38)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(nombreTextField)
                    .addComponent(dniTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioLabel)
                    .addComponent(salarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        radioPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        radioButtonGroup.add(fijoRadioButton);
        fijoRadioButton.setText("Fijo");

        radioButtonGroup.add(temporalRadioButton);
        temporalRadioButton.setText("Temporal");


        javax.swing.GroupLayout radioPanelLayout = new javax.swing.GroupLayout(radioPanel);
        radioPanel.setLayout(radioPanelLayout);
        radioPanelLayout.setHorizontalGroup(
            radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temporalRadioButton)
                    .addComponent(fijoRadioButton))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        radioPanelLayout.setVerticalGroup(
            radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(fijoRadioButton)
                .addGap(18, 18, 18)
                .addComponent(temporalRadioButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        radioLabel.setText("Tipo de contrato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(radioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(radioLabel)))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(radioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>       
    
    //getters y setters para el input del usuario. Me interesa que sean de tipo primitivo 
    //para pasarlos directamente al controlador. Paso el texto de cada textField en los getters
    //para los radioButtons utilizo solamente la selección boolean de "fijo". Seguramente la mejor manera de hacerlo
    //sería con el RadtioButtonGruop.
    public void setRadioButton(boolean fijo){
        if(fijo){
            fijoRadioButton.setSelected(true);
        }else{
            temporalRadioButton.setSelected(true);
        }
    }

    public void clearRadioButtonGroup() {
        this.radioButtonGroup.clearSelection();
    }
    
    public boolean getFijoRadioButton() {
        return fijoRadioButton.isSelected();
    }
    
    public boolean getTemporalRadioButton() {
        return temporalRadioButton.isSelected();
    }

    public boolean getRadioButtonGroup(){
        return getFijoRadioButton() || getTemporalRadioButton();
    }
    
    public String getDniTextField() {
        return dniTextField.getText();
    }

    public void setDniTextField(String dniTextField) {
        this.dniTextField.setText(dniTextField);
    }

    public String getNombreTextField() {
        return nombreTextField.getText();
    }

    public void setNombreTextField(String nombreTextField) {
        this.nombreTextField.setText(nombreTextField);
    }

    public String getSalarioTextField() {
        return salarioTextField.getText();
    }

    public void setSalarioTextField(String salarioTextField) {
        this.salarioTextField.setText(salarioTextField);
    }
       
    //Se reciben listeners para los botones desde el controlador.
    public void addAñadirListener(ActionListener addListener){
        addButton.addActionListener(addListener);
    }
    public void addLimpiarListener(ActionListener limpiarListener){
        limpiarButton.addActionListener(limpiarListener);   
    }
    public void addBuscarListener(ActionListener buscarListener){
        buscarButton.addActionListener(buscarListener);
    }
    public void addSalirListener(ActionListener salirListener){
        salirButton.addActionListener(salirListener);
    }
    //Función para mostar mensajes desde el controlador en un JOptionPane
    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    //comprobación de formato input
    //comprueba que todos los campos estan completados.
    //Para el dni comprueba formato con regEx y salario comprueba si es número positivo.
    public boolean isInputFormated(){        
        return (getDniTextField()!=null && dniFormatOk(getDniTextField())) && 
                getNombreTextField()!=null && 
               (getSalarioTextField()!=null && isNumber(getSalarioTextField())) && 
                getRadioButtonGroup();
    }
    private boolean isNumber(String salarioTextField) {
      return regExChecher("[0-9]+",salarioTextField);
    }
    public boolean dniFormatOk(String dni){
    
     return regExChecher("\\d{8}[A-Za-z]",dni);
    }
    //comprobador de expresiones regulares
    private boolean regExChecher(String regEx, String stringToCheck) {
      Pattern pattern = Pattern.compile(regEx);
      Matcher matcher = pattern.matcher(stringToCheck);
      
      return matcher.matches();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton temporalRadioButton;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel botonPanel;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JRadioButton fijoRadioButton;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel radioLabel;
    private javax.swing.JPanel radioPanel;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField salarioTextField;
    private javax.swing.JButton salirButton;
    // End of variables declaration         



}
