package part1.task52;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }



    public static Person[] generatePeople(int count) {
        Person[] people = new Person[count];
        Random random = new Random();

        String[] names = {"John", "Jane", "Michael", "Emma", "William"};
        String[] surnames = {"Smith", "Johnson", "Brown", "Davis", "Wilson"};

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            int age = random.nextInt(80) + 10; // Random age between 10 and 89

            people[i] = new Person(name, surname, age);
        }

        return people;
    }

    public static void writeToFile(String filename, Person[] people) throws IOException {




        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Person person : people) {
            writer.write(person.getName() + ", " + person.getSurname() + ", " + person.getAge());
            writer.newLine();
        }

        writer.close();
    }
}

