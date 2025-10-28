// Person.java
class Person {
    // Attributes
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {
        // Original person
        Person p1 = new Person("Alice", 25);
        p1.displayDetails();
        System.out.println();

        // Cloned person using copy constructor
        Person p2 = new Person(p1);
        p2.displayDetails();
    }
}
