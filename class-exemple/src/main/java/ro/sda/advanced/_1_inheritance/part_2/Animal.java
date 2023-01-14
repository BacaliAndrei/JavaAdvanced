package ro.sda.advanced._1_inheritance.part_2;

public class Animal {

    public void displayInfo() {
        System.out.println("I'm an animal");
    }

    class Dog extends Animal {
        @Override
        public void displayInfo(){
            System.out.println("I'm a dog");
        }
    }class Main{
        public void main(String[] args) {
            Dog myDog=new Dog();
            myDog.displayInfo();

        }
    }
}
