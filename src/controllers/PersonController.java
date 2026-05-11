package controllers;

import models.Person;

public class PersonController {
    public void sortPersonByAge(Person[] people) {
        // metodo que ordena un arreglo de personas por edad
        // con metodo insercion sort
        for (int i = 1; i < people.length; i++) {
            Person aux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getEdad() > aux.getEdad()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = aux;
        }

    }

    public void sortPersonByName(Person[] people) {
        // metodo que ordena un arreglo de personas por nombre
        // con metodo insercion sort
        for (int i = 1; i < people.length; i++) {
            Person aux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getNombre().compareTo(aux.getNombre()) > 0) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = aux;

        }

    }

    // Metodo que ordena persona por el promedio sus notas
    public void sortPersonByAvrNotas(Person[] people){
        for (int i = 0; i < people.length; i++) {
            int index = i;
            for (int j = i + 1; j < people.length; j++) {
                //Comparacion para actualizar el indice del menor promedio
                if (people[j].getPromedio() < people[index].getPromedio()) {
                    index = j;
                }
            }
            //pregunto si el index es != i
            //entonces cambio posiciones
            if(i!= index){
                Person aux = people[i];
                people[i] = people [index];
                people[index]= aux;
            }
        }
    }

    //Ordenar el arreglo de prsonas por un valor de su nombre
    //el valor del nombre sera la cantidad de letras
    //donde las vocales vales 5
    //consonantes valen el valor de la edad
    //Ej: Juan 20                            Ej: Ana=80
    //20+5+5+20=50                           5+80+5:90
    public void sortPersonByNameValue (Person[] people){
        for (int i = 0; i < people.length; i++) {
            int index = i;
            for (int j = i + 1; j < people.length; j++) {
                //Comparacion para actualizar el indice del menor valor del nombre
                if (people[j].valueName() < people[index].valueName()) {
                    index = j;
                }
            }
            //pregunto si el index es != i
            //entonces cambio posiciones
            if(i!= index){
                Person aux = people[i];
                people[i] = people [index];
                people[index]= aux;
            }
        }
    }

    
}

