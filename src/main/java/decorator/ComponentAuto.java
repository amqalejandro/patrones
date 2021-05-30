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
public class ComponentAuto implements IComponent{
    
    private String modelo;
    private String caracteristicas;
    private double costo;

    public ComponentAuto(String modelo, String caracteristicas, double costo) {
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.costo = costo;
    }
    
    
    

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public String getFunciona() {
        return "Enciende motor";
    }
    
    
    //un metodo propio de la clase 
    public void puertas(boolean estado){
        
        if(estado)
            System.out.println("puertas cerradas");
        else
            System.out.println("puertas abiertas");
    }

    @Override
    public String toString() {
        return "ComponentAuto{" + "modelo=" + modelo + ", caracteristicas=" + caracteristicas + ", costo=" + costo + '}';
    }

    @Override
    public void setCosto(double valor) {
        this.costo=valor;
    }
    
    
    
}
