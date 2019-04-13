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
public final class Perro extends Mamifero implements Interface{
    
    private String raza;
    private int edad;
    private String tempCorporal;
    private double audicion;

    public Perro() {
        
    }

    //cosntructor

    public Perro(String raza, int edad, String tempCorporal, double audicion, int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color, Date fechaNacimiento) {
        super(numHueso, pelo, comida, habitat, codigo, nombre, sexo, color, fechaNacimiento);
        this.raza = raza;
        this.edad = edad;
        this.tempCorporal = tempCorporal;
        this.audicion = audicion;
    }
    

    //set
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTempCorporal(String tempCorporal) {
        this.tempCorporal = tempCorporal;
    }

    public void setAudicion(double audicion) {
        this.audicion = audicion;
    }

    //get
    public String getRaza() {
        return this.raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getTempCorporal() {
        return this.tempCorporal;
    }

    public double getAudicion() {
        return this.audicion;
    }

    //metodos abstractos
    @Override
    public double calcularEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("El perro "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro "+this.getNombre()+" esta durmiendo");
    }
    
    //to String
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "raza=" + raza + ", edad=" + edad + ", tempCorporal=" + tempCorporal + ", audicion=" + audicion + '}';
    }

    
    
}
