package com.mycompany.retocalculadora;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author Wilder David Uribe Barraza Jairo Andres Bautista Neira Fernando Navia
 * Bolaños
 */
public class ClsCalculadora {

    public void ClsCalculadora() {
    }

    public void Iniciar_Programa() {

        int opcion = 0;

        //int operacion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione una opción\n"
                    + "1. Realizar una operación\n"
                    + "2. Salir\n"
            ));
            if (opcion != 1 && opcion != 2) {
                JOptionPane.showMessageDialog(null, "Elija una opciòn válida en el menú", "ERROR...", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcion != 1 && opcion != 2);

        if (opcion == 2) {
            JOptionPane.showMessageDialog(null, "Gracias por hacer uso de la Calculadora", "Calculadora", JOptionPane.DEFAULT_OPTION, null);
        }
        if (opcion == 1) {
            String operacion = JOptionPane.showInputDialog(null,
                    "Seleccione una operación:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n"
                    + "5. Potencia\n"
                    + "6. Raíz cuadrada\n"
                    + "7. Salir\n"
            );

            switch (operacion) {
                case "1":
                    String num_1 = JOptionPane.showInputDialog("Ingresa el primer numero");
                    String num_2 = JOptionPane.showInputDialog("Ingresa el segundo numero");

                    double numero1 = Double.parseDouble(num_1);
                    double numero2 = Double.parseDouble(num_2);

                    double resultado_suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, resultado_suma, "El resultado de la suma es:", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    String num_3 = JOptionPane.showInputDialog("Ingresa el primer numero");
                    String num_4 = JOptionPane.showInputDialog("Ingresa el segundo numero");

                    double numero3 = Double.parseDouble(num_3);
                    double numero4 = Double.parseDouble(num_4);

                    double resultado_resta = numero3 - numero4;
                    JOptionPane.showMessageDialog(null, resultado_resta, "El resultado de la resta es:", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "3":
                    String num_5 = JOptionPane.showInputDialog("Ingresa el primer numero");
                    String num_6 = JOptionPane.showInputDialog("Ingresa el segundo numero");

                    double numero5 = Double.parseDouble(num_5);
                    double numero6 = Double.parseDouble(num_6);

                    double resultado_multiplicacion = numero5 * numero6;
                    JOptionPane.showMessageDialog(null, resultado_multiplicacion, "El resultado de la multiplicacion es:", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "4":
                    String num_7 = JOptionPane.showInputDialog("Ingresa el primer numero");
                    String num_8 = JOptionPane.showInputDialog("Ingresa el segundo numero");

                    double numero7 = Double.parseDouble(num_7);
                    double numero8 = Double.parseDouble(num_8);

                    double resultado_division = numero7 / numero8;
                    if (numero8 == 0) {
                        JOptionPane.showMessageDialog(null, resultado_division, "La divison entre cero no esta determina:", JOptionPane.INFORMATION_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(null, resultado_division, "El resultado de la division es:", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "5":
                    String num_9 = JOptionPane.showInputDialog("Ingresa el primer numero");
                    String num_10 = JOptionPane.showInputDialog("Ingresa el segundo numero");

                    double numero9 = Double.parseDouble(num_9);
                    double numero10 = Double.parseDouble(num_10);
                    double resultado_potencia = Math.pow(numero9, numero10);

                    JOptionPane.showMessageDialog(null, resultado_potencia, "El resultado de la potencia es:", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "6":
                    String num_11 = JOptionPane.showInputDialog("Ingresa el primer numero");

                    int numero11 = Integer.parseInt(num_11);

                    JOptionPane.showMessageDialog(null, " La potencia es igual a: " + Math.sqrt(numero11));

                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Gracias por hacer uso de la Calculadora", "Calculadora", JOptionPane.DEFAULT_OPTION, null);
                    System.exit(0);

            }

        }

    }

}
