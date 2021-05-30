/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author amejia
 */
public class Main {
    
    public static void main(String[] args) {
        IComponent auto=new ComponentAuto("2018","4 puertas",100000);
        System.out.println(auto);
        
        //uso método propio de l clase a decorar
        ((ComponentAuto)auto).puertas(true);
        System.out.println("***************************************************");
        
        auto=new ComponentNitrogeno(auto);
        ((ComponentNitrogeno)auto).setCosto(5000);
        System.out.println("Costo:"+auto.getCosto());
        System.out.println("Funcion:"+auto.getFunciona());
        System.out.println(auto);
            ((ComponentNitrogeno)auto).usaNitrogeno();
   
        System.out.println("***************************************************");
        
        auto=new ComponentSonido(auto);
        ((ComponentSonido)auto).setCosto(10000);
        System.out.println("Costo:"+auto.getCosto());
        System.out.println("Funcion:"+auto.getFunciona());
        System.out.println(auto);
        System.out.println("***************************************************");
       
        auto=new ComponentSuspension(auto);
        ((ComponentSuspension)auto).setCosto(20000);
        System.out.println("Costo:"+auto.getCosto());
        System.out.println("Funcion:"+auto.getFunciona());
        System.out.println(auto);
        System.out.println("***************************************************");
       
    }
    
}
