/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 */
public class Mamifero extends Animal{
    private int numHueso;
    private boolean pelo;
    private String comida;
    private String habitat;
    

    public Mamifero() {
        
    }
    
    //constructor

    public Mamifero(int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color) {
        super(codigo, nombre, sexo, color);
        this.numHueso = numHueso;
        this.pelo = pelo;
        this.comida = comida;
        this.habitat = habitat;
    }
    
    //set
    public void setNumHueso(int numHueso) {
        this.numHueso = numHueso;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //get
    public int getNumHueso() {
        return numHueso;
    }

    public boolean isPelo() {
        return pelo;
    }

    public String getComida() {
        return comida;
    }

    public String getHabitat() {
        return habitat;
    }
    
    //to String
    @Override
    public String toString() {
        return "Mamifero{" + "numHueso=" + numHueso + ", pelo=" + pelo + ", comida=" + comida + ", habitat=" + habitat + '}';
    }
    
}
