package ConversorTemperatura;

import javax.swing.*;

public class ConversorTemperatura {

    public void ConvertirDeCelsiusAFahrenheit(double valor) {
        double fahrenheit = (valor * 1.8) + 32;
        fahrenheit = (double) Math.round(fahrenheit * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + fahrenheit + "º Fahrenheit");
    }

    public void ConvertirDeFahrenheitACelsius(double valor) {
        double celsius = (valor - 32) / 1.8;
        celsius = (double) Math.round(celsius * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + celsius + "º Celsius");
    }

    public void ConvertirDeCelsiusAKelvin(double valor) {
        double kelvinACelsius = valor + 273.15;
        kelvinACelsius = (double) Math.round(kelvinACelsius * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + kelvinACelsius + "K");
    }

    public void ConvertirDeFahrenheitAKelvin(double valor) {
        double kelvinAFahrenheit = (valor - 32)/1.8 + 273.15;
        kelvinAFahrenheit = (double) Math.round(kelvinAFahrenheit * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + kelvinAFahrenheit + "K");
    }

    public void ConvertirDeKelvinACelsius(double valor) {
        double CelsiusAKelvin = valor - 273.15;
        CelsiusAKelvin = (double) Math.round(CelsiusAKelvin * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + CelsiusAKelvin + "º Celsius");
    }

    public void ConvertirDeKelvinAFahrenheit(double valor) {
        double fahrenheitAKelvin = 1.8 * (valor - 273.15) + 32;
        fahrenheitAKelvin = (double) Math.round(fahrenheitAKelvin * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Hacen " + fahrenheitAKelvin + "º Fahrenheit");
    }

}
