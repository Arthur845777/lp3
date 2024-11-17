package GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CaptchaPuzzle extends JFrame {
    private JPanel panel;
    private JLabel pieza;
    private Point posicionInicial;
    private Rectangle objetivo;

    public CaptchaPuzzle() {
        setTitle("Captcha");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        // Panel principal
        panel = new JPanel(null);
        panel.setBounds(0, 0, 500, 300);
        panel.setBackground(Color.WHITE);
        add(panel);

        objetivo = new Rectangle(350, 100, 100, 100);
        JLabel zonaObjetivo = new JLabel("Zona objetivo");
        zonaObjetivo.setBounds(objetivo);
        zonaObjetivo.setHorizontalAlignment(SwingConstants.CENTER);
        zonaObjetivo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        panel.add(zonaObjetivo);

        // Pieza del rompecabezas
        pieza = new JLabel(new ImageIcon("C:/Users/User-HP/Downloads/code/java/actividad/Actividad/ciudades/ucsm.jpg")); // Imagen de la pieza
        pieza.setBounds(50, 100, 100, 100);
        pieza.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel.add(pieza);

        // Eventos de mouse
        pieza.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                posicionInicial = pieza.getLocation();
            }
        });

        pieza.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point nuevaPosicion = SwingUtilities.convertPoint(pieza, e.getPoint(), panel);
                pieza.setLocation(nuevaPosicion.x - pieza.getWidth() / 2, nuevaPosicion.y - pieza.getHeight() / 2);
            }
        });

        pieza.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // Verificar si la pieza encaja en la zona objetivo
                if (objetivo.contains(pieza.getBounds())) {
                    pieza.setLocation(objetivo.x, objetivo.y);
                    JOptionPane.showMessageDialog(panel, "¡Captcha completado!");
                } else {
                    // Regresar a posición inicial si no encaja
                    pieza.setLocation(posicionInicial);
                }
            }
        });
    }
    public static void main(String[] args) {
            new CaptchaPuzzle().setVisible(true);
    }
}
