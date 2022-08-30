package com.mycompany.picasfijas;

import java.awt.Color;
import javax.swing.*;

public class Picasfijas {

    public static void main(String args[]) {

        //INTERFAZ
        UIManager.put("OptionPane.background", Color.gray);
        UIManager.put("Panel.background", Color.white);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n  MENÚ \n\n 1. Reglas \n 2. JUGAR \n 0. SALIR \n "));
            switch (opcion) {
                case 1 ->
                    JOptionPane.showMessageDialog(null, reglas());
                case 2 ->
                    JOptionPane.showMessageDialog(null, jugar());
                case 3 ->
                    JOptionPane.showMessageDialog(null, "Creador: FABIAN VALERO");

            }
        } while (opcion != 0);
    }

    public static int reglas() {

        JOptionPane.showMessageDialog(null, "\n\n   REGLAS    "
                + "\n\n  1. Debes ingresar 4 números uno por uno formando un número de 4 dígitos"
                + "\n  2. El programa te irá dando información acerca de cuantas picas y cuantas fijas tiene el número que digitas      "
                + "\n  3. Si deseas salir del programa debes oprimir el cero (0) en la venta MENÚ\n\n\n"
        );

        return 0;
    }

    public static int jugar() {

        do {

            int vector1[] = {4, 5, 6, 7};
            int vector2[] = new int[4];
            int contFijas = 0;
            int contPicas = 0;

            String cadena = "";
            for (int i = 0; i < 4; i++) {

                vector2[i] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite el número de la posición " + (i + 1)));

                cadena += vector2[i] + "";

            }
            JOptionPane.showMessageDialog(null, "El número que usted digitó fué: \n" + cadena);

            // GANAR
            if (vector1[0] == vector2[0]
                    && vector1[1] == vector2[1]
                    && vector1[2] == vector2[2]
                    && vector1[3] == vector2[3]) {
                UIManager.put("OptionPane.background", Color.green);
                JOptionPane.showMessageDialog(null, "GANASTE el número era: " + cadena + "   ");
                UIManager.put("OptionPane.background", Color.gray);
                return 0;
            }
            
            // CONTANDO FIJAS
            if (vector1[0] == vector2[0]) {
                contFijas++;
            }
            if (vector1[1] == vector2[1]) {
                contFijas++;
            }
            if (vector1[2] == vector2[2]) {
                contFijas++;
            }
            if (vector1[3] == vector2[3]) {
                contFijas++;
            }

            // CONTANDO PICAS POSICIÓN 1
            if (vector1[0] == vector2[1]) {
                contPicas++;
            }
            if (vector1[0] == vector2[2]) {
                contPicas++;
            }
            if (vector1[0] == vector2[3]) {
                contPicas++;
            }

            // CONTANDO PICAS POSICIÓN 2
            if (vector1[1] == vector2[0]) {
                contPicas++;
            }
            if (vector1[1] == vector2[2]) {
                contPicas++;
            }
            if (vector1[1] == vector2[3]) {
                contPicas++;
            }

            // CONTANDO PICAS POSICIÓN 3
            if (vector1[2] == vector2[0]) {
                contPicas++;
            }
            if (vector1[2] == vector2[1]) {
                contPicas++;
            }
            if (vector1[2] == vector2[3]) {
                contPicas++;
            }

            // CONTANDO PICAS POSICIÓN 4
            if (vector1[3] == vector2[0]) {
                contPicas++;
            }
            if (vector1[3] == vector2[1]) {
                contPicas++;
            }
            if (vector1[3] == vector2[2]) {
                contPicas++;
            }

            JOptionPane.showMessageDialog(null, "la cantidad de fijas es: \n" + contFijas + "\nla cantidad de picas es: \n" + contPicas++);

        } while (true);
    }
}