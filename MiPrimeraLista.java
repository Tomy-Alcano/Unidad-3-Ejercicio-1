import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiPrimeraLista {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Mi Primera JList");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,300);
            ventana.setLocationRelativeTo(null);

            JLabel lblTitulo = new JLabel("Lenguajes de programación: ", SwingConstants.CENTER);

            String[] lenguajes = {"Java", "Phyton", "C++", "JavaScript", "Kotlin", "Swift", "Go", "Rust"};

            JList lista = new JList(lenguajes);

            lista.setVisibleRowCount(4);
            lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JScrollPane scroll = new JScrollPane(lista);

            JLabel lblSeleccion = new JLabel("Ningún elemento seleccionado: ");

            lista.addListSelectionListener(e -> {

                if (e.getValueIsAdjusting()) {
                    String seleccionado =
                            (String) lista.getSelectedValue();

                    if (seleccionado != null) {
                        lblSeleccion.setText("Seleccionaste: "+ seleccionado);
                    }
                }

            });
            ventana.add(lblTitulo, BorderLayout.NORTH);
            ventana.add(scroll, BorderLayout.CENTER);
            ventana.add(lblSeleccion, BorderLayout.SOUTH);

            ventana.setVisible(true);
        });

    }

}
