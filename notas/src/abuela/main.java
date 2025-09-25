package abuela;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Inicio de Sesión");

            // Crear el formulario
            login formulario = new login();

            // El contenido de la ventana será el panel del formulario
            frame.setContentPane(formulario.getPanel1());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack(); // ajusta tamaño a los componentes
            frame.setLocationRelativeTo(null); // centra la ventana
            frame.setVisible(true); // muestra la ventana
        });
    }
}
