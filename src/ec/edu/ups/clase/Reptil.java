/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * 
 */
public abstract class Reptil extends Animal{
    
    private boolean extremidades;
    private String sangre;
    private int numHuevos;
    private String desplazamiento;

    public Reptil() {
        
    }
    
    //constructor
    public Reptil(boolean extremidades, String sangre, int numHuevos, String desplazamiento, int codigo, String nombre, String sexo, String color) {
        super(codigo, nombre, sexo, color);
        this.extremidades = extremidades;
        this.sangre = sangre;
        this.numHuevos = numHuevos;
        this.desplazamiento = desplazamiento;
    }

    //set
    public void setExtremidades(boolean extremidades) {
        this.extremidades = extremidades;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    //get
    public boolean getExtremidades() {
        return this.extremidades;
    }

    public String getSangre() {
        return this.sangre;
    }

    public int getNumHuevos() {
        return this.numHuevos;
    }

    public String getDesplazamiento() {
        return this.desplazamiento;
    }

    //abstract
    public abstract double calcularEdad();
    
    //to String
    @Override
    public String toString() {
        return super.toString()+"Reptil{" + "extremidades=" + extremidades + ", sangre=" + sangre + ", numHuevos=" + numHuevos + ", desplazamiento=" + desplazamiento + '}';
    }
    
    
    
}
