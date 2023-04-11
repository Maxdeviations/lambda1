import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Petrov-Vodkin", 47));
        persons.add(new Person("Boris", "Ivanov", 17));
        persons.add(new Person("Petr", "Ivanov-Petrov-Vodkin", 7));
        persons.add(new Person("Oleg", "Ivanov", 27));
        persons.add(new Person("Boris", "Ivanov-Vodkin", 37));

        persons.removeIf(person -> person.getAge() < 18);
        persons.forEach(System.out::println);
    }
}
