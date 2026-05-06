import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] people = {
            new Person("Juan", 25),
            new Person("Ana", 35),
            new Person("Carlos", 35),
            new Person("Maria", 30),
            new Person("Diego", 20)
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
    }
}
