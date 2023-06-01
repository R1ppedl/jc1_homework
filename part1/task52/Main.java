package part1.task52;

import java.io.IOException;

import static part1.task52.Person.generatePeople;
import static part1.task52.Person.writeToFile;

public class Main {
    public static void main(String[] args) {
        Person[] people = generatePeople(10);
        String filename = "src/part1/task52/people.txt";
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getSurname() + ", " + person.getAge());
        }


        try {
            writeToFile(filename, people);
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
