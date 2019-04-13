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
public class Serpiente extends Reptil{
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
        return especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    //to String
    @Override
    public String toString() {
        return "Serpiente{" + "especie=" + especie + ", descripcion=" + descripcion + ", venenosa=" + venenosa + ", alimentacion=" + alimentacion + '}';
    }
    
    
}
