
package segundocuatriexamen.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import segundocuatriexamen.model.ProfesorModel;
import segundocuatriexamen.view.Vista;

public class ProfesorController {
    
    private Vista vista;
    private ProfesorModel profesorModel;

    public ProfesorController(Vista vista,ProfesorModel profesorModel) {
        this.vista = vista;
        this.profesorModel = profesorModel;
        //pasamos a la vista el actionListener que queremos para los botones.
        this.vista.addAñadirListener(new AñadirListener());
        this.vista.addLimpiarListener(new LimpiarListener());
        this.vista.addBuscarListener(new BuscarListener());
        this.vista.addSalirListener(new SalirListener());
    }

    //clases privadas listeners 
    //boton añadir
    private  class AñadirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String dni, nombre;
            double salario;
            boolean fijo;
            
           if(vista.isInputFormated()){
               dni = vista.getDniTextField();
               nombre = vista.getNombreTextField();
               salario = Double.parseDouble(vista.getSalarioTextField());
               fijo = vista.getFijoRadioButton();
               
               profesorModel.añadirProfesor(dni,nombre,salario,fijo);    
               vista.displayMessage("Profesor " + nombre+" añadido correctamente.");   
           }else{
               vista.displayMessage("Para añadir un profesor debe completar todo el formulario correctamente.\n"
                       + "El dni debe tener el formato 00000000X.\n"
                       + "El salario debe ser un numero positivo.\n"
                       + "El tipo de contrado no pude estar vacío.");
           }   
        }
    }

    //boton limpiar
    private  class LimpiarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vista.setDniTextField("");
            vista.setNombreTextField("");
            vista.setSalarioTextField("");
            vista.clearRadioButtonGroup();
        }
    }
    //boton buscar
    private  class BuscarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String dni, nombre;
            double salario;
            boolean fijo;
            if(vista.dniFormatOk(vista.getDniTextField())){
                dni= vista.getDniTextField();
                if(profesorModel.buscarProfesor(dni)){
                    nombre = profesorModel.getNombre(dni);
                    salario = profesorModel.getSalario(dni);
                    fijo = profesorModel.getFijo(dni);
                    vista.setNombreTextField(nombre);
                    vista.setSalarioTextField(String.valueOf(salario));
                    vista.setRadioButton(fijo);
                }else{
                    vista.displayMessage("El dni buscado no se encuentra en la base de datos.");
                }
            }else{
                vista.displayMessage("El formato del dni es incorrecto");
            }
        }
    }
    //boton salir
    private  class SalirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    }
    
    
    
    
    
}
