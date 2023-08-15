class Animal {        //Superclass
    String name;
    String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void speak() {
        System.out.println("I am an animal!");
    }
}

class Dog extends Animal {    //dog as subclass
    String breed;

    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {    //cat as subclass
    String furColor;

    public Cat(String name, String species, String furColor) {
        super(name, species);
        this.furColor = furColor;
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class binatang {   //main class
    public static void main(String[] args) {
        Dog dog = new Dog("Lassie", "Canine", "Border Collie");
        dog.speak();  //method

        Cat cat = new Cat("Garfield", "Feline", "Orange");
        cat.speak();  //method
    }
}
