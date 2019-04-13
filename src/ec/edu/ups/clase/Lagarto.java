/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Interface;

/**
 *
 * @author Domenica Cañizares
 */
public final class Lagarto extends Reptil implements Interface{
    
    private String tipoPiel;
    private int añosVida;
    private String modoDefensa;
    private boolean cambiaColor;

    public Lagarto() {
        
    }

    //constructor
    public Lagarto(String tipoPiel, int añosVida, String modoDefensa, boolean cambiaColor, boolean extremidades, String sangre, int numHuevos, String desplazamiento, int codigo, String nombre, String sexo, String color) {
        super(extremidades, sangre, numHuevos, desplazamiento, codigo, nombre, sexo, color);
        this.tipoPiel = tipoPiel;
        this.añosVida = añosVida;
        this.modoDefensa = modoDefensa;
        this.cambiaColor = cambiaColor;
    }

    //set
    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public void setAñosVida(int añosVida) {
        this.añosVida = añosVida;
    }

    public void setModoDefensa(String modoDefensa) {
        this.modoDefensa = modoDefensa;
    }

    public void setCambiaColor(boolean cambiaColor) {
        this.cambiaColor = cambiaColor;
    }

    //get
    public String getTipoPiel() {
        return this.tipoPiel;
    }

    public int getAñosVida() {
        return this.añosVida;
    }

    public String getModoDefensa() {
        return this.modoDefensa;
    }

    public boolean isCambiaColor() {
        return this.cambiaColor;
    }

    //metodos abstractos
    @Override
    public double calcularEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("El lagarto "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El lagarto "+this.getNombre()+" esta durmiendo");
    }
    
    //to String
    @Override
    public String toString() {
        return super.toString()+"Lagarto{" + "tipoPiel=" + tipoPiel + ", a\u00f1osVida=" + añosVida + ", modoDefensa=" + modoDefensa + ", cambiaColor=" + cambiaColor + '}';
    }

    
    
}
