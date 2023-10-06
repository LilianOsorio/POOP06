/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author lilian 
 * Clase que contiene los métodos que hace una persona
 */
public class Persona {
    private String nombre, direccion;
    private int edad;

    /** 
     * Constructor vacio de persona 
     */
    public Persona() {
    }
    
    /**
     * Constructor lleno d epersona, con tres parametros 
     * @param nombre nombre de la persona en string
     * @param direccion direccion de la persona en string
     * @param edad edad de la persona en primitivo int
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    /**
     * Metodo getNOmbre 
     * @return regresa el nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo setNombre 
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo que sirve para que una persona hable 
     * @param var lo que la persona esta diciendo 
     */
    public void hablar (String var){
        System.out.println(var);
    }
    //5 metodo mas
    
    /**
     * Metodo toString sobre escrito que muestra los valores de los atributos
     * @return regresa la concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    

    
}
