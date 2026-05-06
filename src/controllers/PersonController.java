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
}

