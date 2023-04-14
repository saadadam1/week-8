//Create a class called "Person" with attributes "name" and "age". Create an ArrayList of Person objects and add 7 people to it. Print the name and age of each person. Find the person with the highest age and print their name and age.
import java.util.ArrayList;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        
        people.add(new Person("Saad", 25));
        people.add(new Person("Adam", 30));
        people.add(new Person("Ban", 40));
        people.add(new Person("Alice", 20));
        people.add(new Person("Tom", 50));
        people.add(new Person("Jane", 35));
        people.add(new Person("Bill", 45));
        
        for (Person p : people) {
            System.out.println(p.name + " " + p.age);
        }
        
        Person oldestPerson = people.get(0);
        for (Person p : people) {
            if (p.age > oldestPerson.age) {
                oldestPerson = p;
            }
        }
        
        System.out.println("Oldest person: " + oldestPerson.name + " " + oldestPerson.age);
    }
}
