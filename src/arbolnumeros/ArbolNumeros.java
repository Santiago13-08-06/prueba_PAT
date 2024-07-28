/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolnumeros;

/**
 *
 * @author SANTIAGO TOVAR
 */
public class ArbolNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 8;
        
        for(int i = 0; i < n; i++){
            int number = 1;
            System.out.printf("%"+(n-i)*2+"s","");
            for(int j = 0; j <= i; j++){
                System.out.printf("%4d",number);
                number = number *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    
}
