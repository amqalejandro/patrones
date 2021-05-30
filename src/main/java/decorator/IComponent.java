/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 * interfaz para la decoracion
 * @author amejia
 */
public interface IComponent {
    
    double getCosto();
    void setCosto(double valor);
    String getFunciona();
    
}
