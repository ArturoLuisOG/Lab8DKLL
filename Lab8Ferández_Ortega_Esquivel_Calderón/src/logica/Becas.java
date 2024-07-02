package logica;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Becas {
	private static final int MAX_ESTUDIANTES = 100;
    private ArrayList<Estudiantes> estudiantes;

    public Becas() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiantes estudiante) {
        if (estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("No se puede agregar más estudiantes. Límite alcanzado.");
        }
    }

    public ArrayList<String> obtenerEstudiantesBecados() {
        ArrayList<String> estudiantesBecados = new ArrayList<>();

        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getIndiceAcademico() >= 2.0) {
                estudiantesBecados.add(estudiante.getNombre());
            }
        }

        return estudiantesBecados;
    }
    
    public Estudiantes buscarCedula(String cedula) {
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    public List<Estudiantes> buscarSexo(String sexo) {
        return estudiantes.stream()
            .filter(e -> e.getSexo().equals(sexo))
            .collect(Collectors.toList());
    }

    public List<Estudiantes> buscarCarrera(String carrera) {
        return estudiantes.stream()
            .filter(e -> e.getCarrera().equals(carrera))
            .collect(Collectors.toList());
    }
}


