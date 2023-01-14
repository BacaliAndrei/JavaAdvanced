package DesignPatternExercises._5_;

import java.util.List;

public class Dog {



    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    public Dog(DogBuilder dogBuilder){
        this.name = dogBuilder.name;
        this.type = dogBuilder.type;
        this.age = dogBuilder.age;
        this.toys = dogBuilder.toys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }

    static class DogBuilder {

        private String name;
        private String type;
        private Integer age;
        private List<String> toys;


        public DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder type(String type) {
            this.type = type;
            return this;
        }

        public DogBuilder age(int age) {
            this.age = age;
            return this;
        }

        public DogBuilder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            Dog user = new Dog(this);
            return user;
        }
    }
}
