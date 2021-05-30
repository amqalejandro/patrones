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
public class ComponentNitrogeno implements  IComponent{
    
    private IComponent decorado;
    private double costo;
    //recibe el objeto que se va a decorar 
    public ComponentNitrogeno(IComponent component){
        decorado=component;
    }

    public void setCosto(double costo) {
        this.costo = costo+decorado.getCosto();
    }
    
    

    @Override
    public double getCosto() {
     return costo;
    }

    @Override
    public String getFunciona() {
        return decorado.getFunciona()+", Nitrogeno Listo";
    }
    
    public void usaNitrogeno(){
        System.out.println("Nitrogeno en uso");
    }

    @Override
    public String toString() {
        return "ComponentNitrogeno{" + "decorado=" + decorado + ", costo=" + costo + '}';
    }

    
    
    
}
