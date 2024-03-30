/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torrehanoi;

import java.util.Scanner;

/**
 *
 * @author Felipe Gomes Peranovich
 */
public class TorreHanoi {

    /**
     * @param args the command line arguments
     */
 

    public static void main(String[] args) {
        boolean vencedor = funcionalidade.consultaVencedor();
        Scanner teclado = new Scanner(System.in);
        String valor1;
        String valor2;
        
        //inicia a torre;
        funcionalidade.inicio();       
        while(vencedor == false){
            System.out.println("-------------");
            System.out.println("Informe a casa onde sera retirado o disco:");
            valor1 = teclado.nextLine().toUpperCase();
            System.out.println("Informe a cada onde sera colocado o disco:");
            valor2 = teclado.nextLine().toUpperCase();
            try{
                funcionalidade.movimento(valor1,valor2);
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
            //exibe torre atualizada;
            for (int i = funcionalidade.numpecas-1; i >= 0; i--) {           
            System.out.println(funcionalidade.exibeTorre(i));
            }
            //verifica se acabou
            vencedor = funcionalidade.consultaVencedor();
        }
        System.out.println("Desafio completo, Parabens!");
    }    
   
}
