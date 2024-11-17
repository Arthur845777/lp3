package BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Direcciones implements ActionListener {
    private String ciudad;
    private String rutaImagen;
    private JLabel infoCiudad;

    public Direcciones(String ciudad, String rutaImagen, JLabel infoCiudad) {
        this.ciudad = ciudad;
        this.rutaImagen = rutaImagen;
        this.infoCiudad = infoCiudad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        infoCiudad.setText("Ciudad más cercana: " + ciudad);
        infoCiudad.setIcon(new ImageIcon(rutaImagen));
    }
}
