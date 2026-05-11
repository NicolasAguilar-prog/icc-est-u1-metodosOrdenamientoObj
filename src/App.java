import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] people = {
            new Person("Juan", 25, new int[]{10, 15,20}),
            new Person("Ana", 35, new int[]{12, 18,22}),
            new Person("Carlos", 35, new int[]{14, 16,18}),
            new Person("Maria", 30, new int[]{11, 13,15}),
            new Person("Diego", 20, new int[]{9, 14,19})
        };
        //IMPRIME NORMAL
        for (Person person : people) {
            System.out.println(person);
        }
        //ORDENA POR EDAD

        PersonController personController = new PersonController();
        personController.sortPersonByAge(people);

        //IMPRIME ORDENADO
        System.out.println("Personas ordenadas por edad:");
        for (Person person : people) {
            System.out.println(person);
        }

        //ORDENA POR NOMBRE
        personController.sortPersonByName(people);
        //IMPRIME ORDENADO POR NOMBRE
        System.out.println("Personas ordenadas por nombre:");
        for (Person person : people) {
            System.out.println(person);
        }
        //ORDENA POR PROMEDIO
        personController.sortPersonByAvrNotas(people);
        //IMPRIME ORDENADO POR PROMEDIO
        System.out.println("Personas ordenadas por promedio:");
        for (Person person : people) {
            System.out.println(person + " Promedio: " + person.getPromedio());
        }

        //ORDENA POR VALOR DE NOMBRE
        personController.sortPersonByNameValue(people);
        //IMPRIME ORDENADO POR VALOR DE NOMBRE
        System.out.println("Personas ordenadas por valor de nombre:");
        for (Person person : people) {
            System.out.println(person + " Valor de nombre: " + person.valueName());
        }
    }
}
