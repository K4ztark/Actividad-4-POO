package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaEsfera extends JFrame implements ActionListener {

    private Container contenedor;


    private JLabel radio, volumen, superficie;
    private JTextField campoRadio;
    private JButton calcular;

    public VentanaEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(280, 200);
        setLocationRelativeTo(null); // Centra la ventana
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel("Radio (cms):");
        radio.setBounds(20, 20, 135, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 50, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 90, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 120, 200, 23);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            boolean error = false;
            try {

                double valorRadio = Double.parseDouble(campoRadio.getText());

                Esfera esfera = new Esfera(valorRadio);


                volumen.setText("Volumen (cm3): " + String.format("%.2f", esfera.calcularVolumen()));
                superficie.setText("Superficie (cm2): " + String.format("%.2f", esfera.calcularSuperficie()));
            } catch (Exception e) {
                error = true;
            } finally {
                if (error) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Campo nulo o error en formato de número",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
    }
}
