package models;

public class Person {
    private String nombre;
    private int edad;

    // Constructor vacío
    public Person() {
    }
    
    // Constructor con parámetros
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // toString
    @Override
    public String toString() {
        return "Person{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
