package main;

import ConversorTemperatura.OpcionesConversionTemperatura;
import conversorMonedas.OpcionesConversionMonedas;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        OpcionesConversionMonedas conversionMonedas = new OpcionesConversionMonedas();

        OpcionesConversionTemperatura conversionTemperatura = new OpcionesConversionTemperatura();

        while(true) {
            String opciones = JOptionPane.showInputDialog(null,
                    "Selecciones una opcion de conversion",
                    "Conversor de Pesos Argentinos",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new Object[] {"Conversor de monedas", "Conversor de temperatura"}, "Elegir")
                    .toString();

            switch (opciones) {
                case "Conversor de monedas":{
                    String input = JOptionPane.showInputDialog(null, "Ingresa un valor");

                    double valorRecibido = Double.parseDouble(input);

                    conversionMonedas.ConvertirMonedas(valorRecibido);

                    int respuesta = JOptionPane.showConfirmDialog(null,
                            "¿Deseas realizar otra conversion?");

                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona una opcion");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }

                    break;
                }

                case "Conversor de temperatura": {
                    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");

                    double valorRecibido = Double.parseDouble(input);

                    conversionTemperatura.ConvertirTemperatura(valorRecibido);

                    int respuesta = JOptionPane.showConfirmDialog(null,
                            "¿Deseas realizar otra conversion?");

                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona una opcion");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }

                    break;
                }

            }
        }
    }
}
