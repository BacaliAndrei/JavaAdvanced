package DesignPatterns._4_Decorator;

public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }

}
