/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Interface;
import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public final class Ballena extends Mamifero implements Interface{
    
    private double peso;
    private String tamaño;
    private String nomCientifico;
    private double velocidad;

    public Ballena() {
        
    }


    //constructor
    public Ballena(double peso, String tamaño, String nomCientifico, double velocidad, int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color, Date fechaNacimiento) {    
        super(numHueso, pelo, comida, habitat, codigo, nombre, sexo, color, fechaNacimiento);
        this.peso = peso;
        this.tamaño = tamaño;
        this.nomCientifico = nomCientifico;
        this.velocidad = velocidad;
    }

    //set
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamaño(String tamaño) {
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
        return this.peso;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public String getNomCientifico() {
        return this.nomCientifico;
    }

    public double getVelocidad() {
        return this.velocidad;
    }
    
    //metodos abstractos
    @Override
    public double calcularEdad() {
        Date fechaFin = new Date();
        Date fechaInicio = super.getFechaNacimiento();
        long tiempoMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        long tiempoTranscurridoEnAnios = (tiempoMilisegundos / (3600 * 24 * 1000)) / 365;
        return 0;
    }

    @Override
    public void comer() {
        System.out.println("La ballena "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("La ballena "+this.getNombre()+" esta durmiendo");
    }

    //to String

    @Override
    public String toString() {
        return super.toString()+"Ballena{" + "peso=" + peso + ", tama\u00f1o=" + tamaño + ", nomCientifico=" + nomCientifico + ", velocidad=" + velocidad + '}';
    }
    

    
    
}
