package conversorMonedas;

import javax.swing.*;

public class OpcionesConversionMonedas {
    ConversorMonedas monedas = new ConversorMonedas();

    public void ConvertirMonedas(double valor) {
        String opcion = JOptionPane.showInputDialog(null,
                "Elije la moneda que queres convertir a pesos",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"De Pesos Argentinos a Dolar Oficial",
                        "De Pesos Argentinos a Dolar Blue",
                        "De Pesos Argentinos a Euros",
                        "De Pesos Argentinos a Libras",
                        "De Pesos Argentinos a Yen",
                        "De Pesos Argentinos a Won Coreano",
                        "De Dolar Oficial a Pesos Argentinos",
                        "De Dolar Blue a Pesos Argentinos",
                        "De Euros a Pesos Argentinos",
                        "De Libras a Pesos Argentinos",
                        "De Yen a Pesos Argentinos",
                        "De Won Coreano a Pesos Argentinos"}, "Seleccion").toString();

        switch (opcion) {
            case "De Pesos Argentinos a Dolar Oficial": {
                monedas.ConvertirPesosArgentinosADolarOficial(valor);
                break;
            }
            case "De Pesos Argentinos a Dolar Blue": {
                monedas.ConvertirPesosArgentinosADolarBlue(valor);
                break;
            }
            case "De Pesos Argentinos a Euros": {
                monedas.ConvertirPesosArgentinosAEuros(valor);
                break;
            }
            case "De Pesos Argentinos a Libras": {
                monedas.ConvertirPesosArgentinosALibras(valor);
                break;
            }
            case "De Pesos Argentinos a Yen": {
                monedas.ConvertirPesosArgentinosAYen(valor);
                break;
            }
            case "De Pesos Argentinos a Won Coreano": {
                monedas.ConvertirPesosArgentinosAWonCoreano(valor);
                break;
            }
            case "De Dolar Oficial a Pesos Argentinos": {
                monedas.ConvertirDolarOficialAPesosArgentinos(valor);
                break;
            }
            case "De Dolar Blue a Pesos Argentinos": {
                monedas.ConvertirDolarBlueAPesosArgentinos(valor);
                break;
            }
            case "De Euros a Pesos Argentinos": {
                monedas.ConvertirEurosAPesosArgentinos(valor);
                break;
            }
            case "De Libras a Pesos Argentinos": {
                monedas.ConvertirLibrasAPesosArgentinos(valor);
                break;
            }
            case "De Yen a Pesos Argentinos": {
                monedas.ConvertirYenAPesosArgentinos(valor);
                break;
            }
            case "De Won Coreano a Pesos Argentinos": {
                monedas.ConvertirWonCoreanoAPesosArgentinos(valor);
                break;
            }
        }
    }
}
