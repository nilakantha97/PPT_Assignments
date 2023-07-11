class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat says: Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow says: Moo!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: The dog says: Woof!

        Cat cat = new Cat();
        cat.makeSound();  // Output: The cat says: Meow!

        Cow cow = new Cow();
        cow.makeSound();  // Output: The cow says: Moo!
    }
}
