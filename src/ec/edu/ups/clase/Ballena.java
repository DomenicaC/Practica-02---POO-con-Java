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
public class Ballena extends Mamifero{
    private double peso;
    private double tamaño;
    private String nomCientifico;
    private double velocidad;

    public Ballena() {
        
    }


    //constructor
    public Ballena(double peso, double tamaño, String nomCientifico, double velocidad, int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color) {
        super(numHueso, pelo, comida, habitat, codigo, nombre, sexo, color);
        this.peso = peso;
        this.tamaño = tamaño;
        this.nomCientifico = nomCientifico;
        this.velocidad = velocidad;
    }

    //set
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //get
    public double getPeso() {
        return peso;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public double getVelocidad() {
        return velocidad;
    }

    //to String
    @Override
    public String toString() {
        return "Ballena{" + "peso=" + peso + ", tama\u00f1o=" + tamaño + ", nomCientifico=" + nomCientifico + ", velocidad=" + velocidad + '}';
    }
    
    
    
}
