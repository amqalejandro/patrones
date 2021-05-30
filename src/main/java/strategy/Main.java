/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author amejia
 */
public class Main {

    private static final int SALIR=5;
    private static final int SUMA=1;
    private static final int RESTA=2;
    private static final int MULTIPLICACION=3;
    private static final int DIVISION=4;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        Scanner scanner=new Scanner(System.in);
        IOperationStrategy operacion=new StrategyAdd();
        double valorA = 0,valorB = 0,respuesta=0;
        while(opcion!=SALIR){
            
            System.out.println("1-Suma 2-Resta 3-Multiplicacion 4-Division 5-Salir:");
            opcion=scanner.nextInt();
            
            switch(opcion){
                case SUMA:
                    operacion=new StrategyAdd();
                    break;
                case RESTA:
                    operacion=new StrategySubtraction();
                    break;
                case DIVISION:
                    operacion=new StrategyDivision();
                    break;
                case MULTIPLICACION:
                    operacion=new StrategyMultiplication();
                    break;
                default:
                    opcion=SALIR;
                    break;
            }
            
            if(opcion==SALIR){
                break;
            }
            System.out.println("Ingrese valor A:");
            valorA=scanner.nextDouble();
            
            System.out.println("Ingrese valor B:");
            valorB=scanner.nextDouble();
            
            respuesta=operacion.operation(valorA,valorB);
            
            System.out.println("Respuesta:"+respuesta);
            
            
        }
        
    }
    
}
