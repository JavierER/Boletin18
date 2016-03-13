package boletin_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin_18 {

    public static void main(String[] args){
            switch (Integer.parseInt(JOptionPane.showInputDialog("Elige:\n1.Numeros aleatorios\n2.Notas\n3.Letra NIF"))) {
            case 1:
                Aleatorios ale = new Aleatorios();
                ale.generador();
                ale.visualizar();
                ale.ordenar();
                break;
            case 2:
                Notas notas = new Notas();
                notas.darNomes();
                notas.darNotas();
                notas.listaOrd();
                notas.verNota();
                notas.Aprobados();
                notas.notaMedia();
                notas.notaMaisAlta();
                break;
            case 3:
                nif dni = new nif();
                dni.dni();
                dni.Comparar();
                break;
        }
    }
    }
    

