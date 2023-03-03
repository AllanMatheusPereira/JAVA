/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allan.pereira.areadotriangulo;
import java.util.Scanner;
/**
 *
 * @author allan
 */
public class Caracteristicas {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual nome do aluno: ");
        String aluno = ler.next();
        System.out.println("Qual o sexo do aluno:");
        char sexo = ler.next().charAt(0);
        System.out.println("O aluno "+aluno+" é do sexo: "+sexo);
        sexo=Character.toUpperCase(sexo);
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            case 'L':
                System.out.println("Lesbica");
                break;
            case 'G':
                System.out.println("Homossexual");
                break;
            default:
                System.out.println("Programador");
                break;
        }
    }
}
