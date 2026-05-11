package models;

public class Person {
    private String nombre;
    private int edad;
    private int [] notas;

    // Constructor vacío
    public Person() {
    }
    
    // Constructor con parámetros
    public Person(String nombre, int edad, int [] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
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
    
    public int getPromedio(){
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }

    public int valueName(){
        String nombreF = nombre.toLowerCase();
        int value = 0;
        for (int i = 0; i < nombre.length(); i++) {
        if(nombreF.charAt(i) == 'a' || nombreF.charAt(i) == 'e' || nombreF.charAt(i) == 'i' || nombreF.charAt(i) == 'o' || nombreF  .charAt(i) == 'u'){
            value +=5;
        }else{
            value += edad;
        }
        }
        return value;
    }
    
    // toString
    @Override
    public String toString() {
        return "Person{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
