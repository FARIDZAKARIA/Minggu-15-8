class Person {
    String name;   //declare object
    int age;       //declare object

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class umur {      //main class
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        person1.sayHello();   //method

        Person person2 = new Person("Jane Doe", 25);
        person2.sayHello();   //method
    }
}
