package boletin_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class nif {
    private int resto;
    private final String arrayLetras[];
    private final int nums[];

    /*Divide o nº do DNI entre 23, sen sacar decimais, e anota o resto da división.
    Mira na táboa asociada o resto.( exemplo: nº 1  R )
    A ->3	B 11	C 20	D 9   E 22	F 7	G 4	H 18	J 13	K 21	L 19
    M 5	N 12	P 8	Q 16	R 1	S 15	T 0	V 17	W 2	X 10	Y 6
    Z 14.*/
    public nif() {
        this.arrayLetras = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        this.nums = new int[]{3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
                }
    public int dni(){
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Numero del DNI:"));
        return resto = dni%23;
    }
    public void Comparar(){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==resto){
            JOptionPane.showMessageDialog(null,"La letra es: "+arrayLetras[i]);
            
            }
        }
    }
}
