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
public final class Serpiente extends Reptil implements Interface{
    
    private String especie;
    private String descripcion;
    private boolean venenosa;
    private String alimentacion;

    public Serpiente() {
        
    }

    //Constructor
    public Serpiente(String especie, String descripcion, boolean venenosa, String alimentacion, boolean extremidades, String sangre, int numHuevos, String desplazamiento, int codigo, String nombre, String sexo, String color) {
        super(extremidades, sangre, numHuevos, desplazamiento, codigo, nombre, sexo, color);
        this.especie = especie;
        this.descripcion = descripcion;
        this.venenosa = venenosa;
        this.alimentacion = alimentacion;
    }

    //set
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    //get
    public String getEspecie() {
        return this.especie;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean isVenenosa() {
        return this.venenosa;
    }

    public String getAlimentacion() {
        return this.alimentacion;
    }

    //metodos abstractos
    @Override
    public double calcularEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("La serpiente "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("La serpiente "+this.getNombre()+" esta durmiendo");
    }
    
    //to String
    @Override
    public String toString() {
        return super.toString()+"Serpiente{" + "especie=" + especie + ", descripcion=" + descripcion + ", venenosa=" + venenosa + ", alimentacion=" + alimentacion + '}';
    }

    
    
    
}
