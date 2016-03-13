
package boletin_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Aleatorios {
    private final int numros[] = new int[valores()];
    public int valores() {
        return Integer.parseInt(JOptionPane.showInputDialog("Elementos a generar?"));
    }

    public void generador() {
        for (int i = 0; i < numros.length; i++) {
            int entero = (int) Math.floor(Math.random() * 50 + 1);
            numros[i] = entero;
        }
    }

    public void visualizar() {
        String texto = "";
        for (int i = 0; i < numros.length; i++) {
            texto += numros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void ordenar() {
        String text = "";
        for (int i = numros.length-1; i >= 0; i = i - 1) {
            text += numros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}

