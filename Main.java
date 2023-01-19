class Person {
  private String name;
  private int age;

  // Default constructor
  public Person() {
    this.name = "Amir";
    this.age = 18;
  }

  // Parameterized constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Overloaded constructor
  public Person(String name) {
    this.name = name;
    this.age = 18;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}

public class Main {
  public static void main(String[] args) {
    // Instantiating an object using the default constructor
    Person person1 = new Person();
    System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

    // Instantiating an object using the parameterized constructor
    Person person2 = new Person("Suhel", 25);
    System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());

    // Instantiating an object using the overloaded constructor
    Person person3 = new Person("Karim");
    System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge());
  }
}
