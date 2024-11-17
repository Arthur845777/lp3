package BorderLayout;
import javax.swing.*;
import java.awt.*;

public class BrújulaDemo extends JFrame {
    private JLabel infoCiudad;

    public BrújulaDemo() {
        setTitle("Brújula con BorderLayout");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear botones para cada dirección
        JButton btnNorte = new JButton("Norte");
        JButton btnSur = new JButton("Sur");
        JButton btnEste = new JButton("Este");
        JButton btnOeste = new JButton("Oeste");

        // Área central para mostrar ciudad y su imagen
        infoCiudad = new JLabel("Selecciona una dirección", SwingConstants.CENTER);
        infoCiudad.setHorizontalTextPosition(SwingConstants.CENTER);
        infoCiudad.setVerticalTextPosition(SwingConstants.BOTTOM);

        // Agregar botones al layout en sus posiciones respectivas
        add(btnNorte, BorderLayout.NORTH);
        add(btnSur, BorderLayout.SOUTH);
        add(btnEste, BorderLayout.EAST);
        add(btnOeste, BorderLayout.WEST);
        add(infoCiudad, BorderLayout.CENTER);

        // Agregar listeners a cada botón con ciudades específicas y sus imágenes
        btnNorte.addActionListener(new Direcciones("Cuzco", "C:/Users/User-HP/Downloads/code/java/actividad/Actividad/ciudades/cuzco.jpg", infoCiudad));
        btnSur.addActionListener(new Direcciones("Tacna", "C:/Users/User-HP/Downloads/code/java/actividad/Actividad/ciudades/Tacna.jpg", infoCiudad));
        btnEste.addActionListener(new Direcciones("Puno", "C:/Users/User-HP/Downloads/code/java/actividad/Actividad/ciudades/Puno.jpg", infoCiudad));
        btnOeste.addActionListener(new Direcciones("Mollendo", "C:/Users/User-HP/Downloads/code/java/actividad/Actividad/ciudades/Mollendo.jpg", infoCiudad));
    }
}