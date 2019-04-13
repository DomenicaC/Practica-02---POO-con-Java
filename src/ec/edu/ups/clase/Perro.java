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
public class Perro extends Mamifero{
    
    private String raza;
    private int edad;
    private double tempCorporal;
    private double audicion;

    public Perro() {
        
    }

    //cosntructor
    public Perro(String raza, int edad, double tempCorporal, double audicion, int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color) {
        super(numHueso, pelo, comida, habitat, codigo, nombre, sexo, color);
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

    public void setTempCorporal(double tempCorporal) {
        this.tempCorporal = tempCorporal;
    }

    public void setAudicion(double audicion) {
        this.audicion = audicion;
    }

    //get
    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getTempCorporal() {
        return tempCorporal;
    }

    public double getAudicion() {
        return audicion;
    }

    //to String
    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", edad=" + edad + ", tempCorporal=" + tempCorporal + ", audicion=" + audicion + '}';
    }
    
    
    
}
