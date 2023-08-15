class Animal {  //superclass
    public void speak() {
        System.out.println("I am an animal!");
    }
}

class Dog extends Animal {   //dog as subclass
    @Override                //The Dog classes override the speak() method to print out different messages.
    public void speak() {    //calling the method
        System.out.println("Woof!");
    }
}

class Cat extends Animal {   //cat as subclass
    @Override                //The Cat classes override the speak() method to print out different messages.
    public void speak() {    //calling the method
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.speak();      //method each object

        Dog dog = new Dog();
        dog.speak();          //method each object

        Cat cat = new Cat();
        cat.speak();          //method each object
    }
}
