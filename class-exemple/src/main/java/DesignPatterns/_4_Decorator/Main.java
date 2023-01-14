package DesignPatterns._4_Decorator;

public class Main {
    public static void main(String[] args) {

        ChristmasTree tree =new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree.decorate());

        ChristmasTree tree1=new BubbleLights(new Garland(new BubbleLights(new ChristmasTreeImpl())));
        System.out.println(tree1.decorate());

    }
}
