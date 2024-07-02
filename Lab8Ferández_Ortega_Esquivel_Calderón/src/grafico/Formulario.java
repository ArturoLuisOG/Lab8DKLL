package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


//importar clases del paquete
import logica.Estudiantes;
import logica.Becas;

//Importar elementos de diseño 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textIndice;
	private JTextField textCedula;
	private Estudiantes estudiante;
	private JComboBox<String> comboBoxCarreras;
	private JComboBox<String> comboBoxSexo;
	private ArrayList<Estudiantes> estudiantes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		 estudiantes = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JLabel lblNewLabel = new JLabel("Información de estudiantes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(277, 10, 271, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 97, 95, 22);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNombre.setBounds(141, 102, 153, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Indice:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(21, 239, 95, 22);
		contentPane.add(lblNewLabel_1_1);
		
		textIndice = new JTextField();
		textIndice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textIndice.setColumns(10);
		textIndice.setBounds(141, 240, 153, 19);
		contentPane.add(textIndice);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cédula:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(21, 166, 95, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCedula.setColumns(10);
		textCedula.setBounds(141, 167, 153, 19);
		contentPane.add(textCedula);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Carrera:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(21, 311, 95, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		comboBoxCarreras = new JComboBox<>();
        comboBoxCarreras.setModel(new DefaultComboBoxModel<>(new String[]{"Ingeniería Civil", "Ingeniería Eléctrica", "Ingeniería Industrial", "Ingeniería en Sistemas", "Ingeniería Mecánica", "Ingeniería Marítima"}));
        comboBoxCarreras.setBounds(141, 312, 153, 21);
        comboBoxCarreras.setSelectedIndex(-1);
        contentPane.add(comboBoxCarreras);
		
		JButton btnGuardar = new JButton("Guardar Datos");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(212, 446, 184, 34);
		contentPane.add(btnGuardar);
		
		JButton btnReportes = new JButton("Mostrar Reportes");
		btnReportes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReportes.setBounds(460, 446, 184, 34);
		contentPane.add(btnReportes);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 375, 45, 27);
		contentPane.add(lblNewLabel_2);
		
		comboBoxSexo = new JComboBox<>();
        comboBoxSexo.setModel(new DefaultComboBoxModel<>(new String[]{"Masculino", "Femenino"}));
        comboBoxSexo.setBounds(141, 381, 153, 21);
        comboBoxSexo.setSelectedIndex(-1);
        contentPane.add(comboBoxSexo);
        
        JButton btnNewButton = new JButton("Buscar por Cédula");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(460, 97, 214, 34);
        contentPane.add(btnNewButton);
        
        JButton btnBuscarPorSexo = new JButton("Buscar por Sexo");
        btnBuscarPorSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnBuscarPorSexo.setBounds(460, 160, 214, 34);
        contentPane.add(btnBuscarPorSexo);
        
        JButton btnNewButton_1_1 = new JButton("Buscar por Carrera");
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton_1_1.setBounds(460, 222, 214, 34);
        contentPane.add(btnNewButton_1_1);
	
		// Agregar ActionListener para el botón "Guardar Datos"
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para guardar la información
                guardarDatos();
            }
        });
        btnReportes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cierra la ventana actual
                dispose();
                // Crear una instancia de la clase Becas
                Becas becas = new Becas();

                // Agregar todos los estudiantes del formulario a la instancia de Becas
                for (Estudiantes estudiante : estudiantes) {
                    becas.agregarEstudiante(estudiante);
                }
                // Abre la ventana de reportes
                Reportes reportes = new Reportes();
                reportes.setVisible(true);
                reportes.mostrarBecados(becas);
            }
        });	
        btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String cedula = textCedula.getText();
             Estudiantes estudianteEncontrado = buscarEstudiantePorCedula(cedula);
             if (estudianteEncontrado != null) {
                 JOptionPane.showMessageDialog(null, "Estudiante encontrado: " + estudianteEncontrado.getNombre());
             } else {
                 JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con esa cédula.");
             }
         }
     });

	 btnBuscarPorSexo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String sexo = (String) comboBoxSexo.getSelectedItem();
             ArrayList<Estudiantes> estudiantesPorSexo = buscarEstudiantesPorSexo(sexo);
             if (!estudiantesPorSexo.isEmpty()) {
                 mostrarEstudiantesEnVentana(estudiantesPorSexo);
             } else {
                 JOptionPane.showMessageDialog(null, "No se encontraron estudiantes con ese sexo.");
             }
         }
     });

	 btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String carrera = (String) comboBoxCarreras.getSelectedItem();
             ArrayList<Estudiantes> estudiantesPorCarrera = buscarEstudiantesPorCarrera(carrera);
             if (!estudiantesPorCarrera.isEmpty()) {
                 mostrarEstudiantesEnVentana(estudiantesPorCarrera);
             } else {
                 JOptionPane.showMessageDialog(null, "No se encontraron estudiantes en esa carrera.");
             }
         }
     });
 }

 private Estudiantes buscarEstudiantePorCedula(String cedula) {
     for (Estudiantes estudiante : estudiantes) {
         if (estudiante.getCedula().equals(cedula)) {
             return estudiante;
         }
     }
     return null;
 }

 private ArrayList<Estudiantes> buscarEstudiantesPorSexo(String sexo) {
     ArrayList<Estudiantes> estudiantesEncontrados = new ArrayList<>();
     for (Estudiantes estudiante : estudiantes) {
         if (estudiante.getSexo().equals(sexo)) {
             estudiantesEncontrados.add(estudiante);
         }
     }
     return estudiantesEncontrados;
 }

 private ArrayList<Estudiantes> buscarEstudiantesPorCarrera(String carrera) {
     ArrayList<Estudiantes> estudiantesEncontrados = new ArrayList<>();
     for (Estudiantes estudiante : estudiantes) {
         if (estudiante.getCarrera().equals(carrera)) {
             estudiantesEncontrados.add(estudiante);
         }
     }
     return estudiantesEncontrados;
 }

 private void guardarDatos() {
     try {
         String nombre = textNombre.getText();
         if (!nombre.matches("[a-zA-Z ]+")) {
             throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
         }

         String cedula = textCedula.getText();
         if (!cedula.matches("[0-9-]+")) {
             JOptionPane.showMessageDialog(null, "La cédula solo puede contener números y guiones.");
             return;
         }

         if (textIndice.getText().isEmpty()) {
             throw new IllegalArgumentException("El índice no puede estar vacío.");
         }
         double indice = Double.parseDouble(textIndice.getText());
         if (indice < 0 || indice > 3) {
             throw new NumberFormatException("Índice fuera de rango");
         }

         String carrera = (String) comboBoxCarreras.getSelectedItem();
         if (carrera == null || carrera.isEmpty()) {
             throw new IllegalArgumentException("Debe seleccionar una carrera.");
         }

         String sexo = (String) comboBoxSexo.getSelectedItem();
         if (sexo == null || sexo.isEmpty()) {
             throw new IllegalArgumentException("Debe seleccionar un sexo.");
         }

         Estudiantes estudiante = new Estudiantes(nombre, cedula, carrera, indice, sexo);
         estudiantes.add(estudiante);
         JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
         limpiarCampos();
     } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Índice inválido. Debe estar entre 0 y 3.");
     } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al guardar datos.");
     }
 }

 private void limpiarCampos() {
     textNombre.setText("");
     textCedula.setText("");
     textIndice.setText("");
     comboBoxCarreras.setSelectedIndex(-1);
     comboBoxSexo.setSelectedIndex(-1);
 }

 private void mostrarEstudiantesEnVentana(ArrayList<Estudiantes> estudiantes) {
     StringBuilder sb = new StringBuilder();
     sb.append("Estudiantes encontrados:\n");
     for (Estudiantes estudiante : estudiantes) {
         sb.append(estudiante.getNombre()).append("\n");
     }
     JOptionPane.showMessageDialog(null, sb.toString());
 }
}
