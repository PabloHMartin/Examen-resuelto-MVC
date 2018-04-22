package segundocuatriexamen.model;

import java.util.ArrayList;

public class ProfesorModel {

    private ArrayList<Profesor> profesores = new ArrayList();

    public void añadirProfesor(String dni, String nombre, Double salario, boolean fijo) {
        profesores.add(new Profesor(salario, fijo, dni, nombre));
    }

    public boolean buscarProfesor(String dni) {

        for (Profesor profesor : profesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }

    public String getNombre(String dni) {

        for (Profesor profesor : profesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                return profesor.getNombre();
            }

        }
        return "";
    }

    public double getSalario(String dni) {
        for (Profesor profesor : profesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                return profesor.getSalario();
            }

        }
        return 0;
    }

    public boolean getFijo(String dni) {
        for (Profesor profesor : profesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                return profesor.isFijo();
            }
        }
        return false;
    }

}
