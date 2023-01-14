package ro.sda.advanced._2_abstract_classes;

public abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat!");

    }
}

    class Dog extends Animal {
    public void makeSound() {
            System.out.println("Bark bark");
        }
}
class Cat extends Animal{
   @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d1=new Dog();

        d1.makeSound();
        d1.eat();

        Animal cat=new Cat();
        cat.makeSound();
        cat.eat();
    }
}

