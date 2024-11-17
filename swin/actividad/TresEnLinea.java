package FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnLinea extends JFrame {
    private boolean turnoX = true;  // Alterna entre X y O

    public TresEnLinea() {
        setTitle("Tres en Línea");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Configurar GridLayout 3x3 para el tablero
        setLayout(new GridLayout(3, 3, 5, 5));
        
        // Crear botones para cada celda
        for (int i = 0; i < 9; i++) {
            JButton boton = new JButton("");
            boton.setFont(new Font("Arial", Font.PLAIN, 40));
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (boton.getText().equals("")) {
                        boton.setText(turnoX ? "X" : "O");
                        turnoX = !turnoX;  // Cambiar de turno
                    }
                }
            });
            add(boton);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TresEnLinea().setVisible(true);
        });
    }
}
