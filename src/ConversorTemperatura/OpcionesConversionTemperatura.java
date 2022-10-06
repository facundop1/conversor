package ConversorTemperatura;

import javax.swing.*;

public class OpcionesConversionTemperatura {
    ConversorTemperatura temperatura = new ConversorTemperatura();

    public void ConvertirTemperatura(double valor) {
        String opcion = JOptionPane.showInputDialog(null,
                "Elige la temperatura que quieres convertir",
                "Temperaturas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[] {
                        "De Celsius a Fahrenheit",
                        "De Fahrenheit a Celsius",
                        "De Celsius a Kelvin",
                        "De Fahrenheit a Kelvin",
                        "De Kelvin a Celsius",
                        "De Kelvin a Fahrenheit"
                }, "Seleccion").toString();

        switch (opcion){
            case "De Celsius a Fahrenheit": {
                temperatura.ConvertirDeCelsiusAFahrenheit(valor);
                break;
            }
            case "De Fahrenheit a Celsius": {
                temperatura.ConvertirDeFahrenheitACelsius(valor);
                break;
            }
            case "De Celsius a Kelvin": {
                temperatura.ConvertirDeCelsiusAKelvin(valor);
                break;
            }
            case "De Fahrenheit a Kelvin": {
                temperatura.ConvertirDeFahrenheitAKelvin(valor);
                break;
            }
            case "De Kelvin a Celsius": {
                temperatura.ConvertirDeKelvinACelsius(valor);
                break;
            }
            case "De Kelvin a Fahrenheit": {
                temperatura.ConvertirDeKelvinAFahrenheit(valor);
                break;
            }
        }
    }
}
