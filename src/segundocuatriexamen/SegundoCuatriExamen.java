
package segundocuatriexamen;

import segundocuatriexamen.controller.ProfesorController;
import segundocuatriexamen.model.ProfesorModel;
import segundocuatriexamen.view.Vista;

public class SegundoCuatriExamen {

    public static void main(String[] args) {
           Vista vista = new Vista();
           ProfesorModel profesorModel= new ProfesorModel();
           
           ProfesorController profesorController = new ProfesorController(vista,profesorModel);
           
           vista.setVisible(true);
    }
    
}
