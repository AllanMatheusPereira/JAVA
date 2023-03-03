/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package allan.pereira.somadedoisnumeros;
import java.util.Scanner;
/**
 *
 * @author allan
 */
public class SomadeDoisNumeros {

        public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual a altura do triangulo:");
        int numero = ler.nextInt();
        System.out.println("Qual a base:");
        int base = ler.nextInt();
        int valor = (numero * base) / 2;
        if (valor > 10) {
            System.out.println("Hello World");
        }else{
            System.out.println("...");
        }
        System.out.println("A area do triangulo é: " + valor);
    }
}
