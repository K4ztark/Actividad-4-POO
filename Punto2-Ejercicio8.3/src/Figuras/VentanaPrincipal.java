package Figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton botonCilindro, botonEsfera, botonPiramide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        botonCilindro = new JButton("Cilindro");
        botonCilindro.setBounds(20, 50, 80, 23);
        botonCilindro.addActionListener(this);

        botonEsfera = new JButton("Esfera");
        botonEsfera.setBounds(125, 50, 80, 23);
        botonEsfera.addActionListener(this);

        botonPiramide = new JButton("Pirámide");
        botonPiramide.setBounds(225, 50, 100, 23);
        botonPiramide.addActionListener(this);

        contenedor.add(botonCilindro);
        contenedor.add(botonEsfera);
        contenedor.add(botonPiramide);
    }


    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonEsfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }

        if (evento.getSource() == botonCilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        }

        if (evento.getSource() == botonPiramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        }
    }
}
