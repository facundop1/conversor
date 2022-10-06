package conversorMonedas;

import javax.swing.*;

public class ConversorMonedas {

    public void ConvertirPesosArgentinosADolarOficial(double valor) {
        double dolarOficial = valor / 148.90;
        dolarOficial = (double) Math.round(dolarOficial * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolarOficial + " Dolares");
    }

    public void ConvertirPesosArgentinosADolarBlue(double valor) {
        double dolarBlue = valor / 278.00;
        dolarBlue = (double) Math.round(dolarBlue * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolarBlue + " Dolares");
    }

    public void ConvertirPesosArgentinosAEuros(double valor) {
        double euros = valor / 147.19;
        euros = (double) Math.round(euros * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + euros + " Euros");
    }

    public void ConvertirPesosArgentinosALibras(double valor) {
        double libras = valor / 168.62;
        libras = (double) Math.round(libras * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + libras + " Libras");
    }

    public void ConvertirPesosArgentinosAYen(double valor) {
        double yen = valor / 1.03;
        yen = (double) Math.round(yen * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yen + " Yenes");
    }

    public void ConvertirPesosArgentinosAWonCoreano(double valor) {
        double wonCoreano = valor / 0.11;
        wonCoreano = (double) Math.round(wonCoreano * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + wonCoreano + " Wones");
    }

    public void ConvertirDolarOficialAPesosArgentinos(double valor) {
        double argentinosADolarOficial = valor / 0.0067;
        argentinosADolarOficial = (double) Math.round(argentinosADolarOficial * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosADolarOficial + "Pesos Argentinos");
    }

    public void  ConvertirDolarBlueAPesosArgentinos(double valor) {
        double argentinosADolarBlue = valor / 0.0035;
        argentinosADolarBlue = (double) Math.round(argentinosADolarBlue * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosADolarBlue + "Pesos Argentinos");
    }

    public void  ConvertirEurosAPesosArgentinos(double valor) {
        double argentinosAEuros = valor / 0.0068;
        argentinosAEuros = (double) Math.round(argentinosAEuros * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosAEuros + "Pesos Argentinos");
    }

    public void  ConvertirLibrasAPesosArgentinos(double valor) {
        double argentinosALibras = valor / 0.0059;
        argentinosALibras = (double) Math.round(argentinosALibras * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosALibras + "Pesos Argentinos");
    }

    public void  ConvertirYenAPesosArgentinos(double valor) {
        double argentinosAYen = valor / 0.97;
        argentinosAYen = (double) Math.round(argentinosAYen * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosAYen + "Pesos Argentinos");
    }

    public void  ConvertirWonCoreanoAPesosArgentinos(double valor) {
        double argentinosAWonCoreano = valor / 9.51;
        argentinosAWonCoreano = (double) Math.round(argentinosAWonCoreano * 100d)/ 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + argentinosAWonCoreano + "Pesos Argentinos");
    }
}
