/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public abstract class Mamifero extends Animal{
    private int numHueso;
    private boolean pelo;
    private String comida;
    private String habitat;
    private Date fechaNacimiento;

    public Mamifero() {
        
    }
    
    //constructor
    public Mamifero(int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color, Date fechaNacimiento) {
        super(codigo, nombre, sexo, color);
        this.numHueso = numHueso;
        this.pelo = pelo;
        this.comida = comida;
        this.habitat = habitat;
        this.fechaNacimiento = fechaNacimiento;
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
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    //get
    public int getNumHueso() {
        return this.numHueso;
    }

    public boolean isPelo() {
        return this.pelo;
    }

    public String getComida() {
        return this.comida;
    }

    public String getHabitat() {
        return this.habitat;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    //abstract
    public abstract double calcularEdad();
    
    //to String
    @Override
    public String toString() {
        return super.toString()+"Mamifero{" + "numHueso=" + numHueso + ", pelo=" + pelo + ", comida=" + comida + ", habitat=" + habitat + '}';
    }
    
}
