/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torrehanoi;



/**
 *
 * @author Felipe Gomes Peranovich
 */
public class funcionalidade {
    static final int numpecas = 5;
    static int[] TorreA = new int[numpecas];
    static int[] TorreB = new int[numpecas];
    static int[] TorreC = new int[numpecas];  
    static int peca = numpecas;
    static int topA = -1;
    static int topB = -1;
    static int topC = -1;
    
    public static void inicio(){
        for (int i =0 ; i < numpecas; i++) {
            TorreA[i] = peca;
            TorreB[i] = 0;
            TorreC[i] = 0;
            topA++;
            peca--;
        }
        System.out.println("Torre Hanoi:");
        System.out.println("Pilhas:");
        System.out.println("A"+" | "+"B"+" | "+"C");
        for (int i = numpecas-1; i >= 0; i--) {
            System.out.println(TorreA[i]+" | "+TorreB[i]+" | "+TorreC[i]); 
        }
    }
    public static boolean AestaVazia(){
        return topA == -1;
    }
    public static boolean BestaVazia(){
        return topB == -1;
    }
    public static boolean CestaVazia(){
        return topC == -1;
    }
    public static boolean AestaCheia(){
        return topA== TorreA.length;
    }
    public static boolean BestaCheia(){
        return topB== TorreB.length;
    }
    public static boolean CestaCheia(){
        return topC== TorreC.length;
    }
    public static void movimento(String valor1,String valor2){
        switch (valor1) {            
            case "A":
                if (AestaVazia()) {
                    throw new RuntimeException("Movimento Invalido, Torre A está vazia!");
                }else if (valor2.equals("B")) {
                    if (BestaVazia()) {  
                        System.out.println("Movido A para B");
                        TorreB[topB+1] = TorreA[topA];
                        TorreA[topA] = 0;
                        topA--;
                        topB++;                          
                    }else if (TorreB[topB]>TorreA[topA]) {
                        System.out.println("Movido A para B");
                      TorreB[topB+1] = TorreA[topA];
                      TorreA[topA] = 0;
                       topA--;
                       topB++; 
                    }
                    else{
                        throw new RuntimeException("A para B Movimento Invalido!");
                    }               
                }else if (valor2.equals("C")) {
                    if (CestaVazia()) {
                        System.out.println("Movido A para C");
                        TorreC[topC+1] = TorreA[topA];
                        TorreA[topA] = 0;
                        topA--;
                        topC++;
                    }else if (TorreC[topC]>TorreA[topA]) {
                        System.out.println("Movido A para C");
                        TorreC[topC+1] = TorreA[topA];
                        TorreA[topA]=0;
                        topA--;
                        topC++;                   
                    }else{
                        throw new RuntimeException("A para C Movimento Invalido!"); 
                    }
                }
                break;
                
            case "B":
                if (BestaVazia()) {
                    throw new RuntimeException("Movimento Invalido, Torre B casa está vazia!");
                }else if (valor2.equals("A")) {
                    if (AestaVazia()) {
                        System.out.println("Movido B para A");
                        TorreA[topA+1] = TorreB[topB];
                        TorreB[topB] =0;
                        topB--;
                        topA++;
                    }else if (TorreA[topA]>TorreB[topB]) {
                        System.out.println("Movido B para A");
                        TorreA[topA+1] = TorreB[topB];
                        TorreB[topB] = 0;
                        topB--;
                        topA++;                      
                    }else{
                        throw new RuntimeException(" B para A Movimento Invalido!");
                    }
                }else if (valor2.equals("C")) {
                    if (CestaVazia()) {
                        System.out.println("Movido B para C");
                        TorreC[topC+1] = TorreB[topB];
                        TorreB[topB] = 0;
                        topB--;
                        topC++;
                    }else if (TorreC[topC]>TorreB[topB]) {
                        System.out.println("Movido B para C");
                        TorreC[topC+1] = TorreB[topB];
                        TorreB[topB] = 0;
                        topB--;
                        topC++;
                    }else{
                        throw new RuntimeException("B para C Movimento Invalido!");
                    }
                }
                break;
                
            case "C":
                if (CestaVazia()) {
                    throw new RuntimeException("Movimento Invalido, Torre C está vazia!");
                }else if (valor2.equals("A")) {
                     if (AestaVazia()) {
                        System.out.println("Movido C para A");
                        TorreA[topA+1] = TorreC[topC];
                        TorreC[topC] =0;
                        topC--;
                        topA++;
                    }else if (TorreA[topA]>TorreC[topC]) {
                        System.out.println("Movido C para A");
                        TorreA[topA+1] = TorreC[topC];
                        TorreC[topC] = 0;
                        topC--;
                        topA++;                   
                    }else{
                        throw new RuntimeException("C para A Movimento Invalido!");
                    }
                }else if (valor2.equals("B")) {
                    if (BestaVazia()) {       
                        System.out.println("Movendo C para B");
                        TorreB[topB+1] = TorreC[topC];
                        TorreC[topC] = 0;
                        topC--;
                        topB++;                          
                    }else if (TorreB[topB]>TorreC[topC]) {
                        System.out.println("Movendo C para B");
                        TorreB[topB+1] = TorreC[topC];
                        TorreC[topC] = 0;
                        topC--;
                        topB++; 
                    }
                    else{
                        throw new RuntimeException("C para B Movimento Invalido!");
                    }  
                }
                break;
            default:

        }
    }
    public static String exibeTorre(int n){      
           String torre = TorreA[n]+" | "+TorreB[n]+" | "+ TorreC[n];
           return torre;       
    }
    public static boolean consultaVencedor(){
        if( topC==numpecas-1 || topB==numpecas-1){
            return true;
        }return false;
    }

    
    
}
