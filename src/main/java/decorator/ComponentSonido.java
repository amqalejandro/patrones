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
public class ComponentSonido implements IComponent{

    IComponent decorado;
    private double costo;
    
    public ComponentSonido(IComponent component){
        this.decorado=component;
    }
    
    @Override
    public double getCosto() {
        return costo+this.decorado.getCosto();
    }

    @Override
    public String getFunciona() {
        return decorado.getFunciona()+", Sonido Listo";
    }

    @Override
    public void setCosto(double valor) {
        this.costo=valor;
    }

    @Override
    public String toString() {
        return "ComponentSonido{" + "decorado=" + decorado + ", costo=" + costo + '}';
    }
    
    
    
}
